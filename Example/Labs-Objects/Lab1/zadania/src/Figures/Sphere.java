package Figures;

public class Sphere
{
    private double r; // Promień
    private String name; // Nazwa

    public Sphere(double r, String name)
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
        return 4*Math.PI*Math.pow(r,2);
    } // Pole powierzchni
    public double volume(double r)
    {
        return (4f/3f)*Math.PI*Math.pow(r,3);
    } // Objętość

    public void print()
    {
        System.out.format("\n\tFigura: Kula;\n\tNazwa: %s;\n\tPromień: %.3f;\n\tPole: %.3f;\n\tObjętość: %.3f;\n", name, r, field(r), volume(r));
    }
}
