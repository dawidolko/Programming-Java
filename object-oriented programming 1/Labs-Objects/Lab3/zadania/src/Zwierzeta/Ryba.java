package Zwierzeta;

public abstract class Ryba extends Zwierze implements Plywanie
{
    private String nazwa;

    public Ryba(String nazwa, String rodzaj)
    {
        super(rodzaj);
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String plyn() {
        return "To zwierze zaczyna płynąć";
    }
    @Override
    public String spowalniaj() {
        return "To zwierze zaczyna zatrzymywać się";
    }
    @Override
    public String wynurz() {
        return "To zwierze zaczyna wynurzać się";
    }
    @Override
    public String zanurz() {
        return "To zwierze zaczyna zanurzać się";
    }
}
