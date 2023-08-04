import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
    }

    public void createWarrior(Menu menu, Character character) {
        System.out.println("How do you want to call your " + character + "?");
        switch (character) {
            case WARRIOR:
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
}