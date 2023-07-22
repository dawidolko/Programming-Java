package Point;

public class Punkt
{
    public double x, y;

    public Punkt()
    {
        x = 0;
        y = 0;
    }
    public Punkt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void zeruj()
    {
        this.x = 0;
        this.y = 0;
    }
    public void opis()
    {
        System.out.printf("Wartość współrzędnych: [%f, %f]\n", x, y);
    }
    public void przesun(double x, double y)
    {
        this.x += x;
        this.y += y;
    }
}
