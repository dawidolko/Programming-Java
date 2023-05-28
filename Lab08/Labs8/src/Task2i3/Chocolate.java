package Task2i3;

public class Chocolate extends Product {
    private String type;

    public Chocolate(String name, double price, String description, String type) {
        super(name, price, description);
        this.type = type;
    }

    @Override
    public void buy() {
        System.out.println("Buying chocolate: " + getName());
    }

    @Override
    public void showInfo() {
        System.out.println("Chocolate: " + getName() + ", price: " + getPrice() + ", description: " + getDescription() + ", type: " + type);
    }
}