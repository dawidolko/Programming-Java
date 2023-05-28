package Task4and5;

public class Walec extends FiguraPrzestrzenna{

    private double r;
    private double h;

    public Walec(double r, double h){
        if(r>0 && h>0){
            this.r = r;
            this.h = h;
        }
    }

    public double obliczPole(){
        return 3.14*r*(r+h);
    }

    public double obliczObjetosc(){
        return 3.14*r*r*h;
    }

    public String toString(){
        return super.toString() + " Walca. ";
    }
}