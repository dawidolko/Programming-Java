// Zad. 5 Wykonaj program, który losuje dwie liczby całkowite z przedziału (-10 do 10). Następnie podziel
//      pierwszą liczbę przez drugą i wypisz wynik. Uwzględnij i zaprogramuj wyjątek dzielenia przez zero.
//      Wypisz informację o wystąpieniu tego wyjątku. Po trzecim wystąpieniu wyjątku zakończ wykonywanie programu.

package ZadaniaException.zadanie5;

import java.util.InputMismatchException;
import java.util.Random;

public class zadanie5
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int losowanie = 1;
        int ileZer = 0;
        while (ileZer < 3)
        {
            System.out.println("| Losowanie numer " + losowanie);
            System.out.println("| Ilość wystąpień zer w mianowniku: " + ileZer);
            System.out.print("| Pierwsza liczba: ");
            int liczba1 = random.nextInt(21) - 10;
            System.out.println(liczba1);
            System.out.print("| Druga liczba: ");
            int liczba2 = random.nextInt(21) - 10;
            System.out.println(liczba2 + "\n| ");
            try
            {
                if (liczba2 == 0)
                {
                    ileZer += 1;
                    throw new InputMismatchException("| Nie można wykonać dzielenia");
                }
                System.out.println("| Dzielenie jest wykonalne");
                double wynik = (double) liczba1 / liczba2;
                System.out.println("| Wynik = " + wynik);
            }
            catch (InputMismatchException e)
            {
                System.out.println(e.getMessage());
            }
            losowanie += 1;
            if (ileZer == 3)
            {
                System.out.println("\nDzielenie przez zero nastąpiło 3 razy, koniec programu!");
                System.exit(0);
            }
            System.out.println("\n\n");
        }
    }
}
