package Zadanie3;

//POLECENIE:

//Utwórz klasę generyczną o nazwie Tuple3, implementującą krotkę trzywartościową. Utwórz odpowiedni konstruktor ustawiający pola
//        krotki oraz metody pobierające i ustawiające te pola.

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu Tuple3 i przypisanie wartości
        Tuple3<String, Integer, Double> tuple = new Tuple3<>("Hello", 42, 3.14);

        // Wyświetlanie wartości z krotki
        System.out.println("First: " + tuple.getFirst());
        System.out.println("Second: " + tuple.getSecond());
        System.out.println("Third: " + tuple.getThird());

        // Zmiana wartości w krotce
        tuple.setFirst("World");
        tuple.setSecond(123);
        tuple.setThird(2.71);

        // Wyświetlanie zmienionych wartości
        System.out.println("First (modified): " + tuple.getFirst());
        System.out.println("Second (modified): " + tuple.getSecond());
        System.out.println("Third (modified): " + tuple.getThird());
    }
}

//Wynik:

//First: Hello
//        Second: 42
//        Third: 3.14
//        First (modified): World
//        Second (modified): 123
//        Third (modified): 2.71
//
//        Process finished with exit code 0

