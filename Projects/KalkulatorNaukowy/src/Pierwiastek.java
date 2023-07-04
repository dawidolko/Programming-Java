import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Pierwiastek extends Podstawy implements Zapis {



    public double podstawa;
    public double stopien;
    public String trace;
   public Pierwiastek(double podstawa,double stopien)
   {
       super(podstawa,stopien);
   }
    public   void  operation()
    {
        System.out.println("Wybrałeś pierwiastkowanie");
    }
    public  void result()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("podaj podstawe ");
        double podstawa=in.nextDouble();
        System.out.println("podaj stopień pierwiastka");
        stopien=in.nextDouble();
        double result=Math.pow(podstawa,(1/stopien));
        System.out.println("Wynik to "+result);


            System.out.println("podaj ścieżke do pliku ");
            Scanner inp=new Scanner(System.in);
            String trace=inp.nextLine();



            try {


                String path = trace;
                FileWriter filewriter = new FileWriter(path,true);
                BufferedWriter bufferwriter= new BufferedWriter(filewriter);
                System.out.println();
                String resultendstring=String.valueOf(result);
                bufferwriter.write(resultendstring);
                bufferwriter.newLine();
                bufferwriter.close();
            }catch (IOException e)
            {
                System.out.println("bład");
            }





    }
    public  void printinfo()
    {
        System.out.println("wynik został zapisany do pliku "+trace);
    }



    public void odczytajDane()
    {
        System.out.println("podaj scieżke do pliku, który chcesz odczytać ");
        Scanner scan=new Scanner(System.in);
        String sciezka=scan.next();
        String sciezkaPliku = sciezka;

        try (BufferedReader br = new BufferedReader(new FileReader(sciezkaPliku))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
