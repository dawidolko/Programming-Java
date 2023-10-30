//[Programowanie Java GUI - lekcja 24 JDialog1] - https://www.youtube.com/watch?v=3Mr7wvVlHkM&list=PL3298E3EB8CFDE9BA&index=24
package Lesson24;

import Lesson18.JTexttArea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordTest extends JFrame implements ActionListener {

    private PanelHasla panelHasla;
    private JTexttArea notatnik;
    private JScrollPane scrollPane;
    private JButton bDodajUzytkownika;

    public PasswordTest(){
        setTitle("Demonstracja okna dialogowego");
        setSize(400,400);
        setLayout(null);

        notatnik = new JTexttArea();
        notatnik.setFocusableWindowState(true); // przechodzenie do nowej linii jak sie konczy miejsce
        scrollPane = new JScrollPane();
        scrollPane.setBounds(0,0,300,200);
        add(scrollPane);

        bDodajUzytkownika = new JButton("Dodaj Użytkownika");
        bDodajUzytkownika.setBounds(0,250,150,20);
        add(bDodajUzytkownika);
        bDodajUzytkownika.addActionListener(this);


    }

    public static void main(String[] args) {
        PasswordTest app = new PasswordTest();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class PanelHasla extends JDialog implements ActionListener{

    private JLabel lUser, lHaslo;
    private JTextField tUser, tHaslo;
    private JButton bOK, bCancel;
    private boolean okData;

    public PanelHasla(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}