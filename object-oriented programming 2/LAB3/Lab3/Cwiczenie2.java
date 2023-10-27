import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Cwiczenie2 extends JFrame {
    private JPanel mainPanel;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JTable table1;
    private JButton episodeRatingsButton;
    private JButton IMDBPageButton;
    private JTextField textField1;

    public Cwiczenie2() {
        super("Table Example");
        this.setSize(800, 500);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dodawanie wartości do comboBox1
        comboBox1.addItem("Action");
        comboBox1.addItem("Comedy");
        comboBox1.addItem("Drama");
        comboBox1.addItem("Horror");

        // Dodawanie wartości do comboBox2
        comboBox2.addItem("movie");
        comboBox2.addItem("series");
        comboBox2.addItem("episode");

        String[] columnNames = {"Title", "Year", "Rating", "Num Votes"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        table1.setModel(tableModel);

        // Dodawanie danych do tabeli
        tableModel.addRow(new Object[]{"Top Gun: Maverick", "2022", "8.13", "60977"});
        tableModel.addRow(new Object[]{"Everything Everywhere All at Once", "2022", "7.53", "16748"});
        tableModel.addRow(new Object[]{"Batman", "2022", "7.41", "8781"});

        episodeRatingsButton.addActionListener(e -> {
            // Przykładowa funkcjonalność: wyświetlenie wybranego tytułu filmu.
            int selectedRow = table1.getSelectedRow();
            if(selectedRow >= 0) {
                String title = (String) tableModel.getValueAt(selectedRow, 0);
                JOptionPane.showMessageDialog(this, "Episode ratings for: " + title);
            }
        });

        IMDBPageButton.addActionListener(e -> {
            // Przykładowa funkcjonalność: przekierowanie do strony IMDB.
            int selectedRow = table1.getSelectedRow();
            if(selectedRow >= 0) {
                String title = (String) tableModel.getValueAt(selectedRow, 0);
                JOptionPane.showMessageDialog(this, "Redirecting to IMDB page for: " + title);
            }
        });
    }

    public static void main(String[] args) {
        Cwiczenie2 frame = new Cwiczenie2();
        frame.setVisible(true);
    }
}
