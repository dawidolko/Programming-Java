// Zad. 2 Napisz kalkulator obliczający: sumę, różnicę, iloczyn, iloraz, potęgę, pierwiastek,
//      oraz wartości funkcji trygonometrycznych dla zadanego kąta. Użyj biblioteki Math np. Math.Sin(2.5).
//      Proszę pamiętać, że wartości kąta podawane do funkcji mierzone są miarą łukową. Wyniki działania
//      algorytmów wyświetlaj na konsoli. Do obsługi menu proszę użyć konstrukcji switch-case oraz pętli while.

import java.util.Scanner;

public class zadanie2
{
    public static void main(String[] args) {Run();}

    public static void Run()
    {
        while (true)
        {
            Menu();
            int wybor = InputInt();
            switch (wybor)
            {
                case 1 -> Suma();
                case 2 -> Roznica();
                case 3 -> Iloczyn();
                case 4 -> Iloraz();
                case 5 -> Potega();
                case 6 -> Pierwiastek();
                case 7 -> FunTryg();
                case 8 -> Close();
                default -> Default();
            }
        }
    }

    public static void Menu()
    {
        System.out.println("\n\t\t\t==============================");
        System.out.println("\t\t\t=======   KALKULATOR   =======");
        System.out.println("\t\t\t==============================");
        System.out.println("\t\t\t1. Suma");
        System.out.println("\t\t\t2. Różnica");
        System.out.println("\t\t\t3. Iloczyn");
        System.out.println("\t\t\t4. Iloraz");
        System.out.println("\t\t\t5. Potęga");
        System.out.println("\t\t\t6. Pierwiastek");
        System.out.println("\t\t\t7. Wartości trygonometryczne (sin, cos, tg, ctg)");
        System.out.println("\t\t\t8. Wyjście");
        System.out.println("\t\t\t------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
    }

    public static void Suma()
    {
        System.out.print("\t\t\tSkładnik: ");
        double liczba1 = InputDouble();
        System.out.print("\t\t\tSkładnik: ");
        double liczba2 = InputDouble();
        double wynik = liczba1 + liczba2;
        System.out.format("\t\t\tSuma '%f + %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void Roznica()
    {
        System.out.print("\t\t\tOdjemna: ");
        double liczba1 = InputDouble();
        System.out.print("\t\t\tOdjemnik: ");
        double liczba2 = InputDouble();
        double wynik = liczba1 - liczba2;
        System.out.format("\t\t\tRóżnica '%f - %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void Iloczyn()
    {
        System.out.print("\t\t\tCzynnik: ");
        double liczba1 = InputDouble();
        System.out.print("\t\t\tCzynnik: ");
        double liczba2 = InputDouble();
        double wynik = liczba1 * liczba2;
        System.out.format("\t\t\tIloczyn '%f * %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void Iloraz()
    {
        System.out.print("\t\t\tDzielna: ");
        double liczba1 = InputDouble();
        System.out.print("\t\t\tDzielnik: ");
        double liczba2 = InputDouble();
        double wynik = liczba1 / liczba2;
        System.out.format("\t\t\tIloraz '%f / %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void Potega()
    {
        System.out.print("\t\t\tPodstawa: ");
        double liczba1 = InputDouble();
        System.out.print("\t\t\tWykładnik: ");
        double liczba2 = InputDouble();
        double wynik = Math.pow(liczba1, liczba2);
        System.out.format("\t\t\tPotęgowanie '%f ^ %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void Pierwiastek()
    {
        System.out.print("\t\t\tLiczba pierwiastkowana: ");
        double liczba1 = InputDouble();
        double wynik = Math.sqrt(liczba1);
        System.out.format("\t\t\tPierwiastek kwadratowy z '%f' wynosi '%f'\n", liczba1, wynik);
    }

    public static void FunTryg()
    {
        System.out.print("\t\t\tMiara kąta w stopniach: ");
        double liczba1 = InputDouble();
        double sin = Math.sin(Math.toRadians(liczba1));
        double cos = Math.cos(Math.toRadians(liczba1));
        double tan, ctg;
        if ((liczba1 % 360) == 90 || (liczba1 % 360) == 270)
        {
            tan = Double.POSITIVE_INFINITY;
            ctg = 0;
        }
        else if ((liczba1 % 360) == 0 || (liczba1 % 360) == 180)
        {
            tan = 0;
            ctg = Double.POSITIVE_INFINITY;
        }
        else
        {
            tan = sin / cos;
            ctg = cos / sin;
        }
        System.out.format("\t\t\tWartość sinus z '%f stopni' wynosi '%f'\n", liczba1, sin);
        System.out.format("\t\t\tWartość cosinus z '%f stopni' wynosi '%f'\n", liczba1, cos);
        System.out.format("\t\t\tWartość tangens z '%f stopni' wynosi '%f'\n", liczba1, tan);
        System.out.format("\t\t\tWartość cotangens z '%f stopni' wynosi '%f'\n", liczba1, ctg);
    }

    public static void Close()
    {
        System.out.print("\t\t\tCzy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = InputString();
        if (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("\t\t\tKoniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("\t\t\tAnulowano wyjście");
        }
    }

    public static void Default()
    {
        System.out.println("\t\t\tBłędne dane, koniec programu");
        System.exit(0);
    }

    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        String wyraz = input.nextLine();
        return wyraz;
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }

    public static double InputDouble()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę rzeczywistą: ");
        double liczba = input.nextDouble();
        return liczba;
    }
}
