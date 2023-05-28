package Task4and5;

public class Kwadrat extends FiguraPlaska{

    private double bokA;

    public Kwadrat(double bokA){
        if(bokA>0)
            this.bokA = bokA;
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.bokA = 1;
        }
    }

    @Override
    public double obliczPole(){
        return Math.pow(bokA,2);
    }

    @Override
    public double obliczObwod(){
        return 4*bokA;
    }

    @Override
    public String toString(){
        return "Kwadrat o boku "+bokA;
    }
}