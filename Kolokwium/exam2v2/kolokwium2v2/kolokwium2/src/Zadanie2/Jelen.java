package Zadanie2;

class Jelen extends Zwierze implements IBieganie {
    private int predkoscBiegania;

    public Jelen(String nazwa, String gatunek, int wiek, int predkoscBiegania) throws ValueNegativeException {
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
        System.out.println("Jelen wydaje dźwięk: Beee!");
    }

    @Override
    public void Biegnij(int predkoscBiegania) {
        System.out.println("Jelen biegnie z prędkością " + predkoscBiegania + " km/h.");
    }
}