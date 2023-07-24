package ProstaGra2;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Gra gra = new Gra();
        JFrame jf = new JFrame("Prosta Gra");
        jf.setBounds(100,100,700,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.add(gra);

    }
}
