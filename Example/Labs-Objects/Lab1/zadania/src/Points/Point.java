package Points;

public class Point
{
    public double x;
    public double y;

    public Point()
    {
        x = 0.0;
        y = 0.0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public void zeruj() { x = 0.0; y = 0.0; }
    public void opis() { System.out.format("Współrzędne: [%f, %f]\n", x, y); }
    public void przesun(double x, double y)
    {
        this.x += x;
        this.y += y;
    }
}
