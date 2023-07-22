// Zad. 5 Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest palindromem.
//      Palindrom to słowo, które jest takie samo czytane od początku i od końca, np.: kajak.

import java.util.Scanner;

public class zadanie5
{
    public static void main(String[] args)
    {
        String czyPali = InputString();
        boolean palindrom = CzyPalindrom(czyPali);
        System.out.println("Czy słowo " + czyPali + " jest palindromem? - " + palindrom);
    }

    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String slowo = input.nextLine();
        return slowo;
    }

    public static boolean CzyPalindrom(String napis)
    {
        int y = napis.length() / 2;
        int x = 0;
        while (x < y)
        {
            if (napis.charAt(x) != napis.charAt(napis.length()-1-x))
            {
                return false;
            }
            x += 1;
        }
        return true;
    }
}
