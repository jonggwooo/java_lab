package ex04;

import javax.sound.sampled.SourceDataLine;

class Cal02{
    void divide(int n1,int n2){  System.out.println("나누기 : "+(n1/n2));}
    void multi(int n1,int n2){ System.out.println("곱하기 : "+(n1*n2));}
    void minus(int n1,int n2){   System.out.println("빼기 : "+(n1-n2));}
    void add(int n1,int n2){System.out.println("더하기 : "+(n1+n2));}; 
        
    }//스택을 종료하고 , 복귀주소를 확인하고 복귀한다.




public class Meth02 {
    public static void main(String[] args) {
       Cal02 c1 = new Cal02();
       c1.add(10,5);
       c1.minus(10,5);
       c1.multi(10,5);
       c1.divide(10,5);
    //    Cal02 c2 = new Cal02();
    //    c2.add(20,30);
    //    c1.minus();
    //    c1.multi();
    //    c1.divide();
    }
}
