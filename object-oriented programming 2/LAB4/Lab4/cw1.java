import javax.swing.*;
import java.awt.*;

public class cw1 {

    private JFrame frame;
    private JList<String> listaKursow;
    private JLabel nazwaKursuLabel, cenaLabel;
    private JButton opłacKursButton, wyjścieButton;

    public cw1() {
        frame = new JFrame("Lista kursów");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Tworzenie listy kursów
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Programowanie");
        model.addElement("C#");
        model.addElement("JAVA");
        model.addElement("Python");
        model.addElement("ASP.NET");
        model.addElement("Grafika komputerowa");
        model.addElement("Adobe Photoshop");
        model.addElement("CorelDRAW");
        model.addElement("Adobe InDesign");
        listaKursow = new JList<>(model);
        listaKursow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listaKursow.addListSelectionListener(e -> {
            String wybranyKurs = listaKursow.getSelectedValue();
            nazwaKursuLabel.setText("Kurs: " + wybranyKurs);
            cenaLabel.setText("Cena PLN: 5000.00");  // Tylko dla uproszczenia, każdy kurs ma tę samą cenę
        });

        // Panel informacyjny
        JPanel infoPanel = new JPanel();
        nazwaKursuLabel = new JLabel("Kurs: ");
        cenaLabel = new JLabel("Cena PLN: ");
        infoPanel.add(nazwaKursuLabel);
        infoPanel.add(cenaLabel);

        // Przyciski
        opłacKursButton = new JButton("Opłać kurs");
        opłacKursButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(frame, "Podaj swoje dane:", "Input", JOptionPane.PLAIN_MESSAGE);
            if (name != null) {
                JOptionPane.showMessageDialog(frame, "Dziękujemy za opłatę, " + name + "!");
            }
        });

        wyjścieButton = new JButton("Wyjście");
        wyjścieButton.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(opłacKursButton);
        buttonPanel.add(wyjścieButton);

        frame.add(new JScrollPane(listaKursow), BorderLayout.WEST);
        frame.add(infoPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Cwiczenie1::new);
    }
}
