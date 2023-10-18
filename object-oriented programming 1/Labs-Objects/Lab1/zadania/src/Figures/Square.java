package Figures;

public class Square
{
    private double a; // Bok
    private String name; // Nazwa

    public Square(double a, String name)
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
        return Math.pow(a,2);
    } // Pole powierzchni
    public double circuit(double a)
    {
        return 4*a;
    } // Obwód

    public void print()
    {
        System.out.format("\n\tFigura: Kwadrat;\n\tNazwa: %s;\n\tBok: %.3f;\n\tPole: %.3f;\n\tObwód: %.3f;\n", name, a, field(a), circuit(a));
    }
}
