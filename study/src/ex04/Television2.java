package ex04;

import java.net.Socket;

class Tv{
    void mytv(int n1,int n2){System.out.println("채널과 볼륨"+n1+","+n2);}
    void yourtv(int n1,int n2){System.out.println("채널과 볼륨"+n1+","+n2);}

}

public class Television2 {
    public static void main(String[] args) {
        Tv d1 = new Tv();
        d1.mytv(1,2);
        d1.yourtv(2,3);
    }
}
