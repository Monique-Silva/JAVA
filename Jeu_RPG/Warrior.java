public class Warrior extends Character {
    private String weapon;
    private String shield;

    public Warrior() {
        super();
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    public Warrior(String name) {
        super(name);
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    public Warrior(String name, int life, int attack) {
        super(name, life, attack);
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }
}