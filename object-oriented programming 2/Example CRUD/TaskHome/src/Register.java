import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class Register extends JFrame {
    private JPanel registerPanel;
    private JLabel JLabelIcon;
    private JLabel JLabRegister;
    private JLabel JLabelName;
    private JTextField textFieldName;
    private JLabel JLabelEmail;
    private JTextField textFieldEmail;
    private JLabel JLabelPhone;
    private JTextField textFieldPhone;
    private JLabel JLabelAddress;
    private JTextField textFieldAddress;
    private JLabel JLabelPassword;
    private JPasswordField passwordField;
    private JLabel JLabelConfirm;
    private JPasswordField passwordField1;
    private JButton registerButton;
    private JButton cancelButton;

    private DefaultTableModel model;

    public Register(DefaultTableModel model) {
        super("Rejestracja");
        this.model = model;
        this.setContentPane(registerPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();

        cancelButton.addActionListener(e -> dispose());

        registerButton.addActionListener(e -> {
            String name = textFieldName.getText();
            String email = textFieldEmail.getText();
            String phone = textFieldPhone.getText();
            String address = textFieldAddress.getText();
            char[] password = passwordField.getPassword();
            char[] confirmPassword = passwordField1.getPassword();

            if (!Arrays.equals(password, confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Podane hasła nie są identyczne.");
                return;
            }

            // Dodaj tutaj logikę haszowania hasła przed zapisem do bazy danych
            String hashedPassword = new String(password); // Placeholder dla hashowania

            try (Connection conn = DBConnection.getConnection()) {
                String sql = "INSERT INTO users (name, email, phone, address, password) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, name);
                    statement.setString(2, email);
                    statement.setString(3, phone);
                    statement.setString(4, address);
                    statement.setString(5, hashedPassword);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        model.addRow(new Object[]{name, email, phone, address});
                        JOptionPane.showMessageDialog(this, "Rejestracja zakończona pomyślnie.");
                        dispose();
                        Login Login = new Login();
                        Login.setVisible(true);
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Błąd bazy danych: " + ex.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
