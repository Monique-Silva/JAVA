public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startGame();
        menu.createCharacter();  /** problema: quando o jogador sai do jogo, essa função da escolha do personagem roda */

        character
        Wizard wizard = new Wizard();
        wizard.createWizard();
        /** chamar a função do personagem se for o caso, tem que passar essa chamada pro menu, mesma coisa com warrior */
        Warrior warrior = new Warrior();

        /** chamar todas as funções conforme necessidade */
    }

}

/**
 * Classe onde o programa vai ser iniciado e executado. Deve conter todas as funções que vão chamar as outras classes e funções.
 */