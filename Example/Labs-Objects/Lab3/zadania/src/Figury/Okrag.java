package Figury;

public class Okrag extends Figura implements IFigury, IOFigury
{
    private double pro=0;

    public Okrag() {}
    public Okrag(double pro, Punkt punkt, String kolor)
    {
        super(punkt, kolor);
        this.pro = pro;
    }

    public double getPro() {
        return pro;
    }
    public void setPro(double pro) {
        this.pro = pro;
    }

    public String opis(){
        return "Okrąg o środku [" + getPunkt().getX() + "," + getPunkt().getY() + "] ma promień " + pro;
    }
    public void skaluj(float skala)
    {
        this.pro *= skala;
    }
    @Override
    public double getPowierzchnia() {
        return Math.PI*Math.pow(pro,2);
    }
    @Override
    public boolean wPolu(Punkt punkt)
    {
        return Math.pow(punkt.getX() - getPunkt().getX(), 2) + Math.pow(punkt.getY() - getPunkt().getY(), 2) <= Math.pow(pro, 2);
    }
    @Override
    public void przesun(double x, double y)
    {
        double a = getPunkt().getX() + x;
        double b = getPunkt().getY() + y;
        getPunkt().setX(a);
        getPunkt().setY(b);
    }
}
