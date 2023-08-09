
public class Wizard extends Character {
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

    public void setWizardName(String name) {
        this.name = name;
    }

    public int getWizardLife() {
        return this.life;
    }
    public void setWizardLife(int life) {
        this.life = life;
    }

    public int getWizardAttack() {
        return this.attack;
    }
    public void setWizardAttack(int attack) {
        this.attack = attack;
    }
}