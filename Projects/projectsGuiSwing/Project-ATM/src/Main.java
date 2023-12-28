import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class Main {

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT id, typ, PIN FROM karty";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String typ = resultSet.getString("typ");
                    String PIN = resultSet.getString("PIN");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Dashboard dashboardMenu = new Dashboard();
        Dashboard.playSound();
        dashboardMenu.setVisible(true);
    }

}


