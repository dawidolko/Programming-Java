import java.sql.*;
import java.util.Scanner;

public class WyszukajSamochod {
    private KomisSamochodowy komis;

    public WyszukajSamochod(KomisSamochodowy komis, Scanner scanner) throws SQLException {
        this.komis = komis;
        System.out.println("Podaj minimalną pojemność silnika (cm^3):");
        int minimalnaPojemnoscSilnika = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj minimalny rok produkcji:");
        int minimalnyRokProdukcji = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj maksymalną cenę (zl):");
        int maksymalnaCena = scanner.nextInt();
        scanner.nextLine();

        String query = "SELECT * FROM samochody WHERE pojemnosc_silnika >= ? AND rok_produkcji >= ? AND cena <= ?";
        PreparedStatement preparedStatement = komis.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, minimalnaPojemnoscSilnika);
        preparedStatement.setInt(2, minimalnyRokProdukcji);
        preparedStatement.setInt(3, maksymalnaCena);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            WyswietlSamochod.WyswietlSamochod(resultSet);
        }
    }
}
