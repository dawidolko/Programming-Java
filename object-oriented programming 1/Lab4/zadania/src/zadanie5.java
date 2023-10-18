// Zad. 5 Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
//      posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran. Dla przykładu, dla liczb
//      10, -2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100.
//      Zastanów się, jak można posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie.
//      Przetestuj je na różnych zestawach danych. Możesz też skorzystać z jednego z popularnych
//      algorytmów sortowania, np.: sortowania przez wstawianie. Działanie algorytmu omówiono
//      szczegółowo na zajęciach algorytmy i struktury danych.

import java.util.Arrays;
import java.util.Scanner;

public class zadanie5
{
    public static void main(String[] args)
    {
        int[] tabLiczb = WprowadzDoTabeli(8);
        Sortowanie(tabLiczb);
    }

    public static int[] WprowadzDoTabeli(int ileLiczb)
    {
        int[] tab = new int[ileLiczb];
        for (int x = 0; x < ileLiczb; x++)
        {
            System.out.print("\t\t\tPodaj " + (x+1) + " liczbę: ");
            int liczba = InputInt();
            tab[x] = liczba;
        }
        return tab;
    }

    public static void Sortowanie(int[] tabLiczb)
    {
        int[] tabLiczbSort = Arrays.copyOf(tabLiczb, tabLiczb.length);
        for(int kolej = 0; kolej < tabLiczbSort.length - 1; kolej++)
        {
            for(int x = 0; x < tabLiczbSort.length - kolej - 1; x++)
            {
                if(tabLiczbSort[x] > tabLiczbSort[x+1])
                {
                    int tymczas = tabLiczbSort[x];
                    tabLiczbSort[x] = tabLiczbSort[x+1];
                    tabLiczbSort[x+1] = tymczas;
                }
            }
        }
        System.out.println("\t\t\tWprowadzona tabela liczb: " + Arrays.toString(tabLiczb));
        System.out.println("\t\t\tPosortowana tabela liczb: " + Arrays.toString(tabLiczbSort));
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
