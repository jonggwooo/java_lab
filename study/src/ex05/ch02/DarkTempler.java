package ex05.ch02;

public class DarkTempler extends ProtossUnit{
    String name;
    int hp;
    int attack;

    
    public DarkTempler(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public String getName() {
        return name;
    }
}
