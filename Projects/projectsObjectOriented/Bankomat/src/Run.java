import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public void startRunnig() {
        Bankomat bankomat = new Bankomat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\tPodaj ścieżkę do pliku z kartami które mają być obsługiwane: ");
        String importFilePath = scanner.nextLine();
        DataImporterExporter.importDataFromFile(importFilePath, bankomat);

        while (true) {
            Menu menu = new Menu();
            menu.showMenu();
            try {
                int opcja = scanner.nextInt();
                scanner.nextLine();

                switch (opcja) {
                    case 1:
                        System.out.print("\t\t\tPodaj nazwę karty: ");
                        String nazwaKarty = scanner.nextLine();
                        bankomat.wlozKarte(nazwaKarty);
                        break;
                    case 2:
                        System.out.print("\t\t\tPodaj nazwę nowej karty: ");
                        String nowyNazwaKarty = scanner.nextLine();
                        System.out.print("\t\t\tPodaj saldo nowej karty: ");
                        double saldo = scanner.nextDouble();
                        scanner.nextLine();
                        String nowyPin;
                        boolean poprawnyPin = false;
                        while (!poprawnyPin) {
                            System.out.print("\t\t\tPodaj PIN nowej karty (4 cyfry): ");
                            nowyPin = scanner.nextLine();
                            if (poprawnyPin(nowyPin)) {
                                if (saldo >= 0) {
                                    System.out.println("\t\t\tWybierz typ karty spośród dostępnych:\n\t\t\t1. Karta bankomatowa\n\t\t\t2. Karta kredytowa\n\t\t\t3. Karta płatnicza");
                                    int wersjakarty = scanner.nextInt();
                                    switch (wersjakarty) {
                                        case 1:
                                            KartaElektroniczna nowaKarta = new KartaBankomatowa(saldo, nowyPin);
                                            bankomat.dodajAkceptowanaKarte(nowyNazwaKarty, nowaKarta);
                                            System.out.println("\t\t\tNowa karta została dodana.");
                                            break;
                                        case 2:
                                            KartaElektroniczna nowaKarta1 = new KartaKredytowa(saldo, nowyPin);
                                            bankomat.dodajAkceptowanaKarte(nowyNazwaKarty, nowaKarta1);
                                            System.out.println("\t\t\tNowa karta została dodana.");
                                            break;
                                        case 3:
                                            KartaElektroniczna nowaKarta2 = new KartaPlatnicza(saldo, nowyPin);
                                            bankomat.dodajAkceptowanaKarte(nowyNazwaKarty, nowaKarta2);
                                            System.out.println("\t\t\tNowa karta została dodana.");
                                            break;
                                        default:
                                            System.out.println("\t\t\tNiepoprawna opcja. Spróbuj ponownie.");
                                            break;
                                    }
                                    poprawnyPin = true;
                                } else {
                                    System.out.println("\t\t\tKarta nie została utworzona, niepoprawne saldo. Saldo musi być większe lub równe zeru.");
                                    poprawnyPin = true;
                                }
                            } else {
                                System.out.println("\t\t\tNiepoprawny format PIN-u. PIN musi składać się z 4 cyfr.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\t\t\tLista kart możliwych do usunięcia:");
                        int index = 1;
                        Map<Integer, String> numeracjaKart = new HashMap<>();
                        for (String nazwa : bankomat.akceptowaneKarty.keySet()) {
                            System.out.println("\t\t\t" + index + ". " + nazwa);
                            numeracjaKart.put(index, nazwa);
                            index++;
                        }
                        if (numeracjaKart.isEmpty()) {
                            System.out.println("\t\t\tBrak akceptowanych kart.");
                            break;
                        }

                        System.out.print("\t\t\tWybierz numer karty do usunięcia: ");
                        int numerKarty = scanner.nextInt();
                        scanner.nextLine();

                        String typKartyDoUsuniecia = numeracjaKart.get(numerKarty);
                        if (typKartyDoUsuniecia != null) {
                            bankomat.usunAkceptowanaKarte(typKartyDoUsuniecia);
                            System.out.println("\t\t\tKarta została usunięta.");
                        } else {
                            System.out.println("\t\t\tNieprawidłowy numer karty. Spróbuj ponownie.");
                        }
                        break;
                    case 4:
                        System.out.println("\t\t\tLista kart możliwych do edycji:");
                        int index1 = 1;
                        Map<Integer, String> numeracjaKart1 = new HashMap<>();
                        for (String nazwa : bankomat.akceptowaneKarty.keySet()) {
                            System.out.println("\t\t\t" + index1 + ". " + nazwa);
                            numeracjaKart1.put(index1, nazwa);
                            index1++;
                        }
                        if (numeracjaKart1.isEmpty()) {
                            System.out.println("\t\t\tBrak akceptowanych kart.");
                            break;
                        }

                        System.out.print("\t\t\tWybierz numer karty do Edycji: ");
                        int numerKarty1 = scanner.nextInt();
                        scanner.nextLine();
                        String nazwaKartyDoEdycji = numeracjaKart1.get(numerKarty1);
                        if (nazwaKartyDoEdycji != null) {
                            KartaElektroniczna karta = bankomat.akceptowaneKarty.get(nazwaKartyDoEdycji);
                            boolean poprawnyPin1 = false;
                            boolean poprawneSaldo = false;

                            System.out.println("\t\t\tObecny PIN: " + karta.getPin());
                            System.out.println("\t\t\tObecne saldo: " + karta.getSaldo());
                            while (!poprawnyPin1 || !poprawneSaldo) {
                                System.out.print("\t\t\tPodaj nowy PIN karty (4 cyfry): ");
                                String nowyPinKarty = scanner.nextLine();
                                if (poprawnyPin(nowyPinKarty)) {
                                    poprawnyPin1 = true;
                                    System.out.print("\t\t\tPodaj nowe saldo karty: ");
                                    double noweSaldo = scanner.nextDouble();
                                    scanner.nextLine(); // Konsumowanie znaku nowej linii

                                    if (noweSaldo >= 0) {
                                        poprawneSaldo = true;
                                        karta.setPin(nowyPinKarty);
                                        karta.setSaldo(noweSaldo);
                                        System.out.println("\t\t\tKarta została zaktualizowana.");
                                        break;
                                    } else {
                                        System.out.println("\t\t\tNiepoprawne saldo. Saldo musi być większe lub równe zeru.");
                                    }
                                } else {
                                    System.out.println("\t\t\tNiepoprawny format PIN-u. PIN musi składać się z 4 cyfr.");
                                }
                            }
                        } else {
                            System.out.println("\t\t\tNieprawidłowy numer karty. Spróbuj ponownie.");
                        }
                        break;
                    case 5:
                        System.out.println("\n\t\t\tLista akceptowanych kart:");
                        for (String nazwa : bankomat.akceptowaneKarty.keySet()) {
                            System.out.println("\t\t\t-" + nazwa);
                        }
                        break;
                    case 6:
                        System.out.print("\t\t\tPodaj ścieżkę do pliku: ");
                        String importFilePath1 = scanner.nextLine();
                        DataImporterExporter.importDataFromFile(importFilePath1, bankomat);
                        break;
                    case 7:
                        System.out.print("\t\t\tPodaj ścieżkę do pliku: ");
                        String exportFilePath = scanner.nextLine();
                        DataImporterExporter.exportDataToFile(exportFilePath, bankomat.akceptowaneKarty);
                        break;
                    case 8:
                        close();
                    default:
                        System.out.println("\t\t\tNiepoprawna opcja. Spróbuj ponownie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\t\t\tNiepoprawny format opcji. Spróbuj ponownie.");
                scanner.nextLine();
            }
        }
    }

    private static void close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc? t || T");
        Scanner sc = new Scanner(System.in);
        String znak = sc.nextLine();
        String st1 = "t";
        String st2 = "T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }

    private static boolean poprawnyPin(String pin) {
        return pin.matches("\\d{4}");
    }
}
