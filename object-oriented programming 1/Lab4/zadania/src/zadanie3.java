// Zad. 3 Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją
//      przykładowymi wartościami. Skorzystaj z pętli for-each, aby wypisać wszystkie wartości
//      tablicy ze wszystkimi literami zamienionymi na wielkie. Skorzystaj z funkcjonalności
//      toUpperCase wartości typu String.

import java.util.Scanner;

public class zadanie3
{
    public static void main(String[] args)
    {
        int ileSlow = WprowadzLiczbe();
        String[] tabSlowa = WprowadzDoTabeli(ileSlow);
        WyswietlanieDuzych(tabSlowa);
    }

    public static int WprowadzLiczbe()
    {
        System.out.print("\t\t\tPodaj, ile chcesz wprowadzić słów: ");
        int ileSlow = InputInt();
        while (ileSlow <= 0)
        {
            System.out.println("\t\t\tTablica musi zawierać przynajmniej jeden element!");
            System.out.print("\t\t\tPodaj, ile chcesz wprowadzić słów: ");
            ileSlow = InputInt();
        }
        return ileSlow;
    }

    public static String[] WprowadzDoTabeli(int ileSlow)
    {
        String[] tab = new String[ileSlow];
        for (int x = 0; x < ileSlow; x++)
        {
            System.out.print("\t\t\tPodaj " + (x+1) + " wyraz: ");
            String wyraz = InputString();
            tab[x] = wyraz;
        }
        return tab;
    }

    public static void WyswietlanieDuzych(String[] tabSlowa)
    {
        System.out.println("\n\t\t\tWyświetlanie wartości tablicy ze wszystkimi literami zamienionymi na wielkie:");
        for(String x:tabSlowa)
        {
            System.out.println("\t\t\t" + x.toUpperCase());
        }
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        String wyraz = input.nextLine();
        return wyraz;
    }
}
