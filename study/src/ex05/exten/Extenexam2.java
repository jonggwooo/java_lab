package ex05.exten;

class Fruit {
    public void print(){

    }
}

class Apple extends Fruit{
    private String name;

    public Apple(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}

class Banana extends Fruit{
    private String name;

    public Banana(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }
}


public class Extenexam2 {

    
    public static void main(String[] args) {
      Apple aa = new Apple("사과");
      Banana bb = new Banana("바나나");
      

}
}