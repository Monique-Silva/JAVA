public class Warrior {
    private String name;
    private int life;
    private int attack;
    private Weapon weapon;
    private Weapon shield;

    public Warrior() {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
        //this.weapon = new Weapon();
    }

    public Warrior(String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
        //this.weapon = new Weapon();
    }

    public Warrior(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        //this.weapon = new Weapon();
    }

    public String getWarriorName() {
        return this.name;
    }

    public void setWarriorName(String name) {
        this.name = name;
    }

    public int getWarriorLife() {
        return this.life;
    }

    public void setWarriorLife(int life) {
        this.life = life;
    }

    public int getWarriorAttack() {
        return this.attack;
    }

    public void setWarriorAttack(int attack) {
        this.attack = attack;
    }

    public String getWeapon() {
        return this.weapon.getWeapon();
    } /** revisar a necessidade desse getter */

    //public void setWeapon(Weapon weapon) {
    //    this.weapon = weapon;
    //}

    public String getShield() {
        return this.weapon.getShield();
    }

    //public void setShield(Weapon shield) {
    //    this.shield = shield;
    //}

}
