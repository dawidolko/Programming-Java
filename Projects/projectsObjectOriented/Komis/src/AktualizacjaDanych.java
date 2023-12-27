import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AktualizacjaDanych {
    private KomisSamochodowy komis;

    public AktualizacjaDanych(KomisSamochodowy komis, Scanner scanner) throws SQLException {
        this.komis = komis;
        System.out.println("Podaj ID pojazdu, którego dane chcesz zaktualizować:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Wybierz dane do aktualizacji:");
        System.out.println("1. Marka samochodu");
        System.out.println("2. Model samochodu");
        System.out.println("3. Rok produkcji");
        System.out.println("4. Pojemność silnika");
        System.out.println("5. Moc silnika");
        System.out.println("6. Cena");
        System.out.println("7. Kolor");
        System.out.println("8. Rodzaj paliwa");
        System.out.println("9. Powrót");

        int opcja = scanner.nextInt();
        scanner.nextLine();

        if (opcja == 9) {
            System.out.println("Anulowano aktualizację danych.");
            return;
        }

        String column = getColumnName(opcja);

        System.out.println("Podaj nową wartość dla " + column + ":");
        String newValue = scanner.nextLine();

        String query = "UPDATE samochody SET " + column + " = ? WHERE id = ?";
        PreparedStatement preparedStatement = komis.getConnection().prepareStatement(query);
        preparedStatement.setString(1, newValue);
        preparedStatement.setInt(2, id);

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Dane zostały zaktualizowane.");
        } else {
            System.out.println("Nie udało się zaktualizować danych.");
        }
    }

    private static String getColumnName(int option) {
        switch (option) {
            case 1:
                return "marka_samochodu";
            case 2:
                return "model_samochodu";
            case 3:
                return "rok_produkcji";
            case 4:
                return "pojemnosc_silnika";
            case 5:
                return "moc_silnika";
            case 6:
                return "cena";
            case 7:
                return "kolor";
            case 8:
                return "rodzaj_paliwa";
            default:
                return "";
        }
    }
}

