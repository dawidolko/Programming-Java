//[Programowanie Java GUI - lekcja 1: JFrame] - https://www.youtube.com/watch?v=c345Kng21h0&list=PL3298E3EB8CFDE9BA

package Lesson1;

import javax.swing.JFrame; // importowanie pakietu/biblioteki "swing"

public class MojeOkienko extends JFrame{

    public MojeOkienko(){
        setSize(300,200); // rozmiar okna
        setTitle("Moje pierwsze okienko"); // nazwa okna
    }

    public static void main(String[] args) {
        MojeOkienko okienko = new MojeOkienko(); // stworzenie okna
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dzięki temu okno się zamyka po przyciśnięciu przycisku X
        okienko.setVisible(true); // dzięki temu widać okno, jest ono widoczne
    }
}
