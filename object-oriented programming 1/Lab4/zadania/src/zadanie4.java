// Zad. 4 Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy.
//      Następnie, program powinien wypisać wszystkie słowa, od ostatniego do pierwszego,
//      z literami zapisanymi od końca do początku. Dla przykładu, dla podanych słów
//      "Ala", "ma", "kota", "i", "psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".

import java.util.Arrays;
import java.util.Scanner;

public class zadanie4
{
    public static void main(String[] args)
    {
        String[] tabSlowa = WprowadzDoTabeli(5);
        Wypisanie(tabSlowa);
    }

    public static String[] WprowadzDoTabeli(int ileSlow)
    {
        String[] tab = new String[ileSlow];
        for (int x = 0; x < ileSlow; x++)
        {
            System.out.print("\t\t\tPodaj " + (x+1) + " wyraz: ");
            String wyraz = InputString();
            tab[x] = wyraz;
        }
        return tab;
    }

    public static void Wypisanie(String[] tabSlowa)
    {
        System.out.println("\t\t\tWprowadzona tabela: " + Arrays.toString(tabSlowa));
        System.out.print("\t\t\tTabela napisana od tyłu: [");
        for(int x = tabSlowa.length - 1; x > 0; x--)
        {
            StringBuilder wyraz = new StringBuilder(tabSlowa[x]);
            System.out.print(wyraz.reverse() + ", ");
        }
        StringBuilder wyraz0 = new StringBuilder(tabSlowa[0]);
        System.out.println(wyraz0.reverse() + "]");
    }

    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        String wyraz = input.nextLine();
        return wyraz;
    }
}
