package Zwierzeta;

public class Wieloryb extends Ryba
{
    private String gatunek;

    public Wieloryb(String nazwa, String rodzaj, String gatunek)
    {
        super(nazwa, rodzaj);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String opis()
    {
        return "Jest to zwierze rodzaju " + getRodzaj() + ", gatunku " + getGatunek() + " o imieniu " + getNazwa();
    }
}
