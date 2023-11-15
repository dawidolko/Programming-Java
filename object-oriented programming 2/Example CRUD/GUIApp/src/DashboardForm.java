import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DashboardForm extends  JFrame{
    private JPanel dashboardPanel;
    private JLabel lbAdmin;
    private JButton btnRegister;
    private JTable ClientsTable;
    private JButton btnEdit;
    private JButton btnDelete;
    private JButton btnClear;
    private JButton btnClose;
    private JTextField tfFirstLastName;
    private JTextField tfEamil;
    private JTextField tfPhone;
    private JTextField tfAddress;

    public DashboardForm(){
        super("DashboardForm");
        setContentPane(dashboardPanel);
        int width = 800, height = 600;
        setMinimumSize(new Dimension(width,height));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //wywołnie metody do utworzenia tabeli
        createTable();

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm(null);

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstLastName.setText("");
                tfEamil.setText("");
                tfPhone.setText("");
                tfAddress.setText("");
            }
        });

        //I wersja z twzoeniem tabeli
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tfFirstLastName.getText().equals("") ||
                        tfEamil.getText().equals("") ||
                        tfPhone.getText().equals("") ||
                        tfAddress.getText().equals("") ){
                    JOptionPane.showMessageDialog(null,"Proszę podać wszytskie dane");
                }else{
                    String data[] = {
                            tfFirstLastName.getText(),
                            tfEamil.getText(),
                            tfPhone.getText(),
                            tfAddress.getText() };

                    DefaultTableModel tblModel = (DefaultTableModel)ClientsTable.getModel();
                    tblModel.addRow(data);
                    JOptionPane.showMessageDialog(null,"Dodano poprawnie dane");
                    tfFirstLastName.setText("");
                    tfEamil.setText("");
                    tfPhone.setText("");
                    tfAddress.setText("");

                }//koniec else

            }
        });


        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tblModel = (DefaultTableModel) ClientsTable.getModel();

                if(ClientsTable.getSelectedRowCount()==1)
                    tblModel.removeRow(ClientsTable.getSelectedRow());
                else {
                    if (ClientsTable.getRowCount() == 0)
                        JOptionPane.showMessageDialog(null,"Brak danych do usunięcia");
                    else
                        JOptionPane.showMessageDialog(null,"Proszę zaznaczyć tylko jeden wiersz ...");
                }
            }
        });

        /*//II Wersja
        //====================================================================================
        boolean hasRegistredUsers = connectToDatanbase();
        if(hasRegistredUsers) {
            LoginForm loginForm = new LoginForm(this);
            User user = loginForm.user;

            if (user!=null){
                lbAdmin.setText("User: " + user.name);
                setLocationRelativeTo(null);
                setVisible(true);
            }else dispose();
        }
        else {
            //show registration form
            RegistrationForm registrationForm = new RegistrationForm(this);
            User user = registrationForm.user;

            if(user != null){
                lbAdmin.setText("User: " + user.name);
                setLocationRelativeTo(null);
                setVisible(true);
            }else dispose();

        }

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm(DashboardForm.this);
                User user = registrationForm.user;

                if (user !=null){
                    JOptionPane.showMessageDialog(DashboardForm.this,
                            "New user: "+ user.name,
                            "Successful Registration",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        //====================================================================================*/


    }

    private void createTable() {
        Object[][] data = {

        };

        ClientsTable.setModel(new DefaultTableModel(
                data,
                new String[]{"First and last name",
                        "e-mail",
                        "Phone",
                        "Adress"
                } // kolumny tabeli
        ));

        TableColumnModel columns = ClientsTable.getColumnModel();

        DefaultTableCellRenderer centerRendered = new DefaultTableCellRenderer();
        centerRendered.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(0).setCellRenderer(centerRendered);
        columns.getColumn(1).setCellRenderer(centerRendered);
        columns.getColumn(2).setCellRenderer(centerRendered);
        columns.getColumn(3).setCellRenderer(centerRendered);
    }


    private boolean connectToDatanbase() {
        boolean hasRegistredUsers = false;

        //spr podłaczenia do bazy
        final String MYSQL_SERVER_URL = "jdbc:mysql://localhost/";
        final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            //fist connet to MYSQL server and create the database if not created
            Connection conn = DriverManager.getConnection(MYSQL_SERVER_URL, USERNAME,PASSWORD);
            Statement statement = conn.createStatement();
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS MyStore");
            statement.close();;
            conn.close();

            //connect to the database and create the table "users if not created
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = conn.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(200) NOT NULL," +
                    "email VARCHAR(200) NOT NULL UNIQUE," +
                    "phone varchar(200)," +
                    "address VARCHAR(200)," +
                    "password VARCHAR(200) NOT NULL)";
            statement.executeUpdate(sql);

            //check if we have user in the table users
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM users");

            if(resultSet.next()){
                int numUsers = resultSet.getInt(1);
                if (numUsers > 0){
                    hasRegistredUsers = true;
                }
            }

            statement.close();
            conn.close();


        }catch (Exception e){
            e.printStackTrace();
        }

        return hasRegistredUsers;
    }



}
