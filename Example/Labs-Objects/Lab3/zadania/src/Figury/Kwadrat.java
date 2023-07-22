package Figury;

public class Kwadrat extends Prostokat implements IFigury
{
	public Kwadrat() {}
	public Kwadrat(double bok, String kolor)
	{
		super(bok, bok, kolor);
	}

	public String opis(){
		return "Kwadrat ma bok " + getSzer();
	}
	public void skaluj(float skala)
	{
		double x = getSzer();
		x *= skala;
		setSzer(x);
	}
	@Override
	public double getPowierzchnia() {
		return getSzer()*getSzer();
	}
}
