import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dzielenie {




    public double a,b,modulo,n,wynik2,wynik;
    public Dzielenie(double a, double b)
    {
        this.a=a;
        this.b=b;

    }



    public void wylicz()
    {
        System.out.println("podaj liczby, które chcesz przedzielić ");
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
         wynik=a/b;
        System.out.println("wynik dzielenia liczb "+a+ "/"+b+"wynosi"+wynik);

    }
    public void wyliczmodulo()
    {
        System.out.println("Poniższa opcja pozwala na wyznaczenie reszt z dzielenia");
        System.out.println("podaj liczbe  ");
        Scanner in=new Scanner(System.in);
       n=in.nextDouble();
        System.out.println("podaj modulo");
        modulo=in.nextDouble();
        wynik2=n%modulo;
        System.out.println("wynik działania "+n+"modulo"+modulo+" wynosi "+wynik2);
    }

    public void zapiszinfo()
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
                String resultendstring1=String.valueOf(wynik);
                String resultendstring=String.valueOf(wynik2);
                bufferwriter.write(resultendstring1);
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
