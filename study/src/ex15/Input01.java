package ex15;

import java.io.IOException;
import java.io.InputStream;

//인풋은 txt파일을 터미널에 읽어준다
public class Input01 {
    public static void main(String[] args) {
        //연걸 (키보드한테) 인풋스트림은 1바이트만
        InputStream in = System.in;

        //읽기 , 
        try {
            int data = in.read(); // 대기
            System.out.println(data);
            System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
