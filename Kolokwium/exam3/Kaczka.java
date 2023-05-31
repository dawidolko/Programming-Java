public class Kaczka extends Zwierze implements Ilatanie, Iplywanie {
    public Kaczka(String nazwa, double waga, int wiek) {
        super(nazwa, waga, wiek);
    }

    @Override
    public void je() {
        System.out.println("Kaczka je rośliny i owady.");
    }

    @Override
    public void oddycha() {
        System.out.println("Kaczka oddycha płucami.");
    }

    @Override
    public void lataj() {
        System.out.println("Kaczka lata.");
    }

    @Override
    public void plywaj() {
        System.out.println("Kaczka pływa.");
    }
}