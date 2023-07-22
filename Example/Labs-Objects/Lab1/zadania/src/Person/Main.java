package Person;

public class Main
{
    public static void main(String[] args)
    {
        // Obiekt lub instancja klasy (tworzenie)
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Jan", "Kowalski", 12);
        // Odwołanie się do danej osoby i jej parametrów
        osoba1.info();
        osoba2.info();

        osoba1.setWiek(21);
        osoba1.setImie("Mariusz");
        osoba1.setNazwisko("Wiśniewski");
        osoba1.info();
        System.out.println(osoba1.toString());
    }
}
