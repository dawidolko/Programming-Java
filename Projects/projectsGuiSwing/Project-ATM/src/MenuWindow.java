import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuWindow extends JFrame{
    private JButton checkButtonMenu;
    private JButton paycheckButtonMenu;
    private JButton paymentButtonMenu;
    private JButton TransactionButtonMenu;
    private JButton slideButtonMenu;
    private JPanel panelMenu;
    private JPanel penelTittleMenu;
    private JLabel tittleMenu;
    private JPanel panelComainMenu;
    private JLabel tittleComainMenu;
    private JPanel PanelEndMenu;
    private JPanel panelImageMenu;
    private JComboBox<CardItem> cardComboBox;
    private int selectedCardId;


    public MenuWindow(int selectedCardId) {
        super("Menu Window");
        this.setContentPane(panelMenu);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardComboBox = new JComboBox<>();

        initializeCardComboBox();

        cardComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Aktualne wybrane ID karty: " + selectedCardId);
            }
        });



        checkButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BalanceWindow balanceMenu = new BalanceWindow(selectedCardId);
                balanceMenu.setVisible(true);
            }
        });

        paycheckButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaycheckWindow paycheckMenu = new PaycheckWindow(selectedCardId);
                paycheckMenu.setVisible(true);
            }
        });

        paymentButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaymentWindows paymentMenu = new PaymentWindows(selectedCardId);
                paymentMenu.setVisible(true);
            }
        });

        TransactionButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HistoryWindow historyMenu = new HistoryWindow(selectedCardId);
                historyMenu.setVisible(true);
                System.out.println("Wybrane ID karty dla historii: " + selectedCardId);
            }
        });

        slideButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }

    private void initializeCardComboBox() {
        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT id, typ FROM karty";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String typ = resultSet.getString("typ");
                    cardComboBox.addItem(new CardItem(id, typ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
