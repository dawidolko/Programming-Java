package Task4and5;

public class Kolo extends FiguraPlaska{

    private double promien;

    public Kolo(double promien){
        if(promien>0)
            this.promien = promien;
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.promien = 1;
        }
    }

    @Override
    public double obliczPole(){
        return Math.PI*Math.pow(promien,2);
    }

    @Override
    public double obliczObwod(){
        return 2*Math.PI*promien;
    }

    @Override
    public String toString(){
        return "Koło o promieniu "+promien;
    }
}