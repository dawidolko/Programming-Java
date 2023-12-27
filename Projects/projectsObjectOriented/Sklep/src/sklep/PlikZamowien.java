package sklep;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class PlikZamowien {
    private final String nazwaPliku = "zamowienia.txt";

    public void zapiszKolejke(Queue<Zamowienie> kolejkaZamowien) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            for (Zamowienie zamowienie : kolejkaZamowien) {
                String linia = zamowienie.getId() + ";" +
                        zamowienie.getProdukt().getNazwa() + ";" +
                        zamowienie.getProdukt().getCena() + ";" +
                        zamowienie.getKlient().getImie() + ";" +
                        zamowienie.getKlient().getNazwisko();
                writer.println(linia);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu zamówień do pliku.");
        }
    }

    public Queue<Zamowienie> wczytajKolejke() {
        Queue<Zamowienie> kolejkaZamowien = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                String[] dane = linia.split(";");
                if (dane.length == 5) {
                    int id = Integer.parseInt(dane[0]);
                    String nazwaProduktu = dane[1];
                    double cenaProduktu = Double.parseDouble(dane[2]);
                    String imieKlienta = dane[3];
                    String nazwiskoKlienta = dane[4];

                    Produkt produkt = new Produkt(nazwaProduktu, cenaProduktu);
                    Klient klient = new Klient(imieKlienta, nazwiskoKlienta);
                    Zamowienie zamowienie = new Zamowienie(produkt, klient);

                    kolejkaZamowien.add(zamowienie);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu zamówień z pliku.");
        }

        return kolejkaZamowien;
    }
}

