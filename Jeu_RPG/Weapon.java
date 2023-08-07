public class Weapon {
    private String weapon = "Arrow";
    private int attack = 2;
    private String shield = "Wooden shield";

    public String toString() {
        return this.weapon;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public String getShield(){
        return this.shield;
    }
}
/** A classe da arma deve conter o nome e o nível de ataque */