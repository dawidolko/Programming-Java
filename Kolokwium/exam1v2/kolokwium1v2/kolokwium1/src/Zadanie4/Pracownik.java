package Zadanie4;

public class Pracownik extends Osoba {
    private String zawod;
    private int stazPracy;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, String zawod) {
        super(imie, nazwisko);
        this.zawod = zawod;
    }

    public Pracownik(String imie, String nazwisko, int wiek, String krajPochodzenia, String zawod, int stazPracy) {
        super(imie, nazwisko, wiek, krajPochodzenia);
        this.zawod = zawod;
        setStazPracy(stazPracy);
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public void setStazPracy(int stazPracy) {
        if (stazPracy >= 0) {
            this.stazPracy = stazPracy;
        } else {
            System.out.println("Błędny staż pracy. Ustawiono staż domyślny.");
            this.stazPracy = 0;
        }
    }

    public String getZawod() {
        return zawod;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    @Override
    public void WyswietlDaneOsoby() {
        super.WyswietlDaneOsoby();
        System.out.println("Zawód: " + zawod);
        System.out.println("Staż pracy: " + stazPracy + " lat");
    }
}