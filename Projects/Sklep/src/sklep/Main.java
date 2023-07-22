package sklep;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Dodaj zamówienie");
            System.out.println("2. Pobierz zamówienie");
            System.out.println("3. Odczytaj kolejkę");
            System.out.println("4. Modyfikuj zamówienie");
            System.out.println("0. Wyjście");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Pobierz pozostałą linię
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy wybór. Proszę wprowadzić liczbę całkowitą.");
                System.out.println("------------------------");
                scanner.nextLine(); // Pobierz pozostałą linię, aby uniknąć nieskończonej pętli
                continue; // Przejdź do kolejnej iteracji pętli
            }

            switch (choice) {
                case 1:
                    boolean poprawnaWartosc = false;
                    do {
                        try {

                            System.out.println("Podaj nazwę produktu:");
                            String nazwaProduktu = scanner.nextLine();
                            System.out.println("Podaj cenę produktu:");
                            double cenaProduktu = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.println("Podaj imię klienta:");
                            String imieKlienta = scanner.nextLine();
                            System.out.println("Podaj nazwisko klienta:");
                            String nazwiskoKlienta = scanner.nextLine();

                            Produkt produkt = new Produkt(nazwaProduktu, cenaProduktu);
                            Klient klient = new Klient(imieKlienta, nazwiskoKlienta);

                            sklep.dodajZamowienie(produkt, klient);
                            System.out.println("Dodano zamówienie.");
                            System.out.println("------------------------");

                            poprawnaWartosc = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Wystąpił błąd. Proszę wprowadzić poprawne dane.");
                            System.out.println("------------------------");
                            scanner.nextLine(); // Pobierz pozostałą linię, aby uniknąć nieskończonej pętli
                        }
                    } while (!poprawnaWartosc);
                    break;

                case 2:
                    Zamowienie pobraneZamowienie = sklep.pobierzZamowienie();
                    if (pobraneZamowienie != null) {
                        System.out.println("Pobrane zamówienie:");
                        System.out.println("ID: " + pobraneZamowienie.getId());
                        System.out.println("Produkt: " + pobraneZamowienie.getProdukt().getNazwa());
                        System.out.println("Cena: " + pobraneZamowienie.getProdukt().getCena());
                        System.out.println("Klient: " + pobraneZamowienie.getKlient().getImie() + " " + pobraneZamowienie.getKlient().getNazwisko());
                        System.out.println("------------------------");

                        boolean poprawnaOdpowiedz = false;
                        do {
                            System.out.println("Czy zamówienie zostało zrealizowane? (T/N)");
                            String potwierdzenie = scanner.nextLine().toUpperCase();
                            if (potwierdzenie.equals("T")) {
                                System.out.println("Zamówienie zostało zrealizowane.");
                                poprawnaOdpowiedz = true;
                            } else if (potwierdzenie.equals("N")) {
                                System.out.println("Zamówienie nie zostało zrealizowane.");
                                poprawnaOdpowiedz = true;
                                sklep.dodajZamowienieNaGoreStosu(pobraneZamowienie);
                                // Przenieś zamówienie na górę stosu kolejki FIFO
                            } else {
                                System.out.println("Nieprawidłowa odpowiedź. Proszę wprowadzić ponownie.");
                            }
                        } while (!poprawnaOdpowiedz);

                        System.out.println("------------------------");
                    } else {
                        System.out.println("Kolejka zamówień jest pusta.");
                        System.out.println("------------------------");
                    }
                    break;

                case 3:
                    sklep.odczytajKolejke();
                    break;
                case 4:
                    System.out.println("Podaj indeks zamówienia do modyfikacji:");
                    int indeksModyfikacji = scanner.nextInt();
                    scanner.nextLine(); // Pobierz znak nowej linii po nextInt()

                    Queue<Zamowienie> kolejkaZamowien = sklep.getKolejkaZamowien();
                    if (indeksModyfikacji >= 0 && indeksModyfikacji < kolejkaZamowien.size()) {
                        List<Zamowienie> listaZamowien = new ArrayList<>(kolejkaZamowien);
                        Zamowienie zamowienieModyfikowane = listaZamowien.get(indeksModyfikacji);

                        System.out.println("Podaj nową nazwę produktu (jeśli bez zmian, wciśnij Enter):");
                        String nowaNazwaProduktu = scanner.nextLine();
                        System.out.println("Podaj nową cenę produktu (jeśli bez zmian, wciśnij Enter):");
                        String nowaCenaProduktuStr = scanner.nextLine();
                        System.out.println("Podaj nowe imię klienta (jeśli bez zmian, wciśnij Enter):");
                        String noweImieKlienta = scanner.nextLine();
                        System.out.println("Podaj nowe nazwisko klienta (jeśli bez zmian, wciśnij Enter):");
                        String noweNazwiskoKlienta = scanner.nextLine();

                        // Sprawdź, czy wartości zostały wprowadzone (niepuste)
                        if (!nowaNazwaProduktu.isEmpty()) {
                            zamowienieModyfikowane.getProdukt().setNazwa(nowaNazwaProduktu);
                        }
                        if (!nowaCenaProduktuStr.isEmpty()) {
                            double nowaCenaProduktu = Double.parseDouble(nowaCenaProduktuStr);
                            zamowienieModyfikowane.getProdukt().setCena(nowaCenaProduktu);
                        }
                        if (!noweImieKlienta.isEmpty()) {
                            zamowienieModyfikowane.getKlient().setImie(noweImieKlienta);
                        }
                        if (!noweNazwiskoKlienta.isEmpty()) {
                            zamowienieModyfikowane.getKlient().setNazwisko(noweNazwiskoKlienta);
                        }

                        // Zapisz zmienioną listę zamówień do kolejki
                        kolejkaZamowien.clear();
                        kolejkaZamowien.addAll(listaZamowien);

                        sklep.zapiszKolejkeDoPliku();

                        System.out.println("Zamówienie zostało zmodyfikowane.");
                        System.out.println("------------------------");
                    } else {
                        System.out.println("Nieprawidłowy indeks zamówienia.");
                        System.out.println("------------------------");
                    }

                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Nieprawidłowy wybór.");
                    System.out.println("------------------------");
                    break;
            }
        }

        scanner.close();
    }
}
