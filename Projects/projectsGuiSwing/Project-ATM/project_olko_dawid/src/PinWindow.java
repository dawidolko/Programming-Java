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
    private static int failedAttempts = 0;
    private static long lockoutEndTime = 0;

    public PinWindow(String selectedCardType, int selectedCardId) {
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
                String enteredPin = new String(passwordFieldPin.getPassword());

                if (enteredPin.length() < 4) {
                    JOptionPane.showMessageDialog(PinWindow.this, "PIN jest za krótki. Wpisz 4 cyfry.", "Błąd", JOptionPane.ERROR_MESSAGE);
                } else if (enteredPin.length() > 4) {
                    JOptionPane.showMessageDialog(PinWindow.this, "PIN jest za długi. Wpisz 4 cyfry.", "Błąd", JOptionPane.ERROR_MESSAGE);
                } else if (!enteredPin.matches("\\d{4}")) {
                    JOptionPane.showMessageDialog(PinWindow.this, "PIN może zawierać tylko wartości cyfrowe.", "Błąd", JOptionPane.ERROR_MESSAGE);
                } else {
                    checkPin(enteredPin);
                }
            }
        });

        passwordFieldPin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    enterButtonPin.doClick();
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

//    private void checkPin(String enteredPin) {                                // <--- MainRandowPassword <---
//        String correctPin = oldMain.generatedPins.get(selectedCardType);
//        if (correctPin != null && correctPin.equals(enteredPin)) {
//            // PIN jest poprawny, przechodzimy do MenuWindow
//            SwingUtilities.invokeLater(() -> {
//                MenuWindow menuWindow = new MenuWindow();
//                menuWindow.setVisible(true);
//            });
//            dispose();
//        } else {
//            // PIN jest niepoprawny
//            JOptionPane.showMessageDialog(this, "Nieprawidłowy PIN.");
//        }
//    }

    public static boolean isUserLockedOut() {
        // Check if the current time is past the lockoutEndTime
        return System.currentTimeMillis() < lockoutEndTime;
    }


    private void checkPin(String enteredPin) {
        // Sprawdź, czy użytkownik jest obecnie zablokowany i czy okres blokady minął.
        if (System.currentTimeMillis() < lockoutEndTime) {
            // Użytkownik jest nadal zablokowany, więc informujemy go, jak długo musi jeszcze czekać.
            long timeLeft = (lockoutEndTime - System.currentTimeMillis()) / 1000;
            JOptionPane.showMessageDialog(this, "Twoje konto jest zablokowane na wpisywanie hasła. Pozostało " + timeLeft + " sekund.", "Konto Zablokowane", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT PIN FROM karty WHERE typ = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, this.selectedCardType);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    String correctPin = resultSet.getString("PIN");
                    if (correctPin.equals(enteredPin)) {
                        // Resetowanie licznika prób i końca czasu blokady
                        failedAttempts = 0;
                        lockoutEndTime = 0;

                        // Przejście do MenuWindow
                        SwingUtilities.invokeLater(() -> {
                            MenuWindow menuWindow = new MenuWindow(selectedCardId);
                            menuWindow.setVisible(true);
                        });
                        dispose(); // Zamknięcie bieżącego okna
                    } else {
                        // Inkrementacja licznika prób i ewentualna blokada
                        failedAttempts++;
                        if (failedAttempts >= 3) {
                            // Ustawienie czasu blokady na 3 minuty
                            lockoutEndTime = System.currentTimeMillis() + (3 * 60 * 1000);
                            JOptionPane.showMessageDialog(this, "Masz blokadę na wpisywanie hasła, zostaniesz przeniesiony do dashboardu.", "Zablokowano dostęp", JOptionPane.ERROR_MESSAGE);
                            // Przekierowanie do dashboardu lub inna logika
                        } else {
                            JOptionPane.showMessageDialog(this, "Nieprawidłowy PIN. Pozostało prób: " + (3 - failedAttempts), "Błąd", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Nie znaleziono karty.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

