//[Programowanie Java GUI - lekcja 2: JButton cz.1] - https://www.youtube.com/watch?v=Hys5d2WEaR8&list=PL3298E3EB8CFDE9BA&index=2

package Lesson2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MojeOkienko extends JFrame implements ActionListener
{

    public MojeOkienko(){
        setSize(300,200); // rozmiar okna
        setTitle("Moje pierwsze okienko"); // nazwa okna
        setLayout(null); // układ jaki ma nasze okno
        JButton button = new JButton("Podaj datę"); // przycisk o nazwie button
        button.setBounds(100,50,100,20); // rozmiar przycisku który stworzyliśmy
        add(button); // dodaje do okna element.
        button.addActionListener(this); // dodajemy do przycisku "button" (źródło zdarzeń) słuchacza "addActionListener" (this - to cała ramka)
    }

    public static void main(String[] args) {
        MojeOkienko okienko = new MojeOkienko(); // stworzenie okna
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dzięki temu okno się zamyka po przyciśnięciu przycisku X
        okienko.setVisible(true); // dzięki temu widać okno, jest ono widoczne
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Date()); // wypisywanie daty poprzez słuchacza
    }
}
