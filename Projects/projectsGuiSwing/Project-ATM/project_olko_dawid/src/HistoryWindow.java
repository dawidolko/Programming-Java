import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HistoryWindow extends JFrame{
    private JTable tableHistory;
    private JButton slideButtonHistory;
    private JButton returnButtonHistory;
    private JPanel panelHistory;
    private JPanel panelTittleHistory;
    private JLabel tittleHistory;
    private JPanel panelImage;
    private JPanel panelComainHistory;
    private JScrollPane scrollPanel;
    private JLabel tittleComainHistory;
    private JPanel panelEndHistory;
    private int selectedCardId;

    public HistoryWindow(int selectedCardId) {
        super("History Window");
        this.setContentPane(panelHistory);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.selectedCardId = selectedCardId;
        initializeTable();

        returnButtonHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow(selectedCardId);
                menuMenu.setVisible(true);
            }
        });

        slideButtonHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }


    private void initializeTable() {
        String[] columnNames = {"Transaction ID", "Card ID", "Type", "Amount", "Date"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        tableHistory.setModel(model);
        loadTransactionHistory();
    }

    private void loadTransactionHistory() {
        DefaultTableModel model = (DefaultTableModel) tableHistory.getModel();
        model.setRowCount(0); // Clear the existing data

        String query = "SELECT * FROM tableHistory WHERE karta_id = ? ORDER BY transaction_date DESC";
        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, this.selectedCardId); // Ustawianie ID karty
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int transactionId = resultSet.getInt("transaction_id");
                int cardId = resultSet.getInt("karta_id");
                String type = resultSet.getString("transaction_type");
                double amount = resultSet.getDouble("amount");
                String date = resultSet.getString("transaction_date");

                model.addRow(new Object[]{transactionId, cardId, type, amount, date});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading transaction history.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
