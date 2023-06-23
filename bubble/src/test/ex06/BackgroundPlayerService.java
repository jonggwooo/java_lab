package test.ex06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundPlayerService implements Runnable {

    // 의존하는 것들-->상태가 필요한 것은 전역변수로 뺌.
    private BufferedImage image;
    private Player player;

    public BackgroundPlayerService(Player player) {
        this.player = player;
        File file = new File("image/backgroundService.png");

        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            // 색상 확인
            Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
            Color rightColor = new Color(image.getRGB(player.getX() + 50 + 15, player.getY() + 25));
            // System.out.println("leftColor : "+leftColor);
            // System.out.println("rightColor : "+rightColor);

            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                System.out.println("왼쪽 벽에 충돌함");
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                System.out.println("오른쪽 벽에 충돌함");
            }

            try {
                System.out.println("나 이제 쉴꼐");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 실의 길이

}