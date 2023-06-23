package ex15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class Output02 {
    public static void main(String[] args) {
        try {
            // sysout을 안하고 new FileOutput을 해서 왼쪽에 파일을 생성해준다
            OutputStream os = new FileOutputStream("output.txt", false);
            OutputStreamWriter ow = new OutputStreamWriter(os, "utf-8");
            BufferedWriter bw = new BufferedWriter(ow);
            bw.write("안녕");
            bw.write("안녕");
            bw.write("안녕");
            bw.write("안녕");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}