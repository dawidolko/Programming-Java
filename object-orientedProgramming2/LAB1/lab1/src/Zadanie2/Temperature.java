package Zadanie2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature {
    private JButton KONWERTUJ;
    private JButton WYJŚCIEButton;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JTextField textField1;
    private JLabel Wynik;
    private JPanel Okno;

    public Temperature() {
        // Dodajemy jednostki do comboBoxów
        comboBox1.addItem("Celsius");
        comboBox1.addItem("Fahrenheit");
        comboBox1.addItem("Kelvin");

        comboBox2.addItem("Celsius");
        comboBox2.addItem("Fahrenheit");
        comboBox2.addItem("Kelvin");

        KONWERTUJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.parseDouble(textField1.getText());
                    String inputUnit = comboBox1.getSelectedItem().toString();
                    String outputUnit = comboBox2.getSelectedItem().toString();
                    double result = convert(value, inputUnit, outputUnit);
                    Wynik.setText("Wynik: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Proszę wprowadzić prawidłową wartość temperatury.");
                }
            }
        });

        WYJŚCIEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static double convert(double value, String inputUnit, String outputUnit) {
        // Konwersja do Celsjusza
        if (inputUnit.equals("Fahrenheit")) {
            value = (value - 32) * 5/9;
        } else if (inputUnit.equals("Kelvin")) {
            value = value - 273.15;
        }

        // Konwersja z Celsjusza
        if (outputUnit.equals("Fahrenheit")) {
            value = value * 9/5 + 32;
        } else if (outputUnit.equals("Kelvin")) {
            value = value + 273.15;
        }

        return value;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setContentPane(new Temperature().Okno);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
