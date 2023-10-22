//[Programowanie Java GUI - lekcja 9: JCheckBox bez ActionListener] - https://www.youtube.com/watch?v=Hys5d2WEaR8&list=PL3298E3EB8CFDE9BA&index=9

package Lesson9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
    private JLabel lCelsius, lFahrenheit;
    private JTextField tCelsius, tFahrenheit;
    private JButton bKonwertuj1, bKonwertuj2;
    private JCheckBox chWielkie;
    private ButtonGroup bgRozmiar;
    private JRadioButton rbMały, rbŚredni, rbDuży;
    private double tempCelsius, tempFahrenheit;

    public CelsiusToFahrenheit(){

        setSize(400,300);
        setTitle("Przeliczanie stopni celsiusa na Fahrenheita");
        setLayout(null);

        lCelsius = new JLabel("Stopnie Celsiusa");
        lCelsius.setBounds(20,20,150,20);
        add(lCelsius);

        tCelsius = new JTextField("");
        tCelsius.setBounds(170,20,150,20);
        add(tCelsius);
        tCelsius.addActionListener(this);
        tCelsius.setToolTipText("Podaj temperature w stopniach Celsiusa");

        lFahrenheit = new JLabel("Stopnie Fahrenheita");
        lFahrenheit.setBounds(20,70,150,20);
        add(lFahrenheit);

        tFahrenheit = new JTextField("");
        tFahrenheit.setBounds(170,70,150,20);
        add(tFahrenheit);
        tFahrenheit.addActionListener(this);
        tFahrenheit.setToolTipText("Podaj temperature w stopniach Fahrenheitach");

        bKonwertuj1 = new JButton("Konwertacja z Celsiusa");
        bKonwertuj1.setBounds(150,100,200,20);
        add(bKonwertuj1);
        bKonwertuj1.addActionListener(this);

        bKonwertuj2 = new JButton("Konwertacja z Fahrenheita");
        bKonwertuj2.setBounds(150,130,200,20);
        add(bKonwertuj2);
        bKonwertuj2.addActionListener(this);

        chWielkie = new JCheckBox("Wielkie litery");
        chWielkie.setBounds(20,120,120,20);
        add(chWielkie);
//        chWielkie.addActionListener(this);

        bgRozmiar = new ButtonGroup();

        rbMały = new JRadioButton("Mały", true);
        rbMały.setBounds(50,170,100,20);
        bgRozmiar.add(rbMały);
        add(rbMały);
        rbMały.addActionListener(this);

        rbŚredni = new JRadioButton("Średni", false);
        rbŚredni.setBounds(150,170,100,20);
        bgRozmiar.add(rbŚredni);
        add(rbŚredni);
        rbŚredni.addActionListener(this);

        rbDuży = new JRadioButton("Duży", false);
        rbDuży.setBounds(250,170,100,20);
        bgRozmiar.add(rbDuży);
        add(rbDuży);
        rbDuży.addActionListener(this);
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit aplikacja  = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zmiana = e.getSource();
        if(zmiana==bKonwertuj1 || zmiana==tCelsius) {
            if(chWielkie.isSelected()){ // jeżeli pole do zaznaczenia jest zaznaczone to wykonuje sie ten warunek
                tFahrenheit.setFont(new Font("Arial",Font.BOLD,18));
                tCelsius.setFont(new Font("Arial",Font.BOLD,18));
            }else{ //inaczej wykonuje sie ten.
                tFahrenheit.setFont(new Font("Arial",Font.PLAIN,12));
                tCelsius.setFont(new Font("Arial",Font.PLAIN,12));
            }
            tempCelsius = Double.parseDouble(tCelsius.getText()); // getText to motoda tekstowa, a my mamy double, więc potrzebujemy zrobić rzutowanie na double. (Double.parseDouble)
            tempFahrenheit = 32.0 + (9.0 / 5.0) * tempCelsius;
            tFahrenheit.setText(String.valueOf(tempFahrenheit)); // rzutowanie poprzez klasę String na typ double pod ktorym jest tempFahrenheit.
        }else if(zmiana==bKonwertuj2 || zmiana==tFahrenheit) {
            if(chWielkie.isSelected()){ // jeżeli pole do zaznaczenia jest zaznaczone to wykonuje sie ten warunek
                tFahrenheit.setFont(new Font("Arial",Font.BOLD,18));
                tCelsius.setFont(new Font("Arial",Font.BOLD,18));
            }else{ //inaczej wykonuje sie ten.
                tFahrenheit.setFont(new Font("Arial",Font.PLAIN,12));
                tCelsius.setFont(new Font("Arial",Font.PLAIN,12));
            }
            tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
            tempCelsius = (tempFahrenheit - 32.0) / (9.0 / 5.0);
            tCelsius.setText(String.valueOf(tempCelsius));
        }else if(zmiana==rbMały){
            tCelsius.setFont(new Font("SanSerif", Font.PLAIN, 8));
            lCelsius.setForeground(new Color(0,200,200));
            tFahrenheit.setFont(new Font("SanSerif", Font.PLAIN, 8));
            lFahrenheit.setForeground(new Color(0,200,200));
        }else if(zmiana==rbŚredni){
            tCelsius.setFont(new Font("SanSerif", Font.PLAIN, 12));
            lCelsius.setForeground(new Color(50,100,200));
            tFahrenheit.setFont(new Font("SanSerif", Font.PLAIN, 12));
            lFahrenheit.setForeground(new Color(50,100,200));
        }else if(zmiana==rbDuży){
            tCelsius.setFont(new Font("SanSerif", Font.PLAIN, 18));
            lCelsius.setForeground(new Color(10,50,200));
            tFahrenheit.setFont(new Font("SanSerif", Font.PLAIN, 18));
            lFahrenheit.setForeground(new Color(10,50,200));
        }
    }
}