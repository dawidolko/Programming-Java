import java.sql.*;
import java.util.Scanner;

public class WszystkieSamochody {
    private KomisSamochodowy komis;

    public WszystkieSamochody(KomisSamochodowy komis) throws SQLException {
        this.komis = komis;
        String query = "SELECT * FROM samochody";
        Statement statement = komis.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            WyswietlSamochod.WyswietlSamochod(resultSet);
        }
    }
}
