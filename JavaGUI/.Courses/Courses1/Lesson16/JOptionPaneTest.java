//[Programowanie Java GUI - lekcja 16: JOptionPane] - https://www.youtube.com/watch?v=oDCnQG1hz7k&list=PL3298E3EB8CFDE9BA&index=16


package Lesson16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneTest extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menuPlik, menuNarzędzia, menuOpcje, menuPomoc;
    JMenuItem mOtwórz, mZapisz, mWyjście, mNarz1, mNarz2, nOProgramie, mOpcja1, mOpcja2;
    JCheckBoxMenuItem chOpcja2;

    public JOptionPaneTest(){
        setTitle("Demonstacja JOptionPane");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuBar = new JMenuBar();

        menuPlik = new JMenu("Plik");

        mOtwórz = new JMenuItem("Otwórz",'O'); // dzieki temu 'o' jest ono podkreslone w oknie menu
        mZapisz = new JMenuItem("Zapisz");
        mWyjście = new JMenuItem("Wyjście");

        menuPlik.add(mOtwórz);
        menuPlik.add(mZapisz);
        menuPlik.addSeparator(); // to rozdzielenie 2 opcji
        menuPlik.add(mWyjście);

        mWyjście.addActionListener(this);
        mWyjście.setAccelerator(KeyStroke.getKeyStroke("ctrl Q")); // ta funcja dziala po przycisnieciu ctrl Q

        menuNarzędzia = new JMenu("Narzędzia");

        mNarz1 = new JMenuItem("Narz1");
        mNarz2 = new JMenuItem("Narz2");
        mNarz2.addActionListener(this);
        mNarz1.setEnabled(false);
        menuOpcje = new JMenu("Opcje");
        mOpcja1 = new JMenuItem("opcja1");
        chOpcja2 = new JCheckBoxMenuItem("opcja2");
        chOpcja2.addActionListener(this);

        menuOpcje.add(mOpcja1);
        menuOpcje.add(chOpcja2);
        menuNarzędzia.add(menuOpcje);

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
        nOProgramie.addActionListener(this);

        setJMenuBar(menuBar); // komenda dodajaca do Menubaru.
        menuBar.add(menuPlik);
        menuBar.add(menuNarzędzia);
        menuBar.add(Box.createHorizontalGlue()); // dzieki temu pomoc jest po prawej stronie menubara
        menuBar.add(menuPomoc);
    }

    public static void main(String[] args) {
        Lesson16.JOptionPaneTest appMenu = new Lesson16.JOptionPaneTest();
        appMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zmiana = e.getSource();
        if(zmiana==mWyjście){
            int odp = JOptionPane.showConfirmDialog(null,"Czy napewno wyjść?", "Pytanie", JOptionPane.YES_NO_OPTION);
            if(odp==JOptionPane.YES_OPTION){
                dispose();
            }else if(odp==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Wiedziałem... ;)");
            }else if(odp==JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null, "Tak nie robimy.", "tytuł", JOptionPane.WARNING_MESSAGE);
             }
        }
        if(zmiana==chOpcja2){
            if(chOpcja2.isSelected()){
                mNarz1.setEnabled(true);
            }else if(!chOpcja2.isSelected()){
                mNarz1.setEnabled(false);
            }
        }
        if(zmiana==mNarz2){
            String sMetry = JOptionPane.showInputDialog("Podaj długość w metrach");
            double metry = Double.parseDouble(sMetry);
            double stopy = metry/0.3048;
            String sStopy = String.format("%.2f", stopy);
            JOptionPane.showMessageDialog(null, "metry + metrów = " + sStopy + " stóp");
        }
        if(zmiana==nOProgramie){
            JOptionPane.showMessageDialog(null, "Program demonstruje wykorzystanie JMenuBar i JMenu \n Werjsa 1.0", "tytuł", JOptionPane.WARNING_MESSAGE); //szreg okien dialogowych
        }
    }
}

