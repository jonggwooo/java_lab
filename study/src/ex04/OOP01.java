package ex04;

class Player{
    String name;
    int thirsty; // 0~100 (클수록 목마름)
    public Player() {           //디폴트 생성자
    }                           //디폴트 생성자     

    public void drink(){
        thirsty = thirsty-30;
    }

    public Player(String name, int thirsty) {       //alt+enter 하고 general-construc 눌리고 name,thirsty 체크하고 엔터하면 
        this.name = name;                           // 이렇게 3줄나옴
        this.thirsty = thirsty;                     //
    }
}

public class OOP01 {
    public static void main(String[] args) {
        Player P1 = new Player("홍길동",100);
        Player P2 = new Player("임꺽정",100);
        
        System.out.println(P1.name);
        System.out.println(P2.name);
        P1.drink();
        System.out.println(P1.thirsty);
        System.out.println(P2.thirsty);
    }
}
