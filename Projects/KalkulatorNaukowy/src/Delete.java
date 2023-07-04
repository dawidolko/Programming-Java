import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class Delete implements Usuwanie{
    public void delete()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("podaj ściezke do pliku, który chcesz usunąc ");
        String sciezka=scan.nextLine();
        String filePath = sciezka;
        Path path = Paths.get(filePath);

        try {
            Files.delete(path);
            System.out.println("Plik został usunięty.");
        } catch (IOException e) {
            System.out.println("Nie udało się usunąć pliku: " + e.getMessage());
        }
    }
}
