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

    public BalanceWindow() {
        super("Balance Window");
        this.setContentPane(panelBalance);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i=0, index=0;
        for(i=0;i<Main.kody.length;i++) {
            if (Main.karta.equals(Main.kody[i][0])) {
                index=i;
                break;
            }
        }

        tittleComainBalance.setText(String.format("%.2f", Main.stanyKonta[index]) + " zł");


        returnButtonBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow();
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
}
