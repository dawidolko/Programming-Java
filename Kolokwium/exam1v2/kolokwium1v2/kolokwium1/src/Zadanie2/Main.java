package Zadanie2;

//POLECENIE:

//Napisz program, który deklaruje tablicę 10-elementową typu dobule, do której następnie użytkownik wprowadza dane.
//        Napisz funkcję, która wylicza wartość sumy liczb podzielnych przez 5 i dodatkowo większych od średniej wartości liczb wprowadzonych przez użytkownika.
//        Przetestuj program dwa razy go wywołując, wyniki opisz w komentarzu pod kodem.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklaracja tablicy 10-elementowej typu double
        double[] liczby = new double[10];

        // Wprowadzenie danych przez użytkownika
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < liczby.length; i++) {
            System.out.print("Podaj liczbę: ");
            liczby[i] = scanner.nextDouble();
        }

        // Wywołanie funkcji do obliczenia sumy
        double suma1 = obliczSumePodzielnych(liczby);
        System.out.println("Suma liczb podzielnych przez 5 i większych od średniej: " + suma1);

        // Wywołanie funkcji ponownie
        double suma2 = obliczSumePodzielnych(liczby);
        System.out.println("Suma liczb podzielnych przez 5 i większych od średniej: " + suma2);
    }

    public static double obliczSumePodzielnych(double[] liczby) {
        double suma = 0;
        double srednia = obliczSrednia(liczby);

        for (double liczba : liczby) {
            if (liczba % 5 == 0 && liczba > srednia) {
                suma += liczba;
            }
        }

        return suma;
    }

    public static double obliczSrednia(double[] liczby) {
        double suma = 0;
        for (double liczba : liczby) {
            suma += liczba;
        }

        return suma / liczby.length;
    }
}

//    Wyniki dla dwóch różnych wywołań programu:
//
//        Podaj liczbę: 10
//        Podaj liczbę: 25
//        Podaj liczbę: 15
//        Podaj liczbę: 30
//        Podaj liczbę: 12
//        Podaj liczbę: 8
//        Podaj liczbę: 22
//        Podaj liczbę: 28
//        Podaj liczbę: 17
//        Podaj liczbę: 40
//        Suma liczb podzielnych przez 5 i większych od średniej: 123.0
//
//        Podaj liczbę: 18
//        Podaj liczbę: 21
//        Podaj liczbę: 9
//        Podaj liczbę: 35
//        Podaj liczbę: 42
//        Podaj liczbę: 10
//        Podaj liczbę: 27
//        Podaj liczbę: 14
//        Podaj liczbę: 5
//        Podaj liczbę: 31
//        Suma liczb podzielnych przez 5 i większych od średniej: 78.0