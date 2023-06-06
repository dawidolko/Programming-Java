package zadanie2;

class Kaczka extends Zwierze implements IPlywanie, ILatanie {
    private int predkoscPlywania;
    private int glebokosc;
    private int predkoscLatania;
    private int wysokosc;

    public Kaczka(String nazwa, String gatunek, float waga, int predkoscPlywania, int glebokosc, int predkoscLatania, int wysokosc) throws NegativeValueException {
        super(nazwa, gatunek, waga);
        if (predkoscPlywania < 0) {
            throw new NegativeValueException("Predkosc plywania nie moze byc ujemna.");
        }
        if (glebokosc < 0) {
            throw new NegativeValueException("Glebokosc nie moze byc ujemna.");
        }
        if (predkoscLatania < 0) {
            throw new NegativeValueException("Predkosc latania nie moze byc ujemna.");
        }
        if (wysokosc < 0) {
            throw new NegativeValueException("Wysokosc nie moze byc ujemna.");
        }
        this.predkoscPlywania = predkoscPlywania;
        this.glebokosc = glebokosc;
        this.predkoscLatania = predkoscLatania;
        this.wysokosc = wysokosc;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Kwa kwa!");
    }

    @Override
    public void Plywaj(int predkoscPlywania, int glebokosc) {
        System.out.println("Kaczka pływa z prędkością " + predkoscPlywania + " km/h na głębokości " + glebokosc + " metrów.");
    }

    @Override
    public void Lataj(int predkoscLatania, int wysokosc) {
        System.out.println("Kaczka lata z prędkością " + predkoscLatania + " km/h na wysokości " + wysokosc + " metrów.");
    }
}
