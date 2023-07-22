package Figury;

import java.util.Scanner;

public class Run
{
    public void Runs()
    {
        inicjalizacja();
        while (true)
        {
            menu();
            int choice = inputInt();
            switch (choice)
            {
                case 1 -> opis();
                case 2 -> pole();
                case 3 -> skaluj();
                case 4 -> przesun();
                case 5 -> wsrodku();
                case 6 -> end();
                default -> defaultChoice();
            }
        }
    }

    public void wypisz(int wartosc)
    {
        System.out.println("\nJaką wybierasz figurę?");
        System.out.println("1. Prostokąt");
        System.out.println("2. Kwadrat");
        System.out.println("3. Trójkąt");
        System.out.println("4. Okrąg");
        System.out.println("------------------------------");
        System.out.print("Wybierz odpowiednią operacje: ");
        int jaki = inputInt();
        switch (jaki)
        {
            case 1 -> prostokat(wartosc);
            case 2 -> kwadrat(wartosc);
            case 3 -> trojkat(wartosc);
            case 4 -> okrag(wartosc);
            default -> defaultChoice();
        }
    }

    public void opis()
    {
        int wartosc = 1;
        wypisz(wartosc);
    }

    public void pole()
    {
        int wartosc = 2;
        wypisz(wartosc);
    }

    public void skaluj()
    {
        int wartosc = 3;
        wypisz(wartosc);
    }

    public void przesun()
    {
        int wartosc = 4;
        okrag(wartosc);
    }

    public void wsrodku()
    {
        int wartosc = 5;
        okrag(wartosc);
    }

    public void prostokat(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz prostokat? Podaj liczbę z zakresu od " + 1 + " do " + prostokatTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > prostokatTab.length);
        if (wartosc == 1) System.out.println(prostokatTab[x - 1].opis() + "\n");
        else if (wartosc == 2) System.out.println(prostokatTab[x - 1].opis() + " ma pole powierzchni równe " + prostokatTab[x - 1].getPowierzchnia() + "\n");
        else if (wartosc == 3)
        {
            System.out.print("Podaj wartość skalowania: ");
            float skaluj = inputFloat();
            prostokatTab[x - 1].skaluj(skaluj);
        }
    }

    public void kwadrat(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kwadrat? Podaj liczbę z zakresu od " + 1 + " do " + kwadratTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kwadratTab.length);
        if (wartosc == 1) System.out.println(kwadratTab[x - 1].opis() + "\n");
        else if (wartosc == 2) System.out.println(kwadratTab[x - 1].opis() + " ma pole powierzchni równe " + kwadratTab[x - 1].getPowierzchnia() + "\n");
        else if (wartosc == 3)
        {
            System.out.print("Podaj wartość skalowania: ");
            float skaluj = inputFloat();
            kwadratTab[x - 1].skaluj(skaluj);
        }
    }

    public void trojkat(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz trójkąt? Podaj liczbę z zakresu od " + 1 + " do " + trojkatTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > trojkatTab.length);
        if (wartosc == 1) System.out.println(trojkatTab[x - 1].opis() + "\n");
        else if (wartosc == 2) System.out.println(trojkatTab[x - 1].opis() + " ma pole powierzchni równe " + trojkatTab[x - 1].getPowierzchnia() + "\n");
        else if (wartosc == 3)
        {
            System.out.print("Podaj wartość skalowania: ");
            float skaluj = inputFloat();
            trojkatTab[x - 1].skaluj(skaluj);
        }
    }

    public void okrag(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okragTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okragTab.length);
        if (wartosc == 1) System.out.println(okragTab[x - 1].opis() + "\n");
        else if (wartosc == 2) System.out.println(okragTab[x - 1].opis() + " ma pole powierzchni równe " + okragTab[x - 1].getPowierzchnia() + "\n");
        else if (wartosc == 3)
        {
            System.out.print("Podaj wartość skalowania: ");
            float skaluj = inputFloat();
            okragTab[x - 1].skaluj(skaluj);
        }
        else if (wartosc == 4)
        {
            double a, b;
            System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
            a = inputDouble();
            System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
            b = inputDouble();
            okragTab[x - 1].przesun(a,b);
        }
        else if (wartosc == 5)
        {
            double a, b;
            System.out.print("Podaj współrzędną 'x' punktu którego chcesz sprawdzić: ");
            a = inputDouble();
            System.out.print("Podaj współrzędną 'y' punktu którego chcesz sprawdzić: ");
            b = inputDouble();
            System.out.println("Czy punkt [" + a + "," + b + "] znajduje się w tym okręgu? - " + okragTab[x - 1].wPolu(new Punkt(a,b)));
        }
    }

    Punkt[] punktTab = new Punkt[3];
    Prostokat[] prostokatTab = new Prostokat[3];
    Kwadrat[] kwadratTab = new Kwadrat[3];
    Trojkat[] trojkatTab = new Trojkat[3];
    Okrag[] okragTab = new Okrag[3];
    public void inicjalizacja()
    {
        punktTab[0] = new Punkt(5, 7);
        punktTab[1] = new Punkt(1, 3);
        punktTab[2] = new Punkt(-3, 7);
        prostokatTab[0] = new Prostokat(3, 5, "fioletowy");
        prostokatTab[1] = new Prostokat(4, 7, "czerwony");
        prostokatTab[2] = new Prostokat(1, 3, "czarny");
        kwadratTab[0] = new Kwadrat(8, "morski");
        kwadratTab[1] = new Kwadrat(3, "miedziany");
        kwadratTab[2] = new Kwadrat(13, "mleczny");
        trojkatTab[0] = new Trojkat(6, 8, "żółty");
        trojkatTab[1] = new Trojkat(11, 8, "srebrny");
        trojkatTab[2] = new Trojkat(11, 1, "złoty");
        okragTab[0] = new Okrag(9, new Punkt(3,5), "zielony");
        okragTab[1] = new Okrag(2, new Punkt(1,0), "pomarańczowy");
        okragTab[2] = new Okrag(3, new Punkt(-6,-4), "biały");
    }

    public void menu()
    {
        System.out.println("\n==============================");
        System.out.println("=======   MENU OPCJI   =======");
        System.out.println("==============================");
        System.out.println("1. Wyświetl opis");
        System.out.println("2. Wyświetl pole");
        System.out.println("3. Skaluj figurę");
        System.out.println("4. Przesuń środek okręgu");
        System.out.println("5. Sprawdź czy dany punkt jest w polu");
        System.out.println("6. Wyjście");
        System.out.println("----------------------------------");
        System.out.print("Wybierz odpowiednią operacje: ");
    }

    public void end()
    {
        System.out.print("Czy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = inputString();
        if  (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("Koniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("Anulowano wyjście");
        }
    }

    public void defaultChoice()
    {
        System.out.println("Nie ma takiej opcji");
    }

    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        return number;
    }

    public float inputFloat()
    {
        Scanner input = new Scanner(System.in);
        float number;
        number = input.nextFloat();
        return number;
    }

    public double inputDouble()
    {
        Scanner input = new Scanner(System.in);
        double number;
        number = input.nextDouble();
        return number;
    }

    public String inputString()
    {
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        return word;
    }
}
