// Zad. 6 Wykorzystując zadanie z poprzednich zajęć dotyczące Kalkulatora podstawowych obliczeń oraz
//      Kalkulatora działań na tablicach, zmodyfikuj kody tak aby obsłużyć niezbędne wyjątki.

package ZadaniaException.zadanie6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class zadanie6
{
    public static void main(String[] args) { run(); }

    public static void run()
    {
        double[] tab = poczatkowe();
        while (true)
        {
            menu();
            int wybor = wybor();
            switch (wybor)
            {
                case 1 -> suma();
                case 2 -> roznica();
                case 3 -> iloczyn();
                case 4 -> iloraz();
                case 5 -> potega();
                case 6 -> pierwiastek();
                case 7 -> funTryg();
                case 8 -> wyswietl(tab);
                case 9 -> wyswietlN(tab);
                case 10 -> coDrugi(tab, 1);
                case 11 -> coDrugi(tab, 2);
                case 12 -> sumaTab(tab);
                case 13 -> iloczynTab(tab);
                case 14 -> sredniaTab(tab);
                case 15 -> minTab(tab);
                case 16 -> maksTab(tab);
                case 17 -> close();
            }
        }
    }

    public static void menu()
    {
        System.out.println("\n");
        System.out.println("\n\t\t\t================================================");
        System.out.println("\t\t\t================   MENU OPCJI   ================");
        System.out.println("\t\t\t================================================");
        System.out.println("\t\t\t1. Oblicz sumę");
        System.out.println("\t\t\t2. Oblicz różnicę");
        System.out.println("\t\t\t3. Oblicz iloczyn");
        System.out.println("\t\t\t4. Oblicz iloraz");
        System.out.println("\t\t\t5. Oblicz potęgę");
        System.out.println("\t\t\t6. Oblicz pierwiastek stopnia drugiego");
        System.out.println("\t\t\t7. Wyświetl wartości trygonometryczne (sin, cos, tg, ctg)");
        System.out.println("\t\t\t8. Wyświetl tablicę od pierwszego do ostatniego indeksu");
        System.out.println("\t\t\t9. Wyświetl tablicę od ostatniego do pierwszego indeksu");
        System.out.println("\t\t\t10. Wyświetl tablicę o nieparzystych indeksach");
        System.out.println("\t\t\t11. Wyświetl tablicę o parzystych indeksach");
        System.out.println("\t\t\t12. Wyświetl sumę elementów tablicy");
        System.out.println("\t\t\t13. Wyświetl iloczyn elementów tablicy");
        System.out.println("\t\t\t14. Wyświetl wartość średnią tablicy");
        System.out.println("\t\t\t15. Wyświetl wartość minimalną tablicy");
        System.out.println("\t\t\t16. Wyświetl wartość maksymalną tablicy");
        System.out.println("\t\t\t17. Wyjście");
        System.out.println("\t\t\t------------------------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
    }

    public static double[] poczatkowe()
    {
        System.out.print("\t\t\tPodaj, ile chcesz wprowadzić liczb do tablicy: ");
        int ileLiczb = (int) liczba1();
        while (ileLiczb <= 0)
        {
            System.out.print("\t\t\t\tBłędne dane, podaj wartość ponownie: ");
            ileLiczb = (int) liczba1();
        }
        double[] tab = new double[ileLiczb];
        int x = 0;
        while (x < ileLiczb)
        {
            System.out.print("\t\t\tPodaj liczbe rzeczywistą dla " + x + " indeksu: ");
            double liczbaWprowadz = liczba1();
            tab[x] = liczbaWprowadz;
            x += 1;
        }
        return tab;
    }

    public static int wybor()
    {
        int wybor = 0;
        try
        {
            wybor = inputInt();
            if (wybor <= 0 || wybor >= 18)
            {
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.print("\t\t\t\tBłędne dane, podaj wartość ponownie: ");
            wybor = wybor();
        }
        return wybor;
    }

    public static double liczba1()
    {
        double liczba1 = 0;
        try
        {
            liczba1 = inputDouble();
        }
        catch (InputMismatchException e)
        {
            System.out.print("\t\t\t\tBłędne dane, podaj wartość ponownie: ");
            liczba1 = liczba1();
        }
        return liczba1;
    }

    public static double liczba2()
    {
        double liczba2 = 0;
        try
        {
            liczba2 = inputDouble();
        }
        catch (InputMismatchException e)
        {
            System.out.print("\t\t\t\tBłędne dane, podaj wartość ponownie: ");
            liczba2 = liczba2();
        }
        return liczba2;
    }

    public static void suma()
    {
        System.out.print("\t\t\tSkładnik: ");
        double liczba1 = liczba1();
        System.out.print("\t\t\tSkładnik: ");
        double liczba2 = liczba2();
        double wynik = liczba1 + liczba2;
        System.out.format("\t\t\tSuma '%f + %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void roznica()
    {
        System.out.print("\t\t\tOdjemna: ");
        double liczba1 = liczba1();
        System.out.print("\t\t\tOdjemnik: ");
        double liczba2 = liczba2();
        double wynik = liczba1 - liczba2;
        System.out.format("\t\t\tRóżnica '%f - %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void iloczyn()
    {
        System.out.print("\t\t\tCzynnik: ");
        double liczba1 = liczba1();
        System.out.print("\t\t\tCzynnik: ");
        double liczba2 = liczba2();
        double wynik = liczba1 * liczba2;
        System.out.format("\t\t\tIloczyn '%f * %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void iloraz()
    {
        System.out.print("\t\t\tDzielna: ");
        double liczba1 = liczba1();
        System.out.print("\t\t\tDzielnik: ");
        double liczba2 = liczba2();;
        while (liczba2 == 0)
        {
            System.out.print("\t\t\t\tBłędne dane, podaj wartość ponownie: ");
            liczba2 = liczba2();
        }
        double wynik = liczba1 / liczba2;
        System.out.format("\t\t\tIloraz '%f / %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void potega()
    {
        System.out.print("\t\t\tPodstawa: ");
        double liczba1 = liczba1();
        System.out.print("\t\t\tWykładnik: ");
        double liczba2 = liczba2();
        double wynik = Math.pow(liczba1, liczba2);
        System.out.format("\t\t\tPotęgowanie '%f ^ %f' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void pierwiastek()
    {
        System.out.print("\t\t\tLiczba pierwiastkowana: ");
        double liczba1 = liczba1();
        double wynik = Math.sqrt(liczba1);
        System.out.format("\t\t\tPierwiastek kwadratowy z '%f' wynosi '%f'\n", liczba1, wynik);
    }

    public static void funTryg()
    {
        System.out.print("\t\t\tMiara kąta w stopniach: ");
        double liczba1 = liczba1();
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

    public static void wyswietl(double[] tab)
    { System.out.println("\t\t\t" + Arrays.toString(tab)); }

    public static void wyswietlN(double[] tab)
    {
        double[] tabN = new double[tab.length];
        for(int x = tab.length - 1; x >= 0; x--)
        {
            tabN[tabN.length - 1 - x] = tab[x];
        }
        System.out.println("\t\t\t" + Arrays.toString(tabN));
    }

    public static void coDrugi(double[] tab, int wybor)
    {
        int x = 0;
        if (wybor == 1) { x += 1; }
        int dlugosc = tab.length/2;
        if ((tab.length % 2 == 1) && (wybor == 2)) { dlugosc += 1; }
        double[] tabN = new double[dlugosc];
        while(x/2 < dlugosc)
        {
            try
            {
                tabN[x/2] = tab[x];
                x += 2;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                break;
            }
        }
        System.out.println("\t\t\t" + Arrays.toString(tabN));
    }

    public static void sumaTab(double[] tab)
    {
        double suma = Arrays.stream(tab).sum();
        System.out.println("\t\t\tSuma elementów w tablicy wynosi: " + suma);
    }

    public static void iloczynTab(double[] tab)
    {
        double iloczyn = 1;
        for(double x : tab)
        {
            iloczyn *= x;
        }
        System.out.println("\t\t\tIloczyn elementów tablicy wynosi: " + iloczyn);
    }

    public static void sredniaTab(double[] tab)
    {
        OptionalDouble srednia = Arrays.stream(tab).average();
        System.out.println("\t\t\tWartość średnia tablicy wynosi: " + srednia.toString().substring(15, srednia.toString().length() - 1 ));
    }

    public static void minTab(double[] tab)
    {
        OptionalDouble min = Arrays.stream(tab).min();
        System.out.println("\t\t\tWartość minimalna w tablicy wynosi: " + min.toString().substring(15, min.toString().length() - 1 ));
    }

    public static void maksTab(double[] tab)
    {
        OptionalDouble max = Arrays.stream(tab).max();
        System.out.println("\t\t\tWartość maksymalna w tablicy wynosi: " + max.toString().substring(15, max.toString().length() - 1 ));
    }

    public static void close()
    {
        System.out.print("\t\t\tCzy na pewno chcesz wyjść z programu? ( T | t ): ");
        String znak = inputString();
        if (znak.equals("t") || znak.equals("T"))
        {
            System.out.println("\t\t\tKoniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("\t\t\tAnulowano wyjście");
        }
    }

    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static double inputDouble()
    {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
