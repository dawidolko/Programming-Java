/*Kurs Java od podstaw #5 - Programowanie obiektowe https://www.youtube.com/watch?v=bPHr64sReSs&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=5*/

import java.util.Scanner;

public class Mathematics { //paradygmat to rodzaj w jakim się programuje. Są np. obiektowe, strukturalne, funkcyjne, prodeduralne, sterowane zdarzeniami, uogólnione itp.
    public static void main(String[] args) // obiektowe to takie w którym problem postrzega się jako zbiór obiektów i intereakcje między nimi.
    {
        Mathematics m = new Mathematics();
        m.className();
        System.out.println();
        System.out.println("Podaj wartosc jaką chcesz dać do kwadratu?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Ile chcesz ją zpotengować?");
        int b = scanner.nextInt();
        System.out.println("wynik: " + m.power(a, b));

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę zmiennoprzecinkową: ");
        double number1 = input.nextDouble();
        System.out.print("Podaj drugą liczbę zmiennoprzecinkową: ");
        double number2 = input.nextDouble();

        double result = pow(number1, number2);
        System.out.println("Wynik: "+result);

        System.out.println();
        System.out.println(m.powerDouble(10.5));
        System.out.println(m.powerDouble(15.5));
        System.out.println(m.powerDouble(20.5));
    }

    public void className() // <- Metoda
    {
        System.out.println("Mathematics");
    }

    public static double pow(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public int power(int a, int b) // funkcja do potegowania
    {
        int wynik = a;
        for(int i = 1; i < b; i++)
        {
            wynik *= a;
        }
        return wynik;
    }

    public double powerDouble(double a)
    {

        return a*a;
    }
}