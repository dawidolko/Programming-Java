import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Termometr {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Konwerter Temperatury");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JLabel label = new JLabel("Temperatura w stopniach Celsiusza:");
            JTextField celsiusField = new JTextField(10);
            JButton convertButton = new JButton("Konwertuj");

            JLabel resultLabel = new JLabel("Wynik: ");
            JTextField resultField = new JTextField(10);
            resultField.setEditable(false);

            panel.add(label);
            panel.add(celsiusField);
            panel.add(convertButton);
            panel.add(resultLabel);
            panel.add(resultField);

            convertButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        double celsius = Double.parseDouble(celsiusField.getText());
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        resultField.setText(String.format("%.2f °F", fahrenheit));
                    } catch (NumberFormatException ex) {
                        resultField.setText("Błąd: Wprowadź liczbę");
                    }
                }
            });

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
