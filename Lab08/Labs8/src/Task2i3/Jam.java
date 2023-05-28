package Task2i3;

public class Jam extends Product {
    private String flavor;

    public Jam(String name, double price, String description, String flavor) {
        super(name, price, description);
        this.flavor = flavor;
    }

    @Override
    public void buy() {
        System.out.println("Buying jam: " + getName());
    }

    @Override
    public void showInfo() {
        System.out.println("Jam: " + getName() + " - " + flavor + " flavor");
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
    }
}
