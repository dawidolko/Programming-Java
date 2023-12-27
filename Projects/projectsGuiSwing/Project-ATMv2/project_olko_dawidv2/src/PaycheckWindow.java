import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class PaycheckWindow extends JFrame {
    private JTextField textFieldPaycheck;
    private JButton enterButtonPaycheck;
    private JButton slideButtonPaycheck;
    private JButton returnButtonPaycheck;
    private JPanel panelPaycheck;
    private JPanel panelTittlePaycheck;
    private JLabel tittlePaycheck;
    private JPanel panelImagePaycheck;
    private JPanel panelComainPaycheck;
    private JLabel tittleComainPaycheck;
    private JPanel panelEndPaycheck;
    private JLabel result;


    public PaycheckWindow() {
        super("Paycheck Window");
        this.setContentPane(panelPaycheck);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i=0, index=0;
        for(i=0;i<Main.kody.length;i++) {
            if (Main.karta.equals(Main.kody[i][0])) {
                index=i;
                break;
            }
        }

        result.setText("Saldo: " + String.format("%.2f", Main.stanyKonta[index]) + " zł");

        int finalIndex = index;
        enterButtonPaycheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pole = textFieldPaycheck.getText();

                int wyplata;
                if (!pole.equals("")) wyplata = Integer.parseInt(pole);
                else wyplata = -1;

                if (wyplata<=0) result.setText("Wprowadź poprawną kwotę.");
                else if (wyplata%10!=0) result.setText("W bankomacie nie można wypłacać monet.");
                else if (wyplata > Main.stanyKonta[finalIndex]) result.setText("Nie masz tyle na koncie.");
                else {
                    Main.stanyKonta[finalIndex] -= wyplata;
                    textFieldPaycheck.setText("Saldo: " + String.format("%.2f", Main.stanyKonta[finalIndex]) + " zł");
                    result.setText("Wypłata dokonana pomyślnie.");
                    textFieldPaycheck.setText("");

                    String[] wiersz = new String[5];
                    wiersz[0] = Main.licznikTransakcji + ".";
                    Main.licznikTransakcji++;
                    wiersz[1] = Main.kody[finalIndex][0];
                    wiersz[2] = "Wypłata";
                    wiersz[3] = wyplata + ".00";

                    LocalDateTime data = LocalDateTime.now();
                    String dataDoTablicy = data.getDayOfMonth() + "." + data.getMonthValue() + "." + data.getYear() + " " + data.getHour() + ":" + data.getMinute() + ":" + data.getSecond();

                    wiersz[4] = dataDoTablicy;

                    Main.wierszeHistoriiTransakcji.add(wiersz);
                }
            }
        });

        textFieldPaycheck.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterButtonPaycheck.doClick(); // Symuluje kliknięcie przycisku Enter
                }
            }
        });

        returnButtonPaycheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow();
                menuMenu.setVisible(true);
            }
        });

        slideButtonPaycheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }
}


