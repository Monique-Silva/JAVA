package src.main.fr.campus.java.dnd;

import src.main.fr.campus.java.dnd.menu.Menu;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {

        Menu menu = new Menu();
        menu.startGame();
    }
}