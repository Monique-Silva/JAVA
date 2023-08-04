import java.util.Scanner;

public class Menu {
    public String keyboardScan;
    public void startGame() { /**função de introdução do jogo com opções de criar personnagem ou sair*/
        System.out.println("Welcome to the Dungeons and Dragons adventure!");
        System.out.println("Should we begin?");
        do {
            System.out.println("Please choose an option: Create new character(C) / Quit(Q)");
            keyboardScan = scanKeyboard();
        } while (!(keyboardScan.equals("C") || keyboardScan.equals("Q")));
        if (keyboardScan.equals("C")) {
            System.out.println("Ok! Let's create your character!");
        } else if (keyboardScan.equals("Q")) {
            System.out.println("Are you sure you want to quit (Y/N)?");
            Scanner keyboard2 = new Scanner(System.in);
            keyboardScan = keyboard2.nextLine().toUpperCase();
            if (keyboardScan.equals("Y")) {
                System.out.println("Ok, see you next time!");
            }
        }
    }
    public String scanKeyboard() {
        String optionChoosed;
        Scanner keyboard = new Scanner(System.in);
        optionChoosed = keyboard.nextLine().toUpperCase();
        return optionChoosed;
    }
}
/**
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