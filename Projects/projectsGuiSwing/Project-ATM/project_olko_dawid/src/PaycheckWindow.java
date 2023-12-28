import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaycheckWindow extends JFrame{
    private JTextField textFieldPaycheck;
    private JButton enterButtonPaycheck;
    private JButton slideButtonPaycheck;
    private JButton returnButtonPaycheck;
    private JPanel panelPaycheck;
    private JPanel panelTittlePaycheck;
    private JLabel tittlePaycheck;
    private JPanel panelImagePaycheck;
    private JPanel panelComainPaycheck;
    private JLabel tittleComainPaycheck;
    private JPanel panelEndPaycheck;
    private int selectedCardId;


    public PaycheckWindow(int selectedCardId) {
        super("Paycheck Window");
        this.setContentPane(panelPaycheck);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.selectedCardId = selectedCardId;

        enterButtonPaycheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawMoney();
                dispose();
                BalanceWindow balanceMenu = new BalanceWindow(selectedCardId);
                balanceMenu.setVisible(true);
            }
        });

        textFieldPaycheck.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterButtonPaycheck.doClick(); // Symuluje kliknięcie przycisku Enter
                }
            }
        });

        returnButtonPaycheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow(selectedCardId);
                menuMenu.setVisible(true);
            }
        });

        slideButtonPaycheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }


    private void withdrawMoney() {
        try {
            double amountToWithdraw = Double.parseDouble(textFieldPaycheck.getText());
            double currentBalance = getCurrentBalance();

            if (amountToWithdraw <= currentBalance && amountToWithdraw > 0) {
                double newBalance = currentBalance - amountToWithdraw;
                if (updateBalance(newBalance)) {
                    recordTransaction("WITHDRAW", amountToWithdraw); // Dodajemy tę linijkę
                    JOptionPane.showMessageDialog(this, "Wypłacono: " + amountToWithdraw + " PLN.\nNowy stan konta: " + newBalance + " PLN.");
                } else {
                    JOptionPane.showMessageDialog(this, "Błąd przy aktualizacji salda.", "Błąd", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Niewystarczające środki na koncie lub nieprawidłowa kwota.", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Proszę wpisać poprawną kwotę.", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double getCurrentBalance() {
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT saldo FROM stan_konta WHERE karta_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, this.selectedCardId);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    return resultSet.getDouble("saldo");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    private boolean updateBalance(double newBalance) {
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "UPDATE stan_konta SET saldo = ? WHERE karta_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDouble(1, newBalance);
                preparedStatement.setInt(2, this.selectedCardId);
                int affectedRows = preparedStatement.executeUpdate();
                return affectedRows == 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean recordTransaction(String type, double amount) {
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "INSERT INTO tableHistory (karta_id, transaction_type, amount, transaction_date) VALUES (?, ?, ?, NOW())";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, this.selectedCardId);
                preparedStatement.setString(2, type);
                preparedStatement.setDouble(3, amount);
                int affectedRows = preparedStatement.executeUpdate();
                return affectedRows == 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
