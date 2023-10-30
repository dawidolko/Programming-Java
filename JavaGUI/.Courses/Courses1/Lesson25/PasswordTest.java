//[Programowanie Java GUI - lekcja 25 JDialog2] - https://www.youtube.com/watch?v=3Mr7wvVlHkM&list=PL3298E3EB8CFDE9BA&index=25
package Lesson25;

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
        if(panelHasla==null){
            panelHasla= new PanelHasla(this);
        }
        panelHasla.setVisible(true);
    }
}

class PanelHasla extends JDialog implements ActionListener{

    private JLabel lUser, lHaslo;
    private JTextField tUser;
    private JPasswordField pPassword;
    private JButton bOK, bCancel;
    private boolean okData;

    public PanelHasla(JFrame owner){
        super(owner, "Wprowadzanie hasla", true);
        setSize(300,200);
        setLayout(null);

        lUser = new JLabel("Uzytkownik", JLabel.RIGHT);
        lUser.setBounds(0,0,100,20);
        add(lUser);

        tUser = new JTextField();
        tUser.setBounds(150,0,100,20);
        add(tUser);

        lHaslo = new JLabel("Hasło", JLabel.RIGHT);
        lHaslo.setBounds(0,50,100,20);
        add(lHaslo);

        pPassword = new JPasswordField();
        pPassword.setBounds(150,50,100,20);
        add(pPassword);

        bOK = new JButton("OK");
        bOK.setBounds(0,100,100,20);
        add(bOK);

        bCancel = new JButton("Cancel");
        bCancel.setBounds(0,100,100,20);
        add(bCancel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}