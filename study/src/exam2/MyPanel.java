package exam2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Ball {
        private int x = 100;
        private int y = 100;
        private int size = 30;
        private int xSpeed = 10;
        private int ySpeed = 10;

        public void draw(Graphics g){
            g.setColor(Color.RED);
            g.fillOval(x, y, size, size);
        }

        public void update(){
            x += xSpeed;
            y += ySpeed;
            if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 0){
                xSpeed = -xSpeed;
            }
            if ((y + size) > MyPanel.BOARD_WIDTH - size || y < 0){
                ySpeed = -ySpeed;
            }
        }
    }
        public class MyPanel extends JPanel{
            static final int BOARD_WIDTH = 600;
            static final int BOARD_HEIGHT = 300;
            private Ball ball = new Ball();

            public MyPanel(){
                this.setBackground(Color.YELLOW);

                Runnable task = () -> {
                    while(true){
                        ball.update();
                        repaint();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                new Thread(task).start();
            }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            ball.draw(g);
        }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(MyPanel.BOARD_WIDTH, MyPanel.BOARD_HEIGHT);
        frame.add(new MyPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JButton Stop = new JButton();
    }
}
//여기에 공 stop 버튼이랑 start 버튼 추가해보기