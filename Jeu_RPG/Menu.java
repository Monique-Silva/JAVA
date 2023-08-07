import java.util.Scanner;

public class Menu {
    private String keyboardScan;

    public String startGame() {
        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        do {
            System.out.println("Please choose an option:");
            System.out.println("Create new character(C)");
            System.out.println("Quit(Q)");
            keyboardScan = scanKeyboard();
        } while (!(keyboardScan.equals("C") || keyboardScan.equals("Q")));
        if (keyboardScan.equals("C")) {
            System.out.println("Ok! Let's create your character!");
            String characterChosen = createCharacter();
            switch (characterChosen) {
                case "Warrior":
                    Warrior warrior = new Warrior();
                    createWarrior(warrior);
                    break;
                case "Wizard":
                    Wizard wizard = new Wizard();
                    createWizard(wizard);
                    break;

            }
        } else if (keyboardScan.equals("Q")) {
            toQuit();
        }
        return keyboardScan;
    }

    public String scanKeyboard() {
        String optionChosen;
        Scanner keyboard = new Scanner(System.in);
        optionChosen = keyboard.nextLine().toUpperCase();
        return optionChosen;
    }

    public String createCharacter() {
        String character;
        do {
            System.out.println("Choose your character:");
            System.out.println("Warrior(WR)");
            System.out.println("Wizard(WZ)");
            System.out.println("Quit(Q)");
            Scanner keyboard = new Scanner(System.in);
            character = keyboard.nextLine().toUpperCase();
        } while (!(character.equals("WR") || character.equals("WZ") || character.equals("Q")));
        if (character.equals("WR")) {
            character = "Warrior";
            System.out.println("A " + character + "? Good choice!");
        } else if (character.equals("WZ")) {
            character = "Wizard";
            System.out.println("A " + character + "? Good choice!");
        } else if (character.equals("Q")) {
            toQuit();
        }
        return character;
    }

    public void createWarrior(Warrior warrior) {
        String warriorName = warrior.getWarriorName();
        int warriorLife = warrior.getWarriorLife();
        int warriorAttack = warrior.getWarriorAttack();
        String warriorWeapon = warrior.getWeapon();
        String warriorShield = warrior.getShield();
        System.out.println("How do you want to call your warrior?");
        keyboardScan = scanKeyboard();
        warriorName = keyboardScan;
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        warriorLife = Integer.parseInt(keyboardScan);
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        warriorAttack = Integer.parseInt(keyboardScan);
        System.out.println("Welcome to life, " + warriorName + "! Are you ready to start?");
        System.out.println("Let's go!");
        System.out.println("This is you:");
        System.out.println("Name: " + warriorName);
        System.out.println("Life points: " + warriorLife);
        System.out.println("Attack points: " + warriorAttack);
        System.out.println("Weapon: " + warriorWeapon);
        System.out.println("Filter: " + warriorShield);
        showInfo();
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
        System.out.println("This is you:");
        System.out.println("Name: " + wizardName);
        System.out.println("Life points: " + wizardLife);
        System.out.println("Attack points: " + wizardAttack);
        System.out.println("Spell: " + wizardSpell);
        System.out.println("Filter: " + wizardFilter);
        showInfo();
    }

    public void toQuit() {
        System.out.println("Are you sure you want to quit (Y/N)?");
        Scanner keyboard2 = new Scanner(System.in);
        keyboardScan = keyboard2.nextLine().toUpperCase();
        switch (keyboardScan) {
            case "Y":
                System.out.println("Ok, see you next time!");
                System.exit(0);
            case "N":
                System.out.println("Ok, let's start from the beginning.");
                keyboardScan = startGame();
        }
    }

    public void showInfo(){
        System.out.println("What do you want to do now?");
        System.out.println("Play (P)");
        System.out.println("Change character (C)");
        System.out.println("Quit (Q)");
        keyboardScan = scanKeyboard();
        switch(keyboardScan) {
            case "P":
                //continuação;
            case "C":
                createCharacter();
            case "Q":
                toQuit();
        }

    }
}

