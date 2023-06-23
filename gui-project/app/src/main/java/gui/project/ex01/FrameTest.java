package gui.project.ex01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test");
        f.setSize(600,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel label = new JLabel();
        label.setText("안녕");
    }
}
