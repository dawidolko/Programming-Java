import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;

public class PaymentWindows extends JFrame{
    private JTextField textFieldPayment;
    private JButton enterButtonPayment;
    private JButton slideButtonPayment;
    private JButton returnButtonPayment;
    private JPanel panelPayment;
    private JPanel panelTittlePayment;
    private JLabel tittlePayment;
    private JPanel panelImagePayment;
    private JPanel panelComainPayment;
    private JLabel tittleComainPayment;
    private JPanel panelEndPayment;
    private int selectedCardId;

    public PaymentWindows(int selectedCardId) {
        super("Payment Window");
        this.setContentPane(panelPayment);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.selectedCardId = selectedCardId;

        enterButtonPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositMoney();
                dispose();
                BalanceWindow balanceMenu = new BalanceWindow(selectedCardId);
                balanceMenu.setVisible(true);
            }
        });

        textFieldPayment.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterButtonPayment.doClick();
                }
            }
        });

        returnButtonPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow(selectedCardId);
                menuMenu.setVisible(true);
            }
        });

        slideButtonPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }

    private void depositMoney() {
        try {
            double amountToDeposit = Double.parseDouble(textFieldPayment.getText());
            double currentBalance = getCurrentBalance();

            if (amountToDeposit > 0) {
                double newBalance = currentBalance + amountToDeposit;
                if (updateBalance(newBalance)) {
                    recordTransaction("DEPOSIT", amountToDeposit);
                    JOptionPane.showMessageDialog(this, "Wpłacono: " + amountToDeposit + " PLN.\nNowy stan konta: " + newBalance + " PLN.");
                } else {
                    JOptionPane.showMessageDialog(this, "Błąd przy aktualizacji salda.", "Błąd", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Proszę wpisać poprawną kwotę.", "Błąd", JOptionPane.ERROR_MESSAGE);
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
                if (affectedRows == 1) {
                    return true;
                } else {
                    System.err.println("Nie udało się dodać rekordu transakcji.");
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Błąd SQL: " + e.getMessage());
            return false;
        }
    }



}
