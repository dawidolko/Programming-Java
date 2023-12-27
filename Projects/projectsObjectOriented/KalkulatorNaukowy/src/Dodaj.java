import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.function.Function;

public class Dodaj extends Podstawy implements Zapis{

    public double number1;
    public double number2;
    public double resultend;

    public Dodaj(double number1,double number2)
    {
        super(number1,number2);
    }

    public String trace;
    public   void  operation()
    {
        System.out.println("wybrałeś dodawanie ciągu liczb");
    }
    public  void result()
    {
        double resultend=0;
        Scanner in=new Scanner(System.in);

        do {

            System.out.println("podaj liczby,które chcesz dodać jeśli chcesz zakończyć dodawanie to podaj 0");
            x=in.nextDouble();
            resultend+=x;
        }while(x!=0);

        System.out.println("Wynik dodawania to "+resultend);



        System.out.println("podaj ścieżke do pliku ");
        Scanner inp=new Scanner(System.in);
        trace=inp.nextLine();



        try {


            String path = trace;
            FileWriter filewriter = new FileWriter(path,true);
            BufferedWriter bufferwriter= new BufferedWriter(filewriter);
            System.out.println();
            String resultendstring=String.valueOf(resultend);
            bufferwriter.write(resultendstring);
            bufferwriter.newLine();
            bufferwriter.close();
        }catch (IOException e)
        {
            System.out.println("bład");
        }

    }
    public double getResultend()
    {
        return resultend;
    }

    public  void printinfo()
    {
        System.out.println("wynik został zapisany do pliku "+trace);
    }

    public void zapiszDane()
    {



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

    public void czyodczytac()
    {
        System.out.println("Czy chcesz odczytać dane?");

    }

}
