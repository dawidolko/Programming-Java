package Figures;

public class Cube
{
    private double a; // Bok
    private String name; // Nazwa

    public Cube(double a, String name)
    {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }
    public String getName() {
        return name;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double field(double a)
    {
        return Math.pow(a,2)*6;
    } // Pole powierzchni
    public double volume(double a)
    {
        return Math.pow(a,3);
    } // Objętość
    public void print()
    {
        System.out.format("\n\tFigura: Sześcian;\n\tNazwa: %s;\n\tKrawędź: %.3f;\n\tPole: %.3f;\n\tObjętość: %.3f;\n", name, a, field(a), volume(a));
    }
}
