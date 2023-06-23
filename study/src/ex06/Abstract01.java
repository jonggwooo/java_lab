package ex06;

// 추상클래스는 new 할수 없다
// 추상클래스는 일반메서드와 추상메서드를 가질 수 있다
// 추상클래스는 상태변수를 가질 수 있다
abstract class 동물{

    String name;


    public void run(){
        System.out.println("달린다");
    }
    public abstract void speak();
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");
    }
    
    
}

public class Abstract01 {
    public static void main(String[] args) {
        사자 lion = new 사자();
        lion.run();
    }
}
