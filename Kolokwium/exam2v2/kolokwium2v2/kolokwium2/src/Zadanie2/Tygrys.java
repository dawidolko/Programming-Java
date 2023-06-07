package Zadanie2;

class Tygrys extends Zwierze implements IBieganie, IDrapieznictwo {
    private int predkoscBiegania;

    public Tygrys(String nazwa, String gatunek, int wiek, int predkoscBiegania) throws ValueNegativeException {
        super(nazwa, gatunek, wiek);
        setPredkoscBiegania(predkoscBiegania);
    }

    public void setPredkoscBiegania(int predkoscBiegania) throws ValueNegativeException {
        if (predkoscBiegania >= 0) {
            this.predkoscBiegania = predkoscBiegania;
        } else {
            throw new ValueNegativeException("Predkosc biegania nie może być ujemna.");
        }
    }

    public int getPredkoscBiegania() {
        return predkoscBiegania;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Tygrys wydaje dźwięk: Roooar!");
    }

    @Override
    public void Biegnij(int predkoscBiegania) {
        System.out.println("Tygrys biegnie z prędkością " + predkoscBiegania + " km/h.");
    }

    @Override
    public void Atakuj() {
        System.out.println("Tygrys atakuje swoją zdobycz!");
    }
}