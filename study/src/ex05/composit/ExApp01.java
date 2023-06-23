package ex05.composit;

public class ExApp01 {
    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger(800,"버거");
        Burger b3 = new Burger(500);
        System.out.println("===========");

       
        System.out.println("===========");
        Bigburger bb2 = new Bigburger(1300,"빅버거");
        System.out.println("==");
        Bigburger bb3 = new Bigburger(1300);
        
        
    }
}
