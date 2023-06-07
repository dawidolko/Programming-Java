
package daneosobowe;

public class Osoba {

    /* ------
     * Fields
     * ----- */
    private String imie;     //
    private String nazwisko; // Pola klasy osoba
    private int wiek;        //

    /* --------------------------
     * Constructors - 3 overloads
     * ------------------------- */
    public Osoba(String imie, String nazwisko, int wiek) // Konstruktor pierwszy
    {
        setImie(imie);
        setNazwisko(nazwisko);
        setWiek(wiek);
    }

    public Osoba(String imie_, String nazwisko_) // Konstruktor drugi
    {
        setImie(imie_);
        setNazwisko(nazwisko_);
    }

    public Osoba() {} // Konstruktor trzeci (PUSTY)

    /* --------
     * Methods
     * ------ */
    public void PokazDane() // Metoda pokazująca dane osoby
    {
        System.out.println("Osoba");
        System.out.println("imie: "+getImie());
        System.out.println("nazwisko: "+getNazwisko());
        System.out.println("wiek: "+getWiek()+" lat");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
} // end class