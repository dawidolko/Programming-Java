import java.io.*;
import java.util.Map;
import java.util.Scanner;

class DataImporterExporter {
    public static void exportDataToFile(String filePath, Map<String, KartaElektroniczna> akceptowaneKarty) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (Map.Entry<String, KartaElektroniczna> entry : akceptowaneKarty.entrySet()) {
                KartaElektroniczna karta = entry.getValue();
                String line = entry.getKey() + "," + karta.getClass().getSimpleName();

                if (karta instanceof KartaKredytowa || karta instanceof KartaBankomatowa || karta instanceof KartaPlatnicza) {
                    line += "," + karta.getSaldo() + "," + karta.getPin();
                } else {
                    System.out.println("\t\t\tNieobsługiwana klasa karty.");
                }

                writer.println(line);
            }
            System.out.println("\t\t\tDane zostały wyeksportowane do pliku.");
        } catch (FileNotFoundException e) {
            System.out.println("\t\t\tBłąd podczas eksportowania danych: " + e.getMessage());
        }
    }

    public static void importDataFromFile(String filePath, Bankomat bankomat) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                String nazwaKarty = parts[0];
                String klasaKarty = parts[1];

                if (parts.length >= 4) {
                    Double saldoKarty = Double.parseDouble(parts[2]);
                    String pinKarty = parts[3];

                    switch (klasaKarty) {
                        case "KartaKredytowa":
                            bankomat.dodajAkceptowanaKarte(nazwaKarty, new KartaKredytowa(saldoKarty, pinKarty));
                            break;
                        case "KartaPlatnicza":
                            bankomat.dodajAkceptowanaKarte(nazwaKarty, new KartaPlatnicza(saldoKarty, pinKarty));
                            break;
                        case "KartaBankomatowa":
                            bankomat.dodajAkceptowanaKarte(nazwaKarty, new KartaBankomatowa(saldoKarty, pinKarty));
                            break;
                        default:
                            System.out.println("\t\t\tNieobsługiwana klasa karty: " + klasaKarty);
                    }
                } else {
                    System.out.println("\t\t\tNiepoprawny format danych w linii: " + line);
                }
            }
            System.out.println("\t\t\tDane zostały zaimportowane z pliku.");
        } catch (FileNotFoundException e) {
            System.out.println("\t\t\tBłąd podczas importowania danych: " + e.getMessage());
            System.out.println("\t\t\tPodaj poprawne scieżkę: ");
            Scanner sc = new Scanner(System.in);
            String filePath1 = sc.nextLine();
            importDataFromFile(filePath1, bankomat);
        }
    }
}
