package Zadanie2;

class Sokol extends Zwierze implements ILatanie, IDrapieznictwo {
    private int predkoscLatania;
    private int wysokosc;

    public Sokol(String nazwa, String gatunek, int wiek, int predkoscLatania, int wysokosc) throws ValueNegativeException {
        super(nazwa, gatunek, wiek);
        setPredkoscLatania(predkoscLatania);
        setWysokosc(wysokosc);
    }

    public void setPredkoscLatania(int predkoscLatania) throws ValueNegativeException {
        if (predkoscLatania >= 0) {
            this.predkoscLatania = predkoscLatania;
        } else {
            throw new ValueNegativeException("Predkosc latania nie może być ujemna.");
        }
    }

    public void setWysokosc(int wysokosc) throws ValueNegativeException {
        if (wysokosc >= 0) {
            this.wysokosc = wysokosc;
        } else {
            throw new ValueNegativeException("Wysokość nie może być ujemna.");
        }
    }

    public int getPredkoscLatania() {
        return predkoscLatania;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Sokół wydaje dźwięk: Ki-ki-ki!");
    }

    @Override
    public void Lataj(int predkoscLatania, int wysokosc) {
        System.out.println("Sokół leci z prędkością " + predkoscLatania + " km/h na wysokości " + wysokosc + " metrów.");
    }

    @Override
    public void Atakuj() {
        System.out.println("Sokół atakuje swoją zdobycz!");
    }
}