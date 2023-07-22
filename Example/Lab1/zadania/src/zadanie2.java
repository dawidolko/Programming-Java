// Zad. 2 Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
//      Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.

import java.util.Scanner;

public class zadanie2
{
    public static void main(String[] args)
    {
        int x = InputInt();
        int y = InputInt();
        Dzialania(x, y);
    }

    public static void Dzialania(int x, int y)
    {
        System.out.format("Suma: %d + %d = %d\n", x, y, (y + y));
        System.out.format("Różnica: %d - %d = %d\n", x, y, (x - y));
        System.out.format("Iloczyn: %d * %d = %d\n", x, y, (x * y));
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }
}
