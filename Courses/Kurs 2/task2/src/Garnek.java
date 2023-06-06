public class Garnek { // zawartość to obiekt danej klasy. <--
    int srednica; // dane pola. // final <- to stała tak jakby const. ale musi zostać zainicializowana w konstruktorze
    int wysokosc; // <--
    String kolor; // <--

    public Garnek(){} //Pusty konstruktor

    public Garnek(int srednica, int wysokosc, String kolor) // <-- to jest konstruktor z danymi pola obiektu (srednia, wysokosc, kolor)
    {
        this.kolor = kolor; // Przypisywanie zmiennej z konstruktora do zmiennej z pola obiektu.
        this.wysokosc = wysokosc; // <--
        this.srednica = srednica; // <-- ps. "this" przypisuje nam w danej klasie, zaś "super" w klasie rodzica.
    }

    public String gotuj() //metoda "gotuj"
    {
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol) // metoda sprawdzająca true or false i wypisuje dany napis // NIE MOZE BYC TA SAMA METODA O TYCH SAMYCH TYPACH ARGUMENTÓW O INNYCH MOZE BYC, PONIEWAZ WYSTĄPI PRZECIAZENIE.
    {
        if(czyDodalismySol)
        {
            return "Gotowanie z solą";
        }else
        {
            return "Gotowanie bez soli";
        }
    }

    public int zwrocTempWrzeniaWody()
    {
        return 100;
    }

    public void gotujBezInformacji() // przypisywanie medód do metody ! ! ! WAŻNE!
    {
        wlaczGarnek();
        gotujPrzezPolGodziny();
        wylaczGarnek();
    }

    private void wlaczGarnek()
    {
        System.out.println("wlaczanie garnka");
    }

    private void gotujPrzezPolGodziny()
    {
        System.out.println("Gotuje 30 minut");
    }
    private void wylaczGarnek()
    {
        System.out.println("wylacz garnek");
    }
}
