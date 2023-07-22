// Zad. 3 Napisz program wykorzystujący obsługę wyjątku ArrayIndexOutOfBoundsException.

package ZadaniaException.zadanie3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie3
{
    public static void main(String[] args)
    {
        System.out.print("Podaj ile chcesz mieć miejsc w tablicy: ");
        int ileMiejsc = inputInt();
        int[] tablica = new int[ileMiejsc];
        for(int x = 0; x <= ileMiejsc; x++)
        {
            System.out.print("Podaj wartość int dla " + (x + 1) + " elementu tablicy: ");
            try
            {
                tablica[x] = inputInt();
            }
            catch (InputMismatchException e)
            {
                tablica[x] = 0;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println((x + 1) + " element tablicy znajduje się poza zakresem tej tablicy, nie można dodać elementu");
            }
        }
        System.out.println("\nWprowadzona tablica: " + Arrays.toString(tablica));
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba;
        liczba = input.nextInt();
        return liczba;
    }
}
