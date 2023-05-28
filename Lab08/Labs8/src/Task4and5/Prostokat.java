package Task4and5;

public class Prostokat extends FiguraPlaska{

    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB){
        if(bokA>0 && bokB>0){
            this.bokA = bokA;
            this.bokB = bokB;
        }
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.bokA = 1;
            this.bokB = 1;
        }
    }

    @Override
    public double obliczPole(){
        return bokA*bokB;
    }

    @Override
    public double obliczObwod(){
        return 2*(bokA+bokB);
    }

    @Override
    public String toString(){
        return "Prostokąt o bokach "+bokA+" i "+bokB;
    }
}