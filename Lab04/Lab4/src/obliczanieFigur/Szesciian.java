package obliczanieFigur;

public class Szesciian {

    private double bok;
    private double pole;
    private double obwod;
    private double objetosc;

    public Szesciian(double bok) {
        this.bok = bok;
        this.pole = 6 * Math.pow(bok, 2);
        this.obwod = 12 * bok;
        this.objetosc = Math.pow(bok, 3);
    }

    public void wyswietlDane() {
        System.out.println("Figura: Sześcian");
        System.out.println("Długość boku: " + bok);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
        System.out.println("Objętość: " + objetosc);
    }
}