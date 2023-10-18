package Figures;

public class Rectangle
{
    private double a; // Bok a
    private double b; // Bok b
    private String name; // Nazwa

    public Rectangle(double a, double b, String name)
    {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
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
    public void setName(String name) {
        this.name = name;
    }
    public double field(double a, double b)
    {
        return a*b;
    } // Pole powierzchni
    public double circuit(double a, double b)
    {
        return 2*a+2*b;
    } // Obwód

    public void print()
    {
        System.out.format("\n\tFigura: Prostokąt;\n\tNazwa: %s;\n\tBok 1: %.3f;\n\tBok 2: %.3f;\n\tPole: %.3f;\n\tObwód: %.3f;\n", name, a, b, field(a,b), circuit(a,b));
    }
}
