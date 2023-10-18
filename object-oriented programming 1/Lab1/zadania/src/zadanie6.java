// Zad. 6 Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.

import java.util.Scanner;

public class zadanie6
{
    public static void main(String[] args)
    {
        int x = InputInt();
        System.out.println("Pierwiastek kwadratowy z " + x + " wynosi " + Pierwiastkowanie(x));
    }

    public static double Pierwiastkowanie(int x) { return Math.sqrt(x); }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }
}
