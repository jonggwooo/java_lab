package ex05.ch040;

class DarkTempler extends ProtossUnit{
    
    public DarkTempler(String name, int hp, int attack){
        super(name,hp, attack);
    }
}
class Dragoon extends ProtossUnit {
    
    public Dragoon(String name, int hp, int attack){
        super(name,hp, attack);
    }
}
class Zealot extends ProtossUnit{
   
    public Zealot(String name, int hp, int attack){
        super(name,hp, attack);
    }
}
abstract class ProtossUnit{
    String name;
    int hp;
    int attack;
    
    public ProtossUnit(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
}
public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2){

     u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
       ProtossUnit z1 = new Zealot("질럿1",100,10);
       ProtossUnit d1 = new Dragoon("드라군1",100,10);

       attack(z1, d1);
    }


}