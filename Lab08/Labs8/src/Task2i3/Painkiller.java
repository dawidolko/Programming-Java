package Task2i3;

public class Painkiller extends Product {
    private int dosage;

    public Painkiller(String name, double price, String description, int dosage) {
        super(name, price, description);
        this.dosage = dosage;
    }

    @Override
    public void buy() {
        System.out.println("Buying painkiller: " + getName());
    }

    @Override
    public void showInfo() {
        System.out.println("Painkiller: " + getName() + ", price: " + getPrice() + ", dosage: " + dosage);
    }
}