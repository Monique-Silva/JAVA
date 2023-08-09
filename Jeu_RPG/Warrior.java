public class Warrior extends Character {
    //private String name;
    //private int life;
    //private int attack;
    private Weapon weapon;
    private Weapon shield;

    public Warrior() {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
        this.weapon = null;
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
