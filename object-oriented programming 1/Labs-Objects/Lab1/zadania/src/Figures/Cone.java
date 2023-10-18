package Figures;

public class Cone
{
    private double r; // Promień
    private double h; // Wysokość
    private double l; // Tworząca
    private String name; // Nazwa

    public Cone(double r, double h, String name)
    {
        this.r = r;
        this.h = h;
        setL(r,h);
        this.name = name;
    }

    public double getR() {
        return r;
    }
    public double getH() {
        return h;
    }
    public String getName() {
        return name;
    }
    public void setR(double r) {
        this.r = r;
    }
    public void setH(double h) {
        this.h = h;
    }
    public void setL(double r, double h) {
        this.l = Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
    }
    public void setName(String name) {
        this.name = name;
    }
    public double field(double r, double l)
    {
        return Math.PI*r*(r+l);
    } // Pole powierzchni
    public double volume(double r, double h)
    {
        return (Math.PI*Math.pow(r,2)*h)/3;
    } // Objętość

    public void print()
    {
        System.out.format("\n\tFigura: Stożek;\n\tNazwa: %s;\n\tPromień: %.3f;\n\tWysokość: %.3f;\n\tTworząca: %.3f;\n\tPole: %.3f;\n\tObjętość: %.3f;\n", name, r, h, l, field(r,l), volume(r,h));
    }
}
