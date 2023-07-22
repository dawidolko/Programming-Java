package Figury;

public class Trojkat extends Figura implements IFigury
{
	private double wys=0, podst=0;

	public Trojkat() {}
	public Trojkat(double podst, double wys, String kolor)
	{
		super(kolor);
		this.podst = podst;
		this.wys = wys;
	}

	public double getWys() {
		return wys;
	}
	public void setWys(double wys) {
		this.wys = wys;
	}
	public double getPodst() {
		return podst;
	}
	public void setPodst(double podst) {
		this.podst = podst;
	}

	public String opis(){
		return "Trójkąt ma podstawę " + podst + " i wysokość " + wys;
	}
	public void skaluj(float skala)
	{
		this.podst *= skala;
		this.wys *= skala;
	}
	@Override
	public double getPowierzchnia() {
		return 0.5*podst*wys;
	}
}
