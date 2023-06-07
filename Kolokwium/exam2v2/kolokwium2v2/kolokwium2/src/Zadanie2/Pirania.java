package Zadanie2;

class Pirania extends Zwierze implements IPlywanie, IDrapieznictwo {
    private int predkoscPlywania;
    private int glebokosc;

    public Pirania(String nazwa, String gatunek, int wiek, int predkoscPlywania, int glebokosc) throws ValueNegativeException {
        super(nazwa, gatunek, wiek);
        setPredkoscPlywania(predkoscPlywania);
        setGlebokosc(glebokosc);
    }

    public void setPredkoscPlywania(int predkoscPlywania) throws ValueNegativeException {
        if (predkoscPlywania >= 0) {
            this.predkoscPlywania = predkoscPlywania;
        } else {
            throw new ValueNegativeException("Predkosc pływania nie może być ujemna.");
        }
    }

    public void setGlebokosc(int glebokosc) throws ValueNegativeException {
        if (glebokosc >= 0) {
            this.glebokosc = glebokosc;
        } else {
            throw new ValueNegativeException("Głębokość nie może być ujemna.");
        }
    }

    public int getPredkoscPlywania() {
        return predkoscPlywania;
    }

    public int getGlebokosc() {
        return glebokosc;
    }

    @Override
    public void WydajGlos() {
        System.out.println("Pirania wydaje dźwięk: Chomp chomp!");
    }

    @Override
    public void Plywaj(int predkoscPlywania, int glebokosc) {
        System.out.println("Pirania płynie z prędkością " + predkoscPlywania + " km/h na głębokości " + glebokosc + " metrów.");
    }

    @Override
    public void Atakuj() {
        System.out.println("Pirania atakuje swoją zdobycz!");
    }
}