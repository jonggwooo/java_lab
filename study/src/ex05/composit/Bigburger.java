package ex05.composit;

public class Bigburger extends Burger{
    
    public Bigburger(){
        super(1500,"빅버거");
        System.out.println("빅버거가 만들어졌습니다");
    }

    
    public Bigburger(int price){
        super(price,"빅버거");
        System.out.println("빅버거가 만들어졌습니다");
    }
    
    public Bigburger(int price, String desc){
        super(price, desc);
        System.out.println("빅버거가 만들어졌습니다");

    }
}
