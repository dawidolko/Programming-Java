package Interface;

// Interfejs to “szablon” zawierający elementy, które muszą być użyte w klasach, które go zaimplementują.
// Interfejsy mogą zawierać tylko stałe i deklaracje metod. Implementacja interfejsu w danej klasie odbywa się
// za pomocą słowa kluczowego ,implements,.
//
//      Konstrukcja interfejsu:
//          modyfikator_dostepu interface Nazwa_interfejsu
//          {
//              // deklaracja stałych i/lub metod
//          }
//
//      Implementacja interfejsu:
//          modyfikator_dostepu class Nazwa_klasy implements Nazwa_interfejsu
//          {
//              // deklaracja składowych i/lub metod
//                // kod klasy
//          }
//
//      W odróżnieniu od dziedziczenia dana klasa może implementować wiele interfejsów:
//          modyfikator_dostepu class Nazwa_klasy implements Interfejs1, Interfejs2 // itd...
//          {
//              // deklaracja składowych i/lub metod
//              // kod klasy
//          }
//
//      Interfejsy mogą również dziedziczyć po wielu interfejsach:
//          modyfikator_dostepu interface Nazwa_interfejsu extends Interfejs1, Interfejs2 // itd...
//          {
//              // deklaracja stałych i/lub metod
//          }

public class Main
{
    public static void main(String[] args)
    {
        // Użycie interfejsu i klas dziedziczących jego składowe.
        Kwadrat kw1 = new Kwadrat();
        Kwadrat kw2 = new Kwadrat();
        Kwadrat kw3 = new Kwadrat(5);
        kw1.setA(3);
        kw2.setA(4);
        System.out.println("Pole kwadratu kw1 o boku " + kw1.getA() + " wynosi " + kw1.Pole());
        System.out.println("Obwód kwadratu kw1 o boku " + kw1.getA() + " wynosi " + kw1.Obwod());
        System.out.println("Pole kwadratu kw2 o boku " + kw2.getA() + " wynosi " + kw2.Pole());
        System.out.println("Obwód kwadratu kw2 o boku " + kw2.getA() + " wynosi " + kw2.Obwod());
        System.out.println("Pole kwadratu kw3 o boku " + kw3.getA() + " wynosi " + kw3.Pole());
        System.out.println("Obwód kwadratu kw3 o boku " + kw3.getA() + " wynosi " + kw3.Obwod());
        System.out.println(kw1.getFullName());

        Prostokat pr1 = new Prostokat();
        Prostokat pr2 = new Prostokat();
        Prostokat pr3 = new Prostokat(5,7);
        pr1.setA(5);
        pr1.setB(2);
        pr2.setA(3);
        pr2.setB(5);
        System.out.println("Pole prostokąta pr1 o bokach " + pr1.getA() + " i " + pr1.getB() + " wynosi " + pr1.Pole());
        System.out.println("Obwód prostokąta pr1 o bokach " + pr1.getA() + " i " + pr1.getB() + " wynosi " + pr1.Obwod());
        System.out.println("Pole prostokąta pr2 o bokach " + pr2.getA() + " i " + pr2.getB() + " wynosi " + pr2.Pole());
        System.out.println("Obwód prostokąta pr2 o bokach " + pr2.getA() + " i " + pr2.getB() + " wynosi " + pr2.Obwod());
        System.out.println("Pole prostokąta pr3 o bokach " + pr3.getA() + " i " + pr3.getB() + " wynosi " + pr3.Pole());
        System.out.println("Obwód prostokąta pr3 o bokach " + pr3.getA() + " i " + pr3.getB() + " wynosi " + pr3.Obwod());
        System.out.println();
    }
}
