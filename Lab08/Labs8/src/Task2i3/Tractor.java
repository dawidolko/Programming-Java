package Task2i3;

import Task1.Product;

public class Tractor extends Product {
    public Tractor(String name, double price, String description) {
        super(name, price, description);
    }

    public void buy() {
        System.out.println("I bought a black tractor, capacity 2400!");
    }

    public void showInfo() {
        System.out.println("Price: " + getPrice() + ", name: " + getName() + ", description: " + getDescription());
    }
}