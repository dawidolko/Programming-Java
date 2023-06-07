package zadanie1;

//Zadanie 1. (5 pkt.)
//
//Napisz program w języku Java, który deklaruje tablicę 20-elementową liczb typu float i losuje do
// niej liczby z przedziału 1-100. Następnie wprowadź z konsoli liczbę n typu double. Następnie z
// wylosowanej tablicy oblicz sumę liczb nieparzystych i większych od liczby n. Wyświetl sumę w konsoli.
// Przetestuj program trzy razy go wywołując, wyniki opisz w komentarzu pod kodem.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[] tablica = new float[20];
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(100) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        double n = scanner.nextDouble();

        float suma = 0;
        for (float liczba : tablica) {
            if (liczba > n && liczba % 2 != 0) {
                suma += liczba;
            }
        }

        System.out.println("Suma liczb nieparzystych i większych od " + n + " wynosi: " + suma);
    }
}

// Wynik 1:
//Podaj liczbę n: 10
//        Suma liczb nieparzystych i większych od 10.0 wynosi: 596.0
//
//        Process finished with exit code 0

// wynik 2:
//Podaj liczbę n: 5
//        Suma liczb nieparzystych i większych od 5.0 wynosi: 566.0
//
//        Process finished with exit code 0

// wynik3;
//Podaj liczbę n: 2
//        Suma liczb nieparzystych i większych od 2.0 wynosi: 533.0
//
//        Process finished with exit code 0

//wynik dodaktowy:
//Podaj liczbę n: 100
//        Suma liczb nieparzystych i większych od 100.0 wynosi: 0.0
//
//        Process finished with exit code 0