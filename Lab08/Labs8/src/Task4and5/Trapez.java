package Task4and5;

public class Trapez extends FiguraPlaska{

    private double bokA;
    private double bokB;
    private double wysokosc;

    public Trapez(double bokA, double bokB, double wysokosc){
        if(bokA>0 && bokB>0 && wysokosc>0){
            this.bokA = bokA;
            this.bokB = bokB;
            this.wysokosc = wysokosc;
        }
        else{
            System.out.println("Podana wartość jest niedozwolona");
            this.bokA = 1;
            this.bokB = 1;
            this.wysokosc = 1;
        }
    }

    @Override
    public double obliczPole(){
        return 0.5*(bokA+bokB)*wysokosc;
    }

    @Override
    public double obliczObwod(){
        return bokA+bokB+2*Math.sqrt((bokA-bokB)*(bokA-bokB)+wysokosc*wysokosc);
    }

    @Override
    public String toString(){
        return "Trapez o bokach "+bokA+", "+bokB+" i wysokości "+wysokosc;
    }
}