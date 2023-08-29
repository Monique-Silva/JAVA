package src;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.*;

public class Database {
    private static Connection connection; //objet pour se connecter a la base de données

    //etape 1. chargement du driver:
    private Database() throws Exception {
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(".env");
        Properties prop = new Properties();
        prop.load(in);

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeurpg", prop.getProperty("database.username"), prop.getProperty("database.password"));
    }

    public static Connection getInstance() {
        if (connection == null) {
            try {
                new Database();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    //etape 2. connexion à la base:
    public static List<Character> getCharacter() throws SQLException {
        List<Character> heroes = new ArrayList<Character>(); //initialisation de l'objet hero
        Statement statement; //objet pour faire la requete sql
        ResultSet result; //represente le resultat pour etre manipulé


        statement = connection.createStatement();

        //etape 3. execution de la requete:
        result = statement.executeQuery("SELECT * FROM hero;");

        //etape 4. recuperation des données:
        while (result.next()) {
            String type = result.getString("type");
            String nom = result.getString("nom");
            Integer niveauVie = result.getInt("niveauVie");
            Integer niveauForce = result.getInt("niveauForce");
            String armeOUsort = result.getString("armeOUsort");
            String bouclier = result.getString("bouclier");
            Character character;
            heroes.add(character);
        }
    return heroes;
    }
}