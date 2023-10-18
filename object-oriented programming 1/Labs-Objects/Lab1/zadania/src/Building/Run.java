package Building;

import java.util.Scanner;

public class Run
{
    public void Runs()
    {
        Initialization();
        while (true)
        {
            Menu();
            int choice = InputInt();
            switch (choice)
            {
                case 1 -> Info();
                case 2 -> HowOld();
                case 3 -> End();
                default -> Default();
            }
        }
    }

    Building[] buildingsTab = new Building[5];
    public void Initialization()
    {
        buildingsTab[0] = new Building("Uniwersytet Rzeszowski - budynek A0", 2010,3);
        buildingsTab[1] = new Building("Uniwersytet Rzeszowski - budynek A1", 2005,2);
        buildingsTab[2] = new Building("Uniwersytet Rzeszowski - budynek A2", 2007,3);
        buildingsTab[3] = new Building("Uniwersytet Rzeszowski - budynek A3", 2001,5);
        buildingsTab[4] = new Building("Galeria Milenium Hall", 2011,2);
    }

    public void Info()
    {
        int x;
        do
        {
            System.out.print("\tKtóry wybierasz budynek? Podaj liczbę z zakresu od " + 1 + " do " + buildingsTab.length + ": ");
            x = InputInt();
        } while (x <= 0 || x > buildingsTab.length);
        buildingsTab[x - 1].Print();
    }

    public void HowOld()
    {
        int x;
        do
        {
            System.out.print("\tKtóry wybierasz budynek? Podaj liczbę z zakresu od " + 1 + " do " + buildingsTab.length + ": ");
            x = InputInt();
        } while (x <= 0 || x > buildingsTab.length);
        buildingsTab[x - 1].HowOld();
    }

    public void Menu()
    {
        System.out.println("\n\t======================");
        System.out.println("\t===   MENU OPCJI   ===");
        System.out.println("\t======================");
        System.out.println("\t1. Wyświetlanie informacji o budynkach");
        System.out.println("\t2. Policzenie, ile lat ma budynek");
        System.out.println("\t3. Wyjście");
        System.out.println("\t----------------------");
        System.out.print("\tWybierz odpowiednią operacje: ");
    }

    public void End()
    {
        System.out.print("\tCzy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = InputString();
        if  (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("\tKoniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("\tAnulowano wyjście");
        }
    }

    public void Default()
    {
        System.out.println("\tBłędne dane, koniec programu");
        System.exit(0);
    }

    public int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    public String InputString()
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        return word;
    }
}
