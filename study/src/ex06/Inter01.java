package ex06;

// 인터페이스는 new 할수 없다
// 인터페이스는 변수를 만들 수 있다
// 인터페이스는 추상메서드만 가진다

interface Remote {
    int NUM = 10; // public static final 이 숨겨져있음

    void run(); // public abstract

}


public class Inter01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);
        
    }
}
