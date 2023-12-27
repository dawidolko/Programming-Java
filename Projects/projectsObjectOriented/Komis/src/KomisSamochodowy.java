import java.sql.*;

public class KomisSamochodowy {
    private Connection connection;

    public KomisSamochodowy() {
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/komis_samochodowy", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void zamknijPolaczenie() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
