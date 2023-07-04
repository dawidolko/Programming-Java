import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreateFile implements Dodawanie{


    public void create() {


        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj nazwe pliku, który chcesz utworzyć");
        String plik=scan.nextLine();
        String fileName = plik;
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("Plik został utworzony.");
            } else {
                System.out.println("Plik już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Nie udało się utworzyć pliku: " + e.getMessage());
        }
    }

}
