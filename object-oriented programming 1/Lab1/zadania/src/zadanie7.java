// Zad. 7 Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true,
//      jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
//      Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane
//      są przez użytkownika z klawiatury.

import java.util.Random;
import java.util.Scanner;

public class zadanie7
{
    public static void main(String[] args)
    {
        System.out.print("Podaj liczbe całkowitą, która będzie dolnym przedziałem: ");
        int x = InputInt();
        System.out.print("Podaj liczbe całkowitą, która będzie górnym przedziałem: ");
        int y = InputInt();
        while (y<=x)
        {
            System.out.print("Liczba górnego przedziału musi być większa od dolnego\n");
            System.out.print("Podaj liczbe całkowitą, która będzie górnym przedziałem: ");
            y = InputInt();
        }
        Random rand = new Random();
        int z1 = rand.nextInt(y - x + 1) + x;
        int z2 = rand.nextInt(y - x + 1) + x;
        int z3 = rand.nextInt(y - x + 1) + x;
        System.out.format("Czy z licz %d, %d, %d można zbudować trójkąt prostokątny? - %b", z1, z2, z3, Trojkat(z1, z2, z3));
    }

    public static boolean Trojkat(int z1, int z2, int z3)
    {
        return ((z1*z1 + z2*z2 == z3*z3) || (z1*z1 + z3*z3 == z2*z2) || (z3*z3 + z2*z2 == z1*z1));
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
}
