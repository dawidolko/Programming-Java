import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BazaDanych {
    private String nazwaPliku;

    public BazaDanych(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }

    public void zapiszDane(List<String> dane) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku))) {
            for (String wiersz : dane) {
                writer.write(wiersz);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania danych do pliku!");
        }
    }

    public List<String> wczytajDane() {
        List<String> dane = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String wiersz;
            while ((wiersz = reader.readLine()) != null) {
                dane.add(wiersz);
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas wczytywania danych z pliku!");
        }

        return dane;
    }
}
