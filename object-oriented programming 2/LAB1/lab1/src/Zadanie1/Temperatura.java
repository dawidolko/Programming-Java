package Zadanie1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperatura extends JFrame {
    private JTextField textField1;
    private JButton konwertujButton;
    private JButton wyjscieButton;
    private JLabel Wynik;
    private JPanel okno;

    float stopnieC, stopnieF;

    public static void main(String[] args){
        Temperatura temperatura = new Temperatura();
        temperatura.setVisible(true);
    }
    public Temperatura(){
        super("Temperatura z Celsjusza na Farenheit");
        this.setContentPane(this.okno);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopnieC = Float.valueOf(textField1.getText());
                stopnieF = (stopnieC*1.8f)+32;
                Wynik.setText(stopnieF+"F");
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
