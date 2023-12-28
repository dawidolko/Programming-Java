import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;
import java.util.Objects;


public class Dashboard extends JFrame{
    private JPanel panelDashboard;
    private JLabel titleMainDashboard;
    private JPanel imagePanel;
    private JLabel titleComainLeft;
    private JComboBox comboBoxCard;
    private JButton buttonChoseCard;
    private JButton LeaveButton;
    private JPanel panelTitleDashboard;
    private JPanel panelComain;
    private JPanel panelChoseDashboard;
    private JPanel panelEndDashboard;
    private JRadioButton ATMCARDRadioButton;
    private JRadioButton CREDITCARDRadioButton;
    private JRadioButton CREDITCARDRadioButton1;
    private JPanel radioButton;
    private JButton exportButton;
    private JButton importButton;
    private JSlider slider1;
    private static Clip clip; // Zmienna do kontrolowania dźwięku
    private static boolean isLockedOut = false;
    private static long lockoutEndTime;

    public Dashboard() {
        super("Dashboard Window");
        this.setContentPane(panelDashboard);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ATMCARDRadioButton.setSelected(true);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(ATMCARDRadioButton);
        radioButtonGroup.add(CREDITCARDRadioButton);
        radioButtonGroup.add(CREDITCARDRadioButton1);

        try (Connection connection = DatabaseConnector.connect()) {
            String query = "SELECT id, typ FROM karty"; // Dodajemy "id" do zapytania
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int cardId = resultSet.getInt("id"); // Pobieramy ID karty
                    String cardType = resultSet.getString("typ");
                    comboBoxCard.addItem(cardType);

                    comboBoxCard.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int selectedCardId = comboBoxCard.getSelectedIndex();
//                            System.out.println("Selected Card ID: " + selectedCardId);
                        }
                    });
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        buttonChoseCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCardType = Objects.requireNonNull(comboBoxCard.getSelectedItem()).toString();
                int selectedCardId = comboBoxCard.getSelectedIndex() + 1;

                if (ATMCARDRadioButton.isSelected()) {
                    dispose();
                    PinWindow pinMenu = new PinWindow(selectedCardType, selectedCardId);
                    pinMenu.setVisible(true);
                } else if (CREDITCARDRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Ta karta nie służy do wypłacania.");

                } else if (CREDITCARDRadioButton1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Ta karta nie służy do wypłacania.");
                }
            }
        });

        LeaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clip != null && clip.isRunning()) {
                    clip.stop(); // Zatrzymaj dźwięk przed zamknięciem
                }
                dispose();
            }
        });

        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportTable("karty");
                exportTable("tablehistory");
                exportTable("stan_konta");
            }
        });

        importButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select a CSV file to import");
                int result = fileChooser.showOpenDialog(Dashboard.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    importData(selectedFile);
                }
            }
        });

        slider1.setValue(50);
        slider1.addChangeListener(e -> {
            if (!slider1.getValueIsAdjusting()) {
                if (clip != null) {
                    FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                    float value = slider1.getValue() / 100f;
                    float dB = (float) (Math.log(value == 0.0 ? 0.0001 : value) / Math.log(10.0) * 20.0);
                    gainControl.setValue(dB);
                }
            }
        });
    }

    private void exportTable(String tableName) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        fileChooser.setSelectedFile(new File(System.getProperty("user.home") + "/Desktop/" + tableName + "_export.csv"));
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (Connection connection = DatabaseConnector.connect();
                 Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery("SELECT * FROM " + tableName);
                 FileWriter fileWriter = new FileWriter(fileToSave)) {

                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                for (int i = 1; i <= columnCount; i++) {
                    fileWriter.append(metaData.getColumnName(i));
                    if (i < columnCount) {
                        fileWriter.append(",");
                    }
                }
                fileWriter.append("\n");

                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        fileWriter.append(rs.getString(i));
                        if (i < columnCount) {
                            fileWriter.append(",");
                        }
                    }
                    fileWriter.append("\n");
                }
                JOptionPane.showMessageDialog(this, "Data was exported successfully to " + fileToSave.getAbsolutePath());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error occurred while exporting data.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    private void importData(File file) {
        String tableName = "";
        if (file.getName().startsWith("karty")) {
            tableName = "karty";
        } else if (file.getName().startsWith("tablehistory")) {
            tableName = "tablehistory";
        } else if (file.getName().startsWith("stan_konta")) {
            tableName = "stan_konta";
        } else {
            JOptionPane.showMessageDialog(this, "Error: Incorrect file name format for import.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection connection = DatabaseConnector.connect()) {
            connection.prepareStatement("SET FOREIGN_KEY_CHECKS=0").execute();
            connection.setAutoCommit(false); // Rozpocznij transakcję

            try (PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM " + tableName)) {
                deleteStatement.executeUpdate();
            }

            String insertQuery = "";
            if ("karty".equals(tableName)) {
                insertQuery = "INSERT INTO karty (id, typ, PIN) VALUES (?, ?, ?)";
            } else if ("tablehistory".equals(tableName)) {
                insertQuery = "INSERT INTO tablehistory (transaction_id, karta_id, transaction_type, amount, transaction_date) VALUES (?, ?, ?, ?, ?)";
            } else if ("stan_konta".equals(tableName)) {
                insertQuery = "INSERT INTO stan_konta (id, karta_id, saldo) VALUES (?, ?, ?)";
            }

            try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                 BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                br.readLine();

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    for (int i = 0; i < values.length; i++) {
                        insertStatement.setString(i + 1, values[i].trim()); // Użyj metody trim() aby usunąć białe znaki
                    }
                    insertStatement.executeUpdate();
                }

                connection.commit();
                JOptionPane.showMessageDialog(this, "Data imported successfully from " + file.getName());
            } catch (SQLException e) {
                connection.rollback();
                JOptionPane.showMessageDialog(this, "Error occurred while importing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } finally {
                connection.setAutoCommit(true);
                connection.prepareStatement("SET FOREIGN_KEY_CHECKS=1").execute();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error occurred while importing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void playSound() {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop(); // zatrzymaj dźwięk, jeśli już gra
            }
            // Reszta kodu do ładowania i odtwarzania dźwięku...
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File soundFile = new File("src/please_calm_my_mind.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10.0f);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true));
    }
}
