package gui.project.ex02;

import javax.swing.JButton;

public class Lamda01 {
    public static void main(String[] args) {
        private JButton btn1, btn2;

    public Lamda01() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        
        btn1.addActionListener(e -> System.out.println("버튼1 클릭"));
        btn1.addActionListener(e -> System.out.println("버튼2 클릭"));
        
        setVisible(true);
    }

    
}
}
