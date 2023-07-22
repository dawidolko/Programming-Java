// Zad. 4 Napisz metodę, która jako argument przyjmuje liczbę i zwraca true,
//      jeśli liczba jest podzielna przez 3 i przez 5.

import java.util.Scanner;

public class zadanie4
{
    public static void main(String[] args)
    {
        int x = InputInt();
        System.out.println("Czy liczba " + x + " jest podzielna przez 3 i 5? - " + CzyPodzielna35(x));
    }

    public static boolean CzyPodzielna35(int x)
    {
        return ((x % 3 == 0) && (x % 5 == 0));
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }
}
