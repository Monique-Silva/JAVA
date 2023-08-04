public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        String optionChoosed = menu.startGame();

        switch(optionChoosed) {
            case "Y":
                System.exit(0);
            case "N":
                System.out.println("Ok, let's start from the beginning.");
                optionChoosed = menu.startGame();
        }

        Warrior warrior = null;
        Wizard wizard = null;
        Character character = new Character();

        String characterChoosed = character.createCharacter();
        switch (characterChoosed) {
            case "Warrior":
                warrior = new Warrior();
                warrior.createWarrior(menu);
                break;
            case "Wizard":
                wizard = new Wizard();
                wizard.createWizard(menu);
                break;
        }

    }

}

/**
 * Classe onde o programa vai ser iniciado e executado. Deve conter todas as funções que vão chamar as outras classes e funções.
 */