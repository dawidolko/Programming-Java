package Wyscig;

public class Rower implements Moveable
{
    public Rower() {
    }

    @Override
    public void start()
    {
        System.out.println("Rower rusza z miejsca");
    }
    @Override
    public void stop()
    {
        System.out.println("Rower zatrzymuje się");
    }
}
