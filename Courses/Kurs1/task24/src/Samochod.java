public class Samochod extends Pojazd { //extends to po ang. rozszeż dzidziczenie z tylko max. jeden klasy. comparable to interfejs.
    Samochod(String marka, int iloscKol)
    {
        super(marka, iloscKol); // klasa super oznacza to co znajduje sie w hierarhi dzidziczenia, a this to to jest w tej klasie w ktorej jest uzywane.
        System.out.println("Konstruktor klasy Samochod");
    }
    boolean otwarty = false;
    void zamknijOtworz()
    {
        otwarty =! !otwarty;
        if(otwarty)
        {
            System.out.println("Otwarto");
        }
        else
        {
            System.out.println("Zamkniety");
        }
    }
}
