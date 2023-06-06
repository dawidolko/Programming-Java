/*Kurs Java od podstaw #4 - Instrukcje warunkowe https://www.youtube.com/watch?v=lkoLolpZYEQ&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=4*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a = 10;
        if(a < 10)
        {
            System.out.println("Tak a jest mniejsze od 10");
        } else if (a==10)
        {
            System.out.println("a jest rowne 10");
        } else
        {
            System.out.println("Nie, nie a jest mniejsze od 10");
        }

        int b = 4;
        switch (b)
        {
            case 1:
                System.out.println("b=1");
                break;
            case 2:
                System.out.println("b=2");
                break;
            case 3:
                System.out.println("b=3");
                break;
            case 4:
                System.out.println("b=4");
                break;
            default:
                System.out.println("Podałeś złą wartosc");
                break;
        }

        int c = 10;
        int d;
        d = c < 10 ? -1 : 1;
        System.out.println(d);

        for(int i = 0; i < 10; i++)
        {
            if(i == 5)
            {
                continue;
            }
            System.out.print(i + " "); // print wypisuje w bok, println w dół jako nową linie.
        }
        System.out.println();
        System.out.print("Podaj imie: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
    }
}