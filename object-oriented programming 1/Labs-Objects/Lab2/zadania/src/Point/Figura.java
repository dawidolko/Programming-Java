package Point;

public class Figura
{
	public Punkt punkt = new Punkt();
	public String kolor = "biały";

	public Figura() {}
	public Figura(String kolor)
	{
		this.kolor = kolor;
	}
	public Figura(Punkt punkt)
	{
		this.punkt = punkt;
	}
	public Figura(Punkt punkt, String kolor)
	{
		this.punkt = punkt;
		this.kolor = kolor;
	}

	public Punkt getPunkt() {
		return punkt;
	}
	public String getKolor(){
		return kolor;
	}
	public void setPunkt(Punkt punkt){
		this.punkt = punkt;
	}
	public void setKolor(String kolor){
		this.kolor = kolor;
	}

	public void przesun(double x, double y)
	{
		this.punkt.x += x;
		this.punkt.y += y;
	}
	public void opis()
	{
		System.out.printf("Klasa figura. Środek figury: [%f, %f]. Kolor: %s\n", punkt.x, punkt.y, kolor);
	}
}
