package sklep;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Sklep {
    private Queue<Zamowienie> kolejkaZamowien;
    private Scanner scanner;
    private final String nazwaPliku = "zamowienia.txt";

    public Sklep() {
        kolejkaZamowien = new LinkedList<>();
        scanner = new Scanner(System.in);
        wczytajKolejkeZPliku();
    }
    public Queue<Zamowienie> getKolejkaZamowien() {
        return kolejkaZamowien;
    }


    public void dodajZamowienie(Produkt produkt, Klient klient) {
        if (kolejkaZamowien == null) {
            kolejkaZamowien = new LinkedList<>();
        }
        Zamowienie zamowienie = new Zamowienie(produkt, klient);
        kolejkaZamowien.add(zamowienie);
        zapiszKolejkeDoPliku();
    }

    public void wczytajKolejkeZPliku() {
        try {
            FileInputStream fileIn = new FileInputStream(nazwaPliku);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            kolejkaZamowien = (Queue<Zamowienie>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Plik zamowienia.txt nie istnieje. Tworzę nowy plik.");
            zapiszKolejkeDoPliku();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void zapiszKolejkeDoPliku() {
        try {
            FileOutputStream fileOut = new FileOutputStream(nazwaPliku);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(kolejkaZamowien);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Zamowienie pobierzZamowienie() {
        Zamowienie zamowienie = kolejkaZamowien.poll();
        zapiszKolejkeDoPliku();
        return zamowienie;
    }

    public void odczytajKolejke() {
        int indeks = 0;
        for (Zamowienie zamowienie : kolejkaZamowien) {
            System.out.println("Indeks: " + indeks);
            System.out.println("ID: " + zamowienie.getId());
            System.out.println("Produkt: " + zamowienie.getProdukt().getNazwa());
            System.out.println("Cena: " + zamowienie.getProdukt().getCena());
            System.out.println("Klient: " + zamowienie.getKlient().getImie() + " " + zamowienie.getKlient().getNazwisko());
            System.out.println("------------------------");
            indeks++;
        }
    }


    public void dodajZamowienieNaGoreStosu(Zamowienie zamowienie) {
        kolejkaZamowien.add(zamowienie);
        zapiszKolejkeDoPliku();
    }

    public void modyfikujZamowienie(Zamowienie zamowienie, Produkt nowyProdukt, Klient nowyKlient) {
        zamowienie.setProdukt(nowyProdukt);
        zamowienie.setKlient(nowyKlient);
        zapiszKolejkeDoPliku();
    }


}
