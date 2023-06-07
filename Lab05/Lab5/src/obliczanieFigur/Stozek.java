package obliczanieFigur;

public class Stozek {

    private double promien;
    private double wysokosc;
    private double pole;
    private double objetosc;

    public Stozek(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
        this.pole = Math.PI * promien * (promien + Math.sqrt(Math.pow(wysokosc, 2) + Math.pow(promien, 2)));
        this.objetosc = (Math.PI * Math.pow(promien, 2) * wysokosc) / 3;
    }

    public void wyswietlDane() {
        System.out.println("Figura: Stożek");
        System.out.println("Promień: " + promien);
        System.out.println("Wysokosc: " + wysokosc);
        System.out.println("Pole: " + pole);
        System.out.println("Objętość: " + objetosc);
    }
}