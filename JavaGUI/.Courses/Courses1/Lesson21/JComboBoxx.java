//[Programowanie Java GUI - lekcja 21: JComboBox] - https://www.youtube.com/watch?v=otj81U7PK_Q&list=PL3298E3EB8CFDE9BA&index=21

package Lesson21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JComboBoxx extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JButton bSzukaj;
    JComboBox combo;
    JTextField tSzukamy;
    JMenu menuPlik, menuNarzędzia, menuOpcje, menuPomoc;
    JMenuItem mOtwórz, mZapisz, mWyjście, mNarz1, mNarz2, nOProgramie, mOpcja1, mOpcja2, mKopiuj,mWklej,mDolacz;
    JCheckBoxMenuItem chOpcja2;
    JTextArea notatnik;
    JPopupMenu popup;
    String wybranyTekst;

    public JComboBoxx(){
        setTitle("Demonstacja JComboBox");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuBar = new JMenuBar();

        menuPlik = new JMenu("Plik");

        mOtwórz = new JMenuItem("Otwórz",'O'); // dzieki temu 'o' jest ono podkreslone w oknie menu
        mOtwórz.addActionListener(this);
        mZapisz = new JMenuItem("Zapisz");
        mZapisz.addActionListener(this);
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

        notatnik = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(notatnik);
        scrollPane.setBounds(50,50,300,300);
        add(scrollPane);
        //notatnik.setBounds(50,50,200,200);

        tSzukamy = new JTextField();
        tSzukamy.setBounds(50,360,100,20); // zmieniono wartość z 800 na 360
        add(tSzukamy);

        bSzukaj = new JButton("Szukaj");
        bSzukaj.setBounds(200,360,100,20);
        add(bSzukaj);
        bSzukaj.addActionListener(this);

        mKopiuj = new JMenuItem("Kopiuj");
        mKopiuj.addActionListener(this);

        mWklej = new JMenuItem("Wklej");
        mWklej.addActionListener(this);

        mDolacz = new JMenuItem("Dolacz");
        mDolacz.addActionListener(this);

        popup = new JPopupMenu();
        popup.add(mDolacz);
        popup.add(mKopiuj);
        popup.add(mWklej);

        notatnik.setComponentPopupMenu(popup);

        combo = new JComboBox();
        combo.setBounds(400,50,100,20);
        combo.addItem("Czarny");
        combo.addItem("Czerwony");
        combo.addItem("Zielony");
        combo.addItem("Niebieski");
        combo.addItem("Różowy");
        add(combo);
        combo.addActionListener(this);
    }

    public static void main(String[] args) {
        JComboBoxx appMenu = new JComboBoxx();
        appMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zmiana = e.getSource();
        if(zmiana==mOtwórz){
            JFileChooser fcc = new JFileChooser();
            if(fcc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                File plik = fcc.getSelectedFile();
//                    JOptionPane.showMessageDialog(null,"Wybrany plik to: " + plik.getAbsolutePath());
                try {
                    Scanner scanner = new Scanner(plik);
                    while(scanner.hasNext()){
                        notatnik.append(scanner.nextLine() + "\n");
                    }
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        else if(zmiana==mZapisz){
            JFileChooser fc = new JFileChooser();
            if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
//                    JOptionPane.showMessageDialog(null,"Wybrany plik to: "+plik);
                try {
                    PrintWriter pw = new PrintWriter(plik);
                    Scanner scanner = new Scanner(notatnik.getText());
                    while(scanner.hasNext()){
                        pw.println(scanner.nextLine()+"\n");
                    }
                    pw.close();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        else if(zmiana==mWyjście){
            int odp = JOptionPane.showConfirmDialog(null,"Czy napewno wyjść?", "Pytanie", JOptionPane.YES_NO_OPTION);
            if(odp==JOptionPane.YES_OPTION){
                dispose();
            }else if(odp==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Wiedziałem... ;)");
            }else if(odp==JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null, "Tak nie robimy.", "tytuł", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(zmiana==bSzukaj){
            String tekst = notatnik.getText();
            String szukane = tSzukamy.getText();
            String wystapienia = "";
            int i = 0;
            int index;
            int startIndex = 0;
            while((index = tekst.indexOf(szukane, startIndex)) != -1){
                startIndex = index +szukane.length();
                i++;
                wystapienia = wystapienia+" "+index;
            }

            JOptionPane.showMessageDialog(null, szukane+" wystapilo " + i + " na pozycji: " + wystapienia);
        }
        else if(zmiana==mKopiuj){
            wybranyTekst = notatnik.getSelectedText();
        }
        else if(zmiana==mWklej){
            notatnik.insert(wybranyTekst, notatnik.getCaretPosition());
        } else if (zmiana==mDolacz) {
            notatnik.append("\n"+wybranyTekst);
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
        else if(zmiana==combo){
            String color = combo.getSelectedItem().toString();
            if(color.equals("Zielony")){
                notatnik.setForeground(Color.GREEN);
            }else if(color.equals("Czerwony")){
                notatnik.setForeground(Color.RED);
            }else if(color.equals("Niebieski")){
                notatnik.setForeground(Color.BLUE);
            }else if(color.equals("Różowy")){
                notatnik.setForeground(Color.pink);
            }else if(color.equals("Czarny")){
                notatnik.setForeground(Color.BLACK);
            }
        }
    }
}



