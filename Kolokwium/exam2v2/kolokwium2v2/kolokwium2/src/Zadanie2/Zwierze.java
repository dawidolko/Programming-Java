package Zadanie2;

public abstract class Zwierze {
    private String nazwa;
    private String gatunek;
    private int wiek;

    public Zwierze() {
    }

    public Zwierze(String nazwa, String gatunek) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
    }

    public Zwierze(String nazwa, String gatunek, int wiek) throws ValueNegativeException {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        setWiek(wiek);
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setWiek(int wiek) throws ValueNegativeException {
        if (wiek >= 0) {
            this.wiek = wiek;
        } else {
            throw new ValueNegativeException("Wiek nie może być ujemny.");
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getGatunek() {
        return gatunek;
    }

    public int getWiek() {
        return wiek;
    }

    public abstract void WydajGlos();

    public void PokazInformacje() {
        System.out.println("Dane zwierzęcia:");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Wiek: " + wiek);
        WydajGlos();
    }
}