import java.util.Scanner;

public class Menu {
    private String keyboardScan;
    public Warrior warrior = null;
    public Wizard wizard = null;
    public String characterChosen;

    public String startGame() {
        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        do {
            this.showMenu();
        if (keyboardScan.equals("C")) {
            System.out.println("Ok! Let's create your character!");
            characterChosen = this.chooseCharacter(); /** instanciar objetos dentro dessa função */

        } else if (keyboardScan.equals("S")) {
            /** criar função this.showInfo(); */
        } else if (keyboardScan.equals("M")) {
            System.out.println(characterChosen); //appeler la function modifier character
            } else if (keyboardScan.equals("Q")) {
                toQuit();
            }
            return keyboardScan;
        } while(!(keyboardScan.equals("Q")));
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

        public String chooseCharacter () {
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
                warrior = new Warrior();
                character = "Warrior";
                System.out.println("A " + character + "? Good choice!");
                this.createWarrior(warrior);
            } else if (character.equals("WZ")) {
                wizard = new Wizard();
                character = "Wizard";
                System.out.println("A " + character + "? Good choice!");
                this.createWizard(wizard);

            } else if (character.equals("Q")) {
                toQuit();
            }
            return character;
        }

        public void createWarrior (Warrior warrior){
            //String warriorWeapon = warrior.getWeapon();
            //String warriorShield = warrior.getShield();
            System.out.println("How do you want to call your warrior?");
            keyboardScan = scanKeyboard();
            warrior.setWarriorName(keyboardScan);
            String warriorName = warrior.getWarriorName();
            System.out.println("Choose your life points (5-10):");
            keyboardScan = scanKeyboard();
            warrior.setWarriorLife(Integer.parseInt(keyboardScan));
            int warriorLife = warrior.getWarriorLife();
            System.out.println("Choose your attack points (5-10):");
            keyboardScan = scanKeyboard();
            warrior.setWarriorAttack(Integer.parseInt(keyboardScan));
            int warriorAttack = warrior.getWarriorAttack();
            System.out.println("Welcome to life, " + warriorName + "! Are you ready to start?");
            System.out.println("Let's go!");
            System.out.println("This is you:");
            System.out.println("Name: " + warriorName);
            System.out.println("Life points: " + warriorLife);
            System.out.println("Attack points: " + warriorAttack);
            //System.out.println("Weapon: " + warriorWeapon);
            //System.out.println("Filter: " + warriorShield);
            //menuShowInfo();
        }

        public void createWizard (Wizard wizard){
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
            //menuShowInfo();
        }

        public void toQuit () {
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
    }

