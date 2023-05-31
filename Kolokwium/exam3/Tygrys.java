
public class Tygrys extends Zwierze implements Ibieganie, Ipolowanie {
    public Tygrys(String nazwa, double waga, int wiek) {
        super(nazwa, waga, wiek);
    }

    @Override
    public void je() {
        System.out.println("Tygrys je mięso.");
    }

    @Override
    public void oddycha() {
        System.out.println("Tygrys oddycha płucami.");
    }

    @Override
    public void biegnij() {
        System.out.println("Tygrys biegnie.");
    }

    @Override
    public void poluj() {
        System.out.println("Tygrys poluje na zwierzęta.");
    }
}