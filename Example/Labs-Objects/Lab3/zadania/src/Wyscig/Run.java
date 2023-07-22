package Wyscig;

public class Run
{
    public void Runs()
    {
        Rower rower = new Rower();
        Samochod samochod1 = new Samochod("Opel");
        Samochod samochod2 = new Samochod("Honda");
        Samochod samochod3 = new Samochod("Toyota");
        Pies pies = new Pies("Pimpuś");

        rower.start();
        samochod1.start();
        samochod2.start();
        samochod3.start();
        pies.start();
        System.out.println();
        rower.stop();
        samochod1.stop();
        samochod2.stop();
        samochod3.stop();
        pies.stop();
    }
}
