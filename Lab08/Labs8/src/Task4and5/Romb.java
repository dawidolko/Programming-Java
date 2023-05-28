package Task4and5;

public class Romb extends FiguraPlaska{

    private double bokA;
    private double kat;

    public Romb(double bokA, double kat){
        if(bokA>0 && kat>0){
            this.bokA = bokA;
            this.kat = kat;
        }
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.bokA = 1;
            this.kat = 1;
        }
    }

    @Override
    public double obliczPole(){
        return 0.5*bokA*bokA*Math.sin(Math.toRadians(kat));
    }

    @Override
    public double obliczObwod(){
        return 4*bokA;
    }

    @Override
    public String toString(){
        return "Romb o boku "+bokA+" i kącie "+kat;
    }
}