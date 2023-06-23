package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
        //연걸 (키보드한테) 인풋스트림은 1바이트만
        
        InputStreamReader ir = new InputStreamReader(System.in);

        //읽기 , 
        try {
            char[] ch = new char[50];
            ir.read(ch);
            
            for (char c : ch){
            System.out.println(c);}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
