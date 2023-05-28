import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task2ReadFile {

    //Tworzymy metodę, która będzie czytać nasz plik tekstowy
    public static void readFile(String fileName) {

        try {
            FileReader fileReader = new FileReader(fileName); //Tworzymy obiekt FileReader, który pozwoli nam odczytać plik
            BufferedReader bufferedReader = new BufferedReader(fileReader); //Tworzymy obiekt BufferedReader, który pozwoli nam odczytać zawartość pliku po linii
            String line; //Tworzymy zmienną line do przechowywania tekstu zawartego w poszczególnych liniach pliku

            while ((line = bufferedReader.readLine()) != null) { //Iterujemy po liniach pliku i wypisujemy je na konsoli
                System.out.println(line);
            }

            bufferedReader.close(); //Zamykamy strumień odczytu po zakończeniu operacji
        } catch (IOException e) { //Obsługujemy błędy odczytu
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("ala.txt"); //Wywołujemy naszą metodę, podając jej jako argument ścieżkę do pliku
    }
}