// Zad. 4 Utwórz klasę rzucającą wyjątek przy próbie wykonania dzielenia przez 0.
//      Klasa ma dziedziczyć po java.lang.Exception. Następnie utwórz klasę, która testuje czy wyjątki
//      dzielenia przez zero są rzucane przy pomocy utworzonej wcześniejszej klasy i wyłapywane.

package ZadaniaException.zadanie4;

import java.util.Scanner;

public class zadanie4
{
    public static void main(String[] args)
    {
        System.out.print("Podaj dzielną: ");
        double dzielna = inputDouble();
        System.out.print("Podaj dzielnik: ");
        double dzielnik = inputDouble();
        try
        {
            if (dzielnik == 0)
            {
                throw new DzieleniePrzezZeroException("Nie można dzielić przez zero");
            }
            double iloraz = dzielna / dzielnik;
            System.out.println("Iloraz działania wynosi " + iloraz);
        }
        catch (DzieleniePrzezZeroException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("\nWyjątki dzielenia przez zero są rzucane przy pomocy utworzonej własnej klasy i wyłapywane");
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba;
        liczba = input.nextInt();
        return liczba;
    }

    public static double inputDouble()
    {
        Scanner input = new Scanner(System.in);
        double liczba;
        liczba = input.nextDouble();
        return liczba;
    }
}
