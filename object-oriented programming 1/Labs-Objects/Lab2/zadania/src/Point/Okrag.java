package Point;

public class Okrag extends Figura
{
    public Punkt srodek = new Punkt();
    public double r = 0;

    public Okrag() {}
    public Okrag(Punkt srodek, double r)
    {
        super(srodek);
        this.r = r;
    }
    public Okrag(double r, String kolor)
    {
        super(kolor);
        this.r = r;
    }
    public Okrag(Punkt srodek, double r, String kolor)
    {
        super(srodek, kolor);
        this.r = r;
    }

    public Punkt getSrodek() {
        return srodek;
    }
    public double getR() {
        return r;
    }
    public void setSrodek(Punkt srodek) {
        this.srodek = srodek;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getPowierzchnia() {
        return (Math.PI * Math.pow(r,2));
    }
    public double getSrednica() {
        return 2*r;
    }
    public boolean wSrodku(Punkt punkt)
    {
        return (Math.pow(punkt.getX() - srodek.getX(), 2) + Math.pow(punkt.getY() - srodek.getY(), 2) <= Math.pow(r,2));
    }
    public void przesun(double x, double y)
    {
        this.punkt.x += x;
        this.punkt.y += y;
    }
    public void opis()
    {
        System.out.printf("Klasa okrąg. Środek okręgu: [%f, %f]. Kolor: %s. Promień: %f\n", punkt.x, punkt.y, kolor, r);
    }
}
