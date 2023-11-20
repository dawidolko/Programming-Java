package Lab4.ZadaniaLekcja.LoginForm;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Objects;

import static javax.swing.JOptionPane.*;

public class Dashboard extends JDialog
{
    private JPanel dashboardPanel;
    private JButton closeButton;
    private JButton registerButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JTable clientsTable;
    private JLabel labelLabel;
    private JLabel iconLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    private JTextField nameTextField;
    private JTextField phoneTextField;
    private JTextField addressTextField;
    private JTextField emailTextField;

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight)
    {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args)
    {
        Dashboard dashboardGUI = new Dashboard(null);
        dashboardGUI.setVisible(true);
    }

    public Dashboard(JFrame parent)
    {
        super(parent);
        this.setTitle("Database in dashboard");
        this.setContentPane(this.dashboardPanel);
        this.setDefaultCloseOperation(parent.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(1200, 800));
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setLocationRelativeTo(parent);
        // this.setResizable(false); // Okno GUI nie może zmieniać wymiaru

        ImageIcon database = new ImageIcon(Objects.requireNonNull(getClass().getResource("image_database.png")));
        iconLabel.setIcon(resize(database, 70, 70));

        // Metoda do utworzenia tabeli
        createTable();
        // connectToDatabase();

        UIManager.put("OptionPane.messageFont", new Font("Tw Cen MT", Font.PLAIN, 24));
        UIManager.put("OptionPane.messageForeground", new Color(0,0,0));
        UIManager.put("OptionPane.background", new Color(62,255,89));
        UIManager.put("Panel.background", new Color(62,255,89));
        UIManager.put("Button.background", new Color(211,77,213));
        UIManager.put("Button.foreground", new Color(0,0,0));
        UIManager.put("Button.font", new Font("Tw Cen MT", Font.PLAIN, 36));

        closeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int option = showConfirmDialog(null, "Are you sure to close?", "Close dashboard", YES_NO_OPTION);
                if(option == 0)
                {
                    dispose();
                    Login loginGUI = new Login(null);
                    loginGUI.setVisible(true);
                }
            }
        });

        registerButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || addressTextField.getText().isEmpty())
                    { JOptionPane.showMessageDialog(null,"Please enter all fields!", "Data register error!", WARNING_MESSAGE); }
                else
                {
                    String[] data = getTextField();
                    DefaultTableModel tblModel = (DefaultTableModel)clientsTable.getModel();
                    tblModel.addRow(data);
                    JOptionPane.showMessageDialog(null,"Data added correctly", "Data added", INFORMATION_MESSAGE);
                    setNullInTextField();
                }
            }
        });

        editButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                DefaultTableModel tblModel = (DefaultTableModel) clientsTable.getModel();
                if(clientsTable.getSelectedRowCount()==1)
                {
                    String[] data = getTextField();
                    if (nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || addressTextField.getText().isEmpty())
                        { JOptionPane.showMessageDialog(null,"Please enter all fields!", "Data edit error!", WARNING_MESSAGE); }
                    else
                    {
                        tblModel.setValueAt(data[0], clientsTable.getSelectedRow(), 0);
                        tblModel.setValueAt(data[1], clientsTable.getSelectedRow(), 1);
                        tblModel.setValueAt(data[2], clientsTable.getSelectedRow(), 2);
                        tblModel.setValueAt(data[3], clientsTable.getSelectedRow(), 3);
                        JOptionPane.showMessageDialog(null,"Data edit correctly", "Dara edit", INFORMATION_MESSAGE);
                        setNullInTextField();
                    }
                }
                else
                {
                    if (clientsTable.getRowCount()==0) { JOptionPane.showMessageDialog(null,"No data to edit!", "Data edit error!", WARNING_MESSAGE); } // Jeśli zero wierszy w tabeli
                    else { JOptionPane.showMessageDialog(null,"Please select only one line!", "Data edit error!", WARNING_MESSAGE); } // Gdy jest co najmniej jeden wiersz w tabeli, ale nie zaznaczono żadnych danych albo zaznaczono więcej niż jeden wiersz
                }
            }
        });

        deleteButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                DefaultTableModel tblModel = (DefaultTableModel) clientsTable.getModel();

                if(clientsTable.getSelectedRowCount()==1)
                {
                    JOptionPane.showMessageDialog(null,"Data delete correctly", "Dara delete", INFORMATION_MESSAGE);
                    tblModel.removeRow(clientsTable.getSelectedRow());
                }
                else
                {
                    if (clientsTable.getRowCount()==0) { JOptionPane.showMessageDialog(null,"No data to delete!", "Dara delete error!", WARNING_MESSAGE); } // Jeśli zero wierszy w tabeli
                    else { JOptionPane.showMessageDialog(null,"Please select only one line!", "Dara delete error!", WARNING_MESSAGE); } // Gdy jest co najmniej jeden wiersz w tabeli, ale nie zaznaczono żadnych danych albo zaznaczono więcej niż jeden wiersz
                }
            }
        });

        clearButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                setNullInTextField();
            }
        });
    }

    private void setNullInTextField()
    {
        nameTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");
        addressTextField.setText("");
    }

    private String[] getTextField()
    {
        return new String[] { nameTextField.getText(),
                              emailTextField.getText(),
                              phoneTextField.getText(),
                              addressTextField.getText() };
    }

    private void createTable()
    {
        Object[][] data = {}; // Wiersze tabeli

        clientsTable.setModel(new DefaultTableModel
        (
                data, new String[]{"Name", "Email", "Phone", "Address"} // Kolumny tabeli
        ));
        TableColumnModel columns = clientsTable.getColumnModel();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(0).setCellRenderer(centerRenderer);
        columns.getColumn(1).setCellRenderer(centerRenderer);
        columns.getColumn(2).setCellRenderer(centerRenderer);
        columns.getColumn(3).setCellRenderer(centerRenderer);
    }

    private boolean connectToDatabase()
    {
        boolean hasRegisteredUsers = false;

        // Sprawdzenie połączenia do bazy danych
        final String MYSQL_SERVER_URL = "jdbc:mysql://localhost/";
        final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try
        {
            // Najpierw połącz się z serwerem MYSQL i utwórz bazę danych, jeśli nie została utworzona
            Connection conn = DriverManager.getConnection(MYSQL_SERVER_URL, USERNAME, PASSWORD);
            Statement stat = conn.createStatement();
            stat.executeUpdate("CREATE DATABASE IF NOT EXISTS MyStore");
            stat.close();;
            conn.close();

            // Połącz się z bazą danych i utwórz tabelę „users", jeśli nie została utworzona
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            stat = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                         "id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT," +
                         "name VARCHAR(200) NOT NULL," +
                         "email VARCHAR(200) NOT NULL UNIQUE," +
                         "phone varchar(200)," +
                         "address VARCHAR(200)," +
                         "password VARCHAR(200) NOT NULL)";
            stat.executeUpdate(sql);

            // Sprawdź, czy mamy użytkownika w tabeli "users"
            stat = conn.createStatement();
            ResultSet resultSet = stat.executeQuery("SELECT COUNT(*) FROM users");

            // Czy w tabeli znajdują się użytkownicy
            if(resultSet.next())
            {
                int numUsers = resultSet.getInt(1);
                if (numUsers > 0) { hasRegisteredUsers = true; }
            }

            // Zamknięcie połączenia
            stat.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return hasRegisteredUsers;
    }
}
