import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PinWindow extends JFrame{
    private JPanel panelPin;
    private JLabel tittleMainPin;
    private JPasswordField passwordFieldPin;
    private JButton enterButtonPin;
    private JButton returnButtonPin;
    private JPanel panelTittlePin;
    private JPanel panelComainPin;
    private JPanel panelEndPin;
    private JPanel panelImagePin;
    private String selectedCardType; // Dodano zmienną do przechowywania typu karty
    private int selectedCardId;

    public PinWindow() {
        super("Pin Window");
        this.selectedCardType = selectedCardType; // Ustaw wybrany typ karty
        this.selectedCardId = selectedCardId;
        this.setContentPane(panelPin);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        System.out.println(selectedCardId);
        ((AbstractDocument) passwordFieldPin.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength());
                string += text;
                if ((fb.getDocument().getLength() + text.length()) <= 4 && string.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if ((fb.getDocument().getLength() + string.length()) <= 4 && string.matches("\\d*")) {
                    super.insertString(fb, offset, string, attr);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });

        enterButtonPin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.PIN = passwordFieldPin.getText();

                int i=0, index=0;
                for(i=0;i<Main.kody.length;i++) {
                    if (Main.karta.equals(Main.kody[i][0])) {
                        index=i;
                        break;
                    }
                }

                if(Main.PIN.equals(Main.kody[index][1])) {
                    enterButtonPin.setText("");
                    dispose();
                    MenuWindow.main();
                }
                else enterButtonPin.setText("Wprowadziłeś zły PIN.");

            }
        });

        passwordFieldPin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterButtonPin.doClick(); // Symuluje kliknięcie przycisku Enter
                }
            }
        });

        returnButtonPin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Dashboard mainMenu = new Dashboard();
                mainMenu.setVisible(true);
            }
        });
    }

    public static void main() {
        PinWindow pinWindow = new PinWindow();
        pinWindow.setVisible(true);
    }
}
