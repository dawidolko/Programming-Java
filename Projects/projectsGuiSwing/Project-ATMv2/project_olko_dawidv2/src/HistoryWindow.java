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

    public HistoryWindow() {
        super("History Window");
        this.setContentPane(panelHistory);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int iloscWierszy = Main.wierszeHistoriiTransakcji.size();
        String[][] wiersze = new String[iloscWierszy][5];
        for (int i=0;i<iloscWierszy;i++) {
            wiersze[i][0] = Main.wierszeHistoriiTransakcji.get(i)[0];
            wiersze[i][1] = Main.wierszeHistoriiTransakcji.get(i)[1];
            wiersze[i][2] = Main.wierszeHistoriiTransakcji.get(i)[2];
            wiersze[i][3] = Main.wierszeHistoriiTransakcji.get(i)[3];
            wiersze[i][4] = Main.wierszeHistoriiTransakcji.get(i)[4];
        }


        DefaultTableModel model = new DefaultTableModel(wiersze, Main.kolumnyHistoriiTransakcji);
        tableHistory.setModel(model);

        returnButtonHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow();
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


}
