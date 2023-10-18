package Species;

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
                case 1 -> FullName();
                case 2 -> Haploid();
                case 3 -> Print();
                case 4 -> Clone();
                case 5 -> End();
                default -> Default();
            }
        }
    }

    Species[] speciesTab = new Species[10];
    public void Initialization()
    {
        speciesTab[0] = new Species("Grzyb", "Plesnius splesnialy", 26,9,"Groźny i niebezpieczny dla zdrowia");
        speciesTab[1] = new Species("Ptak", "Cardinalis cardinalisto", 46,11,"Posiada szkarłatne pióra");
        speciesTab[2] = new Species("Królik", "Kicus skoczny", 44,13,"Potrafi skakać na trzy metry w górę");
        speciesTab[3] = new Species("Bakteria", "Salmonella", 2,2,"Zatruwa układ pokarmowy");
        speciesTab[4] = new Species("Człowiek", "Homo sapiens", 22,9,"Żyje ich ponad 8 miliardów na świecie");
        speciesTab[5] = new Species("Pomidor", "Czerwienius olbrzymus", 58,6,"Jadalne czerwone warzywo");
        speciesTab[6] = new Species("Wirus", "COVID-19", 6,1,"Szybko zakaża");
        speciesTab[7] = new Species();
        speciesTab[8] = new Species();
        speciesTab[9] = new Species();
    }

    public void FullName()
    {
        int x;
        do
        {
            System.out.print("\tKtóry organizm wybierasz? Podaj liczbę z zakresu od " + 1 + " do " + speciesTab.length + ": ");
            x = InputInt();
        } while (x <= 0 || x > speciesTab.length);
        speciesTab[x - 1].FullName();
    }

    public void Haploid()
    {
        int x;
        do
        {
            System.out.print("\tKtóry organizm wybierasz? Podaj liczbę z zakresu od " + 1 + " do " + speciesTab.length + ": ");
            x = InputInt();
        } while (x <= 0 || x > speciesTab.length);
        speciesTab[x - 1].Haploid();
    }

    public void Print()
    {
        int x;
        do
        {
            System.out.print("\tKtóry organizm wybierasz? Podaj liczbę z zakresu od " + 1 + " do " + speciesTab.length + ": ");
            x = InputInt();
        } while (x <= 0 || x > speciesTab.length);
        speciesTab[x - 1].Print();
    }

    public void Clone()
    {
        int x;
        do
        {
            System.out.print("\tKtóry organizm wybierasz? Podaj liczbę z zakresu od " + 1 + " do " + speciesTab.length + ": ");
            x = InputInt();
        } while (x <= 0 || x > speciesTab.length);
        int y = 0;
        while (y < speciesTab.length && speciesTab[y].getGenusName() != null)
        {
            y += 1;
        }
        if (y < 10)
        {
            // speciesTab[y] = speciesTab[x -1];
            speciesTab[y].Clone(speciesTab[x - 1]);
            System.out.println("\tPomyślnie skopiowano obiekt");
        }
        else
        {
            System.out.println("\tNie udało się skopiować obiektu, wszystkie miejsca w tablicy są zajęte");
        }
    }

    public void Menu()
    {
        System.out.println("\n\t======================");
        System.out.println("\t===   MENU OPCJI   ===");
        System.out.println("\t======================");
        System.out.println("\t1. Wyświetl pełną nazwę");
        System.out.println("\t2. Wyświetl haploidalną liczbę chromosomów n");
        System.out.println("\t3. Wyświetl wszystkie dane");
        System.out.println("\t4. Sklonuj obiekt");
        System.out.println("\t5. Wyjście");
        System.out.println("\t----------------------");
        System.out.print("\tWybierz odpowiednią operacje: ");
    }

    public void End()
    {
        System.out.print("\tCzy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = InputString();
        if (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
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
