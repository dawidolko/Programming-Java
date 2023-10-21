package Betaprojekt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JPanel panel1;
    private JPanel Okno;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel Przyciski;
    private JButton button1; // Dodawanie
    private JButton button2; // Odejmowanie
    private JButton button3; // Mnożenie
    private JButton button4; // Dzielenie
    private JTextField textField3; // Wynik

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
    }

    public Kalkulator() {
        super("Kalkulator");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("+");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("-");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("*");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("/");
            }
        });
    }

    private void performOperation(String operation) {
        try {
            double a = Double.parseDouble(textField1.getText());
            double b = Double.parseDouble(textField2.getText());
            double result = 0;

            switch (operation) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        JOptionPane.showMessageDialog(null, "Nie można dzielić przez zero!");
                        return;
                    }
                    break;
            }
            textField3.setText(String.format("%.5f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Wprowadź poprawne liczby!");
        }
    }
}
