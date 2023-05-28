package Task4and5;

public class Trojkat extends FiguraPlaska{

    private double bokA;
    private double bokB;
    private double bokC;

    public Trojkat(double bokA, double bokB, double bokC){
        if(bokA>0 && bokB>0 && bokC>0){
            this.bokA = bokA;
            this.bokB = bokB;
            this.bokC = bokC;
        }
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.bokA = 1;
            this.bokB = 1;
            this.bokC = 1;
        }
    }

    @Override
    public double obliczPole(){
        double polowaObwodu = obliczObwod()/2;
        return Math.sqrt(polowaObwodu*(polowaObwodu-bokA)*(polowaObwodu-bokB)*(polowaObwodu-bokC));
    }

    @Override
    public double obliczObwod(){
        return bokA+bokB+bokC;
    }

    @Override
    public String toString(){
        return "Trójkąt o bokach "+bokA+", "+bokB+" i "+bokC;
    }
}