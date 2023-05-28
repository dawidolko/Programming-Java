package Task4and5;

public class Prostopadloscian extends FiguraPrzestrzenna{

    private double a;
    private double b;
    private double h;

    public Prostopadloscian(double a, double b, double h){
        if(a>0 && b>0 && h>0){
            this.a = a;
            this.b = b;
            this.h = h;
        }
    }

    public double obliczPole(){
        return 2*(a*b + a*h + b*h);
    }

    public double obliczObjetosc(){
        return a*b*h;
    }

    public String toString(){
        return super.toString() + " Prostopadłościanu. ";
    }
}