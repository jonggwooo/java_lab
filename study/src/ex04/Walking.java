package ex04;

import javax.sound.sampled.SourceDataLine;

public class Walking {
    public static double calculateCalory(int walk) { //메소드앞에 자료형 명시 double 문법

        return 0.02 * walk;
        //0.02 * 5000
    }
    public static void main(String[] args) {
            //static은 호출 바로됨 new 안써도됨
        double result = calculateCalory(5000);  //변수선언할때는 앞에 자료형 명시double
        System.out.println("소모 칼로리: " + result + "k");
           }
}


