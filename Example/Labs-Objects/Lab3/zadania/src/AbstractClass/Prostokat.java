package AbstractClass;

// Przykład klasy potomnej implementującą klasę abstrakcyjną Figura.

public class Prostokat extends Figura
{
    public double a, b;

    public Prostokat()
    {
        this.a = 0;
        this.b = 0;
    }
    public Prostokat(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double Pole()
    {
        return a*b;
    }
    public double Obwod()
    {
        return 2*a + 2*b;
    }
}
