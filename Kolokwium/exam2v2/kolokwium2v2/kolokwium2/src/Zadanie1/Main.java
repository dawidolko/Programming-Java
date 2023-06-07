package Zadanie1;

//POLECENIE:

//Utwórz klasę ValueNegativeException, która będzie wyrzucać wyjątki w przypadku gdy ustawiona lub wprowadzona liczba jest
//        mniejsza od zera (a powinna być większa od zera). Przetestuj działanie klasy.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int liczba = wczytajLiczbe();
            if (liczba < 0) {
                throw new ValueNegativeException("Wprowadzona liczba jest mniejsza od zera.");
            }
            System.out.println("Wprowadzona liczba: " + liczba);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static int wczytajLiczbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        return scanner.nextInt();
    }
}

//Wyniki:

//    Podaj liczbę: -2
//        Błąd: Wprowadzona liczba jest mniejsza od zera.

