package Task2i3;

public class Book extends Product {
    private String author;
    private int numPages;

    public Book(String name, double price, String description, String author, int numPages) {
        super(name, price, description);
        this.author = author;
        this.numPages = numPages;
    }

    @Override
    public void buy() {
        System.out.println("Buying book: " + getName());
    }

    @Override
    public void showInfo() {
        System.out.println("Book: " + getName() + " by " + author + " - " + numPages + " pages");
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
    }
}