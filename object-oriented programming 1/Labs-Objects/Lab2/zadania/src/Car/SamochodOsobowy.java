package Car;

public class SamochodOsobowy extends Samochod
{
    private double waga, pojemnoscSilnika;
    private int iloscOsob;

    public SamochodOsobowy()
    {
        this.waga = 0;
        this.pojemnoscSilnika = 0;
        this.iloscOsob = 0;
    }
    public SamochodOsobowy(double waga, double pojemnoscSilnika, int iloscOsob)
    {
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }
    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg)
    {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
    }
    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob)
    {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public double getWaga() {
        return waga;
    }
    public void setWaga(double waga) {
        this.waga = waga;
    }
    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
    public double getIloscOsob() {
        return iloscOsob;
    }
    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public void opis()
    {
        System.out.printf("Opis samochodu\t\tMarka: %s\t\tModel: %s\t\tNadwozie: %s\t\tKolor: %s\t\tRok produkcji: %d\t\t" +
                "Przebieg: %d\t\tWaga: %f\t\tPojemność silnika: %f\t\tIlość osób: %d\n", getMarka(), getModel(),
                getNadwozie(), getKolor(), getRokProdukcji(), getPrzebieg(), waga, pojemnoscSilnika, iloscOsob);
    }
}
