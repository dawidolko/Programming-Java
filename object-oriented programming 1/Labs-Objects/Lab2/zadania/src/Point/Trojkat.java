package Point;

public class Trojkat extends Figura
{
	public double wys=0, podst=0;

	public Trojkat() {}
	public Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}
	public Trojkat(double wys, double podst, String kolor)
	{
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
	public Trojkat(double wys, double podst, String kolor, Punkt punkt)
	{
		super(punkt, kolor);
		this.wys = wys;
		this.podst = podst;
	}

	public double getWys() {
		return wys;
	}
	public double getPodst() {
		return podst;
	}
	public void setWys(double wys) {
		this.wys = wys;
	}
	public void setPodst(double podst) {
		this.podst = podst;
	}

	public double getPowierzchnia() {
		return (0.5 * wys * podst);
	}
	public void przesun(double x, double y)
	{
		this.punkt.x += x;
		this.punkt.y += y;
	}
	public void opis()
	{
		System.out.printf("Klasa trójkąt. Środek trójkąta: [%f, %f]. Kolor: %s. Wysokość: %f. Podstawa: %f\n", punkt.x, punkt.y, kolor, wys, podst);
	}
}
