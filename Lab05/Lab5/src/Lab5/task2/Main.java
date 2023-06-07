package Lab5.task2;

public class Main {
    public static void main(String[] args) {
        //Przykładowe obiekty:
        BookPosition book1 = new BookPosition("The Catcher in the Rye", "J.D. Salinger", 277, 1951, 9.99);
        BookPosition book2 = new BookPosition("The Great Gatsby", "F. Scott Fitzgerald", 180, 1925, 8.99);

        //Dostęp do pól:
        System.out.println("Tytuł książki 1: " + book1.getTitle());
        System.out.println("Autor książki 2: " + book2.getAuthor());
        System.out.println("Liczba stron książki 1: " + book1.getPages());
        System.out.println("Rok wydania książki 2: " + book2.getYear());
        System.out.println("Cena książki 2: " + book2.getPrice());
    }
}
