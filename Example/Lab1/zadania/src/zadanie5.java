// Zad. 5 Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.

import java.util.Scanner;

public class zadanie5
{
    public static void main(String[] args)
    {
        int x = InputInt();
        System.out.println(x + "^3 = " + Potegowanie(x));
    }

    public static int Potegowanie(int x) { return (x * x * x); }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }
}
