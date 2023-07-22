package AbstractClass;

// Przykład klasy potomnej implementującą klasę abstrakcyjną Figura.

public class Kwadrat extends Figura
{
    public double a;

    public Kwadrat()
    {
        this.a = 0;
    }
    public Kwadrat(double a)
    {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double Pole()
    {
        return a*a;
    }
    public double Obwod()
    {
        return 4*a;
    }
}
