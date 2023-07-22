// Zad. 1 W nowym pakiecie utwórz klasy opisujące następujące figury geometryczne: Koło, Kwadrat,
//      Prostokąt, Sześcian, Prostopadłościan, Kula, Stożek. Dla każdej klasy dobierz odpowiednie pola.
//      Utwórz także metody obliczające pola figur, obwody (dla figur płaskich), oraz objętości
//      (dla figur przestrzennych). Dla każdej klasy utwórz metodę wyświetlającą dane dotyczące figury
//      tj. nazwa, parametry, wartość pola i obwodu lub objętości. Utwórz obiekty tych figur
//      i pokaż wyniki obliczeń przy użyciu funkcji wyświetlającej dane. Utwórz kalkulator
//      dla figur geometrycznych tj. odpowiednie menu pozwalające na: wybór figury geometrycznej
//      oraz wprowadzanie parametrów dla tej figury z konsoli. Następnie wyświetl wyniki
//      przy użyciu metody wyświetlającej dane.

package Figures;

public class Main
{
    public static void main(String[] args)
    {
        Run run = new Run();
        run.Runs();
    }
}
