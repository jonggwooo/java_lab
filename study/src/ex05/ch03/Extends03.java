package ex05.ch03;

class Animal { // 추상클래스 (추상은 new못씀)
    void speak(){     };// 추상메서드
}

class Dog extends Animal{
  
   void speak(){
       System.out.println("멍멍");
   }
}
class Cat extends Animal{
  
   void speak(){
       System.out.println("야옹");
   }
}

public class Extends03 {

    static void start(Animal u){
        u.speak();
    }


    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();
        Animal c = new Cat();
        start(c);
    }

}