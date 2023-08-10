import java.util.Scanner;

public class Menu {
    private String keyboardScan;
    private Character avatar;
    //private Weapon weapon;
    //private Spell spell;
    private String characterChosen;

    public Menu() {
        this.keyboardScan = null;
        this.avatar = null;
        //this.weapon = null;
        //this.spell = null;
        this.characterChosen = null;
    }


    public void startGame() {
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
        System.out.println("Create character(C)");
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
                avatar = new Warrior();
                character = "Warrior";
                System.out.println("A " + character + "? Good choice!");
                this.createCharacter();
            }
            case "WZ" -> {
                avatar = new Wizard();
                character = "Wizard";
                System.out.println("A " + character + "? Good choice!");
                this.createCharacter();
            }
            case "Q" -> {
                toQuit();
            }
        }
        return character;
    }

    public void createCharacter() {
        System.out.println("How do you want to call your " + this.avatar + "?");
        keyboardScan = scanKeyboard();
        avatar.setName(keyboardScan);
        avatar.getName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        avatar.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        avatar.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + avatar.getName() + "! Are you ready to start?");
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
        System.out.println("Name: " + avatar.getName());
        System.out.println("Life points: " + avatar.getLife());
        System.out.println("Attack points: " + avatar.getAttack());
        switch (characterChosen) {
            case "Warrior" -> {
                //System.out.println("Weapon: " + avatar.getWeapon());
                //System.out.println("Shield: " + avatar.getShield());
            }
            case "Wizard" -> {
                //System.out.println("Spell: " + avatar.getSpell());
                //System.out.println("Filter: " + avatar.getFilter());
            }
        }
    }

    public void modifyCharacter() {
        System.out.println("Name: " + avatar.getName());
        System.out.println("New name:");
        keyboardScan = scanKeyboard();
        avatar.setName(keyboardScan);
        System.out.println("Name: " + avatar.getName());
        System.out.println("Life points: " + avatar.getLife());
        System.out.println("New life points:");
        keyboardScan = scanKeyboard();
        avatar.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Life points: " + avatar.getLife());
        System.out.println("Attack points: " + avatar.getAttack());
        System.out.println("New attack points:");
        keyboardScan = scanKeyboard();
        avatar.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Attack points: " + avatar.getAttack());
        switch (characterChosen) {
            case "Warrior" -> {
                /** adaptar os pontos life e attack */
            }
            case "Wizard" -> {
                /** adaptar os pontos life e attack */
            }
        }
    }
}

