package Transport;

public class Paralotnia extends SrodekTransportu implements Lata
{
    private String nazwa;
    private int liczbaMiejsc;

    public Paralotnia(String nazwa, int liczbaMiejsc)
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
        return "Paralotnia o nazwie " + getNazwa() + ", który ma " + getLiczbaMiejsc() + " liczby miejsc";
    }
    @Override
    public String lec() {
        return " startuje od ziemi.";
    }
    @Override
    public String stoj() {
        return " ląduje.";
    }
    @Override
    String sposobPrzemieszczania() {
        return " jest latającym środkiem transportu.";
    }
}
