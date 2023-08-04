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
    String characterChoosed = character.createCharacter(); /** problema: quando o jogador sai do jogo, essa função da escolha do personagem roda */
        if (characterChoosed.equals("Warrior")) {
        warrior = new Warrior();
        warrior.createWarrior(menu);
    } else if (characterChoosed.equals("Wizard")) {
        wizard = new Wizard();
        wizard.createWizard(menu);
    }
    Warrior warrior = null;
    Wizard wizard = null;
    /** criar uma condição com o retorno do stargame pra continuaR ou não o jogo */
    
}
