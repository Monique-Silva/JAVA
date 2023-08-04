import java.util.Scanner;

public class Menu {
    public void startGame() { /**função de introdução do jogo com opções de criar personnagem ou sair*/
        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        String optionChoosed;
        do {
            System.out.println("Please choose an option: Create new character (Y) / Quit (Q)");
            Scanner keyboard = new Scanner(System.in);
            optionChoosed = keyboard.nextLine().toUpperCase();
        } while (!(optionChoosed.equals("Y") || optionChoosed.equals("Q")));
        if (optionChoosed.equals("Y")) {
            System.out.println("Ok! Let's create your character!");
        } else if (optionChoosed.equals("Q")) {
            System.out.println("Are you sure you want to quit (Y/N)?");
            Scanner keyboard2 = new Scanner(System.in);
            optionChoosed = keyboard2.nextLine().toUpperCase();
            if (optionChoosed.equals("Y")) {
                System.out.println("Ok, see you next time!");
            }
        }
    }

    public void createCharacter() {
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
        System.out.println(" A " + character + "? Good choice!");
    }
    }
/**
 * criar função createCharacter()
 * criar função modificar personagem
 * <p>
 * Classe pra estruturar o jogo, utilizando funções:
 * Criar novo personagem (criar uma função ou uma classe ?)
 * Sair do jogo (função).
 * A função criarPersonagem deve perguntar o tipo e informá-lo (escolha e println).
 * Durante a criação, deve existir saídas para mostrar as infos do personagem, escolha quit)
 * E para modificar as informações (println info , escolha modificação, escolha quit).
 * A qualquer momento é possível sair do jogo.
 */

/**
 * Classe pra estruturar o jogo, utilizando funções:
 * Criar novo personagem (criar uma função ou uma classe ?)
 * Sair do jogo (função).
 * A função criarPersonagem deve perguntar o tipo e informá-lo (escolha e println).
 * Durante a criação, deve existir saídas para mostrar as infos do personagem, escolha quit)
 * E para modificar as informações (println info , escolha modificação, escolha quit).
 * A qualquer momento é possível sair do jogo.
 */