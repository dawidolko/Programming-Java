package Zwierzeta;

public abstract class Zwierze implements Podstawa
{
    private String rodzaj;

    public Zwierze(String rodzaj)
    {
        this.rodzaj = rodzaj;
    }

    public String getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Override
    public String jedz() {
        return "To zwierze spożywa posiłek";
    }
    @Override
    public String pij() {
        return "To zwierze pije wodę";
    }
    @Override
    public String wydal() {
        return "To zwierze wydala toksyny z organizmu";
    }
}
