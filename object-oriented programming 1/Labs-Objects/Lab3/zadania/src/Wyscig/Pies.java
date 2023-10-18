package Wyscig;

public class Pies extends Zwierze implements Moveable, Speakable
{
    public Pies(String name)
    {
        super(name);
    }

    @Override
    public String getType() {
        return "Pies";
    }
    @Override
    public void start()
    {
        System.out.println("Pies o imieniu " + getName() + " rusza z miejsca");
    }
    @Override
    public void stop()
    {
        System.out.println("Pies o imieniu " + getName() + " zatrzymuje się");
    }
    @Override
    public String getVoice(int voice)
    {
        if (voice == QUIET) return "hau hau";
        else if (voice == LOUD) return "HAU HAU";
        else return null;
    }
}
