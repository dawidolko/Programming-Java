package Przykład1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello extends JFrame{

    private JPanel panel1;
    private JButton helloButton;
    private JButton wyjścieButton;
    private JLabel hello;

    public static void main(String[] args){
            Hello hello = new Hello();
            hello.setVisible(true);

    }
    public Hello(){
        super("Hello");
        this.setSize(300,150);
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hello.setText("Hello World!!");
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
