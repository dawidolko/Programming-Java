import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dashboardPanel extends JFrame {
    private JPanel boarddash;
    private JPanel JPanelMenu;
    private JPanel JPanelNav;
    private JPanel JPanelList;
    private JButton registerButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JTable table1;
    private JButton closeButton;
    private JScrollPane JScroll;
    private JLabel JLabelLabel;
    private JLabel JLabelIcon;

    private DefaultTableModel model;

    public dashboardPanel() {
        super("Strona główna");
        this.setContentPane(boarddash);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new MyTableModel(new String[]{"ID", "Name", "Email", "Phone", "Address"}, 0);
        table1.setModel(model);


        registerButton.addActionListener(e -> {
            Register registerForm = new Register(model);
            registerForm.setVisible(true);
        });

        editButton.addActionListener(e -> toggleTableEditable());

        deleteButton.addActionListener(e -> {
            int selectedRow = table1.getSelectedRow();
            if (selectedRow >= 0) {
                int id = (int) model.getValueAt(selectedRow, 0);
                deleteRecord(id);
                model.removeRow(selectedRow);
            }
        });

        clearButton.addActionListener(e -> model.setRowCount(0));
        closeButton.addActionListener(e -> dispose());

        loadUsers();
    }

    private void toggleTableEditable() {
        MyTableModel myModel = (MyTableModel) table1.getModel();
        boolean isEditable = !myModel.isCellEditable(0, 1); // Pobranie przeciwnego stanu pierwszej edytowalnej komórki
        for (int i = 1; i < myModel.getColumnCount(); i++) { // Pomiń kolumnę ID (0)
            myModel.setColumnEditable(i, isEditable); // Zmień edytowalność
        }
        table1.repaint(); // Odświeżenie tabeli, aby zmiany były widoczne
    }

    private void deleteRecord(int id) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM users WHERE id = ?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Błąd bazy danych: " + ex.getMessage());
        }
    }

    private void loadUsers() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM users";
            try (PreparedStatement statement = conn.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    model.addRow(new Object[]{
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getString("phone"),
                            resultSet.getString("address")
                    });
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Błąd bazy danych: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new dashboardPanel().setVisible(true));
    }
}

