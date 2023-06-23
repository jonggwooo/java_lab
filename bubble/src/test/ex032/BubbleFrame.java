package test.ex032;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();

        setVisible(true);

    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("Image/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
        add(player);
    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //키보드이벤트는 화면전체에 해야함 고로 Frame에 하기
    private void initListener(){

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                if(e.getKeyCode() == 39){
                    player.right();
                }
                
                if(e.getKeyCode() == 37){
                    player.left();
                }
            }
        });
    }    public static void main(String[] args) {
        new BubbleFrame();
    }
}
