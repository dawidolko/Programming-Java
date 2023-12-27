import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginSystem {
    private List<User> users;

    public LoginSystem() {
        users = new ArrayList<>();
    }

    public void loadUsersFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 6) {
                    int id = Integer.parseInt(data[0]);
                    String firstName = data[1];
                    String lastName = data[2];
                    String position = data[3];
                    String login = data[4];
                    String password = data[5];
                    User user = new User(id, firstName, lastName, position, login, password);
                    users.add(user);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku.");
            e.printStackTrace();
        }
    }

    public User findUserByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public boolean authenticateUser(User user, String password) {
        return user.getPassword().equals(password);
    }

    public User getUserById(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void displayAllUsers() {
        System.out.println("-----------------------------");
        for (User user : users) {
            System.out.println("[" + user.getId() + "] " + user.getFirstName() + " " + user.getLastName());
        }
        System.out.println("-----------------------------");
    }

    public void removeUser(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                System.out.println("\nUżytkownik o ID " + id + " został usunięty.\n");
                return;
            }
        }
        System.out.println("Nie znaleziono użytkownika.");
    }

    public void saveUsersToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                String line = user.getId() + ";" + user.getFirstName() + ";" + user.getLastName() + ";" +
                        user.getPosition() + ";" + user.getLogin() + ";" + user.getPassword();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Dane użytkowników zostały pomyślnie zapisane");
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisywania danych.");
            e.printStackTrace();
        }
    }

    public void createUserAndSaveToFile(int id, String firstName, String lastName, String position,
                                        String login, String password) {
        User user = new User(id, firstName, lastName, position, login, password);
        users.add(user);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(";");
            sb.append(firstName).append(";");
            sb.append(lastName).append(";");
            sb.append(position).append(";");
            sb.append(login).append(";");
            sb.append(password).append(System.lineSeparator());

            writer.write(sb.toString());
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku.");
        }
    }
}