/*Kurs Java od podstaw #9 - Zasady programowania obiektowego https://www.youtube.com/watch?v=8Albh-XR6QI&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=9
* */
package Main;

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Main {

    double a, b, wynik;
    String zamknac, tak, nie;



    String znak;
    String odejmowanie = "-";
    String dodawanie = "+";
    String mnozenie = "*";
    String dzielenie = "/";



    public static void main(String[] args)
    {
        Main main = new Main();

        main.wczytaj_dane();
        main.przetworz_dane();
        main.wyswietl_wynik();

    }

    private void wczytaj_dane()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę od -999 do 999: ");
        try {
            a = scanner.nextDouble();
        }
        catch(Exception e)
        {
            System.err.println("Nie wprowadziłeś cyfry! Zacznij od nowa!");
            System.exit(0);
        }
        System.out.println("Wpisz znak matematyczny: ");
        znak = scanner.next();
        if(znak.equals(odejmowanie))
        {
            System.out.print("");
        }
        else if (znak.equals(dodawanie))
        {
            System.out.print("");
        }
        else if (znak.equals(mnozenie))
        {
            System.out.print("");
        }
        else if (znak.equals(dzielenie))
        {
            System.out.print("");
        }
        else
        {
            System.err.println("Nie wprowadziłeś znaku, zacznij od nowa!");
            System.exit(0);
        }
        System.out.println("Wpisz druga liczbe: ");
        try {
            b = scanner.nextDouble();
        }
        catch(Exception e)
        {
            System.err.println("Nie wprowadziłeś cyfry! Zacznij od nowa!");
            System.exit(0);
        }
    }


    private void przetworz_dane()
    {
        if(znak.equals(odejmowanie)){
            wynik=a-b;
        }
        else if(znak.equals(dodawanie)){
            wynik=a+b;
        }
        else if(znak.equals(mnozenie)){
            wynik=a*b;
        }
        else if(znak.equals(dzielenie)){
            wynik=a/b;
        }

    }


    private void  wyswietl_wynik()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Twój wynik to: ");
        System.out.println(wynik);


    }

}