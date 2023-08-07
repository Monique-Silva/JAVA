import java.util.Scanner;

public class Menu extends Main {
    public String keyboardScan;

    public String startGame() {
        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        do {
            System.out.println("Please choose an option: Create new character(C) / Quit(Q)");
            keyboardScan = scanKeyboard();
        } while (!(keyboardScan.equals("C") || keyboardScan.equals("Q")));
        if (keyboardScan.equals("C")) {
            System.out.println("Ok! Let's create your character!");
            String characterChoosed = createCharacter();
            switch (characterChoosed) {
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
        return keyboardScan;
    }

        public String scanKeyboard() {
        String optionChoosed;
        Scanner keyboard = new Scanner(System.in);
        optionChoosed = keyboard.nextLine().toUpperCase();
        return optionChoosed;
    }

        public String createCharacter() {
        String character;
        do {
            System.out.println("Choose your character: Warrior (WR) or Wizard (WZ)");
            Scanner keyboard = new Scanner(System.in);
            character = keyboard.nextLine().toUpperCase();
        } while (!(character.equals("WR") || character.equals("WZ")));
        if (character.equals("WR")) {
            character = "Warrior";
        } else if (character.equals("WZ")) {
            character = "Wizard";
        }
        System.out.println("A " + character + "? Good choice!");
        return character;
    }

        public void createWarrior (Warrior warrior){
        System.out.println("How do you want to call your warrior?");
        keyboardScan = scanKeyboard();
        warrior.name = keyboardScan;
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.life = Integer.parseInt(keyboardScan);
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.attack = Integer.parseInt(keyboardScan);
        System.out.println("Welcome to life, " + warrior.name + "! Are you ready to start?");
        System.out.println("Let's go!");
    }

        public void createWizard (Wizard wizard){
        System.out.println("How do you want to call your wizard?");
        keyboardScan = scanKeyboard();
        wizard.name = keyboardScan;
        System.out.println("Choose your life points (3-6):");
        keyboardScan = scanKeyboard();
        wizard.life = Integer.parseInt(keyboardScan);
        System.out.println("Choose your attack points (8-15):");
        keyboardScan = scanKeyboard();
        wizard.attack = Integer.parseInt(keyboardScan);
        System.out.println("Welcome to life, " + wizard.name + "! Are you ready to start?");
        System.out.println("Let's go!");
    }
    }

