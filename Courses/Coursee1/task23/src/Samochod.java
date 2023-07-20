public class Samochod extends Pojazd { //extends to po ang. rozszeż dzidziczenie z tylko max. jeden klasy. comparable to interfejs.
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
