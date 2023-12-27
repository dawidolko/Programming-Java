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


    public MenuWindow() {
        super("Menu Window");
        this.setContentPane(panelMenu);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        checkButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BalanceWindow balanceMenu = new BalanceWindow();
                balanceMenu.setVisible(true);
            }
        });

        paycheckButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaycheckWindow paycheckMenu = new PaycheckWindow();
                paycheckMenu.setVisible(true);
            }
        });

        paymentButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaymentWindows paymentMenu = new PaymentWindows();
                paymentMenu.setVisible(true);
            }
        });

        TransactionButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HistoryWindow historyMenu = new HistoryWindow();
                historyMenu.setVisible(true);
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

    public static void main() {
        MenuWindow menuWindow = new MenuWindow();
        menuWindow.setVisible(true);
    }
}
