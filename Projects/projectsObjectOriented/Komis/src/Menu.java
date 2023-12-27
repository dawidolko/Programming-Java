import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private KomisSamochodowy komis;
    private Scanner scanner;

    public Menu(KomisSamochodowy komis) {
        this.komis = komis;
        scanner = new Scanner(System.in);
    }

    public void uruchom() throws SQLException {
        while (true) {
            System.out.println("========MENU========");
            System.out.println("1. Wyszukaj samochód");
            System.out.println("2. Wyświetl wszystkie samochody");
            System.out.println("3. Kup samochód");
            System.out.println("4. Sprzedaj samochód");
            System.out.println("5. Aktualizuj dane");
            System.out.println("6. Zamknij program");
            System.out.print("Wybierz opcję: ");
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    new WyszukajSamochod(komis, scanner);
                    break;
                case 2:
                    new WszystkieSamochody(komis);
                    break;
                case 3:
                    new KupSamochod(komis, scanner);
                    break;
                case 4:
                    new SprzedajSamochod(komis, scanner);
                    break;
                case 5:
                    new AktualizacjaDanych(komis, scanner);
                case 6:
                    komis.zamknijPolaczenie();
                    System.out.println("Program zakończony.");
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
            }
        }
    }
}
