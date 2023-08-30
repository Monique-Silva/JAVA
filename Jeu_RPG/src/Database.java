package src;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.*;

public class Database {
    private static Connection connection; //objet pour se connecter a la base de données

    public static Connection getConnection() {
        if (connection == null) {
            try {
                InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(".env");
                Properties prop = new Properties();
                prop.load(in);

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/Heroes", prop.getProperty("database.username"), prop.getProperty("database.password"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    //etape 2. connexion à la base:
    public static List<Character> getCharacter() throws SQLException {
        List<Character> heroes = new ArrayList<Character>(); //initialisation de la liste des hero

        Statement statement = getConnection().createStatement();

        //etape 3. execution de la requete:
        ResultSet result = statement.executeQuery("SELECT * FROM `Character`;");

        //etape 4. recuperation des données:
        while (result.next()) {
            Character character = null;
            String type = result.getString("type");
            if (type.equals("Warrior")) {
                character = new Warrior(result.getString("name"), result.getInt("life"), result.getInt("attack"));
            }
            if (type.equals("Wizard")) {
                character = new Wizard(result.getString("name"), result.getInt("life"), result.getInt("attack"));
            }
            String name = result.getString("name");
            Integer life = result.getInt("life");
            Integer attack = result.getInt("attack");
            String power = result.getString("power");
            String shield = result.getString("shield");

            heroes.add(character);
        }

        return heroes;
    }
}