// [Programowanie Java GUI - lekcja 28: Nimbus LookAndFeel] - https://www.youtube.com/watch?v=1W5BWdvg52I&list=PL3298E3EB8CFDE9BA&index=28

package Lesson28;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;

public class AdvancedNotepad extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu fileMenu, toolsMenu, lookAndFeelMenu, helpMenu;
    private JMenuItem closeItem, saveItem, openItem, aboutItem;
    private JComboBox<String> colorCombo;
    private JTextField searchField;
    private JButton searchButton;
    private JColorChooser colorChooser;
    private JPanel sidePanel;

    public AdvancedNotepad() {
        setTitle("Zaawansowany Notatnik");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Menu
        menuBar = new JMenuBar();

        // File menu
        fileMenu = new JMenu("Plik");
        saveItem = new JMenuItem("Zapisz");
        openItem = new JMenuItem("Otwórz");
        closeItem = new JMenuItem("Zamknij");

        saveItem.addActionListener(this);
        openItem.addActionListener(this);
        closeItem.addActionListener(this);

        fileMenu.add(saveItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);

        // Look and Feel menu
        lookAndFeelMenu = new JMenu("Look and Feel");
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            JMenuItem item = new JMenuItem(info.getName());
            item.addActionListener(e -> {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                    SwingUtilities.updateComponentTreeUI(this);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            lookAndFeelMenu.add(item);
        }

        // Help menu
        helpMenu = new JMenu("Pomoc");
        aboutItem = new JMenuItem("O programie");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Zaawansowany Notatnik v1.0"));
        helpMenu.add(aboutItem);

        // Add menus to menubar
        menuBar.add(fileMenu);
        menuBar.add(lookAndFeelMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Side Panel
        sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));

        colorCombo = new JComboBox<>(new String[] {"Czarny", "Czerwony", "Niebieski"});
        colorCombo.addActionListener(e -> {
            switch (colorCombo.getSelectedItem().toString()) {
                case "Czarny": textArea.setForeground(Color.BLACK); break;
                case "Czerwony": textArea.setForeground(Color.RED); break;
                case "Niebieski": textArea.setForeground(Color.BLUE); break;
            }
        });

        searchField = new JTextField(10);
        searchButton = new JButton("Szukaj");
        searchButton.addActionListener(e -> {
            String searchTerm = searchField.getText();
            if (!searchTerm.isEmpty()) {
                int start = textArea.getText().indexOf(searchTerm);
                if (start >= 0) textArea.select(start, start + searchTerm.length());
            }
        });

        JButton chooseColorButton = new JButton("Wybierz kolor");
        chooseColorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(this, "Wybierz kolor tekstu", textArea.getForeground());
            if (newColor != null) textArea.setForeground(newColor);
        });

        sidePanel.add(colorCombo);
        sidePanel.add(searchField);
        sidePanel.add(searchButton);
        sidePanel.add(chooseColorButton);
        add(sidePanel, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(textArea.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        } else if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (FileReader reader = new FileReader(file)) {
                    textArea.read(reader, null);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        } else if (e.getSource() == closeItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        AdvancedNotepad notepad = new AdvancedNotepad();
        notepad.setVisible(true);
    }
}

