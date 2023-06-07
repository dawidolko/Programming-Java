package obliczanieFigur;

public class Kula {

    private double promien;
    private double pole;
    private double objetosc;

    public Kula(double promien) {
        this.promien = promien;
        this.pole = 4 * Math.PI * Math.pow(promien, 2);
        this.objetosc = (4 * Math.PI * Math.pow(promien, 3)) / 3;
    }

    public void wyswietlDane() {
        System.out.println("Figura: Kula");
        System.out.println("Promień: " + promien);
        System.out.println("Pole: " + pole);
        System.out.println("Objętość: " + objetosc);
    }
}