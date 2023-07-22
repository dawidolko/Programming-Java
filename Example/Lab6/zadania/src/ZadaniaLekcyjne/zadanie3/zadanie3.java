// Zad. 3 Napisz program z klasą Adres, która będzie miała podane poniżej pola, które będą ustawiane w konstruktorze
//      klasy Adres. Konstruktor powinien sprawdzić wszystkie podane wartości i rzucić wyjątek
//      NieprawidlowyAdresException rodzaju Checked, jeżeli któraś z wartości będzie nieprawidłowa.
//      Uwaga: komunikat rzucanego wyjątku powinien zawierać informację o wszystkich nieprawidłowych wartościach
//      przekazanych do konstruktora – dla przykładu, jeżeli ulica i miasto będą miały wartość null,
//      to komunikat wyjątku powinien być następujący: "Ulica nie może być nullem. Miasto nie może być nullem".
//      Pola klasy: String ulica – wartość nieprawidłowa to null, int numerDomu – wartość nieprawidłowa to liczba <= 0,
//      String kodPocztowy – wartość nieprawidłowa to null, String miasto – wartość nieprawidłowa to null.

package ZadaniaLekcyjne.zadanie3;

import java.util.Scanner;

public class zadanie3
{
    public static void main(String[] args)
    {
        Adres adres1 = new Adres("3 maja", 315, "39-100", "Ropczyce");
        System.out.println();
        System.out.println("Ulica: " + adres1.getUlica());
        System.out.println("Numer domu: " + adres1.getNumerDomu());
        System.out.println("Kod pocztowy: " + adres1.getKodPocztowy());
        System.out.println("Miasto: " + adres1.getMiasto());
        System.out.println();
        Adres adres2 = new Adres();
        System.out.println();
        System.out.println("Ulica: " + adres2.getUlica());
        System.out.println("Numer domu: " + adres2.getNumerDomu());
        System.out.println("Kod pocztowy: " + adres2.getKodPocztowy());
        System.out.println("Miasto: " + adres2.getMiasto());
    }

    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        String napis;
        napis = input.nextLine();
        return napis;
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba;
        liczba = input.nextInt();
        return liczba;
    }
}
