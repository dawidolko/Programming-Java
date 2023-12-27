import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BazaDanych {
    private String nazwaPliku;

    public BazaDanych(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }

    public List<Potrawa> wczytajPotrawyZPliku() {
        List<Potrawa> potrawy = new ArrayList<>();

        try {
            File plik = new File(nazwaPliku);
            Scanner scanner = new Scanner(plik);

            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                String[] dane = linia.split(";");

                if (dane.length == 3) {
                    String nazwa = dane[0].trim();
                    String[] zakresTemperatury = dane[1].trim().split(",");
                    String[] zakresCzasu = dane[2].trim().split(",");

                    if (zakresTemperatury.length == 2 && zakresCzasu.length == 2) {
                        int temperaturaMin = Integer.parseInt(zakresTemperatury[0].trim());
                        int temperaturaMax = Integer.parseInt(zakresTemperatury[1].trim());
                        int czasMin = Integer.parseInt(zakresCzasu[0].trim());
                        int czasMax = Integer.parseInt(zakresCzasu[1].trim());

                        Potrawa potrawa = new Potrawa(nazwa, temperaturaMin, temperaturaMax, czasMin, czasMax) {
                            @Override
                            public void gotuj() {
                                System.out.println("Gotowanie potrawy: " + nazwa);
                                System.out.println("Zalecana temperatura: " + temperaturaMin + "-" + temperaturaMax);
                                System.out.println("Zalecany czas gotowania: " + czasMin + "-" + czasMax);
                            }
                        };
                        potrawy.add(potrawa);
                    } else {
                        System.out.println("Błąd odczytu danych dla potrawy: " + nazwa);
                    }
                } else {
                    System.out.println("Błąd odczytu linii: " + linia);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku: " + nazwaPliku);
        }

        return potrawy;
    }
}