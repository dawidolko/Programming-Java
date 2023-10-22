//[Programowanie Java GUI - lekcja 6: JTextField cz.2] - https://www.youtube.com/watch?v=Hys5d2WEaR8&list=PL3298E3EB8CFDE9BA&index=6

package Lesson6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
    JLabel lCelsius, lFahrenheit;
    JTextField tCelsius, tFahrenheit;
    JButton bKonwertuj1, bKonwertuj2;
    double tempCelsius, tempFahrenheit;

    public CelsiusToFahrenheit(){

        setSize(400,200);
        setTitle("Przeliczanie stopni celsiusa na Fahrenheita");
        setLayout(null);

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

        bKonwertuj1 = new JButton("Konwertacja z Celsiusa");
        bKonwertuj1.setBounds(150,100,200,20);
        add(bKonwertuj1);
        bKonwertuj1.addActionListener(this);

        bKonwertuj2 = new JButton("Konwertacja z Fahrenheita");
        bKonwertuj2.setBounds(150,130,200,20);
        add(bKonwertuj2);
        bKonwertuj2.addActionListener(this);
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit aplikacja  = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zmiana = e.getSource();
        if(zmiana==bKonwertuj1) {
            tempCelsius = Double.parseDouble(tCelsius.getText()); // getText to motoda tekstowa, a my mamy double, więc potrzebujemy zrobić rzutowanie na double. (Double.parseDouble)
            tempFahrenheit = 32.0 + (9.0 / 5.0) * tempCelsius;
            tFahrenheit.setText(String.valueOf(tempFahrenheit)); // rzutowanie poprzez klasę String na typ double pod ktorym jest tempFahrenheit.
        }else if(zmiana==bKonwertuj2) {
            tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
            tempCelsius = (tempFahrenheit - 32.0) / (9.0 / 5.0);
            tCelsius.setText(String.valueOf(tempCelsius));
        }
    }
}