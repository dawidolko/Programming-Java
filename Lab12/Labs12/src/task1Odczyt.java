import java.io.*;
import java.util.Scanner;

public class task1Odczyt {
    public static void main(String[] args) throws FileNotFoundException {
        //ZAPIS
        PrintWriter zapis = new PrintWriter("ala.class");
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();

        //ODCZYT
        File file = new File("ala.class");
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] buffer = new byte[20]; // utworzenie bufora na 20 bajtów
            inputStream.read(buffer); // odczytanie pierwszych 20 bajtów z pliku
            for (byte b : buffer) {
                System.out.printf("%02X ", b); // wypisanie każdego bajtu w zapisie szesnastkowym na konsolę
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Normalnie: " + zdanie);
    }
}