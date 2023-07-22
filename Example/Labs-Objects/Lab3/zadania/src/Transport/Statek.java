package Transport;

public class Statek extends SrodekTransportu implements Plywa
{
    private String nazwa;
    private int liczbaMiejsc, dlugosc, szerokosc, wysokosc;

    public Statek(String nazwa, int liczbaMiejsc, int dlugosc, int szerokosc, int wysokosc)
    {
        this.nazwa = nazwa;
        this.liczbaMiejsc = liczbaMiejsc;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }
    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }
    public int getDlugosc() {
        return dlugosc;
    }
    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public int getSzerokosc() {
        return szerokosc;
    }
    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }
    public int getWysokosc() {
        return wysokosc;
    }
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public String opis()
    {
        return "Statek o nazwie " + getNazwa() + ", który ma " + getLiczbaMiejsc() + " liczbę miejsc, i o wymiarach " +
                getDlugosc() + "x" + getSzerokosc() + "x" + getWysokosc();
    }
    @Override
    public String plyn() {
        return " zaczyna płynąć.";
    }
    @Override
    public String stoj() {
        return " zacumowuje.";
    }
    @Override
    String sposobPrzemieszczania() {
        return " jest pływającym środkiem transportu.";
    }
}
