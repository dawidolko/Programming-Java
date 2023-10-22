//[Programowanie Java GUI - lekcja 4: JLabel] - https://www.youtube.com/watch?v=Hys5d2WEaR8&list=PL3298E3EB8CFDE9BA&index=4

package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MojeOkienko extends JFrame implements ActionListener
{
    JButton bPodajDate, bWyjście; // deklaracja przycisków
    JLabel lWyświetlDate; // deklaracja pola
    public MojeOkienko(){
        // OKNO:
        setSize(300,200); // rozmiar okna
        setTitle("Moje pierwsze okienko"); // nazwa okna
        setLayout(null); // układ jaki ma nasze okno

        // 1 PRZYCISK:
        bPodajDate = new JButton("Podaj datę"); // przycisk o nazwie bPodajDate
        bPodajDate.setBounds(50,50,100,20); // rozmiar przycisku który stworzyliśmy
        add(bPodajDate); // dodaje do okna element.
        bPodajDate.addActionListener(this); // dodajemy do przycisku "bPodajDate" (źródło zdarzeń) słuchacza "addActionListener" (this - to cała ramka)

        // 2 PRZYCISK:
        bWyjście = new JButton("Wyjście");
        bWyjście.setBounds(150,50,100,20);
        add(bWyjście);
        bWyjście.addActionListener(this);

        // ETYKIETA:
        lWyświetlDate = new JLabel("Data:"); // Nazwa oraz napis w oknie etykiety.
        lWyświetlDate.setBounds(50,100,200,20);
//        lWyświetlDate.setForeground(Color.PINK); // zmiana koloru napisu na etykiecie 1 sposób
        lWyświetlDate.setForeground(new Color(0,200,200)); // 2 sposób
        lWyświetlDate.setFont(new Font("SansSerif",Font.BOLD,16)); // Czcionka, styl, rozmiar
        add(lWyświetlDate);
    }

    public static void main(String[] args) {
        MojeOkienko okienko = new MojeOkienko(); // stworzenie okna
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dzięki temu okno się zamyka po przyciśnięciu przycisku X
        okienko.setVisible(true); // dzięki temu widać okno, jest ono widoczne
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource(); // tworzymy Obiekt do actionEventa, który umożliwi nam przypisanie przyciskom poszczegolnych działań
        if(źródło==bPodajDate){
            lWyświetlDate.setText(new Date().toString()); // <-- Ta komenda wypisuje nam treść JLabel, ponieważ metoda Date nie jest w trybie tekstowym, dodajemy toString
//            System.out.println(new Date()); // wypisywanie daty poprzez słuchacza
        }
        else if(źródło==bWyjście){
            System.out.println("Program wyłączony");
            dispose(); // <-- ta komenda zamyka program.
        }
    }
}
