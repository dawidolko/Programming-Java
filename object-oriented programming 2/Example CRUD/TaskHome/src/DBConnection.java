import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Dane do połączenia z bazą danych
    private static final String URL = "jdbc:mysql://localhost:3306/mystore";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Jeśli masz hasło, podaj je tutaj

    static {
        try {
            // Rejestracja sterownika JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Metoda do uzyskiwania połączenia z bazą danych
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
