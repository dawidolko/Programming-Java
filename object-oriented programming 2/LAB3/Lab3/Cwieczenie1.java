import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cwieczenie1 extends JFrame {

    private JPanel mainPanel;
    private JLabel showTextLabel;
    private JButton showButton;
    private JComboBox<String> comboBox1;

    public Cwieczenie1() {
        super("combox example");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        // Dodajemy przykładowe języki programowania do comboBox
        comboBox1.addItem("C");
        comboBox1.addItem("C++");
        comboBox1.addItem("Java");
        comboBox1.addItem("Python");

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");  // Dodane do diagnozy
                String selectedLanguage = (String) comboBox1.getSelectedItem();
                showTextLabel = new JLabel();
                showTextLabel.setText("Programming language Selected: " + selectedLanguage);
                JOptionPane.showMessageDialog(null, "You selected the language: " + selectedLanguage);  // zmieniłem "mainPanel" na "null"
            }
        });
    }

    public static void main(String[] args) {
        Cwieczenie1 frame = new Cwieczenie1();
        frame.setVisible(true);
    }
}
