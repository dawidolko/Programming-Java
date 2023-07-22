package Transport;

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
                case 2 -> start();
                case 3 -> stop();
                case 4 -> end();
                default -> defaultChoice();
            }
        }
    }

    public void wypisz(int wartosc)
    {
        System.out.println("\nJaki wybierasz środek transportu?");
        System.out.println("1. Samochód");
        System.out.println("2. Rower");
        System.out.println("3. Statek");
        System.out.println("4. Kajak");
        System.out.println("5. Samolot");
        System.out.println("6. Paralotnia");
        System.out.println("------------------------------");
        System.out.print("Wybierz odpowiednią operacje: ");
        int jaki = inputInt();
        switch (jaki)
        {
            case 1 -> samochodOpis(wartosc);
            case 2 -> rowerOpis(wartosc);
            case 3 -> statekOpis(wartosc);
            case 4 -> kajakOpis(wartosc);
            case 5 -> samolotOpis(wartosc);
            case 6 -> paralotniaOpis(wartosc);
            default -> defaultChoice();
        }
    }

    public void opis()
    {
        int wartosc = 0;
        wypisz(wartosc);
    }

    public void start()
    {
        int wartosc = 1;
        wypisz(wartosc);
    }

    public void stop()
    {
        int wartosc = 2;
        wypisz(wartosc);
    }

    public void samochodOpis(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz samochód? Podaj liczbę z zakresu od " + 1 + " do " + samochodTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > samochodTab.length);
        System.out.print(samochodTab[x - 1].opis());
        if (wartosc == 1) System.out.println(samochodTab[x - 1].jedz());
        else if (wartosc == 2) System.out.println(samochodTab[x - 1].stoj());
        else System.out.println();
    }

    public void rowerOpis(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz rower? Podaj liczbę z zakresu od " + 1 + " do " + rowerTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > rowerTab.length);
        System.out.print(rowerTab[x - 1].opis());
        if (wartosc == 1) System.out.println(rowerTab[x - 1].jedz());
        else if (wartosc == 2) System.out.println(rowerTab[x - 1].stoj());
        else System.out.println();
    }

    public void statekOpis(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz statek? Podaj liczbę z zakresu od " + 1 + " do " + statekTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > statekTab.length);
        System.out.print(statekTab[x - 1].opis());
        if (wartosc == 1) System.out.println(statekTab[x - 1].plyn());
        else if (wartosc == 2) System.out.println(statekTab[x - 1].stoj());
        else System.out.println();
    }

    public void kajakOpis(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kajak? Podaj liczbę z zakresu od " + 1 + " do " + kajakTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kajakTab.length);
        System.out.print(kajakTab[x - 1].opis());
        if (wartosc == 1) System.out.println(kajakTab[x - 1].plyn());
        else if (wartosc == 2) System.out.println(kajakTab[x - 1].stoj());
        else System.out.println();
    }

    public void samolotOpis(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Który wybierasz samolot? Podaj liczbę z zakresu od " + 1 + " do " + samolotTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > samolotTab.length);
        System.out.print(samolotTab[x - 1].opis());
        if (wartosc == 1) System.out.println(samolotTab[x - 1].lec());
        else if (wartosc == 2) System.out.println(samolotTab[x - 1].stoj());
        else System.out.println();
    }

    public void paralotniaOpis(int wartosc)
    {
        int x;
        do
        {
            System.out.print("Którą wybierasz paralotnie? Podaj liczbę z zakresu od " + 1 + " do " + paralotniaTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > paralotniaTab.length);
        System.out.print(paralotniaTab[x - 1].opis());
        if (wartosc == 1) System.out.println(paralotniaTab[x - 1].lec());
        else if (wartosc == 2) System.out.println(paralotniaTab[x - 1].stoj());
        else System.out.println();
    }

    Samochod[] samochodTab = new Samochod[5];
    Rower[] rowerTab = new Rower[5];
    Statek[] statekTab = new Statek[5];
    Kajak[] kajakTab = new Kajak[5];
    Samolot[] samolotTab = new Samolot[5];
    Paralotnia[] paralotniaTab = new Paralotnia[5];
    public void inicjalizacja()
    {
        samochodTab[0] = new Samochod("Honda", "Accord", 1.9, 1.8, 234000, 144);
        samochodTab[1] = new Samochod("Toyota", "Corolla", 1.4, 1.5, 295860, 96);
        samochodTab[2] = new Samochod("Nissan", "Trade", 3.2, 2.6, 410964, 250);
        samochodTab[3] = new Samochod("Koenigsegg", "Regera", 5, 1.47, 12856, 1119);
        samochodTab[4] = new Samochod("Lamborghini", "Sesto Elemento", 5.2, 0.99, 43789, 570);

        rowerTab[0] = new Rower("Kross", "Hexagon", 11.2);
        rowerTab[1] = new Rower("Kross", "Sosha", 9.3);
        rowerTab[2] = new Rower("Ghost", "Runner", 8.1);
        rowerTab[3] = new Rower("Romet", "Do miasta", 10.8);
        rowerTab[4] = new Rower("Monis", "Do miasta", 10.3);

        statekTab[0] = new Statek("Żegluga świnoujście", 242, 64, 16, 65);
        statekTab[1] = new Statek("Jan Heweliusz", 765, 112, 27, 69);
        statekTab[2] = new Statek("Stena Estrid", 1000, 145, 29, 94);
        statekTab[3] = new Statek("Kolossus", 2350, 259, 59, 144);
        statekTab[4] = new Statek("Martini", 630, 125, 31, 62);

        kajakTab[0] = new Kajak("Herman", 2);
        kajakTab[1] = new Kajak("Żeglownik", 2);
        kajakTab[2] = new Kajak("Urubus", 1);
        kajakTab[3] = new Kajak("Solinka", 2);
        kajakTab[4] = new Kajak("Jack", 1);

        samolotTab[0] = new Samolot("LOT 2137", 242, 79, 72, 24);
        samolotTab[1] = new Samolot("Boeing 747", 660, 78,76,19);
        samolotTab[2] = new Samolot("Boeing 747", 333, 59, 70, 19);
        samolotTab[3] = new Samolot("Airbus A380", 550, 66, 72, 23);
        samolotTab[4] = new Samolot("Flotus 091", 142, 49, 61, 16);

        paralotniaTab[0] = new Paralotnia("Lotus", 2);
        paralotniaTab[1] = new Paralotnia("Dżownisiuś", 3);
        paralotniaTab[2] = new Paralotnia("Radawa", 2);
        paralotniaTab[3] = new Paralotnia("Gazela", 2);
        paralotniaTab[4] = new Paralotnia("Morbius", 1);
    }

    public void menu()
    {
        System.out.println("\n==============================");
        System.out.println("=======   MENU OPCJI   =======");
        System.out.println("==============================");
        System.out.println("1. Informacje o środkach transportu");
        System.out.println("2. Polecenie start");
        System.out.println("3. Polecenie stop");
        System.out.println("4. Wyjście");
        System.out.println("------------------------------");
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
        System.out.println("Nie istnieje taka opcja");
    }

    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
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
