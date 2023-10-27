import javax.swing.*;

public class Cwiczenie3 extends JFrame{
    private JPanel mainPanel, secondPanel;
    private JList<String> languageList;
    private JList<String> editorList;
    private JButton showButton;
    private JLabel resultLabel;

    public Cwiczenie3() {
        super("listy");
        this.setSize(400,500);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Wstępna inicjalizacja list
        DefaultListModel<String> languageModel = new DefaultListModel<>();
        languageModel.addElement("C++");
        languageModel.addElement("C#");
        languageModel.addElement("JAVA");
        languageModel.addElement("JAVA Script");
        languageList.setModel(languageModel);

        DefaultListModel<String> editorModel = new DefaultListModel<>();
        editorModel.addElement("Visual Studio");
        editorModel.addElement("Visual Studio Code");
        editorModel.addElement("IntelliJ idea");
        editorModel.addElement("PyCharm");
        editorModel.addElement("WebStorm");
        editorModel.addElement("PhpStorm");
        editorList.setModel(editorModel);

        // Nasłuchiwacz dla przycisku
        showButton.addActionListener(e -> {
            String selectedLanguage = languageList.getSelectedValue();
            String selectedEditor = editorList.getSelectedValue();
            resultLabel.setText("Programming language: " + selectedLanguage + ", Editor Selected: " + selectedEditor);
        });
    }

    public static void main(String[] args) {
        Cwiczenie3 frame = new Cwiczenie3();
        frame.setVisible(true);
    }
}
