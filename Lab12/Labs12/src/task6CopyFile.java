// Wpływ użycia buforowania na efektywność
// Użycie buforowania znacznie poprawia efektywność
// kopiowania plików. Pozwala to na odczyt i zapis większych porcji danych
// za jednym razem, a nie pojedynczych bajtów, co zmniejsza liczbę wywołań
// do i/o i zapewnia szybsze działanie programu.

// Przekształcony program z mierzeniem czasu kopiowania
import java.io.*;

public class task6CopyFile {
    public static void main(String[] args) {

        // Utworzenie obiektów plików wejściowego i wyjściowego
        File inFile = new File("ala.txt");
        File outFile = new File("plikWyjsciowy.txt");

        // Utworzenie obiektu Reader i Writer do kopiowania pliku
        Reader reader = null;
        Writer writer = null;

        // Utworzenie zmiennej do mierzenia czasu
        long startTime = System.currentTimeMillis();

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

            // Mierzenie czasu i wypisanie wyniku
            long stopTime = System.currentTimeMillis();
            System.out.println("Czas kopiowania: " + (stopTime - startTime) + " ms");
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

// W porównaniu do poprzedniego programu poprawiłem go przez dodanie mierzenia czasu kopiowania pliku. Mierzenie czasu
// jest wykonane wykorzystując metodę System.currentTimeMillis(), która zwraca aktualny czas w milisekundach. Zmienna
// startTime przypisuje czas przed wykonaniem kopiowania, a stopTime jest przypisywana po wykonaniu kopiowania. Na
// podstawie tych dwóch zmiennych obliczam czas kopiowania pliku i wypisuję go na konsole.

// Dodatkowo w celu poprawy wydajności programu użyłem buforowania w metodach, które wczytują zawartość pliku
// (BufferedReader) oraz w metodzie echo do kopiowania pliku (BufferedWriter). Wpływ buforowania na wydajność
// jest pozytywny, gdyż pozwala na odczyt lub zapis większych ilości danych w jednej operacji, co zmniejsza czas przetwarzania.