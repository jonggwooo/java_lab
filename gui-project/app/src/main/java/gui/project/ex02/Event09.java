package gui.project.ex02;

import java.awt.BorderLayout;

import javax.swing.JButton;

// 1. 이벤트 소스
public class Event09 extends MyFrame {

    // 생성자 안에 변수선언 X, 바깥에서 사용 못함
    private JButton btn1, btn2;

    public Event09() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        btn1.addActionListener(null);
        
        setVisible(true);

    }

    public static void main(String[] args) {
        new Event09();

    }

}
