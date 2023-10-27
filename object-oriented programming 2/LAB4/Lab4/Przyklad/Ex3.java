package Przyklad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3 extends JFrame {

    private JPanel mainPanel;
    private JButton closeButton;
    private JButton orderButton;
    private JLabel timeLabel;
    private JLabel costLabel;
    private JComboBox comboBox1;
    private JCheckBox firstBox;
    private JCheckBox secondBox;

    public Ex3() {
        super("Asystent dostaw");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200, 200, 400, 300);

        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String company = comboBox1.getSelectedItem().toString();

                if (company.equals("Poczta Polska")) {
                    timeLabel.setText("Paczka dotrze za 3 dni.");
                    costLabel.setText("Koszt przewoźnika to 18zł.");
                    firstBox.setEnabled(true);
                    secondBox.setEnabled(true);
                } else if (company.equals("DPD")) {
                    timeLabel.setText("Paczka dotrze za 2 dni.");
                    costLabel.setText("Koszt przewoźnika to 21zł.");
                    firstBox.setEnabled(true);
                    secondBox.setEnabled(true);
                } else if (company.equals("Inpost")) {
                    timeLabel.setText("Paczka dotrze do Ciebie jutro.");
                    costLabel.setText("Koszt przewoźnika to 11zł.");
                    firstBox.setEnabled(true);
                    secondBox.setEnabled(true);
                }else if (company.equals("Teleportex")) {
                    timeLabel.setText("Paczka zostanie do Ciebie teleportowana w przeciągu godziny.");
                    costLabel.setText("Cena teleportacji to 149zł.");
                    firstBox.setEnabled(false);
                    secondBox.setEnabled(false);
                }

            }
        });

        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cost = 0;
                String company = comboBox1.getSelectedItem().toString();

                if (company.equals("Poczta Polska")) {
                    cost += 18;
                    if (firstBox.isSelected()) cost += 11;
                    if (secondBox.isSelected()) cost += 8;
                } else if (company.equals("DPD")) {
                    cost += 21;
                    if (firstBox.isSelected()) cost += 11;
                    if (secondBox.isSelected()) cost += 8;
                } else if (company.equals("Inpost")) {
                    cost += 11;
                    if (firstBox.isSelected()) cost += 11;
                    if (secondBox.isSelected()) cost += 8;
                }else if (company.equals("Teleportex")) {
                    cost += 149;
                }

                JOptionPane.showMessageDialog(mainPanel, "Koszt dostawy będzie równy " + cost + " zł.");

            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Ex3 frame = new Ex3();
        frame.setVisible(true);
    }
}
