import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Zawodnik {
    private String imie;
    private int wiek;
    private String pozycja;
    private int numerKoszulki;

    public Zawodnik(String imie, int wiek, String pozycja, int numerKoszulki) {
        this.imie = imie;
        this.wiek = wiek;
        this.pozycja = pozycja;
        this.numerKoszulki = numerKoszulki;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getPozycja() {
        return pozycja;
    }

    public int getNumerKoszulki() {
        return numerKoszulki;
    }

    @Override
    public String toString() {
        return "Nr." + numerKoszulki + " " + imie + " (" + wiek + ")" + " - " + pozycja;
    }
}
class Klub {
    private List<Zawodnik> zawodnicy;

    public Klub() {
        zawodnicy = new ArrayList<>();
    }

    public List<Zawodnik> getZawodnicy() {
        return zawodnicy;
    }

    public void dodajZawodnika(Zawodnik zawodnik) {
        zawodnicy.add(zawodnik);
    }

    public void usunZawodnika(Zawodnik zawodnik) {
        zawodnicy.remove(zawodnik);
    }

    public void wyswietlZawodnikow() {
        if (zawodnicy.isEmpty()) {
            System.out.println("Brak zawodników.");
        } else {
            System.out.println("Lista zawodników:");
            for (Zawodnik zawodnik : zawodnicy) {
                System.out.println(zawodnik);
            }
        }
    }

    public void wyswietlZawodnikowZPozycji(String pozycja) {
        if (zawodnicy.isEmpty()) {
            System.out.println("Brak zawodników.");
        } else {
            System.out.println("Lista zawodników z pozycji " + pozycja + ":");
            for (Zawodnik zawodnik : zawodnicy) {
                if (zawodnik.getPozycja().equalsIgnoreCase(pozycja)) {
                    System.out.println(zawodnik);
                }
            }
        }
    }

    public void wybierzJedenastke() {
        List<Zawodnik> bramkarze = new ArrayList<>();
        List<Zawodnik> obrońcy = new ArrayList<>();
        List<Zawodnik> pomocnicy = new ArrayList<>();
        List<Zawodnik> napastnicy = new ArrayList<>();

        for (Zawodnik zawodnik : zawodnicy) {
            if (zawodnik.getPozycja().equalsIgnoreCase("bramkarz")) {
                bramkarze.add(zawodnik);
            } else if (zawodnik.getPozycja().equalsIgnoreCase("obrońca")) {
                obrońcy.add(zawodnik);
            } else if (zawodnik.getPozycja().equalsIgnoreCase("pomocnik")) {
                pomocnicy.add(zawodnik);
            } else if (zawodnik.getPozycja().equalsIgnoreCase("napastnik")) {
                napastnicy.add(zawodnik);
            }
        }

        if (bramkarze.isEmpty() || obrońcy.size() < 4 || pomocnicy.size() < 3 || napastnicy.size() < 3) {
            System.out.println("Nie można wybrać wyjściowej jedenastki. Brak wystarczającej liczby zawodników w każdej pozycji.");
            return;
        }

        List<Zawodnik> wybraniObrońcy = new ArrayList<>();
        List<Zawodnik> wybraniPomocnicy = new ArrayList<>();
        List<Zawodnik> wybraniNapastnicy = new ArrayList<>();

        System.out.println("Wybierz bramkarza:");
        for (int i = 0; i < bramkarze.size(); i++) {
            System.out.println((i + 1) + ". " + bramkarze.get(i));
        }
        int numerBramkarza = wczytajNumerZawodnika(bramkarze.size());
        Zawodnik bramkarz = bramkarze.get(numerBramkarza - 1);

        for (int i = 0; i < 4; i++) {
            System.out.println("Wybierz numer " + (i + 1) + " obrońcy:");
            for (int j = 0; j < obrońcy.size(); j++) {
                System.out.println((j + 1) + ". " + obrońcy.get(j));
            }
            int numerObrońcy = wczytajNumerZawodnika(obrońcy.size());
            Zawodnik obrońca = obrońcy.get(numerObrońcy - 1);
            obrońcy.remove(obrońca);
            wybraniObrońcy.add(obrońca);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Wybierz numer " + (i + 1) + " pomocnika:");
            for (int j = 0; j < pomocnicy.size(); j++) {
                System.out.println((j + 1) + ". " + pomocnicy.get(j));
            }
            int numerPomocnika = wczytajNumerZawodnika(pomocnicy.size());
            Zawodnik pomocnik = pomocnicy.get(numerPomocnika - 1);
            pomocnicy.remove(pomocnik);
            wybraniPomocnicy.add(pomocnik);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Wybierz numer " + (i + 1) + " napastnika:");
            for (int j = 0; j < napastnicy.size(); j++) {
                System.out.println((j + 1) + ". " + napastnicy.get(j));
            }
            int numerNapastnika = wczytajNumerZawodnika(napastnicy.size());
            Zawodnik napastnik = napastnicy.get(numerNapastnika - 1);
            napastnicy.remove(napastnik);
            wybraniNapastnicy.add(napastnik);
        }

        System.out.println("Wyjściowa jedenastka:");
        System.out.println("Bramkarz: " + bramkarz);
        System.out.println("Obrońcy:");
        for (Zawodnik obrońca : wybraniObrońcy) {
            System.out.println(obrońca);
        }
        System.out.println("Pomocnicy:");
        for (Zawodnik pomocnik : wybraniPomocnicy) {
            System.out.println(pomocnik);
        }
        System.out.println("Napastnicy:");
        for (Zawodnik napastnik : wybraniNapastnicy) {
            System.out.println(napastnik);
        }
    }

    private int wczytajNumerZawodnika(int maksymalnyNumer) {
        Scanner scanner = new Scanner(System.in);
        int numer = -1;
        while (numer < 1 || numer > maksymalnyNumer) {
            System.out.print("Wprowadź numer zawodnika: ");
            numer = scanner.nextInt();
            scanner.nextLine();
            if (numer < 1 || numer > maksymalnyNumer) {
                System.out.println("Wprowadzono niepoprawny numer zawodnika.");
            }
        }
        return numer;
    }
    public void dodajWynikMeczu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź datę meczu (dd-mm-rrrr): ");
        String dataMeczu = scanner.nextLine();

        System.out.print("Wprowadź nazwę pierwszej drużyny: ");
        String druzynaPierwsza = scanner.nextLine();

        System.out.print("Wprowadź liczbę goli dla pierwszej drużyny: ");
        int golePierwsza = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Wprowadź nazwę drugiej drużyny: ");
        String druzynaDruga = scanner.nextLine();

        System.out.print("Wprowadź liczbę goli dla drugiej drużyny: ");
        int goleDruga = scanner.nextInt();
        scanner.nextLine();

        String wynik = dataMeczu + "r. " + druzynaPierwsza + " " + golePierwsza + ":" + goleDruga + " " + druzynaDruga;

        zapiszWynikMeczu(wynik);
        System.out.println("Wynik meczu został zapisany.");
    }

    private void zapiszWynikMeczu(String wynik) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("wyniki.txt", true))) {
            writer.write(wynik);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisywania wyniku meczu.");
        }
    }
    public void wyswietlWyniki() {
        try (BufferedReader reader = new BufferedReader(new FileReader("wyniki.txt"))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytywania wyników meczów.");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoją rolę (Manager/Kibic): ");
        String rola = scanner.nextLine();

        Klub klub = new Klub();
        wczytajZawodnikowZPliku("zawodnicy.txt", klub);

        if (rola.equalsIgnoreCase("Manager")) {
            menuManagera(klub);
        } else if (rola.equalsIgnoreCase("Kibic")) {
            menuKibica(klub);
        } else {
            System.out.println("Nieznana rola. Zakończono program.");
        }
    }

    private static void menuManagera(Klub klub) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Managera:");
            System.out.println("1. Dodaj zawodnika");
            System.out.println("2. Usuń zawodnika");
            System.out.println("3. Wyświetl zawodników");
            System.out.println("4. Wyświetl zawodników z danej pozycji");
            System.out.println("5. Wybierz wyjściową jedenastkę");
            System.out.println("6. Dodaj wynik meczu");
            System.out.println("7. Wyświetl wyniki meczów");
            System.out.println("8. Zakończ program");
            System.out.print("Wybierz opcję: ");
            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1:
                    System.out.print("Wprowadź imię zawodnika: ");
                    String imie = scanner.nextLine();
                    System.out.print("Wprowadź wiek zawodnika: ");
                    int wiek = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Wprowadź pozycję zawodnika: ");
                    String pozycja = scanner.nextLine();
                    System.out.print("Wprowadź numer na koszulce zawodnika: ");
                    int numerKoszulki = scanner.nextInt();
                    scanner.nextLine();

                    Zawodnik nowyZawodnik = new Zawodnik(imie, wiek, pozycja, numerKoszulki);
                    klub.dodajZawodnika(nowyZawodnik);
                    break;
                case 2:
                    klub.wyswietlZawodnikow();
                    System.out.print("Wprowadź numer zawodnika do usunięcia: ");
                    int numerZawodnikaUsun = scanner.nextInt();
                    scanner.nextLine();
                    if (numerZawodnikaUsun >= 1 && numerZawodnikaUsun <= klub.getZawodnicy().size()) {
                        Zawodnik zawodnikUsun = klub.getZawodnicy().get(numerZawodnikaUsun - 1);
                        klub.usunZawodnika(zawodnikUsun);
                        System.out.println("Zawodnik został usunięty.");
                    } else {
                        System.out.println("Wprowadzono niepoprawny numer zawodnika.");
                    }
                    break;
                case 3:
                    klub.wyswietlZawodnikow();
                    break;
                case 4:
                    System.out.print("Wprowadź pozycję zawodników do wyświetlenia: ");
                    String pozycjaWyswietl = scanner.nextLine();
                    klub.wyswietlZawodnikowZPozycji(pozycjaWyswietl);
                    break;
                case 5:
                    klub.wybierzJedenastke();
                    break;
                case 6:
                    klub.dodajWynikMeczu();
                    break;
                case 7:
                    klub.wyswietlWyniki();
                    break;
                case 8:
                    System.out.println("Zakończono program.");
                    return;
                default:
                    System.out.println("Wprowadzono niepoprawną opcję. Spróbuj ponownie.");
            }

            System.out.println();
        }
    }

    private static void menuKibica(Klub klub) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Kibica:");
            System.out.println("1. Wyświetl zawodników");
            System.out.println("2. Wyświetl wyniki meczów");
            System.out.println("3. Zakończ program");
            System.out.print("Wybierz opcję: ");
            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1:
                    klub.wyswietlZawodnikow();
                    break;
                case 2:
                    klub.wyswietlWyniki();
                    break;
                case 3:
                    System.out.println("Zakończono program.");
                    return;
                default:
                    System.out.println("Wprowadzono niepoprawną opcję. Spróbuj ponownie.");
            }

            System.out.println();
        }
    }
    private static void wczytajZawodnikowZPliku(String nazwaPliku, Klub klub) {
        File plik = new File(nazwaPliku);

        try {
            Scanner scanner = new Scanner(plik);

            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                String[] dane = linia.split(",");
                if (dane.length == 4) {
                    String imie = dane[0].trim();
                    int wiek = Integer.parseInt(dane[1].trim());
                    String pozycja = dane[2].trim();
                    int numerKoszulki = Integer.parseInt(dane[3].trim());

                    Zawodnik zawodnik = new Zawodnik(imie, wiek, pozycja, numerKoszulki);
                    klub.dodajZawodnika(zawodnik);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie można odnaleźć pliku " + nazwaPliku);
        }
    }
}
