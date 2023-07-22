package Library;

import java.util.Objects;
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
                case 1 -> ksiazkiInfo();
                case 2 -> podrecznikiInfo();
                case 3 -> powiesciInfo();
                case 4 -> ksiegarnieInfo();
                case 5 -> klienciInfo();
                case 6 -> zawartosc();
                case 7 -> sprzedane();
                case 8 -> end();
                default -> defaultChoice();
            }
        }
    }

    public void ksiazkiInfo()
    {
        for (Ksiazka x : ksTab) { if (Objects.equals(x.getAdres().getMiejscowosc(),"N/A")) x.opis(); }
    }

    public void podrecznikiInfo()
    {
        for (Podrecznik x : poTab) { if (Objects.equals(x.getAdres().getMiejscowosc(),"N/A")) x.opis(); }
    }

    public void powiesciInfo()
    {
        for (Powiesc x : pwTab) { if (Objects.equals(x.getAdres().getMiejscowosc(),"N/A")) x.opis(); }
    }

    public void ksiegarnieInfo()
    {
        for (Ksiegarnia x : kgTab) { x.opis(); }
    }

    public void klienciInfo()
    {
        for (Klient x : klTab) { x.opis(); }
    }

    public void zawartosc()
    {
        for (Ksiazka x : ksTab) { if ((Objects.equals(x.getKlient().getImie(),"N/A")) && (!Objects.equals(x.getAdres().getMiejscowosc(),"N/A"))) x.opisKg(); }
        for (Podrecznik x : poTab) { if ((Objects.equals(x.getKlient().getImie(),"N/A")) && (!Objects.equals(x.getAdres().getMiejscowosc(),"N/A"))) x.opisKg(); }
        for (Powiesc x : pwTab) { if ((Objects.equals(x.getKlient().getImie(),"N/A")) && (!Objects.equals(x.getAdres().getMiejscowosc(),"N/A"))) x.opisKg(); }
    }

    public void sprzedane()
    {
        for (Ksiazka x : ksTab) { if ((!Objects.equals(x.getKlient().getImie(),"N/A")) && (!Objects.equals(x.getAdres().getMiejscowosc(),"N/A"))) x.zakup(); }
        for (Podrecznik x : poTab) { if ((!Objects.equals(x.getKlient().getImie(),"N/A")) && (!Objects.equals(x.getAdres().getMiejscowosc(),"N/A"))) x.zakup(); }
        for (Powiesc x : pwTab) { if ((!Objects.equals(x.getKlient().getImie(),"N/A")) && (!Objects.equals(x.getAdres().getMiejscowosc(),"N/A"))) x.zakup(); }
    }

    Ksiegarnia[] kgTab = new Ksiegarnia[5];
    Ksiazka[] ksTab = new Ksiazka[10];
    Podrecznik[] poTab = new Podrecznik[10];
    Powiesc[] pwTab = new Powiesc[10];
    Klient[] klTab = new Klient[5];
    public void inicjalizacja()
    {
        kgTab[0] = new Ksiegarnia("Grunwaldzka", "6a", "39-100", "Ropczyce");
        kgTab[1] = new Ksiegarnia("Rynek", "7b", "31-300", "Rzeszów");
        kgTab[2] = new Ksiegarnia("Fryderyka Chopina", "245", "21-786", "Dębica");
        kgTab[3] = new Ksiegarnia("Cicha", "362", "47-209", "Mielec");
        kgTab[4] = new Ksiegarnia("Niepodległości", "76", "68-092", "Sanok");

        klTab[0] = new Klient("Jan", "Kowalski", "04211854391");
        klTab[1] = new Klient("Monika", "Januszewska", "98061232342");
        klTab[2] = new Klient("Michalina", "Młoda", "76032923308");
        klTab[3] = new Klient("Oskar", "Mały", "03261507329");
        klTab[4] = new Klient("Michał", "Słaby", "59020734547");

        ksTab[0] = new Ksiazka("Ogólna teoria względności", "Albert Einstain", 1934, 1023);
        ksTab[1] = new Ksiazka("Ogólna teoria względności", "Albert Einstain", 1934, 1023, kgTab[0]);
        ksTab[2] = new Ksiazka("Ogólna teoria względności", "Albert Einstain", 1934, 1023, kgTab[2]);
        ksTab[3] = new Ksiazka("Ogólna teoria względności", "Albert Einstain", 1934, 1023, kgTab[2], klTab[0]);
        ksTab[4] = new Ksiazka("Dzieje Polski", "Dorota Herman-Robak", 2022, 54);
        ksTab[5] = new Ksiazka("Dzieje Polski", "Dorota Herman-Robak", 2022, 54, kgTab[3]);
        ksTab[6] = new Ksiazka("Dzieje Polski", "Dorota Herman-Robak", 2022, 54, kgTab[4]);
        ksTab[7] = new Ksiazka("Smaki Makłowicza", "Robert Makłowicz", 2017, 184);
        ksTab[8] = new Ksiazka("Smaki Makłowicza", "Robert Makłowicz", 2017, 184, kgTab[0]);
        ksTab[9] = new Ksiazka("Smaki Makłowicza", "Robert Makłowicz", 2017, 184, kgTab[1]);

        poTab[0] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2014, 222, "Podstawowa", 7);
        poTab[1] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2014, 222, "Podstawowa", 7, kgTab[1]);
        poTab[2] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2014, 222, "Podstawowa", 7, kgTab[1], klTab[0]);
        poTab[3] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2014, 222, "Podstawowa", 7, kgTab[4]);
        poTab[4] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2014, 222, "Podstawowa", 7, kgTab[4], klTab[3]);
        poTab[5] = new Podrecznik("Chemia wokół nas", "Maria Słodowska-Curlisz", 2007, 190, "Ponadpodstawowa", 1);
        poTab[6] = new Podrecznik("Chemia wokół nas", "Maria Słodowska-Curlisz", 2007, 190, "Ponadpodstawowa", 1, kgTab[1]);
        poTab[7] = new Podrecznik("Chemia wokół nas", "Maria Słodowska-Curlisz", 2007, 190, "Ponadpodstawowa", 1, kgTab[4]);
        poTab[8] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2012, 256, "Podstawowa", 8);
        poTab[9] = new Podrecznik("Z fizyką w przyszłość", "Magdalena Mądra", 2012, 256, "Podstawowa", 8, kgTab[1]);

        pwTab[0] = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", 1973, 350, "Powieść przygodowa");
        pwTab[1] = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", 1973, 350, "Powieść przygodowa", kgTab[0]);
        pwTab[2] = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", 1973, 350, "Powieść przygodowa", kgTab[0], klTab[4]);
        pwTab[3] = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", 1973, 350, "Powieść przygodowa", kgTab[3]);
        pwTab[4] = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", 1973, 350, "Powieść przygodowa", kgTab[3], klTab[1]);
        pwTab[5] = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", 1973, 350, "Powieść przygodowa", kgTab[3], klTab[2]);
        pwTab[6] = new Powiesc("Dziady", "Adam Mickiewicz", 1822, 418, "Dramat");
        pwTab[7] = new Powiesc("Dziady", "Adam Mickiewicz", 1822, 418, "Dramat", kgTab[2]);
        pwTab[8] = new Powiesc("Dziady", "Adam Mickiewicz", 1822, 418, "Dramat", kgTab[2], klTab[1]);
        pwTab[9] = new Powiesc("Dziady", "Adam Mickiewicz", 1822, 418, "Dramat", kgTab[2], klTab[2]);
    }

    public void menu()
    {
        System.out.println("\n==============================");
        System.out.println("=======   MENU OPCJI   =======");
        System.out.println("==============================");
        System.out.println("1. Informacje o książkach");
        System.out.println("2. Informacje o podręcznikach");
        System.out.println("3. Informacje o powieściach");
        System.out.println("4. Informacje o księgarniach");
        System.out.println("5. Informacje o klientach");
        System.out.println("6. Informacje o zawartości księgarni");
        System.out.println("7. Informacje o sprzedanych zawartościach księgarni");
        System.out.println("8. Wyjście");
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
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);
    }

    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
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
