public class Nosy extends TV{
    @Override
    public void onTV(boolean b) // napisanie metody z klasy abstrakcyjnej
    {
        if(b)
        {
            System.out.println("TV is on");
        }else
        {
            System.out.println("TV is off");
        }
    }

    @Override
    public String toString() {
        return "Metoda toSting klasy Nosy";
    }

    @Override
    public void changeChannel() {
        System.out.println("Zmiana kanału");
    }

}
