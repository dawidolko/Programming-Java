package Lab4.ZadaniaLekcja.LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

public class Login extends JDialog
{
    private JPanel loginPanel;
    private JLabel iconLabel;
    private JLabel welcomeLabel;
    private JLabel loginFormLabel;
    private JButton okButton;
    private JButton cancelButton;
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private User user;

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight)
    {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

//    public static void main(String[] args)
//    {
//        Login loginGUI = new Login(null);
//        loginGUI.setVisible(true);
//        User user = loginGUI.user;
//        if(user != null)
//        {
//            System.out.println("Successful login " + user.getName());
//        }
//        else
//        {
//            System.out.println("Canceled login");
//        }
//    }

    public Login(JFrame parent)
    {
        super(parent);
        this.setTitle("Login to the application");
        this.setContentPane(this.loginPanel);
        this.setDefaultCloseOperation(parent.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(1200, 800));
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setLocationRelativeTo(parent);
        // this.setResizable(false); // Okno GUI nie może zmieniać wymiaru

        ImageIcon user_icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("image_user.png")));
        iconLabel.setIcon(resize(user_icon, 100, 100));

        okButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) { loginUser(); }
        });

        cancelButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) { dispose(); }
        });
    }

    private void loginUser()
    {
        String email = emailTextField.getText();
        String password = String.valueOf(passwordField.getPassword());

        UIManager.put("OptionPane.messageFont", new Font("Tw Cen MT", Font.PLAIN, 24));
        UIManager.put("OptionPane.messageForeground", new Color(0,0,0));
        UIManager.put("OptionPane.background", new Color(62,255,89));
        UIManager.put("Panel.background", new Color(62,255,89));
        UIManager.put("Button.background", new Color(211,77,213));
        UIManager.put("Button.foreground", new Color(0,0,0));
        UIManager.put("Button.font", new Font("Tw Cen MT", Font.PLAIN, 36));

        if(email.isEmpty() || password.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter all fields!", "Login error!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        user = autenticateUser(email, password);
        if(user != null)
        {
            dispose();
            Dashboard dashboardGUI = new Dashboard(null);
            dashboardGUI.setVisible(true);
        }
        else { JOptionPane.showMessageDialog(this, "Email or password invalid!", "Login error!", JOptionPane.WARNING_MESSAGE); }
    }

    private User autenticateUser(String email, String password)
    {
        User user = null;

        // Sprawdzenie połączenia do bazy danych
        final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stat = conn.createStatement();
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql); // Zapytanie SQL-owskie, odnośnie czy dany użytkownika należy do bazy danych
            preparedStatement.setString(1, email); // Zastąpienie pytajnika 1 emailem z LoginForm
            preparedStatement.setString(2, password); // Zastąpienie pytajnika 2 passwordem z LoginForm

            // Pobranie z bazy danych informacji o poszczególnym użytkowniku
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                user = new User(resultSet.getString("name"), resultSet.getString("email"), resultSet.getString("phone"), resultSet.getString("address"), resultSet.getString("password"));
            }

            // Zamknięcie połączenia
            stat.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }
}
