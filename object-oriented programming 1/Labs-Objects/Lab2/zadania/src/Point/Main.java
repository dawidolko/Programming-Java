// Zad. 1 Postępuj według następujących instrukcji:
//      1. Utwórz projekt zawierający funkcje Main.
//      2. Utwórz klasę Punkt, która zawiera publiczne pola (współrzędne): x oraz y.
//      3. Dla klasy Punkt zdefiniuj konstruktor bezparametrowy, który zainicjuje początkowe wartości atrybutów.
//      4. Zdefiniuj drugi konstruktor, który przekazane parametry zapamięta, jako wartości atrybutów: x i y.
//      5. Zdefiniuj następujące metody dla klasy punkt:
//         • gettery i settery;
//         • void zeruj();
//         • void opis();
//         • void przesun(int x, int y);
//      6. W metodzie main() utwórz trzy obiekty typu Punkt.
//      7. Pokaż, w jaki sposób można wykorzystać każdą ze zdefiniowanych metod.
//      8. Do pakietu pliki Figury, Prostokąt i Trojkat (udostępnione przez prowadzącego).
//      9. Utworzyć obiekty typu Figura, Prostokat i Trojkat. Sprawdzić działanie metod dla utworzonych obiektów.
//      10. Zaprojektować klasę Okrag zawierającą pola:
//          • środek klasy Punkt – środek okręgu;
//          • promień typu double;
//          oraz metody:
//          • getPowierzchnia() zwracająca pole powierzchni;
//          • getSrednica() zwracająca średnice;
//          • setPromien(double p) ustawiająca nowy promień;
//          • getPromien() zwracająca promień;
//          • wSrodku(Punkt) sprawdzająca czy dany punkt znajduje się wewnątrz okręgu. Skorzystaj ze wzoru:
//            (x-a)^2 + (y-b)^2 <= r^2, S=(a,b);
//          Konstruktory:
//          • Pusty – inicjujący pola wartościami domyślnymi punkt (0,0), promień 0;
//          • Określający punkt oraz promień;
//      11. Zmodyfikować klasę Prostokat i Trojkat, tak, aby dziedziczyły z klasy Figura.
//      12. Dodać konstruktor przeciążony dla klasy Prostokat postaci: Prostokat(float wys, float szer, String kolor).
//          Wewnątrz konstruktora powinien być wywołany konstruktor z klasy bazowej.
//      13. Dodać konstruktor przeciążony dla klasy Trojkat postaci Trojkat(float wys, float podst, String kolor).
//      14. Dodać metodę przesuwającą prostokąt o dane współrzędne void przesun(float x, float y).
//      15. Dla obiektu typu Prostokat wywołać metodę przesun(3,5).
//      16. Zdefiniować nową klasę Kwadrat dziedziczącą z klasy Prostokat. Umieścić w niej gettery i setery.
//      17. Utworzyć dowolny obiekt typu Kwadrat i nadać mu dowolną wartość początkową.
//      18. Przysłonić metody opis() we wszystkich klasach.
//      19. Dla utworzonych obiektów wywołać metodę opis(), w taki sposób, aby opis o danym obiekcie został
//          wyświetlony na konsolę.
//      20. Zmodyfikować klasę Okrag zawierającą, tak, aby dziedziczyła po klasie Figura.
//      21. Sprawdzić działanie zdefiniowanych metod dla przykładowych obiektów.

package Point;

public class Main
{
    public static void main(String[] args)
    {
        Run run = new Run();
        run.Runs();
    }
}
