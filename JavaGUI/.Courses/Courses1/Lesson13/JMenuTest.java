//[Programowanie Java GUI - lekcja 13: Menu cz.1] - https://www.youtube.com/watch?v=oDCnQG1hz7k&list=PL3298E3EB8CFDE9BA&index=13

package Lesson13;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menuPlik, menuNarzędzia, menuOpcje, menuPomoc;
    JMenuItem mOtwórz, mZapisz, mWyjście, mNarz1, mNarz2, nOProgramie, mOpcja1, mOpcja2;

    public JMenuTest(){
        setTitle("Demonstacja JMenuBar");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuBar = new JMenuBar();

        menuPlik = new JMenu("Plik");

        mOtwórz = new JMenuItem("Otwórz");
        mZapisz = new JMenuItem("Zamknij");
        mWyjście = new JMenuItem("Wyjście");

        menuPlik.add(mOtwórz);
        menuPlik.add(mZapisz);
        menuPlik.addSeparator(); // to rozdzielenie 2 opcji
        menuPlik.add(mWyjście);

        menuNarzędzia = new JMenu("Narzędzia");

        mNarz1 = new JMenuItem("Narz1");
        mNarz2 = new JMenuItem("Narz2");

        menuNarzędzia.add(mNarz1);
        menuNarzędzia.add(mNarz2);

            menuOpcje = new JMenu("Opcje");

            mOpcja1 = new JMenuItem("Opcja 1");
            mOpcja2 = new JMenuItem("Opcja 2");

            menuOpcje.add(mOpcja1);
            menuOpcje.add(mOpcja2);

        menuNarzędzia.add(menuOpcje);

        menuPomoc = new JMenu("Pomoc");

        nOProgramie = new JMenuItem("Program info");

        menuPomoc.add(nOProgramie);

        setJMenuBar(menuBar); // komenda dodajaca do Menubaru.
        menuBar.add(menuPlik);
        menuBar.add(menuNarzędzia);
        menuBar.add(menuPomoc);
    }

    public static void main(String[] args) {
        JMenuTest appMenu = new JMenuTest();
        appMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
