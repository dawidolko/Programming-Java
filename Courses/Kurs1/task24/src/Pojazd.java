public class Pojazd {
    Pojazd(String marka, int iloscKol)
    {
        this.marka = marka;
        this.iloscKol = iloscKol;
        System.out.println("Konstruktor klasy Pojazd");
    }
    String marka;
    int iloscKol;

    void odpal() //private to zabezpieczenie przed innymi klasami.
    {
        System.out.println("Pojazd odpalil");
    }
}
