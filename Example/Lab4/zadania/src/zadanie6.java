// Zad. 6 Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy,
//      a następnie policzy i wypisze silnię każdej z pobranych liczb.

import java.util.Scanner;

public class zadanie6
{
    public static void main(String[] args)
    {
        int[] tabLiczb = WprowadzDoTabeli(5);
        Silnia(tabLiczb);
    }

    public static int[] WprowadzDoTabeli(int ileLiczb)
    {
        int[] tab = new int[ileLiczb];
        for (int x = 0; x < ileLiczb; x++)
        {
            System.out.print("\t\t\tPodaj " + (x+1) + " liczbę: ");
            int liczba = InputInt();
            while(liczba < 0)
            {
                System.out.println("\t\t\tLiczba musi być równa bądź większa od zera");
                System.out.print("\t\t\tPodaj " + (x+1) + " liczbę: ");
                liczba = InputInt();
            }
            tab[x] = liczba;
        }
        return tab;
    }

    public static void Silnia(int[] tabLiczb)
    {
        for(int x:tabLiczb)
        {
            int silnia = 1;
            if(x != 0)
            {
                for(int i = 1; i <= x; i++)
                {
                    silnia *= i;
                }
            }
            System.out.println("\t\t\tSilnia z " + x + " wynosi: " + silnia);
        }
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
