import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args) {
        IntArray intArray = new IntArray();
        intArray.inputNumbers();
        System.out.print("Numbers entered: ");
        intArray.displayNumbers();
        System.out.println("Average: " + intArray.average());
    }
}

// W tej implementacji, pole numbers klasy IntArray przechowuje tablicę 10 liczb całkowitych. Metoda inputNumbers pozwala użytkownikowi wprowadzić wartości do tablicy za pomocą obiektu Scanner, a metoda displayNumbers wyświetla zawartość tablicy na ekranie. Metoda average oblicza średnią wartość elementów tablicy i zwraca ją jako wynik.
//
//W metodzie main tworzymy obiekt klasy IntArray i wywołujemy na nim metody inputNumbers, displayNumbers i average, aby przetestować działanie naszej klasy.