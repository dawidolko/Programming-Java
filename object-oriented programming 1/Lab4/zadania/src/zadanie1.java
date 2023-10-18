// Zad. 1 Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
//      Elementy do tablicy mają zostać wylosowane z dowolnego przedziału.
//      Należy zaproponować oddzielną metodę do losowania liczb.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie1
{
    public static void main(String[] args)
    {
        int ileLiczb = WprowadzLiczbe();
        int[] tabLiczb = WprowadzDoTabeli(ileLiczb);
        Run(tabLiczb);
    }

    public static void Run(int[] tabLiczb)
    {
        while (true)
        {
            Menu(tabLiczb);
            int wybor = InputInt();
            switch (wybor)
            {
                case 1 -> Suma(tabLiczb);
                case 2 -> Srednia(tabLiczb);
                case 3 -> Zakoncz();
                default -> Default();
            }
        }
    }

    public static void Menu(int[] tabLiczb)
    {
        System.out.println("\n\t\t\t==============================");
        System.out.println("\t\t\t=======   MENU OPCJI   =======");
        System.out.println("\t\t\t==============================");
        System.out.println("\t\t\t1. Suma elementów");
        System.out.println("\t\t\t2. Wartość średnia");
        System.out.println("\t\t\t3. Wyjście z programu");
        System.out.println("\t\t\t------------------------------");
        System.out.println("\t\t\tDostępna tablica: " + Arrays.toString(tabLiczb));
        System.out.println("\t\t\t------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
    }

    public static void Suma(int[] tab)
    {
        int suma = 0;
        for(int x:tab)
        {
            suma += x;
        }
        System.out.println("\t\t\tSuma elementów tablicy wynosi: " + suma);
    }

    public static void Srednia(int[] tab)
    {
        double srednia = tab[0];
        for(int x = 1; x < tab.length; x++)
        {
            srednia += tab[x];
        }
        srednia /= tab.length;
        System.out.println("\t\t\tWartość średnia w tablicy wynosi: " + srednia);
    }

    public static void Zakoncz()
    {
        System.out.print("\t\t\tCzy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = InputString();
        if (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("\t\t\tKoniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("\t\t\tAnulowano wyjście");
        }
    }

    public static void Default()
    {
        System.out.println("\t\t\tBłędne dane, koniec programu");
        System.exit(0);
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
