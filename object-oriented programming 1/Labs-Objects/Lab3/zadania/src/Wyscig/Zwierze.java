package Wyscig;

public abstract class Zwierze
{
    private String name = "bez imienia";

    public Zwierze(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() { return "Zwierze nazywa się " + name;}

    public abstract String getType(); // Metoda abstrakcyjna - ogólne nie wiadomo jaki typ jest zwierzęcia
}
