// Zad. 3 Napisz program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy.
//      Następnie utwórz następujące funkcjonalności używając pętli for:
//        • Wyświetlanie tablicy od pierwszego do ostatniego indeksu.
//        • Wyświetlanie tablicy od ostatniego do pierwszego indeksu.
//        • Wyświetlanie elementów o nieparzystych indeksach.
//        • Wyświetlanie elementów o parzystych indeksach.
//      Wyniki działania algorytmów wyświetlaj na konsoli. Dla wyboru powyższych funkcjonalności programu
//      utwórz odpowiednie menu. Do obsługi menu użyć rozbudowanej konstrukcji else-if oraz pętli do-while.

import java.util.Arrays;
import java.util.Scanner;

public class zadanie3
{
    public static void main(String[] args)
    {
        int ileLiczb = WprowadzLiczbe();
        double[] tab = WprowadzDoTabeli(ileLiczb);
        Run(tab);
    }

    public static void Run(double[] tab)
    {
        do
        {
            Menu();
            int wybor = InputInt();
            if (wybor == 1 || wybor == 2 || wybor == 3 || wybor == 4) {Wyswietl(wybor, tab);}
            else if (wybor == 5) {Zakoncz();}
            else {Default();}
        } while (true);
    }

    public static void Menu()
    {
        System.out.println("\n\t\t\t==============================");
        System.out.println("\t\t\t=======   MENU OPCJI   =======");
        System.out.println("\t\t\t==============================");
        System.out.println("\t\t\t1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
        System.out.println("\t\t\t2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
        System.out.println("\t\t\t3. Wyświetlanie elementów o nieparzystych indeksach");
        System.out.println("\t\t\t4. Wyświetlanie elementów o parzystych indeksach");
        System.out.println("\t\t\t5. Wyjście z programu");
        System.out.println("\t\t\t------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
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

    public static double[] WprowadzDoTabeli(int ileLiczb)
    {
        double[] tab = new double[ileLiczb];
        int x = 0;
        while (x < ileLiczb)
        {
            System.out.print("\t\t\tPodaj liczbe rzeczywistą dla " + x + " indeksu: ");
            double liczbaWprowadz = InputDouble();
            tab[x] = liczbaWprowadz;
            x += 1;
        }
        return tab;
    }

    public static void Wyswietl(int wybor, double[] tab)
    {
        if (wybor == 1) {System.out.println("\t\t\t" + Arrays.toString(tab));}
        else if (wybor == 2) {Odwroc(tab);}
        else {CoDrugi(tab, wybor);}
    }

    public static void Odwroc(double[] tab)
    {
        double[] tabN = new double[tab.length];
        for(int x = tab.length - 1; x >= 0; x--)
        {
            tabN[tabN.length - 1 - x] = tab[x];
        }
        System.out.println("\t\t\t" + Arrays.toString(tabN));
    }

    public static void CoDrugi(double[] tab, int wybor)
    {
        int x = 0;
        if (wybor == 3) {x += 1;}
        int dlugosc = tab.length/2;
        if ((tab.length % 2 == 1) && (wybor == 4)) {dlugosc += 1;}
        double[] tabN = new double[dlugosc];
        for(int i = 0; i < dlugosc; i++)
        {
            tabN[i] = tab[x];
            x += 2;
        }
        System.out.println("\t\t\t" + Arrays.toString(tabN));
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

    public static double InputDouble()
    {
        Scanner input = new Scanner(System.in);
        double liczba = input.nextDouble();
        return liczba;
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
