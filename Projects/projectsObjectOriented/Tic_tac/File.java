import java.io.FileWriter;
import java.io.IOException;

public class File {
    private FileWriter fileWriter; //do zapisu obiekt do pliku

    public File(String filename) throws IOException {
        fileWriter = new FileWriter(filename, true); // mozna dopisywac
    }

    public void write(String text) throws IOException {
        fileWriter.write(text); // zapis
        fileWriter.flush(); // wymusza zapis wszystkiego do pliku
    }

    public void close() throws IOException {
        fileWriter.close(); //to juz jest koniec
    }
}
