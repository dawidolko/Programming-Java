package zadanie2;

class Orzel extends Zwierze implements ILatanie, IDrapieznictwo {
    private int predkoscLatania;
    private int wysokosc;

    public Orzel(String nazwa, String gatunek, float waga, int predkoscLatania, int wysokosc) throws NegativeValueException {
        super(nazwa, gatunek, waga);
        if (predkoscLatania < 0) {
            throw new NegativeValueException("Predkosc latania nie moze byc ujemna.");
        }
        if (wysokosc < 0) {
            throw new NegativeValueException("Wysokosc nie moze byc ujemna.");
        }
        this.predkoscLatania = predkoscLatania;
        this.wysokosc = wysokosc;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Skrr!");
    }

    @Override
    public void Lataj(int predkoscLatania, int wysokosc) {
        System.out.println("Orzeł lata z prędkością " + predkoscLatania + " km/h na wysokości " + wysokosc + " metrów.");
    }

    @Override
    public void Atakuj() {
        System.out.println("Orzeł atakuje swoją zdobycz.");
    }
}
