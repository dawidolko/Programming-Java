import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Dashboard extends JFrame{
    private JPanel panelDashboard;
    private JLabel titleMainDashboard;
    private JPanel imagePanel;
    private JLabel titleComainLeft;
    private JComboBox comboBoxCard;
    private JButton buttonChoseCard;
    private JButton LeaveButton;
    private JPanel panelTitleDashboard;
    private JPanel panelComain;
    private JPanel panelChoseDashboard;
    private JPanel panelEndDashboard;
    private JRadioButton ATMCARDRadioButton;
    private JRadioButton CREDITCARDRadioButton;
    private JRadioButton CREDITCARDRadioButton1;
    private JPanel radioButton;

    public Dashboard() {
        super("Dashboard Window");
        this.setContentPane(panelDashboard);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ATMCARDRadioButton.setSelected(true);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(ATMCARDRadioButton);
        radioButtonGroup.add(CREDITCARDRadioButton);
        radioButtonGroup.add(CREDITCARDRadioButton1);

        buttonChoseCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCardType = Objects.requireNonNull(comboBoxCard.getSelectedItem()).toString();
                int selectedCardId = comboBoxCard.getSelectedIndex() + 1;

                if (ATMCARDRadioButton.isSelected()) {
                    // Wybrano ATM CARD
                    Main.karta = comboBoxCard.getSelectedItem().toString();
                    dispose();
                    PinWindow.main();
                } else if (CREDITCARDRadioButton.isSelected()) {
                    // Wybrano CREDIT CARD
                    JOptionPane.showMessageDialog(null, "Ta karta nie służy do wypłacania.");

                } else if (CREDITCARDRadioButton1.isSelected()) {
                    // Wybrano inny typ karty
                    JOptionPane.showMessageDialog(null, "Ta karta nie służy do wypłacania.");
                }
            }
        });

        LeaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main() {
        SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true));
    }
}
