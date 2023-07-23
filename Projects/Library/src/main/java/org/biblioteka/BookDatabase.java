package org.biblioteka;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.UUID;

class BookDatabase implements DatabaseOperations, CSVOperations {
    private static List<Book> books;
    private static List<BorrowInfo> borrowInfoList;
    private static final String BORROWS_FILE_PATH = "src/main/java/org/biblioteka/borrows.txt";

    public BookDatabase() {
        this.books = new ArrayList<>();
        this.borrowInfoList = new ArrayList<>();
        try {
            loadFromDatabase("src/main/java/org/biblioteka/books.txt");
            loadBorrowInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addBook(Book book) throws IllegalArgumentException {
        if (findBookByTitleAndAuthor(book.getTitle(), book.getAuthor()) != null) {
            throw new IllegalArgumentException("Książka jest już w bazie");
        }
        books.add(book);
        try {
            saveToDatabase("src/main/java/org/biblioteka/books.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //szkic metody do usuwania książki z bazy danych
    /*public void removeBook(Book book) throws NoSuchElementException {
        if (!books.remove(book)) {
            throw new NoSuchElementException("Nie ma podanej książki w bazie");
        }
        try {
            saveToDatabase("src/main/java/org/biblioteka/books.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public List<Book> getBooks() {
        return books;
    }

    public static Book findBookByTitleAndAuthor(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public BorrowInfo borrowBook(String title, String author, String readerId) {
        if (title == null || title.isBlank() || author == null || author.isBlank() || readerId == null || readerId.isBlank()) {
            throw new IllegalArgumentException("Nieprawidłowe dane. Żadne z pól nie może pozostać puste");
        }
        Book book = findBookByTitleAndAuthor(title, author);
        UUID readerID = UUID.fromString(readerId);
        if (book != null && book.isAvailable()) {
            book.setNumberOfCopies(book.getNumberOfCopies() - 1);
            BorrowInfo borrowInfo = new BorrowInfo(book, readerID, LocalDate.now());
            borrowInfoList.add(borrowInfo);
            saveBorrowInfo();
            System.out.println("Pomyślnie wypożyczono książkę: " + book);
            return borrowInfo;
        } else {
            System.out.println("Książka nie jest dostępna do wypożyczenia");
            return null;
        }
    }

    public static BorrowInfo returnBook(String title, String author, String readerId) {
        if (title == null || title.isBlank() || author == null || author.isBlank() || readerId == null || readerId.isBlank()) {
            throw new IllegalArgumentException("Nieprawidłowe dane. Żadne z pól nie może pozostać puste.");
        }
        Book book = findBookByTitleAndAuthor(title, author);
        BorrowInfo borrowInfo = findBorrowInfo(title, author, readerId);
        if (book != null && borrowInfo != null) {
            book.setNumberOfCopies(book.getNumberOfCopies() + 1);
            int fine = calculateFine(borrowInfo);
            if (fine > 0) {
                System.out.println("Książka zwrócona z opóźnieniem. Kara za spóźnienie: " + fine + " PLN");
            }
            borrowInfoList.remove(borrowInfo);
            saveBorrowInfo();
            System.out.println("Książka zwrócona pomyślnie: " + book);
            return borrowInfo;
        } else {
            System.out.println("Nieprawidłowy tytuł, ID czytelnika bądź książka nie jest wypożyczona przez tego czytelnika");
            return null;
        }
    }

    public static void saveBorrowInfo() {
        String tempFilePath = "src/main/java/org/biblioteka/borrows_temp.txt";
        File tempFile = new File(tempFilePath);
        File origFile = new File(BORROWS_FILE_PATH);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {
            for (BorrowInfo info : borrowInfoList) {
                writer.write(info.getBook().getTitle() + ","
                        + info.getBook().getAuthor() + ","
                        + info.getReaderId() + ","
                        + info.getBorrowDate() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (origFile.delete()) {
            tempFile.renameTo(origFile);
        } else {
            System.out.println("Nie można usunąć pliku: " + origFile.getName());
        }
    }


    private void loadBorrowInfo() throws IOException {
        borrowInfoList.clear();
        File file = new File(BORROWS_FILE_PATH);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String title = parts[0];
                    String author = parts[1];
                    UUID readerId = UUID.fromString(parts[2]);
                    LocalDate borrowDate = LocalDate.parse(parts[3]);
                    Book book = findBookByTitleAndAuthor(title, author);
                    if (book != null) {
                        borrowInfoList.add(new BorrowInfo(book, readerId, borrowDate));
                    }
                }
            }
        } else {
            System.out.println("Plik " + BORROWS_FILE_PATH + " nie istnieje. Dane nie zostały pobrane");
        }
    }

    private static int calculateFine(BorrowInfo borrowInfo) {
        LocalDate borrowDate = borrowInfo.getBorrowDate();
        LocalDate dueDate = borrowDate.plusDays(14);
        LocalDate returnDate = LocalDate.now();

        if (returnDate.isAfter(dueDate)) {
            long daysDelayed = java.time.temporal.ChronoUnit.DAYS.between(dueDate, returnDate);
            return (int) daysDelayed * 2;
        } else {
            return 0;
        }
    }

    private static BorrowInfo findBorrowInfo(String title, String author, String readerId) {
        for (BorrowInfo borrowInfo : borrowInfoList) {
            if (borrowInfo.getBook().getTitle().equals(title) &&
                    borrowInfo.getBook().getAuthor().equals(author) &&
                    borrowInfo.getReaderId().equals(UUID.fromString(readerId))) {
                return borrowInfo;
            }
        }
        return null;
    }


    @Override
    public void saveToDatabase(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getNumberOfCopies() + "\n");
            }
        }
    }

    @Override
    public void loadFromDatabase(String filePath) throws IOException {
        books.clear();
        File file = new File(filePath);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String title = parts[0];
                    String author = parts[1];
                    int numberOfCopies = Integer.parseInt(parts[2]);
                    books.add(new RegularBook(title, author, numberOfCopies));
                }
            }
        } else {
            System.out.println("Plik " + filePath + " nie istnieje. Dane nie zostały pobrane");
        }
    }


    @Override
    public void importFromCSV(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                String title = line[0];
                String author = line[1];
                int copies = Integer.parseInt(line[2]);
                this.books.add(new RegularBook(title, author, copies));
            }
        } catch (IOException e) {
            System.out.println("Wystąpił problem w odczycie pliku");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Nieprawidłowy format danych w pliku");
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exportToCSV(String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
            for (Book book : books) {
                String[] line = {book.getTitle(), book.getAuthor(), Integer.toString(book.getNumberOfCopies())};
                writer.writeNext(line);
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu pliku");
            e.printStackTrace();
        }
    }
}
