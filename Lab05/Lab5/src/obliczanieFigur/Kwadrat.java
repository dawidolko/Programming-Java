package obliczanieFigur;

public class Kwadrat {

    private double bok;
    private double pole;
    private double obwod;

    public Kwadrat(double bok) {
        this.bok = bok;
        this.pole = Math.pow(bok, 2);
        this.obwod = 4 * bok;
    }

    public void wyswietlDane() {
        System.out.println("Figura: Kwadrat");
        System.out.println("Długość boku: " + bok);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
    }
}