import java.util.Scanner;

public class Menu {
    public String keyboardScan;

    public String startGame() { /**função de introdução do jogo com opções de criar personnagem ou sair*/
        String finalOption = null;
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
        return keyboardScan;
    }


    public String scanKeyboard() {
        String optionChoosed;
        Scanner keyboard = new Scanner(System.in);
        optionChoosed = keyboard.nextLine().toUpperCase();
        return optionChoosed;
    }
}