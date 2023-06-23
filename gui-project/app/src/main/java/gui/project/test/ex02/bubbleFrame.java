package gui.project.test.ex02;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bubbleFrame extends JFrame{

    private JLabel backgroundMap;
    private Player player;


    public bubbleFrame(){
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        setSize(1000,640);
        setLayout(null); //absoulte 레이아웃(자유롭게 배치가능)
        setLocationRelativeTo(null); //JFrame 가운데 배치하기
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);   
        }
    

    public static void main(String[] args) {
        new bubbleFrame();
    }
}