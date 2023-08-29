import src.Character; //probleme de syntaxe, voir avec Johann
import src.Database;
import src.Menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.startGame();
        List<Character> character = Database.getCharacter();
        //Warrior warrior = new Warrior();
        //warrior.play();
    }
}