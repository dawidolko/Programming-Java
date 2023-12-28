import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceWindow extends JFrame{
    private JButton buttonSlideBalance;
    private JButton returnButtonBalance;
    private JPanel panelBalance;
    private JPanel panelTittleBalance;
    private JPanel panelImageBalance;
    private JPanel panelComainBalance;
    private JLabel tittleComainBalance;
    private JLabel stateBalance;
    private JPanel panelEndBalance;
    private int selectedCardId;

    public BalanceWindow(int selectedCardId) {
        super("Balance Window");
        this.setContentPane(panelBalance);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.selectedCardId = selectedCardId;
        showBalance();

        returnButtonBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow(selectedCardId);
                menuMenu.setVisible(true);
            }
        });

        buttonSlideBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }

    private void showBalance() {
        if (stateBalance == null) {
            JOptionPane.showMessageDialog(this, "Komponent stanu konta nie został zainicjalizowany.", "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT saldo FROM stan_konta WHERE karta_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, this.selectedCardId);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    double balance = resultSet.getDouble("saldo");
                    stateBalance.setText(String.format("Stan konta: %.2f PLN", balance));
                } else {
                    stateBalance.setText("Brak danych dla wybranej karty.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Błąd połączenia z bazą danych: " + e.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
            stateBalance.setText("Błąd przy wczytywaniu salda.");
        }
    }
}
