public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.loadUsersFromFile("users.txt");

        Gui gui = new Gui(loginSystem);
        gui.start();
    }
}