package Lab5.task2;

public class BookPosition {
    //pola klasy
    private final String title;
    private final String author;
    private final int pages;
    private final int year;
    private double price;

    //konstruktor
    public BookPosition(String title, String author, int pages, int year, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    //metody dostępowe
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}