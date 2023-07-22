// Zad. 4 Wykorzystując algorytm z zadania 3, napisz program, który pozwoli użytkownikowi
//      na wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb
//      parzystych w danym ciągu.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie4
{
    public static void main(String[] args)
    {
        int ileLiczb = WprowadzLiczbe();
        int[] liczby = WczytywanieDoTabeliLos(ileLiczb);
        System.out.println("Wylosowana tabela liczb: " + Arrays.toString(liczby));
        SumaParzystych(liczby);
    }

    public static int WprowadzLiczbe()
    {
        System.out.print("Podaj, ile chcesz wylosować liczb: ");
        int liczba = InputInt();
        while (liczba <= 0)
        {
            System.out.println("Tablica musi zawierać przynajmniej jeden element!");
            System.out.print("Podaj, ile chcesz wylosować liczb: ");
            liczba = InputInt();
        }
        return liczba;
    }

    public static int[] WczytywanieDoTabeliLos(int i)
    {
        int[] tab = new int[i];
        int x = 0;
        while (x < i)
        {
            Random rand = new Random();
            int liczbaLos = rand.nextInt(54)-9;
            tab[x] = liczbaLos;
            x += 1;
        }
        return tab;
    }

    public static void SumaParzystych(int[] tab)
    {
        int sumaParz = 0;
        for(int x : tab)
        {
            if ((x % 2) == 0) { sumaParz += x; }
        }
        System.out.println("Suma wszystkich wylosowanych liczb parzystych wynosi: " + sumaParz);
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
