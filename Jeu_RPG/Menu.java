import java.util.Scanner;

public class Menu {
    private String keyboardScan;
    private Character avatar;
    private String character;

    public Menu() {
        this.keyboardScan = null;
        this.avatar = null;
        this.character = null;
    }


    public void startGame() {
        System.out.println("Welcome to the Dungeons and Dragons adventure!\nShould we begin?");
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
        System.out.println("Menu:\nCreate character(C)\nQuit(Q)");
        keyboardScan = scanKeyboard();
        switch (keyboardScan) {
            case "C" -> {
                character = this.chooseCharacter();
            }
            case "Q" -> {
                this.toQuit();
            }
        }
    }

    public void showMenu2() {
        do {
            System.out.println("Menu:\nShow character information(I)\nModify your character(M)\nPlay(P)\nQuit(Q)");
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
            System.out.println("Ok! Let's create your character!\nChoose your character:\nWarrior(WR)\nWizard(WZ)\nQuit(Q)");
            Scanner keyboard = new Scanner(System.in);
            character = keyboard.nextLine().toUpperCase();
        } while (!(character.equals("WR") || character.equals("WZ") || character.equals("Q")));
        switch (character) {
            case "WR" -> {
                avatar = new Warrior();
                character = "warrior";
                System.out.println("A " + character + "? Good choice!");
                this.createCharacter(character);
            }
            case "WZ" -> {
                avatar = new Wizard();
                character = "wizard";
                System.out.println("A " + character + "? Good choice!");
                this.createCharacter(character);
            }
            case "Q" -> {
                toQuit();
            }
        }
        return character;
    }

    public void createCharacter(String character) {
        System.out.println("How do you want to call your " + character + "?");
        keyboardScan = scanKeyboard();
        avatar.setName(keyboardScan);
        switch (character) {
            case "warrior" -> {
                defineLevel("life", 5, 10);
            }
            case "wizard" -> {
                defineLevel("life", 3, 6);
            }
        }
        keyboardScan = scanKeyboard();
        avatar.setLife(Integer.parseInt(keyboardScan));
        switch (character) {
            case "warrior" -> {
                defineLevel("attack", 5, 10);
            }
            case "wizard" -> {
                defineLevel("attack", 8, 15);
            }
        }
        keyboardScan = scanKeyboard();
        avatar.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + avatar.getName() + "! Are you ready to start?\nLet's go!");
    }

    public void defineLevel(String points, int min, int max) {
        System.out.println("Choose your " + points + " points (" + min + "-" + max + "):");
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
        System.out.println("This is you:\n" + avatar);
    }

    public void modifyCharacter() {
        do {
        System.out.println("What do you want to change?\n" + avatar + "\nName(N)\nLife Points(L)\nAttack points(A)\nBack to menu(B)");
        keyboardScan = scanKeyboard();
            switch (keyboardScan) {
                case "N":
                    System.out.println("New name:");
                    keyboardScan = scanKeyboard();
                    avatar.setName(keyboardScan);
                    break;
                case "L":
                    System.out.println("New life points:");
                    keyboardScan = scanKeyboard();
                    avatar.setLife(Integer.parseInt(keyboardScan));
                    break;
                case "A":
                    System.out.println("New attack points:");
                    keyboardScan = scanKeyboard();
                    avatar.setAttack(Integer.parseInt(keyboardScan));
                    break;
                case "B":
                    this.showMenu2();
            }
            System.out.println("Do you want to change anything else?(Y/N)");
            keyboardScan = scanKeyboard();
        } while(! keyboardScan.equals("N"));
    }
}

