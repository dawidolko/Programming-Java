// Zad. 1 Napisz program obliczający wyróżnik delta i pierwiastki trójmianu kwadratowego.

import java.util.Scanner;

public class zadanie1
{
    public static void main(String[] args)
    {
        System.out.println("Podaj wartości dla a, b, c: ");
        System.out.print("Dla 'a': ");
        double a = InputDouble();
        System.out.print("Dla 'b': ");
        double b = InputDouble();
        System.out.print("Dla 'c': ");
        double c = InputDouble();
        if (a != 0)
        {
            RownanieKwadratowe(a, b, c);
        }
        else
        {
            System.out.println("To nie jest równanie kwadratowe");
        }
    }

    public static double InputDouble()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę rzeczywistą: ");
        double liczba = input.nextDouble();
        return liczba;
    }

    public static void RownanieKwadratowe(double a, double b, double c)
    {
        double delta = Math.pow(b,2) - (4*a*c);
        if (delta < 0)
        {
            System.out.println("Brak rozwiązania w zbiorze liczb rzeczywistych");
        }
        else if (delta == 0)
        {
            System.out.println("Rownanie ma jedno rozwiązanie: x1=" + (-b/(2*a)));
        }
        else
        {
            System.out.println("Rownanie ma dwa rozwiązania: x1=" + ((-b-Math.sqrt(delta))/(2*a)) + ", x2=" + ((-b+Math.sqrt(delta))/(2*a)));
        }
    }
}
