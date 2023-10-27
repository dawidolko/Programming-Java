package Zadanie2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 extends JFrame{
    private JPanel mainPanel;
    private JComboBox colorCombo;
    private JEditorPane editor;
    private JButton bButton;
    private JButton iButton;
    private JButton zButton;
    private JButton pButton;

    private boolean bold=false, italic=false;

    public Ex2() {
        super("Edytor tesktu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setBounds(100, 100, 700, 550);

        colorCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String color = colorCombo.getSelectedItem().toString();

                if (color.equals("Czarny")) editor.setForeground(Color.BLACK);
                else if (color.equals("Czerwony")) editor.setForeground(Color.RED);
                else if (color.equals("Zielony")) editor.setForeground(Color.GREEN);
                else if (color.equals("Fioletowy")) editor.setForeground(Color.MAGENTA);
                else if (color.equals("Niebieski")) editor.setForeground(Color.BLUE);
                else if (color.equals("Żółty")) editor.setForeground(Color.YELLOW);
            }
        });

        bButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()));
                    bold = true;
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()));
                    bold = true;
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()));
                    bold = false;
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()));
                    bold = false;
                }
            }
        });

        iButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()));
                    italic = true;
                } else if (!italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()));
                    italic = true;
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN + Font.BOLD, editor.getFont().getSize()));
                    italic = false;
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()));
                    italic = false;
                }
            }
        });

        zButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()+1));
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()+1));
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()+1));
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()+1));
                }
            }
        });

        pButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()-1));
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()-1));
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()-1));
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()-1));
                }
            }
        });
    }

    public static void main(String[] args) {
        Ex2 frame = new Ex2();
        frame.setVisible(true);
    }
}
