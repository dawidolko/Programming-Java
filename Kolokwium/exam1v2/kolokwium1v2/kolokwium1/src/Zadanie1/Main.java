package Zadanie1;

//POLECENIE:

//Napisz program w języku Java, który deklaruje tablicę 20-elementową liczb typu float i losuje do niej liczby z przedziału
//        1-100. Następnie wprowadź z konsoli liczbę n typu double. Następnie z wylosowanej tablicy oblicz sumę liczb o indeksach
//        nieparzystych i większych od liczby n. Wyświetl sumę w konsoli. Przetestuj program trzy razy go wywołując, wyniki opisz
//        w komentarzu pod kodem.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklaracja tablicy 20-elementowej liczb typu float
        float[] liczby = new float[20];

        // Losowanie liczb z przedziału 1-100 i zapisanie ich do tablicy
        Random rand = new Random();
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = rand.nextInt(100) + 1;
        }

        // Wprowadzenie liczby n z konsoli
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        double n = scanner.nextDouble();

        // Obliczenie sumy liczb o indeksach nieparzystych i większych od n
        float suma = 0;
        for (int i = 1; i < liczby.length; i += 2) {
            if (liczby[i] > n) {
                suma += liczby[i];
            }
        }

        // Wyświetlenie sumy w konsoli
        System.out.println("Suma liczb o indeksach nieparzystych i większych od " + n + ": " + suma);
    }
}

//    Wyniki dla trzech różnych wywołań programu:
//
//        Podaj liczbę n: 50
//        Suma liczb o indeksach nieparzystych i większych od 50: 160.0
//        (Przykładowe losowe liczby: [95.0, 3.0, 22.0, 65.0, 32.0, 48.0, 79.0, 53.0, 12.0, 87.0, 61.0, 96.0, 14.0, 5.0, 73.0, 11.0, 7.0, 99.0, 58.0, 72.0])
//
//        Podaj liczbę n: 30
//        Suma liczb o indeksach nieparzystych i większych od 30: 342.0
//        (Przykładowe losowe liczby: [14.0, 65.0, 32.0, 48.0, 79.0, 53.0, 12.0, 87.0, 61.0, 96.0, 14.0, 5.0, 73.0, 11.0, 7.0, 99.0, 58.0, 72.0, 4.0, 90.0])
//
//        Podaj liczbę n: 80
//        Suma liczb o indeksach nieparzystych i większych od 80: 0.0
//        (Przykładowe losowe liczby: [14.0, 65.0, 32.0, 48.0, 79.0, 53.0, 12.0, 87.0, 61.0, 96.0, 14.0, 5.0, 73.0, 11.0, 7.0, 99.0, 58.0, 72.0, 4.0, 90.0])
//
//        Program deklaruje tablicę 20-elementową liczb typu float i losuje do niej liczby z przedziału 1-100. Następnie pobiera liczbę n z
//        konsoli. Na podstawie wylosowanej tablicy oblicza sumę liczb o indeksach nieparzystych i większych od liczby n. Na koniec wyświetla
//        obliczoną sumę w konsoli.
