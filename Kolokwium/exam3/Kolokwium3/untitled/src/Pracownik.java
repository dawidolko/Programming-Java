public class Pracownik extends Osoba {
    private String zawod;
    private double zarobki;

    public Pracownik(String imie, String nazwisko, int wiek, double wzrost, double waga, String zawod, double zarobki) {
        super(imie, nazwisko, wiek, wzrost, waga);
        this.zawod = zawod;
        this.zarobki = zarobki;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public void wyswietlDane() {
        super.wyswietlDane();
        System.out.println("Zawód: " + zawod);
        System.out.println("Zarobki: " + zarobki);
    }
}