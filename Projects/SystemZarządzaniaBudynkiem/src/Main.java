import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("System zarządzania budynkiem\n");

        boolean wyjdz = false;
        Scanner input = new Scanner(System.in);

        Budynek budynek = new Budynek("Dom jednorodzinny");
        ZgloszenieUsterki zgloszenieUsterki = new ZgloszenieUsterki("Uszkodzona sciana");
        MonitorowanieTemperatury monitorowanieTemperatury = new MonitorowanieTemperatury(8, 20);
        DostepDoBudynku dostep = new DostepDoBudynku("1Owoc24");
        SiecElektryczna elektryk = new SiecElektryczna();
        BazaDanych bazaDanych = new BazaDanych("dane1.txt");

        while (wyjdz != true) {
            System.out.println("1. Otworz budynek");
            System.out.println("2. Zamknij budynek");
            System.out.println("3. Wlacz swiatla");
            System.out.println("4. Wylacz swiatla");
            System.out.println("5. Wlacz siec elektryczna");
            System.out.println("6. Wylacz siec elektryczna");
            System.out.println("7. Zglos usterke");
            System.out.println("8. Monitoruj temperatury");
            System.out.println("9. Dodaj do bazy danych");
            System.out.println("10. Odczytaj z bazy danych");
            System.out.println("11. Wyjdz z programu");

            System.out.print("Wybierz opcje: ");
            int opcja = input.nextInt();

            switch (opcja) {
                case 1:
                    if (dostep.zweryfikujDostep("1Owoc24")) {
                        budynek.otworzBudynek();
                        System.out.println("Budynek otwarty!");
                    } else {
                        System.out.println("Brak dostepu. Wprowadz poprawny kod dostepu!");
                    }
                    break;
                case 2:
                    budynek.zamknijBudynek();
                    System.out.println("Budynek zamnkniety");
                    break;
                case 3:
                    budynek.wlaczSwiatla();
                    System.out.println("Swiatla wlaczane");
                    break;
                case 4:
                    budynek.wylaczSwiatla();
                    System.out.println("Swiatla wylaczane");
                    break;
                case 5:
                    elektryk.wlaczSiec();
                    System.out.println("Siec elektryczna wlaczana");
                    break;
                case 6:
                    elektryk.wylaczSiec();
                    System.out.println("Siec elektryczna wylaczana");
                    break;
                case 7:
                    System.out.println("Podaj opis usterki");
                    String opisUsterki = input.next();
                    zgloszenieUsterki = new ZgloszenieUsterki(opisUsterki);
                    System.out.println("Usterka zgloszona: " + zgloszenieUsterki.getOpisUsterki());
                    break;
                case 8:
                    System.out.println("Temperatura powietrza: " + monitorowanieTemperatury.getTemperaturyPowietrza());
                    System.out.println("Temperatura wody: " + monitorowanieTemperatury.getTemperaturyWody());
                    break;
                case 9:
                    List<String> daneDoZapisu = new ArrayList<>();
                    daneDoZapisu.add(budynek.getRodzajBudynku());
                    daneDoZapisu.add(String.valueOf(budynek.isCzyZamkniety()));
                    daneDoZapisu.add(String.valueOf(budynek.isCzyWlaczaneSwiatla()));
                    daneDoZapisu.add(String.valueOf(elektryk.isCzyWlaczanaSiec()));
                    daneDoZapisu.add(zgloszenieUsterki.getOpisUsterki());
                    daneDoZapisu.add(String.valueOf(monitorowanieTemperatury.getTemperaturyPowietrza()));
                    daneDoZapisu.add(String.valueOf(monitorowanieTemperatury.getTemperaturyWody()));
                    bazaDanych.zapiszDane(daneDoZapisu);

                    System.out.println("Dane zostały zapisane do bazy danych!");
                    break;
                case 10:
                    List<String> wczytajDane = bazaDanych.wczytajDane();
                    if (!wczytajDane.isEmpty()) {
                        budynek.setRodzajBudynku(wczytajDane.get(0));
                        budynek.setCzyZamkniety(Boolean.parseBoolean(wczytajDane.get(1)));
                        budynek.setCzyWlaczaneSwiatla(Boolean.parseBoolean(wczytajDane.get(2)));
                        elektryk.setCzyWlaczanaSiec(Boolean.parseBoolean(wczytajDane.get(3)));
                        zgloszenieUsterki.setOpisUsterki(wczytajDane.get(4));
                        monitorowanieTemperatury.setTemperaturyPowietrza(Double.parseDouble(wczytajDane.get(5)));
                        monitorowanieTemperatury.setTemperaturyWody(Double.parseDouble(wczytajDane.get(6)));

                        System.out.println("Dane zostały odczytane z bazy danych!");
                    } else {
                        System.out.println("Brak danych w bazie danych!");
                    }
                    break;
                case 11:
                    wyjdz = true;
                    System.out.println("Wychodze z programu");
                    break;
                default:
                    System.out.println("Nieprawidlowa opcja. Sproboj ponownie");
            }
        }
    }
}
