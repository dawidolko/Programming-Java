package Task4and5;

public class Kula extends FiguraPrzestrzenna{

    private double r;

    public Kula(double r){
        if(r>0){
            this.r = r;
        }
    }

    public double obliczPole(){
        return 4*3.14*r*r;
    }

    public double obliczObjetosc(){
        return 4/3*3.14*r*r*r;
    }

    public String toString(){
        return super.toString() + " Kuli. ";
    }
}