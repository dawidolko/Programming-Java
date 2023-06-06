package dodatekZadanie2;

// Klasa Lew dziedzicząca po Zwierze i implementująca IBieganie, IDrapieznictwo
class Lew extends Zwierze implements IBieganie, IDrapieznictwo {
    private int predkoscBiegania;

    public Lew(String nazwa, String gatunek, float waga, int predkoscBiegania) throws NegativeValueException {
        super(nazwa, gatunek, waga);
        if (predkoscBiegania < 0) {
            throw new NegativeValueException("Predkosc biegania nie moze byc ujemna.");
        }
        this.predkoscBiegania = predkoscBiegania;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Ryczenie lwa!");
    }

    @Override
    public void Biegnij(int predkoscBiegania) {
        System.out.println("Lew biegnie z prędkością " + predkoscBiegania + " km/h.");
    }

    @Override
    public void Atakuj() {
        System.out.println("Lew atakuje swoją zdobycz.");
    }
}