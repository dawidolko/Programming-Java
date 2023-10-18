package Point;

public class Prostokat extends Figura
{
	public double wys=0, szer=0;

	public Prostokat() {}
	public Prostokat(double szer)
	{
		this.szer = szer;
	}
	public Prostokat(double szer, String kolor)
	{
		super(kolor);
		this.szer = szer;
	}
	public Prostokat(double szer, String kolor, Punkt punkt)
	{
		super(punkt, kolor);
		this.szer = szer;
	}
	public Prostokat(double wys, double szer)
	{
		this.wys = wys;
		this.szer = szer;
	}
	public Prostokat(double wys, double szer, String kolor)
	{
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}
	public Prostokat(double wys, double szer, String kolor, Punkt punkt)
	{
		super(punkt, kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public double getWys() {
		return wys;
	}
	public double getSzer() {
		return szer;
	}
	public void setWys(double wys) {
		this.wys = wys;
	}
	public void setSzer(double szer) {
		this.szer = szer;
	}

	public double getPowierzchnia() {
        return (szer * wys);
    }
	public void przesun(double x, double y)
	{
		this.punkt.x += x;
		this.punkt.y += y;
	}
	public void opis()
	{
		System.out.printf("Klasa prostokąt. Środek prostokąta: [%f, %f]. Kolor: %s. Wysokość: %f. Szerokość: %f\n", punkt.x, punkt.y, kolor, wys, szer);
	}
}
