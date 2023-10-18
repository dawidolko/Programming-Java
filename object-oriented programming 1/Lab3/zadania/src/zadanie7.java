// Zad. 7 Napisz program umożliwiający wprowadzanie n liczb oraz sortujący te liczby
//      metodą bąbelkową lub wstawiania. Wyniki wyświetlaj na konsoli.

import java.util.Arrays;
import java.util.Scanner;

public class zadanie7
{
    public static void main(String[] args)
    {
        int n = WprowadzLiczbe();
        int[] Liczby = Wprowadzanie(n);
        int[] Poczatkowa = Arrays.copyOf(Liczby, Liczby.length);
        int[] Posortowana = Sortowanie(n, Liczby);
        System.out.print("\n\t\t\tPoczątkowa tabelka: " + Arrays.toString(Poczatkowa));
        System.out.print("\n\t\t\tPosortowana tabelka: " + Arrays.toString(Posortowana));
    }

    public static int WprowadzLiczbe()
    {
        System.out.print("\t\t\tPodaj, ile chcesz wprowadzić liczb: ");
        int ileLiczb = InputInt();
        while (ileLiczb <= 0)
        {
            System.out.println("\t\t\tTablica musi zawierać przynajmniej jeden element!");
            System.out.print("\t\t\tPodaj, ile chcesz wprowadzić liczb: ");
            ileLiczb = InputInt();
        }
        return ileLiczb;
    }

    public static int[] Wprowadzanie(int n)
    {
        int[] tab = new int[n];
        int x = 0;
        while (x < n)
        {
            System.out.print("\t\t\tPodaj liczbe całkowitą dla " + (x + 1) + " pozycji: ");
            int liczbaWprowadz = InputInt();
            tab[x] = liczbaWprowadz;
            x += 1;
        }
        return tab;
    }

    public static int[] Sortowanie(int n, int[] tab)
    {
        int kolej = 0;
        while (kolej < n-1)
        {
            System.out.println();
            System.out.println(Arrays.toString(tab));
            System.out.println("Sortowanie "+ (kolej+1) +" kolejka:");
            int x = 0;
            while (x < n-1-kolej)
            {
                if (tab[x] > tab[x+1])
                {
                    System.out.println(tab[x]+">"+tab[x+1]+", więc zamiana kolejności");
                    int tymczas = tab[x];
                    tab[x] = tab[x+1];
                    tab[x+1] = tymczas;
                }
                else
                {
                    System.out.println(tab[x]+"<"+tab[x+1]+", więc brak zamiany kolejności");
                }
                x += 1;
            }
            kolej += 1;
        }
        return tab;
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
