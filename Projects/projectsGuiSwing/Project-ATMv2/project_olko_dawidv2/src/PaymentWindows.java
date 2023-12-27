import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.time.LocalDateTime;

public class PaymentWindows extends JFrame{
    private JTextField textFieldPayment;
    private JButton enterButtonPayment;
    private JButton slideButtonPayment;
    private JButton returnButtonPayment;
    private JPanel panelPayment;
    private JPanel panelTittlePayment;
    private JLabel tittlePayment;
    private JPanel panelImagePayment;
    private JPanel panelComainPayment;
    private JLabel tittleComainPayment;
    private JPanel panelEndPayment;
    private JLabel result;

    public PaymentWindows() {
        super("Payment Window");
        this.setContentPane(panelPayment);
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
        enterButtonPayment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pole = textFieldPayment.getText();

                int wplata;
                if (!pole.equals("")) wplata = Integer.parseInt(pole);
                else wplata = -1;

                if (wplata<=0) textFieldPayment.setText("Wprowadź poprawną kwotę.");
                else if (wplata%10!=0) textFieldPayment.setText("W bankomacie nie można wpłacać monet.");
                else {
                    Main.stanyKonta[finalIndex] += wplata;
                    result.setText("Saldo: " + String.format("%.2f", Main.stanyKonta[finalIndex]) + " zł");
                    textFieldPayment.setText("Wpłata dokonana pomyślnie.");
                    textFieldPayment.setText("");

                    String[] wiersz = new String[5];
                    wiersz[0] = Main.licznikTransakcji + ".";
                    Main.licznikTransakcji++;
                    wiersz[1] = Main.kody[finalIndex][0];
                    wiersz[2] = "Wpłata";
                    wiersz[3] = wplata + ".00";

                    LocalDateTime data = LocalDateTime.now();
                    String dataDoTablicy = data.getDayOfMonth() + "." + data.getMonthValue() + "." + data.getYear() + " " + data.getHour() + ":" + data.getMinute() + ":" + data.getSecond();

                    wiersz[4] = dataDoTablicy;

                    Main.wierszeHistoriiTransakcji.add(wiersz);
                }
            }
        });

        textFieldPayment.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterButtonPayment.doClick(); // Symuluje kliknięcie przycisku Enter
                }
            }
        });

        returnButtonPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuWindow menuMenu = new MenuWindow();
                menuMenu.setVisible(true);
            }
        });

        slideButtonPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }

}
