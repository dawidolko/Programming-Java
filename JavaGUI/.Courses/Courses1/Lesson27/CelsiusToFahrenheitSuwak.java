package Lesson27;

import Lesson6.CelsiusToFahrenheit;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CelsiusToFahrenheitSuwak extends JFrame implements ChangeListener {

    private JLabel lCelsius, lFahrenheit;
    private JSlider sCelsius, sFahrenheit;
    private int tempCelius, tempFahrenheit;

    public CelsiusToFahrenheitSuwak(){
        setSize(500,300);
        setTitle("Przeliczanie stopni");
        setLayout(null);

        sCelsius = new JSlider(0,100,0);
        sCelsius.setBounds(50,50,300,50);
        sCelsius.setMajorTickSpacing(20);
        sCelsius.setMinorTickSpacing(20);
        sCelsius.setPaintTicks(true);
        sCelsius.setPaintLabels(true);
        add(sCelsius);

        sFahrenheit = new JSlider(30,212,30);
        sFahrenheit.setBounds(50,150,300,50);
        sFahrenheit.setMajorTickSpacing(20);
        sFahrenheit.setMinorTickSpacing(20);
        sFahrenheit.setPaintTicks(true);
        sFahrenheit.setPaintLabels(true);
        sCelsius.addChangeListener(this);
        sFahrenheit.setEnabled(false);
        add(sFahrenheit);

        lCelsius = new JLabel("Celsius: ");
        lCelsius.setBounds(380,50,300,50);
        add(lCelsius);

        lFahrenheit = new JLabel("Fahrenheit: ");
        lFahrenheit.setBounds(380,150,300,50);
        add(lFahrenheit);
    }

    public static void main(String[] args) {
        CelsiusToFahrenheitSuwak apps = new CelsiusToFahrenheitSuwak();
        apps.setDefaultCloseOperation(EXIT_ON_CLOSE);
        apps.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        tempCelius = sCelsius.getValue();
        lCelsius.setText("Celsius " + tempCelius);
        tempFahrenheit = (int)Math.round(32 + (9/5)*tempCelius);
        lFahrenheit.setText("Fahrenheit: "+tempFahrenheit);
        sFahrenheit.setValue(tempFahrenheit);
    }
}
