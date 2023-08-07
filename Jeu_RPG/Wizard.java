
public class Wizard {
    public String name;
    public int life;
    public int attack;

    public Wizard () {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
    }
    public Wizard (String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
    }
    public Wizard (String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

}