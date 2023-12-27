import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Poteguj extends Podstawy implements Zapis {


    public double result;
   Scanner in =new Scanner(System.in);

    public Poteguj(double podstawa,double wykladnik)
    {

        super(podstawa,wykladnik);


    }


    public  void  operation()
    {
        System.out.println("wybrałeś potegowanie");
    }
    public void result()
    {
        System.out.println("podaj podstawe ");
        double podstawa=in.nextDouble();
        System.out.println("podaj wykładnik");
        double wykladnik=in.nextDouble();
        result=Math.pow(podstawa,wykladnik);
        System.out.println(result);



    }
    public  void printinfo()
    {

    }



    public void odczytajDane()
    {

        {


            System.out.println("podaj ścieżke do pliku ");
            Scanner inp=new Scanner(System.in);
            String  trace=inp.nextLine();



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
    }


}
