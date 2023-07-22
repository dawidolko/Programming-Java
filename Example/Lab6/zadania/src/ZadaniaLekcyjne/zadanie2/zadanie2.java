// Zad. 2 Napisz metodę, która będzie zwracać silnię podanej jako argument liczby. Metoda powinna rzucać wyjątek
//      rodzaju Checked zdefiniowanego przez Ciebie typu BlednaWartoscDlaSilniException, gdy jej argument będzie ujemny.
//      Skorzystaj z tej metody w main, obsługując potencjalny wyjątek.

package ZadaniaLekcyjne.zadanie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie2
{
    public static void main(String[] args)
    {
        System.out.print("Podaj liczbę dodatnią: ");
        int liczba;
        try
        {
            liczba = inputInt();
            if (liczba < 0)
            {
                throw new BlednaWartoscDlaSilniException("Liczba musi być nieujemna: " + liczba);
            }
        }
        catch (BlednaWartoscDlaSilniException | InputMismatchException e)
        {
            liczba = 0;
        }
        int silnia = obliczSilnia(liczba);
        System.out.println("Silnia z liczby " + liczba + " wynosi " + silnia);
    }

    public static int obliczSilnia(int i)
    {
        if (i == 0 || i == 1)
        {
            return 1;
        }
        else
        {
            return (i * obliczSilnia(i - 1));
        }
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba;
        liczba = input.nextInt();
        return liczba;
    }
}
