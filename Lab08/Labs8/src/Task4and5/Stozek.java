package Task4and5;

public class Stozek extends FiguraPrzestrzenna{

    private double r;
    private double l;
    private double h;

    public Stozek(double r, double l, double h){
        if(r>0 && l>0 && h>0){
            this.r = r;
            this.l = l;
            this.h = h;
        }
    }

    public double obliczPole(){
        return 3.14*r*(r+l);
    }

    public double obliczObjetosc(){
        return 1/3*3.14*r*r*h;
    }

    public String toString(){
        return super.toString() + " Stożka. ";
    }
}