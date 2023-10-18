package CwiczeniaLekcyjne;

import java.util.Scanner;

public class ExceptionExample1
{
    public static void main(String[] args)
    {
        System.out.print("Podaj liczbę godzin do zamienienia na liczbę sekund: ");
        int hour = inputInt();
        int second = getNumberOfSeconds(hour);
        System.out.println("Liczba sekund: " + second);
    }

    public static int getNumberOfSeconds(int hour)
    {
        if (hour < 0)
        {
            throw new IllegalArgumentException("Godzina musi być większa bądź równa zeru: " + hour);
        }
        return hour * 60 * 60;
    }

    public static int inputInt()
    {
    Scanner input = new Scanner(System.in);
    int liczba;
    liczba = input.nextInt();
    return liczba;
    }
}
