public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String login;
    private String password;

    public User(int id, String firstName, String lastName, String position, String login, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getPosition() {
        return position;
    }


    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }


    public String toString() {
        return "ID: " + id + "\n" +
                "Imię: " + firstName + "\n" +
                "Nazwisko: " + lastName + "\n" +
                "Stanowisko: " + position + "\n" +
                "Login: " + login + "\n" +
                "Hasło: " + password;
    }
}
