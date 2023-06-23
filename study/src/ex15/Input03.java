package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
    public static void main(String[] args) {
        //연걸 (키보드한테) 인풋스트림은 1바이트만
        
        // InputStreamReader ir = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(ir);
        // 두줄을 한줄로 가능 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //읽기 , 
        try {
            String data = br.readLine();
            System.out.println(data);
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
