//[Programowanie Java GUI - lekcja 5: JTextField cz.1] - https://www.youtube.com/watch?v=Hys5d2WEaR8&list=PL3298E3EB8CFDE9BA&index=5

package Lesson5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
    public CelsiusToFahrenheit(){
        setSize(400,200);
        setTitle("Przeliczanie stopni celsiusa na Fahrenheita");
        setLayout(null);

        JLabel lCelsius, lFahrenheit;
        JTextField tCelsius, tFahrenheit;
        JButton bKonwertuj;

        lCelsius = new JLabel("Stopnie Celsiusa");
        lCelsius.setBounds(20,20,150,20);
        add(lCelsius);

        tCelsius = new JTextField("");
        tCelsius.setBounds(170,20,150,20);
        add(tCelsius);

        lFahrenheit = new JLabel("Stopnie Fahrenheita");
        lFahrenheit.setBounds(20,70,150,20);
        add(lFahrenheit);

        tFahrenheit = new JTextField("");
        tFahrenheit.setBounds(170,70,150,20);
        add(tFahrenheit);

        bKonwertuj = new JButton("Konwertacja");
        bKonwertuj.setBounds(200,100,120,20);
        add(bKonwertuj);
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit aplikacja  = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
