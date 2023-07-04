import java.sql.ResultSet;
import java.sql.SQLException;

public class WyswietlSamochod {
    public static void WyswietlSamochod(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String marka_samochodu = resultSet.getString("marka_samochodu");
        String model_samochodu = resultSet.getString("model_samochodu");
        int rok_produkcji = resultSet.getInt("rok_produkcji");
        int pojemnosc_silnika = resultSet.getInt("pojemnosc_silnika");
        int moc_silnika = resultSet.getInt("moc_silnika");
        int cena = resultSet.getInt("cena");
        String kolor = resultSet.getString("kolor");
        String rodzaj_paliwa = resultSet.getString("rodzaj_paliwa");

        System.out.println("================================");
        System.out.println("ID: " + id);
        System.out.println("Marka: " + marka_samochodu);
        System.out.println("Model: " + model_samochodu);
        System.out.println("Rok produkcji: " + rok_produkcji);
        System.out.println("Pojemność silnika (cm^3): " + pojemnosc_silnika);
        System.out.println("Moc silnika (KM): " + moc_silnika);
        System.out.println("Cena (zl): " + cena);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rodzaj paliwa: " + rodzaj_paliwa);
        System.out.println("================================");
    }
}
