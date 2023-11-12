import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame {

    private JPanel JPanelLogin;
    private JTextField textFieldEmail;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    private JLabel JLabelWelcome;
    private JLabel JLabelLogin;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JLabel JLabelIcon;
    private JLabel JLabelEmail;
    private JLabel JLabelPassword;

    public Login() {
        super("Logowanie");
        this.setContentPane(JPanelLogin);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();

        cancelButton.addActionListener(e -> dispose());

        loginButton.addActionListener(e -> {
            String email = textFieldEmail.getText();
            char[] password = passwordField.getPassword();

            // Dodaj tutaj logikę porównywania zahashowanych haseł
            String hashedPassword = new String(password); // Placeholder dla hashowania

            try (Connection conn = DBConnection.getConnection()) {
                String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, email);
                    statement.setString(2, hashedPassword);

                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            JOptionPane.showMessageDialog(this, "Zalogowano pomyślnie.");
                            dispose();
                            new dashboardPanel().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(this, "Niepoprawny email lub hasło.");
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Błąd bazy danych: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
