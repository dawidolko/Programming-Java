package Figury;

// Deklaracja klasy abstrakcyjnej

public abstract class Figura
{
	// Pola metody
	private Punkt punkt = new Punkt();
	private String kolor = "bialy";

	public Figura() {}
	public Figura(String kolor)
	{
		this.kolor = kolor;
	}
	public Figura(Punkt punkt, String kolor)
	{
		this.punkt = punkt;
		this.kolor = kolor;
	}

	public Punkt getPunkt() {
		return punkt;
	}
	public void setPunkt(Punkt punkt) {
		this.punkt = punkt;
	}
	public String getKolor() {
		return kolor;
	}
	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	// Pola metody abstrakcyjne
	abstract String opis();
	abstract void skaluj(float skala);
}
