package org.biblioteka;

import java.util.Objects;
import java.util.UUID;

abstract class Book {
    private UUID id;
    private String title;
    private String author;
    private int numberOfCopies;

    public Book(String title, String author, int numberOfCopies) {
        this.id = UUID.randomUUID();  // generowanie unikalnego ID
        this.title = title;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title + ", Autor: " + author + ", Dostępność: " + isAvailable();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return id.equals(book.id);  // porównywanie książek na podstawie ich ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
