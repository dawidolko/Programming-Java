package Zwierzeta;

public abstract class Ptak extends Zwierze implements Latanie
{
    private String nazwa;

    public Ptak(String nazwa, String rodzaj)
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
    public String lec() {
        return "To zwierze zaczyna lecieć";
    }
    @Override
    public String wyladuj() {
        return "To zwierze zaczyna lądować";
    }
}
