import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Random;

public class MainRandomPassword {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnector.connect()) {
            if (connection != null) {
                HashMap<String, String> generatedPins = new HashMap<>();
                Random random = new Random();

                String[] cardTypes = {
                        "Visa",
                        "American Express",
                        "Visa Electron",
                        "Mastercard",
                        "Diners Club",
                        "Japan Credit Bureau"
                };

                for (String cardType : cardTypes) {
                    String pin = String.format("%04d", random.nextInt(10000));
                    generatedPins.put(cardType, pin);

                    updateCardPin(connection, cardType, pin);

                    System.out.println(cardType + ": " + pin);
                }
            } else {
                System.err.println("Nie udało się połączyć z bazą danych.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Dashboard dashboardMenu = new Dashboard();
        Dashboard.playSound();
        dashboardMenu.setVisible(true);
    }

    private static void updateCardPin(Connection connection, String cardType, String newPin) throws SQLException {
        String updateQuery = "UPDATE karty SET PIN = '" + newPin + "' WHERE typ = '" + cardType + "'";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(updateQuery);
        }
    }
}
