// Zad. 1 Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik).
//      Wprowadzamy liczbę punktów dla każdego studenta. Napisz program,
//      który obliczy średnią liczbę punktów w grupie z wykorzystaniem pętli while.

import java.util.Arrays;
import java.util.Scanner;

public class zadanie1
{
    public static void main(String[] args)
    {
        int studenci = WprowadzLiczbe();
        int[] liczbyPunktow = PunktyDlaStudentow(studenci);
        double sredniaPunkow = ObliczanieSredniej(liczbyPunktow);
        System.out.println("Wprowadzona tabela punktów: " + Arrays.toString(liczbyPunktow));
        System.out.println("Średnia ilość punktów studentów wynosi: " + sredniaPunkow);
    }

    public static int WprowadzLiczbe()
    {
        System.out.print("Podaj liczbe studentów: ");
        int liczba = InputInt();
        while (liczba <= 0)
        {
            System.out.println("Liczba studentów musi być równa bądź większa od 1");
            System.out.print("Podaj liczbe studentów: ");
            liczba = InputInt();
        }
        return liczba;
    }

    public static int[] PunktyDlaStudentow(int i)
    {
        int[] tab = new int[i];
        int x = 0;
        while (x < i)
        {
            System.out.print("Podaj liczbe punktów dla " + (x + 1) + " studenta: ");
            int punkty = Punkty();
            tab[x] = punkty;
            x += 1;
        }
        return tab;
    }

    public static int Punkty()
    {
        System.out.print("Podaj liczbe punktów: ");
        int liczba = InputInt();
        while (liczba < 0)
        {
            System.out.println("Liczba punktów studenta musi być równa bądź większa od 0");
            System.out.print("Podaj liczbe punktów: ");
            liczba = InputInt();
        }
        return liczba;
    }

    public static double ObliczanieSredniej(int[] tab)
    {
        double SredniaPunktow = 0;
        int x = 0;
        while (x < tab.length)
        {
            SredniaPunktow += tab[x];
            x += 1;
        }
        SredniaPunktow /= tab.length;
        return SredniaPunktow;
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
