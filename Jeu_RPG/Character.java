import java.util.Scanner;

public class Character {
    public String createCharacter() {
        String character;
        do {
            System.out.println("Choose your character: Warrior (WR) or Wizard (WZ)");
            Scanner keyboard = new Scanner(System.in);
            character = keyboard.nextLine().toUpperCase();
        } while (!(character.equals("WR") || character.equals("WZ")));
        if(character.equals("WR")) {
            character = "Warrior";
        }
        else if(character.equals("WZ")) {
            character = "Wizard";
        }
        System.out.println("A " + character + "? Good choice!");
        return character;
    }
}
