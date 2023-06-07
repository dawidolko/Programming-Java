package Zadanie3;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String krajPochodzenia;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String imie, String nazwisko, int wiek, String krajPochodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        setWiek(wiek);
        this.krajPochodzenia = krajPochodzenia;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        if (wiek >= 0 && wiek <= 120) {
            this.wiek = wiek;
        } else {
            System.out.println("Błędny wiek. Ustawiono wiek domyślny.");
            this.wiek = 0;
        }
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public void WyswietlDaneOsoby() {
        System.out.println("Dane osoby:");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Kraj pochodzenia: " + krajPochodzenia);
    }
}
