package Transport;

public class Rower extends SrodekTransportu implements Jedzie
{
    private String marka, model;
    private double waga;

    public Rower(String marka, String model, double waga)
    {
        this.marka = marka;
        this.model = model;
        this.waga = waga;
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
    public double getWaga() {
        return waga;
    }
    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String opis()
    {
        return "Rower marki " + getMarka() + ", model " + getModel() + ", i wadze " + getWaga();
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
