package Przykład3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton mnozenieButton;
    private JButton dzielenieButton;
    private JButton wyjscieButton;
    private JLabel wynik;
    int a, b, w;

    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
    }
    public Kalkulator(){
        super("Kalkulator");
        this.setContentPane(this.panel1);
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                System.out.println("Liczba a " + a + " liczba b " + b);
                w = a + b;
                wynik.setText("Wynik " + a + " + " + b + " = " + w);
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                System.out.println("Liczba a " + a + " liczba b " + b);
                w = a - b;
                wynik.setText("Wynik " + a + " - " + b + " = " + w);
            }
        });
        mnozenieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                System.out.println("Liczba a " + a + " liczba b " + b);
                w = a * b;
                wynik.setText("Wynik " + a + " * " + b + " = " + w);
            }
        });
       dzielenieButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                System.out.println("Liczba a " + a + " liczba b " + b);
                w = a / b;
                wynik.setText("Wynik " + a + " / " + b + " = " + w);
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
