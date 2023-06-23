package ex03;

public class Coin2 {
    final int money = 120005160; // scanner 로 수정하기
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    void printRestMoney(int m) { // 행위
        count = restMoney / m;
        System.out.println(m + "원 : " + count);
        restMoney = restMoney % m;
    }

    public static void main(String[] args) {
        Coin2 c2 = new Coin2();
       c2.printRestMoney(500);
    }
}