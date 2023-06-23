package gui.project.ex01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame02 extends JFrame{
    public MyFrame02(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button2");
        b2.setBackground(Color.green);
        
        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300,150);

        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new MyFrame02();
    }
}
