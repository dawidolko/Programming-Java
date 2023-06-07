import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

/*#33. Kurs Java dla początkujących - Zapis do pliku (File) https://www.youtube.com/watch?v=i1xNvCG8_MI&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=34*/
public class task33 {
    public static void main(String[] args)
    {
        File f = new File("test.txt");
        if(!f.exists()) //sprawdza czy plik istnieje czy nie.
        {
            try {
                f.createNewFile();
                System.out.println("Plik zostal utworzony");
            }catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        if(f.canWrite()) {
            try{
                FileWriter fw = new FileWriter(f, true); //dołączać <- append dołączać po ang.
                Formatter fm = new Formatter(fw);
                Scanner sf = new Scanner(f);

                Scanner sc = new Scanner(System.in);
                System.out.println("Podaj tekst pliku");
                String tekst = sc.nextLine();
                fm.format("%s\r\n", tekst); // znak \n w linuxie \r w windowsie
                System.out.println("zapisano");
                fm.close(); // zamykanie pliku
                fw.close(); // zamykanie pliku

                System.out.println("zawartosc pliku: ");
                while(sf.hasNextLine())
                {
                    System.out.println(sf.nextLine());
                }
                sc.close();
                sf.close();
            }catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
