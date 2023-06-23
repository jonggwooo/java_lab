package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{

    public MyFrame(){
      setSize(300,500);
      setTitle("MyFrame");

      this.setLayout(new FlowLayout());

      JButton button = new JButton("버튼");
      this.add(button);

      JButton button2 = new JButton("버튼2");
      this.add(button2);

      JButton button3 = new JButton("버튼3");
      this.add(button3);

      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
