package daneosobowe;

public class Osoba {

    /* ------
     * Fields
     * ----- */
    public String imie;     //
    public String nazwisko; // Pola klasy osoba
    public int wiek;        //

    /* --------------------------
     * Constructors - 3 overloads
     * ------------------------- */
    public Osoba(String imie, String nazwisko, int wiek) // Konstruktor pierwszy
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie_, String nazwisko_) // Konstruktor drugi
    {
        imie = imie_;
        nazwisko = nazwisko_;
    }

    public Osoba() {} // Konstruktor trzeci (PUSTY)

    /* --------
     * Methods
     * ------ */
    public void PokazDane() // Metoda pokazująca dane osoby
    {
        System.out.println("Osoba");
        System.out.println("imie: "+this.imie);
        System.out.println("nazwisko: "+this.nazwisko);
        System.out.println("wiek: "+this.wiek+" lat");
    }
} // end class
