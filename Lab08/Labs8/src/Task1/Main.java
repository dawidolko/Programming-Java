package Task1;

public class Main {
    public static void main(String[] args) {
        Product product = new Tractor("John Deere", 50000, "Agricultural tractor");
        product.showInfo();
        product.buy();
    }
}