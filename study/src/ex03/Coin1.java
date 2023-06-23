package ex03;

    public class Coin1 {
        public static void main(String[] args) {
            // 500, 100, 50, 10 (개수를 최소로 해서 주세요.)
            final int money = 2680; // scanner 로 수정하기
            int restMoney = money; // 남은금액 변수 만들기
            int count; // 동전 개수를 담을 변수
    
            int tempMoney; // 선언
            int[] ab = {500, 100, 50, 10}; // 배열
    
    
            for(int i=0; i<4 ; i++){
    
            tempMoney=ab[i];
            count = restMoney / tempMoney; // 5
            System.out.println(tempMoney+"원 : " + count);
            restMoney = restMoney % tempMoney;
            }
    

            
            // for문,배열로 4줄로만 만들기
        }   
    }
    

