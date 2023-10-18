// Zad. 1 Na podstawie przykładów, należy stworzyć program z następującymi funkcjami:
//          1. Funkcja tworząca tabelę z listą obecności studentów na zajęciach on-line. Tabela powinna obejmować:
//              a. Prowadzącego,
//              b. Nazwę przedmiotu,
//              c. Imię i nazwisko studenta,
//              d. Numer albumu,
//              e. Datę zajęć,
//              f. Czas zalogowania,
//              g. Czas wylogowania,
//              h. Długość czasu spędzonego na sesji,
//          2. Funkcję dodającą studenta do listy obecności.
//             Podczas dodawania powinny być uzupełnione dane dotyczące obecności.
//          3. Funkcję wyświetlającą obecności wszystkich studentów na zajęciach.

import java.sql.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
import static java.sql.Time.valueOf;

public class zadanie1
{
    public static void main(String[] args)
    {
        System.out.println("\nBaza danych została pomyślnie otwarta\n\n");
        while (true)
        {
            menu();
            int choice = inputInt();
            switch (choice)
            {
                case 1 -> tworzenieTablicy();
                case 2 -> dodajStudenta();
                case 3 -> wyswietl();
                case 4 -> end();
                default -> defaultChoice();
            }
        }
    }

    public static void tworzenieTablicy()
    {
        Connection polaczenie = null;
        Statement deklaracja = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:zadanie1.db");
            deklaracja = polaczenie.createStatement();
            String sql = "CREATE TABLE LISTA_OBECNOSCI_STUDENTOW " +
                    "(IMIE_I_NAZWISKO_PROWADZACEGO TEXT NOT NULL, " +
                    " NAZWA_PRZEDMIOTU TEXT NOT NULL, " +
                    " IMIE_I_NAZWISKO_STUDENTA TEXT NOT NULL, " +
                    " NUMER_ALBUMU TEXT NOT NULL, " +
                    " DATA_ZAJEC TEXT NOT NULL, " +
                    " CZAS_ZALOGOWANIA TIME NOT NULL, " +
                    " CZAS_WYLOGOWANIA TIME NOT NULL, " +
                    " DLUGOSC_SESJI TIME NOT NULL)";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Janusz Kowalski', 'Programowanie Obiektowe', 'Robert Sowa', '125189', " +
                    "'2023-31-05', '13:14:53', '14:44:56', '01:30:03');";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Janusz Kowalski', 'Programowanie Obiektowe', 'Maksymilian Przypadek', " +
                    "'125155', '2023-31-05', '13:12:23', '14:46:57', '01:34:34');";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Janusz Kowalski', 'Programowanie Obiektowe', 'Piotr Rojek', '125159', " +
                    "'2023-31-05', '13:18:12', '14:45:04', '01:26:52');";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Mirosław Skarga', 'Analiza matematyczna', 'Robert Sowa', '125189', " +
                    "'2023-07-06', '09:46:34', '11:13:21', '01:26:47');";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Mirosław Skarga', 'Analiza matematyczna', 'Maksymilian Przypadek', " +
                    "'125155', '2023-07-06', '09:41:48', '11:13:23', '01:31:35');";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Mirosław Skarga', 'Analiza matematyczna', 'Piotr Rojek', '125159', " +
                    "'2023-07-06', '09:44:01', '11:13:56', '01:29:55');";
            deklaracja.executeUpdate(sql);
            sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('Mirosław Skarga', 'Analiza matematyczna', 'Monika Kurowska', '122874', " +
                    "'2023-07-06', '09:44:56', '11:14:09', '01:29:13');";
            deklaracja.executeUpdate(sql);
            deklaracja.close();;
            polaczenie.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Tablica została pomyślnie utworzona\n");
    }

    public static void dodajStudenta()
    {
        Connection polaczenie = null;
        Statement deklaracja = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:zadanie1.db");
            polaczenie.setAutoCommit(false);
            deklaracja = polaczenie.createStatement();
            System.out.print("Podaj imię i nazwisko prowadzącego zajęcia: ");
            String imie_i_nazwisko_prowadzacego = inputString();
            System.out.print("Podaj nazwę przedmiotu: ");
            String nazwa_przedmiotu = inputString();
            System.out.print("Podaj imię i nazwisko studenta: ");
            String imie_i_nazwisko_studenta = inputString();
            System.out.print("Podaj numer albumu studenta: ");
            String numer_albumu = inputString();
            System.out.print("Podaj datę zajęć (w postaci: RRRR-MM-DD): ");
            String data_zajec = inputString();
            System.out.print("Podaj czas zalogowania na zajęcia (w postaci: GG:MM:SS): ");
            String czas_zalogowania = inputString();
            System.out.print("Podaj czas wylogowania z zajęć (w postaci: GG:MM:SS): ");
            String czas_wylogowania = inputString();
            LocalTime localTime1 = LocalTime.parse(czas_zalogowania);
            LocalTime localTime2 = LocalTime.parse(czas_wylogowania);
            long sekundy = Duration.between(localTime1, localTime2).toSeconds();
            LocalTime localTime3 = LocalTime.ofSecondOfDay(sekundy);
            String sql = "INSERT INTO LISTA_OBECNOSCI_STUDENTOW (IMIE_I_NAZWISKO_PROWADZACEGO,NAZWA_PRZEDMIOTU," +
                    "IMIE_I_NAZWISKO_STUDENTA,NUMER_ALBUMU,DATA_ZAJEC,CZAS_ZALOGOWANIA,CZAS_WYLOGOWANIA," +
                    "DLUGOSC_SESJI) VALUES ('" + imie_i_nazwisko_prowadzacego + "', '" + nazwa_przedmiotu + "', '" +
                    imie_i_nazwisko_studenta + "', '" + numer_albumu + "', '" + data_zajec + "', '" +
                    czas_zalogowania + "', '" + czas_wylogowania + "', '" + localTime3 + "');";
            deklaracja.executeUpdate(sql);
            deklaracja.close();
            polaczenie.commit();
            polaczenie.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Rekord został pomyślnie utworzony\n");
    }

    public static void wyswietl()
    {
        Connection polaczenie = null;
        Statement deklaracja = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:zadanie1.db");
            polaczenie.setAutoCommit(false);
            deklaracja = polaczenie.createStatement();
            ResultSet rekord = deklaracja.executeQuery( "SELECT * FROM LISTA_OBECNOSCI_STUDENTOW;" );
            System.out.println();
            while (rekord.next())
            {
                String imie_i_nazwisko_prowadzacego = rekord.getString("imie_i_nazwisko_prowadzacego");
                String nazwa_przedmiotu = rekord.getString("nazwa_przedmiotu");
                String imie_i_nazwisko_studenta = rekord.getString("imie_i_nazwisko_studenta");
                String numer_albumu = rekord.getString("numer_albumu");
                String data_zajec = rekord.getString("data_zajec");
                Time czas_zalogowania = valueOf(rekord.getString("czas_zalogowania"));
                Time czas_wylogowania = valueOf(rekord.getString("czas_wylogowania"));
                Time dlugosc_sesji = valueOf(rekord.getString("dlugosc_sesji"));

                System.out.println( "Imię i nazwisko prowadzącego = " + imie_i_nazwisko_prowadzacego );
                System.out.println( "Nazwa przedmiotu = " + nazwa_przedmiotu );
                System.out.println( "Imię i nazwisko studenta = " + imie_i_nazwisko_studenta );
                System.out.println( "Numer albumu = " + numer_albumu );
                System.out.println( "Data zajęć = " + data_zajec );
                System.out.println( "Czas zalogowania = " + czas_zalogowania );
                System.out.println( "Czas wylogowania = " + czas_wylogowania );
                System.out.println( "Długość sesji = " + dlugosc_sesji );
                System.out.println();
            }
            rekord.close();
            deklaracja.close();
            polaczenie.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void menu()
    {
        System.out.println("\n==============================");
        System.out.println("=======   MENU OPCJI   =======");
        System.out.println("==============================");
        System.out.println("1. Stwórz tablicę listy obecności studentów");
        System.out.println("2. Dodaj studenta do listy obecności");
        System.out.println("3. Wyświetl wszystkie obecności");
        System.out.println("4. Wyjście");
        System.out.println("----------------------------------");
        System.out.print("Wybierz odpowiednią operacje: ");
    }

    public static void end()
    {
        System.out.print("Czy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = inputString();
        if  (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("\nBaza danych została pomyślnie zamknięta - koniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("Anulowano wyjście");
        }
    }

    public static void defaultChoice()
    {
        System.out.println("Nie ma takiej opcji w menu wyboru");
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        return number;
    }

    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        return word;
    }
}
