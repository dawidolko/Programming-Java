package obliczanieFigur;

public class Kolo {

    private double promien;
    private double pole;
    private double obwod;

    public Kolo(double promien) {
        this.promien = promien;
        this.pole = Math.PI * Math.pow(promien, 2);
        this.obwod = 2 * Math.PI * promien;
    }

    public void wyswietlDane() {
        System.out.println("Figura: Koło");
        System.out.println("Promień: " + promien);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
    }
}
