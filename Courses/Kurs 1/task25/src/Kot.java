public class Kot extends Animal{
    @Override
    public void dajGlos() {
        System.out.println("mial mial");
    }

    @Override //nadpisanie
    public String toString() {
        return "Jestem kotem";
    }

    public void idz()
    {
        System.out.println("ide sobie");
    }
}
