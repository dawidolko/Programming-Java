package zadanie2;

//Napisz program, który deklaruje tablicę 10-elementową typu dobule, do której następnie
// użytkownik wprowadza dane. Napisz funkcję, która wylicza wartość sumy liczb podzielnych
// przez 3 i dodatkowo większych od średniej wartości liczb wprowadzonych przez użytkownika.
//
//Przetestuj program dwa razy go wywołując, wyniki opisz w komentarzu pod kodem.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] tablica = new double[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Podaj liczbę: ");
            tablica[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double liczba : tablica) { // petla for each <--
            suma += liczba;
        }

        double srednia = suma / tablica.length;
        double sumaPodzielnych = 0;
        for (double liczba : tablica) {
            if (liczba % 3 == 0 && liczba > srednia) {
                sumaPodzielnych += liczba;
            }
        }

        System.out.println("Suma liczb podzielnych przez 3 i większych od średniej wynosi: " + sumaPodzielnych);
    }
}

//wynik 1:
//Podaj liczbę: 10
//        Podaj liczbę: 9
//        Podaj liczbę: 8
//        Podaj liczbę: 7
//        Podaj liczbę: 6
//        Podaj liczbę: 5
//        Podaj liczbę: 4
//        Podaj liczbę: 3
//        Podaj liczbę: 2
//        Podaj liczbę: 1
//        Suma liczb podzielnych przez 3 i większych od średniej wynosi: 15.0


// wynik 2:
//Podaj liczbę: 1
//        Podaj liczbę: 1
//        Podaj liczbę: 2
//        Podaj liczbę: 2
//        Podaj liczbę:
//        3
//        Podaj liczbę: 3
//        Podaj liczbę: 4
//        Podaj liczbę: 4
//        Podaj liczbę: 5
//        Podaj liczbę: 6
//        Suma liczb podzielnych przez 3 i większych od średniej wynosi: 6.0

// wynik dodatkowy:
//Podaj liczbę: 1
//        Podaj liczbę: 2
//        Podaj liczbę: 3
//        Podaj liczbę: 4
//        Podaj liczbę: 5
//        Podaj liczbę: 6
//        Podaj liczbę: 7
//        Podaj liczbę: 8
//        Podaj liczbę: 9
//        Podaj liczbę: 10
//        Suma liczb podzielnych przez 3 i większych od średniej wynosi: 15.0

