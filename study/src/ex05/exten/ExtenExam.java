package ex05.exten;


class Animall {
    public void print(){

    }
}

class Tiger extends Animall{
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

class Lion extends Animall{
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class ExtenExam {

    static void start(Animall u) {
        u.print();
    }

    public static void main(String[] args) {
        Lion lion = new Lion("사자1");
        Tiger tiger = new Tiger("호랑이1");
        start(lion);
        start(tiger);
    }
}
