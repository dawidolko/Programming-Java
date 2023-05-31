public class Orzeł extends Zwierze implements Ilatanie, Ipolowanie {
    public Orzeł(String nazwa, double waga, int wiek) {
        super(nazwa, waga, wiek);
    }

    @Override
    public void je() {
        System.out.println("Orzeł je mięso.");
    }

    @Override
    public void oddycha() {
        System.out.println("Orzeł oddycha płucami.");
    }

    @Override
    public void lataj() {
        System.out.println("Orzeł lata.");
    }

    @Override
    public void poluj() {
        System.out.println("Orzeł poluje na zwierzęta.");
    }
}