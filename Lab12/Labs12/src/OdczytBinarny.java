import java.io.FileInputStream;
import java.io.IOException;

public class OdczytBinarny {
    public static void main(String[] args) {
        try {
            FileInputStream we = new FileInputStream("x");
            byte bajt;
            while ((bajt = (byte) we.read()) != -1) {
// Wykonaj operacje na wczytanym bajcie.
            }
            we.close();
        } catch (IOException e) {
            System.err.println("Błąd: " + e);
        }
    }
}