import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class Main {
    public static void playSound() {
        try {
            File soundFile = new File("src/please_calm_my_mind.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnector.connect()) {
            // Przykładowe zapytanie do bazy danych
            String query = "SELECT id, typ, PIN FROM karty";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String typ = resultSet.getString("typ");
                    String PIN = resultSet.getString("PIN");
                    // Tutaj możesz przetwarzać dane z bazy danych
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Dashboard dashboardMenu = new Dashboard();
        playSound();
        dashboardMenu.setVisible(true);
    }

}


