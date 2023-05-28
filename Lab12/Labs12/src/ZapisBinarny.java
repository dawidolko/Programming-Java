import java.io.FileOutputStream;
import java.io.IOException;

public class ZapisBinarny {
    public static void main(String[] args) {
        try {
            FileOutputStream wy = new FileOutputStream("plik.wy");
            for (int i = 0; i < 255; i++) {
                wy.write(i);
            }
            wy.close();
        } catch (IOException ex) {
            System.err.println("Błąd: " + ex);
        }
    }
}