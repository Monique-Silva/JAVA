
public class Wizard {
    private String name;
    private int life;
    private int attack;

    public Wizard () {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
    }
    public Wizard (String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
    }
    public Wizard (String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public void createWizard(Menu menu) {
        System.out.println("How do you want to call your wizard?");
        menu.keyboardScan = menu.scanKeyboard();
        this.name = menu.keyboardScan;
        System.out.println("Choose your life points (3-6):");
        menu.keyboardScan = menu.scanKeyboard();
        this.life = Integer.parseInt(menu.keyboardScan);
        System.out.println("Choose your attack points (8-15):");
        menu.keyboardScan = menu.scanKeyboard();
        this.attack = Integer.parseInt(menu.keyboardScan);
        System.out.println("Welcome to life, " + this.name + "! Are you ready to start?");
        System.out.println("Let's go!");
    }
}

/** Classe do mágico, deve conter 3 construtores (sem parâmetros), com nome//life/força de ataque)
 * Attributs Magicien : Nom, Niveau de vie (3-6), Force d’attaque (8-15), Sort, Philtre
 */
