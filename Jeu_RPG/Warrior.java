public class Warrior {
    public String name;
    public int life;
    public int attack;

    public Weapon weapon = new Weapon();

    public Warrior() {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
        this.weapon = weapon;
    }

    public Warrior(String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
    }

    public Warrior(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

}
