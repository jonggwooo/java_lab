package gui.project.ex01;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame01 extends JFrame{
    public MyFrame01(){
        setSize(300,150);
        setLocation(200,700);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        this.add(button1);
        this.add(button2);
        setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

    }




    public static void main(String[] args) {
        new MyFrame01();
        
    }

}