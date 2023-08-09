import java.util.Scanner;

public class Menu {
    private String keyboardScan;
    public Warrior warrior = null;
    public Wizard wizard = null;
    public Weapon weapon = null;
    public Spell spell = null;
    public String characterChosen;

    public void startGame() {
        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        do {
            this.showMenu();
            switch (keyboardScan) {
                case "C" -> {
                    System.out.println("Ok! Let's create your character!");
                    characterChosen = this.chooseCharacter();
                }
                case "S" -> {
                    this.showInfo();
                }
                case "M" -> {
                    //switch
                    //this.modifyCharacter(characterChosen);appeler la function modifier character
                }
                case "Q" -> {
                    toQuit();
                }
            }
        } while (!(keyboardScan.equals("Q")));
    }

    public void showMenu() {
        do {
            System.out.println("Please choose an option:");
            System.out.println("Create new character(C)");
            System.out.println("Show character information(S)");
            System.out.println("Modify your character(M)");
            System.out.println("Play(P)");
            System.out.println("Quit(Q)");
            keyboardScan = scanKeyboard();
        } while (!(keyboardScan.equals("C") || keyboardScan.equals("S") || keyboardScan.equals("M") || keyboardScan.equals("P") || keyboardScan.equals("Q")));
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
            }
            case "WZ" -> {
                wizard = new Wizard();
                character = "Wizard";
                System.out.println("A " + character + "? Good choice!");
                this.createWizard(wizard);
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
        warrior.setWarriorName(keyboardScan);
        String warriorName = warrior.getWarriorName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.setWarriorLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.setWarriorAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + warriorName + "! Are you ready to start?");
        System.out.println("Let's go!");
    }

    public void createWizard(Wizard wizard) {
        String wizardName = wizard.getWizardName();
        int wizardLife = wizard.getWizardLife();
        int wizardAttack = wizard.getWizardAttack();
        String wizardSpell = wizard.spell.getSpell();
        String wizardFilter = wizard.spell.getFilter();
        System.out.println("How do you want to call your wizard?");
        keyboardScan = scanKeyboard();
        wizardName = keyboardScan;
        System.out.println("Choose your life points (3-6):");
        keyboardScan = scanKeyboard();
        wizardLife = Integer.parseInt(keyboardScan);
        System.out.println("Choose your attack points (8-15):");
        keyboardScan = scanKeyboard();
        wizardAttack = Integer.parseInt(keyboardScan);
        System.out.println("Welcome to life, " + wizardName + "! Are you ready to start?");
        System.out.println("Let's go!");
        this.showInfo();
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
                System.out.println("Name: " + warrior.getWarriorName());
                System.out.println("Life points: " + warrior.getWarriorLife());
                System.out.println("Attack points: " + warrior.getWarriorAttack());
            }
            //System.out.println("Weapon: " + warrior.getWeapon());
            //System.out.println("Shield: " + warrior.getShield());
            case "Wizard" -> {
                System.out.println("Name: " + wizard.getWizardName());
                System.out.println("Life points: " + wizard.getWizardLife());
                System.out.println("Attack points: " + wizard.getWizardAttack());
            }
            //System.out.println("Spell: " + wizard.getSpell());
            //System.out.println("Filter: " + wizard.getFilter());
        }
    }

    modifyCharacter() {
        switch (characterChosen) {
            case "Warrior" -> {
                System.out.println("Name: " + warrior.getWarriorName());
                String name = warrior.getWarriorName();

                System.out.println("Life points: " + warrior.getWarriorLife());
                System.out.println("Attack points: " + warrior.getWarriorAttack());
            }
            //System.out.println("Weapon: " + warrior.getWeapon());
            //System.out.println("Shield: " + warrior.getShield());
            case "Wizard" -> {
                System.out.println("Name: " + wizard.getWizardName());
                System.out.println("Life points: " + wizard.getWizardLife());
                System.out.println("Attack points: " + wizard.getWizardAttack());
            }
            //System.out.println("Spell: " + wizard.getSpell());
            //System.out.println("Filter: " + wizard.getFilter());
        }
    }
}

