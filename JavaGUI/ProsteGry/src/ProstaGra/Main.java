package ProstaGra;

import ProstaGra.Gra;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Gra gra = new Gra();
        JFrame jf = new JFrame("Prosta_Gra");
        //tworzenie okna gry
        jf.setBounds(200, 200,700,600);
        //tworzenie sytuacji co jeśli okno się zamknie
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
        //dodanie do okna interakcji z klasą gra
        jf.add(gra);
    }
}