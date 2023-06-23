package ex06;

import javax.sound.sampled.SourceDataLine;

class 미니언{
    public 미니언(){
        System.out.println("미니언이 생성되었습니다");

    }
}

class 바론 {
    private static 바론 instance = new 바론();
    
    public static 바론 getinstace(){
        return instance;
    }
    private 바론(){}


}

//싱글톤
public class Single01 {

    public static void main(String[] args) {
        
    
    미니언 n1 = new 미니언();
    미니언 n2 = new 미니언();

    바론 b1 = 바론.getinstace();
    바론 b2 = 바론.getinstace();

    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());

    if(b1 instanceof 바론){
        System.out.println("같은 타입 입니다");
    }
    if(b1 instanceof Object){
        System.out.println("같은 타입 입니다");
    }
}
}