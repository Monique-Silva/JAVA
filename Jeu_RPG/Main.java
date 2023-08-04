public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startGame();
        Warrior warrior = null;
        Wizard wizard = null;
        /** criar uma condição com o retorno do stargame pra continuaR ou não o jogo */
        Character character = new Character();
        String characterChoosed = character.createCharacter(); /** problema: quando o jogador sai do jogo, essa função da escolha do personagem roda */
        if (characterChoosed.equals("Warrior")) {
            warrior = new Warrior();
            warrior.createWarrior(menu);
        } else if (characterChoosed.equals("Wizard")) {
            wizard = new Wizard();
            wizard.createWizard();
        }



        /** chamar todas as funções conforme necessidade */
    }

}

/**
 * Classe onde o programa vai ser iniciado e executado. Deve conter todas as funções que vão chamar as outras classes e funções.
 */