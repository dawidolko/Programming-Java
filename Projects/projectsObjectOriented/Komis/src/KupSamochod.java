import java.sql.*;
import java.util.Scanner;

public class KupSamochod {
    private KomisSamochodowy komis;

    public KupSamochod(KomisSamochodowy komis, Scanner scanner) throws SQLException {
        this.komis = komis;
        scanner.nextLine();

        System.out.println("Podaj markę samochodu:");
        String marka_samochodu = scanner.nextLine();

        System.out.println("Podaj model samochodu:");
        String model_samochodu = scanner.nextLine();

        System.out.println("Podaj rok produkcji samochodu:");
        int rok_produkcji = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj pojemność silnika (cm^3):");
        int pojemnosc_silnika = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj moc silnika (KM):");
        int moc_silnika = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj cenę samochodu (zl):");
        int cena = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj kolor samochodu:");
        String kolor = scanner.nextLine();

        System.out.println("Podaj rodzaj paliwa samochodu:");
        String rodzaj_paliwa = scanner.nextLine();

        String query = "INSERT INTO samochody (marka_samochodu, model_samochodu, rok_produkcji, pojemnosc_silnika, moc_silnika, cena, kolor, rodzaj_paliwa) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = komis.getConnection().prepareStatement(query);
        preparedStatement.setString(1, marka_samochodu);
        preparedStatement.setString(2, model_samochodu);
        preparedStatement.setInt(3, rok_produkcji);
        preparedStatement.setInt(4, pojemnosc_silnika);
        preparedStatement.setInt(5, moc_silnika);
        preparedStatement.setInt(6, cena);
        preparedStatement.setString(7, kolor);
        preparedStatement.setString(8, rodzaj_paliwa);
        preparedStatement.executeUpdate();

        System.out.println("Samochód został dodany do bazy danych.");
    }
}
