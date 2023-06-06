package dodatekZadanie2;

class Rekin extends Zwierze implements IPlywanie, IDrapieznictwo {
    private int predkoscPlywania;
    private int glebokosc;

    public Rekin(String nazwa, String gatunek, float waga, int predkoscPlywania, int glebokosc) throws NegativeValueException {
        super(nazwa, gatunek, waga);
        if (predkoscPlywania < 0) {
            throw new NegativeValueException("Predkosc plywania nie moze byc ujemna.");
        }
        if (glebokosc < 0) {
            throw new NegativeValueException("Glebokosc nie moze byc ujemna.");
        }
        this.predkoscPlywania = predkoscPlywania;
        this.glebokosc = glebokosc;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Jaws music...");
    }

    @Override
    public void Plywaj(int predkoscPlywania, int glebokosc) {
        System.out.println("Rekin pływa z prędkością " + predkoscPlywania + " km/h na głębokości " + glebokosc + " metrów.");
    }

    @Override
    public void Atakuj() {
        System.out.println("Rekin atakuje swoją zdobycz.");
    }
}
