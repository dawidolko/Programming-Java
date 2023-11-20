package Lab4.ZadaniaLekcja.LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Objects;

public class Register extends JDialog
{
    private JPanel registerPanel;
    private JTextField nameTextField;
    private JTextField emailTextField;
    private JTextField phoneTextField;
    private JTextField addressTextField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerButton;
    private JButton cancelButton;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    private JLabel passwordLabel;
    private JLabel confirmPasswordLabel;
    private JLabel registerLabel;
    private JLabel iconLabel;
    private User user;

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight)
    {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

//    public static void main(String[] args)
//    {
//        Register registerGUI = new Register(null);
//        registerGUI.setVisible(true);
//        User user = registerGUI.user;
//        if(user != null)
//        {
//            System.out.println("Successful registration of " + user.getName());
//        }
//        else
//        {
//            System.out.println("Canceled registration");
//        }
//    }

    public Register(JFrame parent)
    {
        super(parent);
        this.setTitle("Create a new account");
        this.setContentPane(this.registerPanel);
        this.setDefaultCloseOperation(parent.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(1200, 800));
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setLocationRelativeTo(parent);
        // this.setResizable(false); // Okno GUI nie może zmieniać wymiaru

        ImageIcon human_plus_icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("image_human_plus.png")));
        iconLabel.setIcon(resize(human_plus_icon, 100, 100));
        
        registerButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) { registerUser(); }
        });

        cancelButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) { dispose(); }
        });
    }

    private void registerUser()
    {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String phone = phoneTextField.getText();
        String address = addressTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        String confirmPassword = String.valueOf(confirmPasswordField.getPassword());

        UIManager.put("OptionPane.messageFont", new Font("Tw Cen MT", Font.PLAIN, 24));
        UIManager.put("OptionPane.messageForeground", new Color(0,0,0));
        UIManager.put("OptionPane.background", new Color(255,212,36));
        UIManager.put("Panel.background", new Color(255,212,36));
        UIManager.put("Button.background", new Color(239,0,8));
        UIManager.put("Button.foreground", new Color(0,0,0));
        UIManager.put("Button.font", new Font("Tw Cen MT", Font.PLAIN, 36));

        if(name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty() || confirmPassword.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter all fields!", "Data error!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!isPhoneCorrect(phone))
        {
            JOptionPane.showMessageDialog(this, "Please enter correct phone number!", "Data error!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!password.equals(confirmPassword))
        {
            JOptionPane.showMessageDialog(this, "Please enter correct passwords in both fields!", "Data error!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Poprawność hasła:
        // Zawiera co najmniej 8 znaków i maksymalnie 20 znaków.
        // Zawiera co najmniej jedną cyfrę.
        // Zawiera co najmniej jeden wielki alfabet.
        // Zawiera co najmniej jeden mały alfabet.
        // Zawiera co najmniej jeden znak specjalny, który obejmuje !@#$%&*()-+=^.
        // Nie zawiera żadnych białych znaków.
        if(password.length()>=8 && password.length()<=20)
        {
            if(!isPasswordCorrect(password))
            {
                JOptionPane.showMessageDialog(this,
                        """
                        Please enter a password containing:
                        - at least one digit.
                        - at least one uppercase letter.
                        - at least one lowercase letter.
                        - at least one special character that includes !@#$%&*()-+=^.""", "Data error!", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter a password between 8 and 20 characters long!", "Data error!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        user = addUserToDatabase(name, email, phone, address, password);
        if(user != null) { dispose(); }
        else { JOptionPane.showMessageDialog(this, "Failed to register new user!", "Data error!", JOptionPane.WARNING_MESSAGE); }
    }

    private boolean isPhoneCorrect(String phone)
    {
        boolean phoneCorrect = false;
        int numbers = 0, i;
        for(i = 0; i < phone.length(); i++)
        {
            int ascii = phone.charAt(i);
            if(ascii>=48 && ascii<=57) { numbers++; }
            else { break; }
        }
        if(i==phone.length() && i==numbers) { phoneCorrect = true; }
        return phoneCorrect;
    }

    private boolean isPasswordCorrect(String password)
    {
        boolean passwordCorrect = false;
        int numbers = 0, big = 0, small = 0, special = 0, i;
        for(i = 0; i < password.length(); i++)
        {
            int ascii = password.charAt(i);
            if(ascii==33 || (ascii>=35 && ascii<=38) || (ascii>=40 && ascii<=43) || ascii==45 || ascii==61 || ascii==64 || ascii==94) { special++; }
            else if(ascii>=48 && ascii<=57) { numbers++; }
            else if(ascii>=65 && ascii<=90) { big++; }
            else if(ascii>=97 && ascii<=122) { small++; }
            else { break; }
        }
        if(numbers>=1 && big>=1 && small>=1 && special>=1 && i==password.length()) { passwordCorrect = true; }
        return passwordCorrect;
    }

    private User addUserToDatabase(String name, String email, String phone, String address, String password)
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
            String sql = "INSERT INTO users (name, email, phone, address, password) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql); // Polecenie SQL-owskie, odnośnie do dodania nowego użytkownika do bazy danych
            preparedStatement.setString(1,name); // Zastąpienie pytajnika 1 namem z RegisterForm
            preparedStatement.setString(2,email); // Zastąpienie pytajnika 2 emailem z RegisterForm
            preparedStatement.setString(3,phone); // Zastąpienie pytajnika 3 phonem z RegisterForm
            preparedStatement.setString(4,address); // Zastąpienie pytajnika 4 adddressem z RegisterForm
            preparedStatement.setString(5,password); // Zastąpienie pytajnika 5 passwordem z RegisterForm

            // Wpisanie do poszczególnych wierszów tabeli danych danego użytkownika
            int addedRows = preparedStatement.executeUpdate();
            if(addedRows > 0)
            {
                user = new User(name, email, phone, address, password);
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
