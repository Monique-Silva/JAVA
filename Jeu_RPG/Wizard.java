
public class Wizard {
    private String name;
    private int life;
    private int attack;

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

    public String getWizardName() {
        return this.name;
    }

    public int getWizardLife() {
        return this.life;
    }

    public int getWizardAttack() {
        return this.attack;
    }

}