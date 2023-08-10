
public class Wizard extends Character {
    public String spell;

    public Wizard() {
        super();
        this.spell = "Avada Kedavra!";
    }

    public Wizard(String name) {
        super(name);
        this.spell = "Avada Kedavra!";
    }

    public Wizard(String name, int life, int attack) {
        super(name, life, attack);
        this.spell = "Avada Kedavra!";
           }
}