package Task2i3;

public class Pen extends Product {
    private String color;

    public Pen(String name, double price, String description, String color) {
        super(name, price, description);
        this.color = color;
    }

    @Override
    public void buy() {
        System.out.println("Buying pen: " + getName());
    }

    @Override
    public void showInfo() {
        System.out.println("Pen: " + getName() + ", price: " + getPrice() + ", color: " + color);
    }
}