package Figury;

public class Prostokat extends Figura implements IFigury
{
	private double wys=0, szer=0;

	public Prostokat() {}
	public Prostokat(double szer, double wys, String kolor)
	{
		super(kolor);
		this.szer = szer;
		this.wys = wys;
	}

	public double getWys() {
		return wys;
	}
	public void setWys(double wys) {
		this.wys = wys;
	}
	public double getSzer() {
		return szer;
	}
	public void setSzer(double szer) {
		this.szer = szer;
	}

	public String opis(){
		return "Prostokat ma szerokość " + szer + " i wysokość " + wys;
	}
	public void skaluj(float skala)
	{
		this.szer *= skala;
		this.wys *= skala;
	}
	@Override
	public double getPowierzchnia() {
		return szer*wys;
	}
}
