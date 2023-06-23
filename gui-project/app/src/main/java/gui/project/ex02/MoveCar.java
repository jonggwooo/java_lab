package gui.project.ex02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveCar extends JFrame{

    int img_x=150, img_y=150;
    JButton button;

    public MoveCar(){
        setSize(600,300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("d:\\car.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x, img_y);
        button.setSize(200,100);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener() {
            public void keypressed(KeyEvent e){
                int keycode = e.getKeyCode();
                switch (keycode){
                    case KeyEvent.VK_UP: img_y -= 10; break;
                }
            }    
        })
    
    }
    }
    public static void main(String[] args) {
        
    }
}
