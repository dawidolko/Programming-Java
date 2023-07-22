package Figures;

public class Circle
{
    private double r; // Promień
    private String name; // Nazwa

    public Circle(double r, String name)
    {
        this.r = r;
        this.name = name;
    }

    public double getR() {
        return r;
    }
    public String getName() {
        return name;
    }
    public void setR(double r) {
        this.r = r;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double field(double r)
    {
        return Math.PI*Math.pow(r,2);
    } // Pole powierzchni
    public double circuit(double r)
    {
        return 2*Math.PI*r;
    } // Obwód

    public void print()
    {
        System.out.format("\n\tFigura: Koło;\n\tNazwa: %s;\n\tPromień: %.3f;\n\tPole: %.3f;\n\tObwód: %.3f;\n", name, r, field(r), circuit(r));
    }
}
