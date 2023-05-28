/* Program do kopiowania plików tekstowych znak po znaku.
   Program używa wydzielonej metody echo(Reader, Writer) do kopiowania pliku.
   Nie obsługuje żadnych wyjątków, ale pamięta o właściwym zamykaniu obu plików.
 */

import java.io.*;

public class task5CopyFile {
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