import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordCheckGUI {

    private JFrame frame;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton okButton;

    public PasswordCheckGUI() {
        frame = new JFrame("Swing PasswordField Demo Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        // Etykieta i pole do wprowadzania hasła
        JLabel passwordLabel = new JLabel("Enter password:");
        passwordField = new JPasswordField();
        frame.add(passwordLabel);
        frame.add(passwordField);

        // Etykieta i pole do potwierdzenia hasła
        JLabel confirmPasswordLabel = new JLabel("Confirm password:");
        confirmPasswordField = new JPasswordField();
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);

        // Przycisk OK
        okButton = new JButton("OK");
        frame.add(new JLabel()); // Puste miejsce
        frame.add(okButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals("codejava")) {
                    JOptionPane.showMessageDialog(frame, "Wrong password!", "Message", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Congratulations! You entered correct password.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordCheckGUI();
            }
        });
    }
}

