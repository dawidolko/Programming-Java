package Przykład2;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Okno extends JFrame {
    private JPanel panel1;
    private JButton wyświetlDatęButton;
    private JLabel JData;
    private JButton wyjścieButton;

    public static void main(String[] args){
        Okno okno = new Okno();
        okno.setVisible(true);
    }
    public Okno(){
        super("Okno");
        this.setContentPane(this.panel1);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        wyświetlDatęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date data = new Date();
                JData.setText(data.toString());
            }
        });
        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
