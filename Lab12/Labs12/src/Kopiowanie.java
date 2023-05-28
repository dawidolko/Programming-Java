import java.io.*;

public class Kopiowanie {
    public static void main(String[] args) {
        try {
            FileReader we = new FileReader("C:/plik1.txt");
            BufferedReader buforWe = new BufferedReader(we);
            FileWriter wy = new FileWriter("C:/plik2.txt");
            BufferedWriter buforWy = new BufferedWriter(wy);
            String linia;
            while ((linia = buforWe.readLine()) != null) {
                buforWy.write(linia);
            }
            buforWe.close(); buforWy.close();
        } catch (IOException ex) {
            System.err.println("Błąd: " + ex); }
    }
}