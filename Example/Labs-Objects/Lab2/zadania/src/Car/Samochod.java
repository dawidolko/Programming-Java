package Car;

public class Samochod
{
    private String marka, model, nadwozie, kolor;
    private int rokProdukcji, przebieg;

    public Samochod()
    {
        this.marka = "N/A   ";
        this.model = "N/A   ";
        this.nadwozie = "N/A   ";
        this.kolor = "N/A   ";
        this.rokProdukcji = 0;
        this.przebieg = 0;
    }
    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg)
    {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getNadwozie() {
        return nadwozie;
    }
    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }
    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public int getRokProdukcji() {
        return rokProdukcji;
    }
    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
    public int getPrzebieg() {
        return przebieg;
    }
    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void opis()
    {
        System.out.printf("Opis samochodu\t\tMarka: %s\t\tModel: %s\t\tNadwozie: %s\t\tKolor: %s\t\tRok produkcji: %d\t\t" +
                "Przebieg: %d\n", marka, model, nadwozie, kolor, rokProdukcji, przebieg);
    }
}
