import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FishDatabase {
    private Connection connection;

    public FishDatabase() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:fish.db");
            dropTable();
            createTable();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void dropTable() {
        String query = "DROP TABLE IF EXISTS Fish";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("Error drop table: " + e.getMessage());
        }
    }

    private void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS Fish (" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "SPECIES TEXT NOT NULL, " +
                "NAME TEXT NOT NULL, " +
                "TANK_SIZE INTEGER NOT NULL," +
                "MIN_PH INTEGER NOT NULL," +
                "MAX_PH INTEGER NOT NULL" +
                ")";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }

    public void addFish(Fish fish) {
        String query = "INSERT INTO Fish (SPECIES, NAME, TANK_SIZE, MIN_PH, MAX_PH) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, fish.getSpecies());
            statement.setString(2, fish.getName());
            statement.setInt(3, fish.getTankSize());
            statement.setInt(4, fish.getMinPh());
            statement.setInt(5, fish.getMaxPh());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error adding fish: " + e.getMessage());
        }
    }

    public boolean deleteFish(int id) {
        String query = "DELETE FROM Fish WHERE ID = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error deleting fish: " + e.getMessage());
            return false;
        }
    }

    public List<Fish> getFishBySpecies(String species) {
        List<Fish> fishList = new ArrayList<>();
        String query = "SELECT * FROM Fish WHERE SPECIES = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, species);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                int tankSize = resultSet.getInt("TANK_SIZE");
                int minpH = resultSet.getInt("MIN_PH");
                int maxpH = resultSet.getInt("MAX_PH");

                Fish fish = new Fish(id, species, name, tankSize, minpH, maxpH);
                fishList.add(fish);
            }
        } catch (SQLException e) {
            System.err.println("Error searching fish: " + e.getMessage());
        }

        return fishList;
    }

    public List<Fish> getAllFish() {
        List<Fish> fishList = new ArrayList<>();
        String query = "SELECT * FROM Fish";

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String species = resultSet.getString("SPECIES");
                String name = resultSet.getString("NAME");
                int tankSize = resultSet.getInt("TANK_SIZE");
                int minpH = resultSet.getInt("MIN_PH");
                int maxpH = resultSet.getInt("MAX_PH");

                Fish fish = new Fish(id, species, name, tankSize, minpH, maxpH);
                fishList.add(fish);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving fish data: " + e.getMessage());
        }

        return fishList;
    }

    public List<Fish> getFishForTank(int tankSize, int pHValue) {
        List<Fish> fishList = new ArrayList<>();
        String query = "SELECT * FROM Fish WHERE TANK_SIZE <= ? AND MIN_PH <= ? AND MAX_PH >= ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, tankSize);
            statement.setInt(2, pHValue);
            statement.setInt(3, pHValue);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String species = resultSet.getString("SPECIES");
                String name = resultSet.getString("NAME");
                int fishTankSize = resultSet.getInt("TANK_SIZE");
                int minPH = resultSet.getInt("MIN_PH");
                int maxPH = resultSet.getInt("MAX_PH");

                Fish fish = new Fish(id, species, name, fishTankSize, minPH, maxPH);
                fishList.add(fish);
            }
        } catch (SQLException e) {
            System.err.println("Error searching fish for tank: " + e.getMessage());
        }

        return fishList;
    }
}
