package Transport;

public class Samochod extends SrodekTransportu implements Jedzie
{
    private String marka, model;
    private double pojemnosc, waga;
    private int przebieg, konie;

    public Samochod(String marka, String model, double pojemnosc, double waga, int przebieg, int konie)
    {
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.waga = waga;
        this.przebieg = przebieg;
        this.konie = konie;
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
    public double getPojemnosc() {
        return pojemnosc;
    }
    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
    public double getWaga() {
        return waga;
    }
    public void setWaga(double waga) {
        this.waga = waga;
    }
    public int getPrzebieg() {
        return przebieg;
    }
    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
    public int getKonie() {
        return konie;
    }
    public void setKonie(int konie) {
        this.konie = konie;
    }

    public String opis()
    {
        return "Samochód marki " + getMarka() + ", model " + getModel() + ", o pojemności silnika " + getPojemnosc() +
                " i mocy " + getKonie() + "KM, o wadze " + getWaga() + " i przejechaniu " + getPrzebieg() + "km";
    }
    @Override
    public String jedz() {
        return " rusza z miejsca.";
    }
    @Override
    public String stoj() {
        return " zatrzymuje się.";
    }
    @Override
    String sposobPrzemieszczania() {
        return " jest lądowym środkiem transportu.";
    }
}
