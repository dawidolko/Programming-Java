import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Table extends JFrame {
    private JPanel mainPanel;
    private JTable userTable;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;
    private JButton clearButton;
    private JButton addButton;
    private JButton deleteButton;


    public Table() {
        super("Table");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 400);

        String[] columns = {"Name", "Email", "Phone", "Address"};
        String[][] data = {
                {"Michał Komsa", "komsa.m@o2.pl", "+48539023985", "ul. Jana Zamoyskiego 74"},
                {"Andrzej Baran", "baran122@gmail.com", "+48577822094", "ul. Podlaska 12"},
                {"Edyta Nowak", "e.nowak8@stud.ur.edu.pl", "+48765344012", "ul. Kamienna 44"},
        };
        TableModel tableModel = new DefaultTableModel(data, columns);
        userTable.setModel(tableModel);

        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();

            if (name.equals("") || email.equals("") || phone.equals("") || address.equals("")) JOptionPane.showMessageDialog(this, "Wypelnij wszystkie pola!");
            else if (!email.contains("@")) JOptionPane.showMessageDialog(this, "Najprawdopodobniej wprowadziłeś zły email.");
            else if (!phone.startsWith("+")) JOptionPane.showMessageDialog(this, "Wprowadź także numer kierunkowy zaczynający się od \"+\".");
            else {
                String[] newData = {name, email, phone, address};
                DefaultTableModel model = (DefaultTableModel)userTable.getModel();
                model.addRow(newData);

                nameField.setText("");
                emailField.setText("");
                phoneField.setText("");
                addressField.setText("");
            }
        });

        clearButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            phoneField.setText("");
            addressField.setText("");
        });

        deleteButton.addActionListener(e -> {
            int index = userTable.getSelectedRow();
            if(index>-1) {
                DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                model.removeRow(index);
            }
        });
    }

    public static void main(String[] args) {
        Table frame = new Table();
        frame.setVisible(true);
    }
}
