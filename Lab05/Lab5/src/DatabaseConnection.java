public class DatabaseConnection {
    private String username;
    private String password;
    private String url;

    public DatabaseConnection(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public void connect() {
        // tu kod do łączenia z bazą danych
    }

    public void disconnect() {
        // tu kod do rozłączania z bazą danych
    }
}