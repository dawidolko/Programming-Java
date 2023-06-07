package obliczanieFigur;

public class Prostopadloscian {

    private double bok1;
    private double bok2;
    private double bok3;
    private double pole;
    private double obwod;
    private double objetosc;

    public Prostopadloscian(double bok1, double bok2, double bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.pole = 2 * (bok1 * bok2 + bok1 * bok3 + bok2 * bok3);
        this.obwod = 4 * (bok1 + bok2 + bok3);
        this.objetosc = bok1 * bok2 * bok3;
    }

    public void wyswietlDane() {
        System.out.println("Figura: Prostopadłościan");
        System.out.println("Długości boków: " + bok1 + ", " + bok2 + ", " + bok3);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
        System.out.println("Objętość: " + objetosc);
    }
}