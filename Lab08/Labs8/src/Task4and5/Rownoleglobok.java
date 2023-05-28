package Task4and5;

public class Rownoleglobok extends FiguraPlaska{

    private double bokA;
    private double bokB;
    private double wysokosc;

    public Rownoleglobok(double bokA, double bokB, double wysokosc){
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
        return bokA*wysokosc;
    }

    @Override
    public double obliczObwod(){
        return 2*(bokA+bokB);
    }

    @Override
    public String toString(){
        return "Równoległobok o bokach "+bokA+", "+bokB+" i wysokości "+wysokosc;
    }
}