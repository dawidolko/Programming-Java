package pl.jaknauczycsieprogramowania;

public class Book {
    String title;
    String author;
    int rating;

    public Book(String title, String author, int rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
