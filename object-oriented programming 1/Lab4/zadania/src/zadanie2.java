// Zad. 2 Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic.
//      Pierwsza tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie2
{
    public static void main(String[] args)
    {
        int ileLiczb = WprowadzLiczbe();
        System.out.println("\t\t\tWprowadzanie danych do tablicy 1, będzie zawierała n elementów: ");
        int[] tab1Liczb = WprowadzDoTabeli(ileLiczb);
        WyswietlanieCoDrugi(tab1Liczb);
        System.out.println("\n\t\t\tWprowadzanie danych do tablicy 2, będzie zawierała n+1 elementów: ");
        int[] tab2Liczb = WprowadzDoTabeli(ileLiczb + 1);
        WyswietlanieCoDrugi(tab2Liczb);
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

    public static int[] WprowadzDoTabeli(int ileLiczb)
    {
        int[] tab = new int[ileLiczb];
        Random rand = new Random();
        System.out.print("\t\t\tPodaj dolny zakres losowania: ");
        int dol = InputInt();
        System.out.print("\t\t\tPodaj górny zakres losowania: ");
        int gora = InputInt();
        while (gora < dol)
        {
            System.out.println("\t\t\tGórny zakres musi być równy bądź większy od dolnego zakresu!");
            System.out.print("\t\t\tPodaj górny zakres losowania: ");
            gora = InputInt();
        }
        for(int i = 0; i < ileLiczb; i++)
        {
            tab[i] = rand.nextInt(gora-dol+1)+dol;
        }
        System.out.println("\t\t\tWylosowana tablica: " + Arrays.toString(tab));
        return tab;
    }


    public static void WyswietlanieCoDrugi(int[] tab)
    {
        System.out.println("\t\t\tWyświetlanie co drugiego parzystego elementu:");
        System.out.print("\t\t\t[");
        int x = 0;
        while (x < tab.length-2)
        {
            System.out.print(tab[x] + ", ");
            x += 2;
        }
        System.out.println(tab[x] + "]");

        System.out.println("\t\t\tWyświetlanie co drugiego nieparzystego elementu:");
        System.out.print("\t\t\t[");
        x = 1;
        while (x < tab.length-2)
        {
            System.out.print(tab[x] + ", ");
            x += 2;
        }
        System.out.println(tab[x] + "]");
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
