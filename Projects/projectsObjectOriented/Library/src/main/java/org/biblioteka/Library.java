package org.biblioteka;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

//zgodnie ze standardami nazewnictwa nazwy klas, interfejsów oraz zmiennych są w języku angielskim, zaś komunikaty i opcje menu dla lepszego odbioru są w języku polskim
class Library extends BookDatabase {
    private BookDatabase bookDatabase; //zapewniona hermetyzacja
    private ReaderDatabase readerDatabase;
    private List<BorrowInfo> borrows;
    private Scanner in;

    public Library(BookDatabase bookDatabase, ReaderDatabase readerDatabase) {
        this.bookDatabase = new BookDatabase();
        this.readerDatabase = new ReaderDatabase();
        this.borrows = new ArrayList<>();
        this.in = new Scanner(System.in);
        try {
            this.bookDatabase.loadFromDatabase("src/main/java/org/biblioteka/books.txt");
            this.loadBorrowInfo("src/main/java/org/biblioteka/borrows.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startLibrary() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n#################### MENU ####################\n" +
                    "Wybierz co chcesz zrobić podając numer funkcji\n\n" +
                    "1. Dodaj książkę do bazy\n" +
                    "2. Wypożycz książkę\n" +
                    "3. Zwróć książkę\n" +
                    "4. Wyszukaj książkę\n" +
                    "5. Dodaj czytelnika\n" +
                    "6. Usuń czytelnika\n" +
                    "7. Importuj bazę książek z pliku CSV\n" +
                    "8. Eksportuj książki do bazy w pliku CSV\n" +
                    "9. Importuj bazę czytelników z pliku CSV\n" +
                    "10. Eksportuj czytelników do bazy w pliku CSV\n" +
                    "11. Wyjście z programu");

            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    addBook();
                    saveState();
                    break;
                case "2":
                    borrowBook();
                    saveState();
                    break;
                case "3":
                    returnBookUser();
                    saveState();
                    break;
                case "4":
                    searchBook();
                    break;
                case "5":
                    addReader();
                    saveState();
                    break;
                case "6":
                    removeReader();
                    saveState();
                    break;
                case "7":
                    importBooksFromCSV();
                    saveState();
                    break;
                case "8":
                    exportBooksToCSV();
                    break;
                case "9":
                    importReadersFromCSV();
                    saveState();
                    break;
                case "10":
                    exportReadersToCSV();
                    break;
                case "11":
                    exit = true;
                    break;
                default:
                    System.out.println("Niepoprawny wybór opcji. Spróbuj ponownie");
                    break;
            }
        }
    }


    public void importBooksFromCSV() {
        System.out.println("Podaj ścieżkę pliku CSV:");
        String filePath = in.nextLine();
        File file = new File(filePath);
        if (file.exists() && !file.isDirectory()) {
            bookDatabase.importFromCSV(filePath);
        } else {
            System.out.println("Nie znaleziono pliku. Sprawdź poprawność podanej ścieżki i spróbuj ponownie");
        }
    }

    public void exportBooksToCSV() {
        System.out.println("Podaj ścieżkę pliku CSV:");
        String filePath = in.nextLine();
        System.out.println("Jeśli podany plik istnieje zostanie on zaktualizowany");
        bookDatabase.exportToCSV(filePath);
    }

    public void importReadersFromCSV() {
        System.out.println("Podaj ścieżkę pliku CSV:");
        String filePath = in.nextLine();
        File file = new File(filePath);
        if (file.exists() && !file.isDirectory()) {
            readerDatabase.importFromCSV(filePath);
        } else {
            System.out.println("Nie znaleziono pliku. Sprawdź poprawność podanej ścieżki i spróbuj ponownie");
        }
    }

    public void exportReadersToCSV() {
        System.out.println("Podaj ścieżkę pliku CSV:");
        String filePath = in.nextLine();
        System.out.println("Jeśli podany plik istnieje zostanie on zaktualizowany");
        readerDatabase.exportToCSV(filePath);
    }

    private void borrowBook() {
        System.out.println("Podaj ID czytelnika:");
        String readerId = in.nextLine();
        System.out.println("Podaj tytuł książki:");
        String title = in.nextLine();
        System.out.println("Podaj autora książki:");
        String author = in.nextLine();
        bookDatabase.borrowBook(title, author, readerId);
    }


    private void addBook() {
        System.out.println("Podaj tytuł książki:");
        String title = in.nextLine();
        System.out.println("Podaj autora książki:");
        String author = in.nextLine();
        System.out.println("Podaj liczbę ezgemplarzy:");
        int copies = in.nextInt();
        in.nextLine();
        bookDatabase.addBook(new RegularBook(title, author, copies));
    }


    private void returnBookUser() {
        System.out.println("Podaj ID czytelnika:");
        String readerId = in.nextLine();
        System.out.println("Podaj tytuł książki:");
        String title = in.nextLine();
        System.out.println("Podaj autora książki:");
        String author = in.nextLine();
        BookDatabase.returnBook(title, author, readerId);
    }

    private void searchBook() {
        System.out.println("Podaj tytuł książki:");
        String title = in.nextLine();
        System.out.println("Podaj autora książki:");
        String author = in.nextLine();
        Book book = bookDatabase.findBookByTitleAndAuthor(title, author);
        if (book != null) {
            System.out.println("Znaleziona książka: " + book);
        } else {
            System.out.println("Nieznaleziono książki");
        }
    }

    private void addReader() {
        System.out.println("Podaj imię i nazwisko czytelnika:");
        String name = in.nextLine();
        System.out.println("Podaj PESEL czytelnika:");
        String pesel = in.nextLine();
        try {
            readerDatabase.addReader(new Reader(name, pesel));
        } catch (IllegalArgumentException e) {
            System.out.println("Nieprawidłowy nr PESEL. Spróbuj ponownie");
        }
    }


    private void removeReader() {
        System.out.println("Podaj imię i nazwisko czytelnika:");
        String name = in.nextLine();
        System.out.println("Podaj PESEL czytelnika:");
        String pesel = in.nextLine();
        try {
            readerDatabase.removeReader(new Reader(name, pesel));
        } catch (NoSuchElementException e) {
            System.out.println("Nieznaleziono podanego czytelnika w bazie danych");
        }
    }


    private void loadBorrowInfo(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                borrows.add(BorrowInfo.fromString(line, bookDatabase));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void saveState() {
        try {
            this.bookDatabase.saveToDatabase("src/main/java/org/biblioteka/books.txt");
            this.readerDatabase.saveToDatabase("src/main/java/org/biblioteka/readers.txt");
            saveBorrowInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabase();
        ReaderDatabase readerDatabase = new ReaderDatabase();
        Library library = new Library(bookDatabase, readerDatabase);
        library.startLibrary();
    }
}

