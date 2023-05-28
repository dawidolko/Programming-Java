// Przekształcony program
import java.io.*;

public class task5v2CopyFile {
    public static void main(String[] args) {

        // Utworzenie obiektów plików wejściowego i wyjściowego
        File inFile = new File("ala.txt");
        File outFile = new File("plikWyjsciowy.txt");

        // Utworzenie obiektu Reader i Writer do kopiowania pliku
        Reader reader = null;
        Writer writer = null;

        try {
            // Utworzenie obiektu Reader i Writer do kopiowania pliku
            reader = new FileReader(inFile);
            writer = new FileWriter(outFile);

            // Wywołanie metody echo do kopiowania pliku
            echo(reader, writer);

            // Zamknięcie obiektów Reader i Writer
            reader.close();
            writer.close();

            // Wyświetlenie zawartości pliku wejściowego
            System.out.println("Zawartość pliku wejściowego:");
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // Wyświetlenie zawartości pliku wyjściowego
            System.out.println("Zawartość pliku wyjściowego:");
            BufferedReader br2 = new BufferedReader(new FileReader(outFile));
            String line2;
            while ((line2 = br2.readLine()) != null) {
                System.out.println(line2);
            }
            br2.close();
        } catch (IOException e) {
            // Tutaj będzie kod do obsługi wyjątków
        }
    }

    // Metoda echo do kopiowania pliku znak po znaku
    public static void echo(Reader reader, Writer writer) throws IOException {
        int b;
        while ((b = reader.read()) != -1) {
            writer.write(b);
        }
    }
}