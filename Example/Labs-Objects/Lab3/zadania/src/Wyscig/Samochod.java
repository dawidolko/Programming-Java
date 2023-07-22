package Wyscig;

public class Samochod implements Moveable
{
    public String marka;

    public Samochod(String marka)
    {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public void start()
    {
        System.out.println("Samochód marki " + marka + " rusza z miejsca");
    }
    @Override
    public void stop()
    {
        System.out.println("Samochód marki " + marka + " zatrzymuje się");
    }
}
