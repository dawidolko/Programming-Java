import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Odejmij extends Podstawy{


    public  double resultend;
    public Odejmij(double number1,double number2)
    {
        super(number1,number2);
    }

    public   void  operation()
    {
        System.out.println("wybrałeś odejmowanie ciągu liczb");
    }

    public void result()
    {
       resultend=0;
        Scanner in=new Scanner(System.in);
        System.out.println("podaj liczby,które chcesz odjąć jeśli chcesz zakończyć odejmowanie to podaj 0");
        do {


            x=in.nextDouble();
            resultend-=x;
        }while(x!=0);

        System.out.println("Wynik odejmowania liczb  to "+resultend);
    }
    public void printinfo()
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
            String resultendstring=String.valueOf(resultend);
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
