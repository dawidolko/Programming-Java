// Zad. 2 Utwórz metodę wprowadzInt wraz z obsługą wyjątków tak aby np.: nie można było wprowadzić
//      błędnej postaci liczby tj. „1w2”. Utwórz metody wprowadzania innych typów danych np.: char, long, short,
//      float, double, String wraz z odpowiednią obsługą wyjątków. Do wprowadzania danych z konsoli użyj klasy Scanner.

package ZadaniaException.zadanie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie2
{
    public static void main(String[] args)
    {
        System.out.print("Podaj liczbę int: ");
        int liczbaInt;
        try
        {
            liczbaInt = inputInt();
        }
        catch (InputMismatchException e)
        {
            liczbaInt = 0;
        }
        System.out.println("Liczba int: " + liczbaInt);

        System.out.print("Podaj znak char: ");
        char znakChar;
        znakChar = inputChar();
        System.out.println("Znak char: " + znakChar);

        System.out.print("Podaj liczbę long: ");
        long liczbaLong;
        try
        {
            liczbaLong = inputLong();
        }
        catch (InputMismatchException e)
        {
            liczbaLong = 0;
        }
        System.out.println("Liczba long: " + liczbaLong);

        System.out.print("Podaj liczbę short: ");
        short liczbaShort;
        try
        {
            liczbaShort = inputShort();
        }
        catch (InputMismatchException e)
        {
            liczbaShort = 0;
        }
        System.out.println("Liczba short: " + liczbaShort);

        System.out.print("Podaj liczbę float: ");
        float liczbaFloat;
        try
        {
            liczbaFloat = inputFloat();
        }
        catch (InputMismatchException e)
        {
            liczbaFloat = 0;
        }
        System.out.println("Liczba float: " + liczbaFloat);

        System.out.print("Podaj liczbę double: ");
        double liczbaDouble;
        try
        {
            liczbaDouble = inputDouble();
        }
        catch (InputMismatchException e)
        {
            liczbaDouble = 0;
        }
        System.out.println("Liczba double: " + liczbaDouble);

        System.out.print("Podaj zdanie string: ");
        String zdanieString;
        zdanieString = inputString();
        System.out.println("Zdanie string: " + zdanieString);
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba;
        liczba = input.nextInt();
        return liczba;
    }

    public static char inputChar()
    {
        Scanner input = new Scanner(System.in);
        char znak;
        znak = input.next().charAt(0);
        return znak;
    }

    public static long inputLong()
    {
        Scanner input = new Scanner(System.in);
        long liczba;
        liczba = input.nextLong();
        return liczba;
    }

    public static short inputShort()
    {
        Scanner input = new Scanner(System.in);
        short liczba;
        liczba = input.nextShort();
        return liczba;
    }

    public static float inputFloat()
    {
        Scanner input = new Scanner(System.in);
        float liczba;
        liczba = input.nextFloat();
        return liczba;
    }

    public static double inputDouble()
    {
        Scanner input = new Scanner(System.in);
        double liczba;
        liczba = input.nextDouble();
        return liczba;
    }

    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        String wyraz;
        wyraz = input.nextLine();
        return wyraz;
    }
}
