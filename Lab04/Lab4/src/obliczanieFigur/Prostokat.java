package obliczanieFigur;

public class Prostokat {

    private double bok1;
    private double bok2;
    private double pole;
    private double obwod;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.pole = bok1 * bok2;
        this.obwod = 2 * bok1 + 2 * bok2;
    }

    public void wyswietlDane() {
        System.out.println("Figura: Prostokąt");
        System.out.println("Długości boków: " + bok1 + ", " + bok2);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
    }
}