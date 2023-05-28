package Task4and5;

public class Szescian extends FiguraPrzestrzenna{

    private double bokA;

    public Szescian(double bokA){
        if(bokA>0)
            this.bokA = bokA;
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.bokA = 1;
        }
    }

    @Override
    public double obliczPole(){
        return 6*Math.pow(bokA,2);
    }

    @Override
    public double obliczObjetosc(){
        return Math.pow(bokA,3);
    }

    @Override
    public String toString(){
        return "Sześcian o boku "+bokA;
    }
}