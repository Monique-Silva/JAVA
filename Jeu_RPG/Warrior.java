public class Warrior {
    private String name;
    private int life;
    private int attack;

    public Warrior() {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
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

    public void createWarrior(Menu menu) {
        System.out.println("How do you want to call your warrior?");
        menu.keyboardScan = menu.scanKeyboard();
        this.name = menu.keyboardScan;
        System.out.println("Choose your life points (5-10):");
        menu.keyboardScan = menu.scanKeyboard();
        this.life = Integer.parseInt(menu.keyboardScan);
        System.out.println("Choose your attack points (5-10):");
        menu.keyboardScan = menu.scanKeyboard();
        this.attack = Integer.parseInt(menu.keyboardScan);
        System.out.println("Welcome to life, " + this.name + "! Are you ready to start?");
        System.out.println("Let's go!");
    }
}
