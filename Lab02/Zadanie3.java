import java.util.Scanner;

//Zadanie 3.
//        Napisz program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy. Następnie
//        utwórz następujące funkcjonalności używając pętli for:
//        a) Wyświetlanie tablicy od pierwszego do ostatniego indeksu.
//        b) Wyświetlanie tablicy od ostatniego do pierwszego indeksu.
//        c) Wyświetlanie elementów o nieparzystych indeksach.
//        d) Wyświetlanie elementów o parzystych indeksach.
//        Wyniki działania algorytmów wyświetlaj na konsoli. Dla wyboru powyższych funkcjonalności
//        programu utwórz odpowiednie menu. Do obsługi menu użyć rozbudowanej konstrukcji else-if oraz
//        pętli do-while.

public class Zadanie3 {

    public static void main(String[] args) {

        double[] liczby = new double[10];
        Scanner scanner = new Scanner(System.in);

        // Wprowadzanie liczb do tablicy
        System.out.println("Wprowadź 10 liczb rzeczywistych:");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            liczby[i] = scanner.nextDouble();
        }

        // Menu
        int wybor = 0;
        do {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach");
            System.out.println("4. Wyświetlanie elementów o parzystych indeksach");
            System.out.println("5. Wyjście");
            System.out.print("Twój wybór: ");
            wybor = scanner.nextInt();

            // Wykonanie wybranej funkcjonalności
            switch (wybor) {
                case 1:
                    System.out.println("Tablica od pierwszego do ostatniego indeksu:");
                    for (int i = 0; i < liczby.length; i++) {
                        System.out.print(liczby[i] + " ");
                    }
                    break;
                case 2:
                    System.out.println("Tablica od ostatniego do pierwszego indeksu:");
                    for (int i = liczby.length-1; i >= 0; i--) {
                        System.out.print(liczby[i] + " ");
                    }
                    break;
                case 3:
                    System.out.println("Elementy o nieparzystych indeksach:");
                    for (int i = 0; i < liczby.length; i++) {
                        if (i % 2 == 1) {
                            System.out.print(liczby[i] + " ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Elementy o parzystych indeksach:");
                    for (int i = 0; i < liczby.length; i++) {
                        if (i % 2 == 0) {
                            System.out.print(liczby[i] + " ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Niepoprawny wybór.");
                    break;
            }

        } while (wybor != 5);

        scanner.close();
    }
}