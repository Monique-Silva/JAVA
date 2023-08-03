import java.util.Scanner;

public class Main {
    public void isTyped(String option) {
        String optionChoosed;
        String optionConfirmed;
        //char finalOption;
        System.out.println("Please choose an option: Create new character (type Y) / Quit (type Q)");
        Scanner keyboard = new Scanner(System.in);
        optionChoosed = keyboard.nextLine();
        //finalOption = optionChoosed.charAt();
        System.out.println("You choose " + optionChoosed);
        if (optionChoosed.equals("Y")) {
            System.out.println("Ok! Let's create your character!");
        }
        if (optionChoosed.equals("Q")) {
            System.out.println("Are you sure you want to quit?");
            Scanner keyboard2 = new Scanner(System.in);
            optionConfirmed = keyboard2.nextLine();
            System.out.println("Ok, see you next time!");
        } else {
            System.out.println("Please select 'Y' or 'Q'");
        }
    }
}