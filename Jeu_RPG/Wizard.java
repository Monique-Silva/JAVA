
public class Wizard {
    private String name;
    private int life;
    private int attack;

    public Wizard () {
        this.name = "Hermione";
        this.life = 3;
        this.attack = 8;
    }
    public Wizard (String name) {
        this.name = name;
        this.life = 4;
        this.attack = 10;
    }
    public Wizard (String name, int life, int attack) {
        this.name = name;
        this.life = 6;
        this.attack = 15;
    }

    public void createWizard() {
        /** choose your name
         * choose your ...
         */
    }

}
/** Classe do mágico, deve conter 3 construtores (sem parâmetros), com nome//life/força de ataque)
 * Attributs Magicien : Nom, Niveau de vie (3-6), Force d’attaque (8-15), Sort, Philtre
 */
