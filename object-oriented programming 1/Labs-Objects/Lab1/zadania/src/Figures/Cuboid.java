package Figures;

public class Cuboid
{
    private double a; // Bok a
    private double b; // Bok b
    private double c; // Bok c
    private String name; // Nazwa

    public Cuboid(double a, double b, double c, String name)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public String getName() {
        return name;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double field(double a, double b, double c)
    {
        return 2*a*b+2*a*c+2*b*c;
    } // Pole powierzchni
    public double volume(double a, double b, double c)
    {
        return a*b*c;
    } // Objętość

    public void print()
    {
        System.out.format("\n\tFigura: Prostopadłościan;\n\tNazwa: %s;\n\tKrawędź 1: %.3f;\n\tKrawędź 2: %.3f;\n\tKrawędź 3: %.3f;\n\tPole: %.3f;\n\tObjętość: %.3f;\n", name, a, b, c, field(a,b,c), volume(a,b,c));
    }
}
