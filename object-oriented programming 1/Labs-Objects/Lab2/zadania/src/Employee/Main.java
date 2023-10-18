package Employee;

public class Main
{
    public static void main(String[] args)
    {
        Pracownik prac1 = new Pracownik("Wiktor", "Zięba", 3000);
        System.out.println("Imię: " + prac1.getImie());
        System.out.println("Nazwisko: " + prac1.getNazwisko());
        System.out.println("Wypłata: " + prac1.getWyplata() + "\n");

        // Najpierw stwórzmy obiekt klasy Szef korzystając z domyślnego konstruktora
        Szef szef1 = new Szef("Jan","Kowalki",12000,4000);
        // Zobaczmy jak wyglądają odpowiednie pola
        System.out.println("Imię: " + szef1.getImie());
        System.out.println("Nazwisko: " + szef1.getNazwisko());
        System.out.println("Wypłata: " + szef1.getWyplata());
        System.out.println("Premia: " + szef1.getPremia() + "\n");

        // Teraz ustawiamy dane szefa
        szef1.setImie("Tadeusz");
        szef1.setNazwisko("Kowalski");
        szef1.setWyplata(10000);
        szef1.setPremia(2000);
        System.out.println("Imię: " + szef1.getImie());
        System.out.println("Nazwisko: " + szef1.getNazwisko());
        System.out.println("Wypłata: " + szef1.getWyplata());
        System.out.println("Premia: " + szef1.getPremia() + "\n");



        // Rzutowanie (ang. cast) jest to operacja polegająca na zmianie zmiennej referencyjnej jednego typu na
        // zmienną referencyjną innego typu. W Javie wyróżniamy dwa rodzaj rzutowania obiektów:
        //  • rzutowanie w górę (ang. upcasting) – bezpieczne.
        //  • rzutowanie w dół (ang. downcasting) – wymaga testowania (stwierdzenia typu instancji obiektu).
        // Stwierdzeniu jakiego typu jest referencja służy operator instanceof: ref instanceof T
        // Przy tym:
        //  • wyrażenie null instanceof dowolny_typ zawsze ma wartość false.
        //  • wyrażenie x instanceof T, będzie błędne składniowo (wystąpi błąd w kompilacji),
        //    jeśli typ referencji x i typ T nie są związane stosunkiem dziedziczenia.
        //  • wyrażenie x instanceof T będzie miało wartość false, jeśli faktyczny typ referencji x jest nadtypem typu T.

        // Przykład:
        // Rzutowanie w górę
        Szef szef2 = new Szef("Zdzisław","Kiepski",11000,3500);
        Pracownik prac2 = (Szef) szef2; // Rzutowanie w górę: Szef -> Pracownik
        System.out.println("Imię: " + prac2.getImie());
        System.out.println("Nazwisko: " + prac2.getNazwisko());
        System.out.println("Wypłata: " + prac2.getWyplata() + "\n");

        // Rzutowanie w dół
        Pracownik prac3 = (Pracownik) new Szef("Zdzisław","Kępski",11100,3550);
        if(prac3 instanceof Szef) // Sprawdzenie przed rzutowaniem
        {
            Szef szef3 = (Szef) prac3; // Rzutowanie w dół: Pracownik -> Szef
            System.out.println("Imię: " + szef3.getImie());
            System.out.println("Nazwisko: " + szef3.getNazwisko());
            System.out.println("Wypłata: " + szef3.getWyplata());
            System.out.println("Premia: " + szef3.getPremia());
        }



        System.out.println("\n------------------------------");
        prac1.Wypisz();
        szef1.Wypisz();
        szef1.Wypisz2();
    }
}
