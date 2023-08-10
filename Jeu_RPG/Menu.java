import java.util.Scanner;

public class Menu {
    private String keyboardScan;
    private Warrior warrior;
    private Wizard wizard;
    private Weapon weapon;
    private Spell spell;
    private String characterChosen;

    public Menu() {
        this.keyboardScan = null;
        this.warrior = null;
        this.wizard = null;
        this.weapon = null;
        this.spell = null;
        this.characterChosen = null;
    }


    public void startGame() {
        //Character w = new Warrior("Eric");
        //System.out.println(w.getName());
        //System.exit(0);


        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        this.showMenu1();
        do {
            this.showMenu2();
            switch (keyboardScan) {
                case "I" -> {
                    this.showInfo();
                }
                case "M" -> {
                    this.modifyCharacter();
                }
                case "Q" -> {
                    this.toQuit();
                }
            }
        } while (!(keyboardScan.equals("Q")));
    }

    public void showMenu1() {
        System.out.println("Menu:");
        System.out.println("Create character(C)"); /** trocar start por criar personagem */
        System.out.println("Quit(Q)");
        keyboardScan = scanKeyboard();
        switch (keyboardScan) {
            case "C" -> {
                characterChosen = this.chooseCharacter();
            }
            case "Q" -> {
                this.toQuit();
            }
        }
    }

    public void showMenu2() {
        do {
            System.out.println("Menu:");
            System.out.println("Show character information(I)");
            System.out.println("Modify your character(M)");
            System.out.println("Play(P)");
            System.out.println("Quit(Q)");
            keyboardScan = scanKeyboard();
        } while (!(keyboardScan.equals("I") || keyboardScan.equals("M") || keyboardScan.equals("P") || keyboardScan.equals("Q")));
    }

    public String scanKeyboard() {
        String optionChosen;
        Scanner keyboard = new Scanner(System.in);
        optionChosen = keyboard.nextLine().toUpperCase();
        return optionChosen;
    }

    public String chooseCharacter() {
        String character;
        do {
            System.out.println("Ok! Let's create your character!");
            System.out.println("Choose your character:");
            System.out.println("Warrior(WR)");
            System.out.println("Wizard(WZ)");
            System.out.println("Quit(Q)");
            Scanner keyboard = new Scanner(System.in);
            character = keyboard.nextLine().toUpperCase();
        } while (!(character.equals("WR") || character.equals("WZ") || character.equals("Q")));
        switch (character) {
            case "WR" -> {
                warrior = new Warrior();
                character = "Warrior";
                System.out.println("A " + character + "? Good choice!");
                this.createWarrior(warrior, characterChosen);
                //warrior.createCharacter();
            }
            case "WZ" -> {
                wizard = new Wizard();
                character = "Wizard";
                System.out.println("A " + character + "? Good choice!");
                this.createWizard(wizard, characterChosen);
            }
            case "Q" -> {
                toQuit();
            }
        }
        return character;
    }

    public void createWarrior(Warrior warrior, String characterChosen) {
        System.out.println("How do you want to call your warrior?");
        keyboardScan = scanKeyboard();
        warrior.setName(keyboardScan);
        String warriorName = warrior.getName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + warriorName + "! Are you ready to start?");
        System.out.println("Let's go!");
    }

    public void createWizard(Wizard wizard, String characterChosen) {
        System.out.println("How do you want to call your wizard?");
        keyboardScan = scanKeyboard();
        wizard.setName(keyboardScan);
        String wizardName = wizard.getName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        wizard.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        wizard.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + wizardName + "! Are you ready to start?");
        System.out.println("Let's go!");
    }

    public void toQuit() {
        System.out.println("Are you sure you want to quit (Y/N)?");
        Scanner keyboard2 = new Scanner(System.in);
        keyboardScan = keyboard2.nextLine().toUpperCase();
        switch (keyboardScan) {
            case "Y" -> {
                System.out.println("Ok, see you next time!");
                System.exit(0);
            }
            case "N" -> {
                System.out.println("Ok, let's start from the beginning.");
                this.startGame();
            }
        }
    }

    public void showInfo() {
        System.out.println("This is you:");
        switch (characterChosen) {
            case "Warrior" -> {
                System.out.println("Name: " + warrior.getName());
                System.out.println("Life points: " + warrior.getLife());
                System.out.println("Attack points: " + warrior.getAttack());
            }
            //System.out.println("Weapon: " + warrior.getWeapon());
            //System.out.println("Shield: " + warrior.getShield());
            case "Wizard" -> {
                System.out.println("Name: " + wizard.getName());
                System.out.println("Life points: " + wizard.getLife());
                System.out.println("Attack points: " + wizard.getAttack());
            }
            //System.out.println("Spell: " + wizard.getSpell());
            //System.out.println("Filter: " + wizard.getFilter());
        }
    }

    public void modifyCharacter() {
        switch (characterChosen) {
            case "Warrior" -> {
                System.out.println("Name: " + warrior.getName());
                System.out.println("New name:");
                keyboardScan = scanKeyboard();
                warrior.setName(keyboardScan);
                System.out.println("Name: " + warrior.getName());
                System.out.println("Life points: " + warrior.getLife());
                System.out.println("New life points:");
                keyboardScan = scanKeyboard();
                warrior.setLife(Integer.parseInt(keyboardScan));
                System.out.println("Life points: " + warrior.getLife());
                System.out.println("Attack points: " + warrior.getAttack());
                System.out.println("New attack points:");
                keyboardScan = scanKeyboard();
                warrior.setAttack(Integer.parseInt(keyboardScan));
                System.out.println("Attack points: " + warrior.getAttack());
            }
            case "Wizard" -> {
                System.out.println("Name: " + wizard.getName());
                System.out.println("New name:");
                keyboardScan = scanKeyboard();
                wizard.setName(keyboardScan);
                System.out.println("Name: " + wizard.getName());
                System.out.println("Life points: " + wizard.getLife());
                System.out.println("New life points:");
                keyboardScan = scanKeyboard();
                wizard.setLife(Integer.parseInt(keyboardScan));
                System.out.println("Life points: " + wizard.getLife());
                System.out.println("Attack points: " + wizard.getAttack());
                System.out.println("New attack points:");
                keyboardScan = scanKeyboard();
                wizard.setAttack(Integer.parseInt(keyboardScan));
                System.out.println("Attack points: " + wizard.getAttack());
            }
        }
    }
}

