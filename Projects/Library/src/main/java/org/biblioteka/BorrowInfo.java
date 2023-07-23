package org.biblioteka;

import java.time.LocalDate;
import java.util.UUID;

class BorrowInfo {
    private Book book;
    private UUID readerId;
    private LocalDate borrowDate;

    public BorrowInfo(Book book, UUID readerId, LocalDate borrowDate) {
        this.book = book;
        this.readerId = readerId;
        this.borrowDate = borrowDate;
    }

    public Book getBook() {
        return book;
    }

    public UUID getReaderId() {
        return readerId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public static BorrowInfo fromString(String str, BookDatabase bookDatabase) {
        String[] parts = str.split(",");
        Book book = BookDatabase.findBookByTitleAndAuthor(parts[0], parts[1]);
        UUID readerId = UUID.fromString(parts[2]);
        LocalDate borrowDate = LocalDate.parse(parts[3]);
        return new BorrowInfo(book, readerId, borrowDate);
    }

    @Override
    public String toString() {
        return book.getTitle() + ","
                + book.getAuthor() + ","
                + readerId + ","
                + borrowDate;
    }
}

