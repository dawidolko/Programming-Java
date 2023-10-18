// Zad. 2 Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości
//      oraz sumy liczb ujemnych i dodatnich podanych przez użytkownika.

import java.util.Arrays;
import java.util.Scanner;

public class zadanie2
{
    public static void main(String[] args)
    {
        int[] liczby = WczytywanieDoTabeli(10);
        System.out.println("Wprowadzona tabela liczb: " + Arrays.toString(liczby));
        Sumy(liczby);
        Ilosci(liczby);
    }

    public static void Sumy(int[] tab)
    {
        int sumaDod = 0;
        int sumaUje = 0;
        for (int i : tab)
        {
            if (i > 0) { sumaDod += i; }
            else { sumaUje += i; }
        }
        System.out.println("Suma liczb dodatnich wynosi: " + sumaDod);
        System.out.println("Suma liczb ujemnych wynosi: " + sumaUje);
    }

    public static void Ilosci(int[] tab)
    {
        int ileDod = 0;
        int ileUje = 0;
        for (int i : tab)
        {
            if (i > 0) { ileDod += 1; }
            else if (i < 0){ ileUje += 1; }
        }
        System.out.println("Liczb dodatnich jest: " + ileDod);
        System.out.println("Liczb ujemnych jest: " + ileUje);
    }

    public static int[] WczytywanieDoTabeli(int i)
    {
        int[] tab = new int[i];
        int x = 0;
        while (x < i)
        {
            System.out.print("Podaj liczbe całkowitą dla " + (x + 1) + " pozycji: ");
            int liczbaWprowadz = InputInt();
            tab[x] = liczbaWprowadz;
            x += 1;
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
