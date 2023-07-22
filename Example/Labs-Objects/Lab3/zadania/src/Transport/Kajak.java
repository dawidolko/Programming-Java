package Transport;

public class Kajak extends SrodekTransportu implements Plywa
{
    private String nazwa;
    private int liczbaMiejsc;

    public Kajak(String nazwa, int liczbaMiejsc)
    {
        this.nazwa = nazwa;
        this.liczbaMiejsc = liczbaMiejsc;
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

    public String opis()
    {
        return "Kajak o nazwie " + getNazwa() + ", który ma " + getLiczbaMiejsc() + " liczby miejsc";
    }
    @Override
    public String plyn() {
        return " zaczyna płynąć.";
    }
    @Override
    public String stoj() {
        return " dopływa do brzegu.";
    }
    @Override
    String sposobPrzemieszczania() {
        return " jest pływającym środkiem transportu.";
    }
}
