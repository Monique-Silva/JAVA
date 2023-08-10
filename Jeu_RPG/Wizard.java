
public class Wizard extends Character {
    //private String name;
    //private int life;
    //private int attack;
    public Spell spell;

    public Wizard () {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
        this.spell = new Spell();
    }
    public Wizard (String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
        this.spell = new Spell();
    }
    public Wizard (String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.spell = new Spell();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return this.life;
    }
    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return this.attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
}