package Lesson23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class PasswordFiledTest extends JFrame implements ActionListener {
    JPasswordField phaslo;

    public PasswordFiledTest(){
        setTitle("Test hasła");
        setSize(400,400);
        setLayout(null);

        phaslo = new JPasswordField();
        phaslo.setBounds(50,50,150,20);
        phaslo.addActionListener(this);
        phaslo.setEchoChar('#'); // za nim kropek to są # w textfieldzie
        add(phaslo);
    }

    public static void main(String[] args){
        PasswordFiledTest app = new PasswordFiledTest();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null, Arrays.toString(phaslo.getPassword())); // wyswietla [ , , , , , ] <- w taki sposob haslo.
//        JOptionPane.showMessageDialog(null, String.valueOf(phaslo.getPassword())); // tu normalnie
        JOptionPane.showMessageDialog(null, new String(phaslo.getPassword()));
    }
}
