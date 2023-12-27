import java.sql.*;
import java.util.Scanner;

public class SprzedajSamochod {
    private KomisSamochodowy komis;

    public SprzedajSamochod(KomisSamochodowy komis, Scanner scanner) throws SQLException {
        this.komis = komis;
        System.out.println("Podaj ID samochodu do sprzedaży:");
        int id = scanner.nextInt();

        String query = "DELETE FROM samochody WHERE id = ?";
        PreparedStatement preparedStatement = komis.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows > 0) {
            System.out.println("Samochód został sprzedany.");
        } else {
            System.out.println("Nie znaleziono samochodu o podanym ID.");
        }
    }
}
