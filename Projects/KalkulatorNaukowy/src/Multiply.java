import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Multiply extends Podstawy{


    public Multiply(double liczba1,double liczba2)
    {
        super(liczba1,liczba2);
    }

    public double result;
    Scanner in=new Scanner(System.in);
    public  void  operation()
    {
        System.out.println("wybrales mnozenie");

    }
    public  void result()
    {
        System.out.println("podaj pierwsza liczbe ");
        double liczba1=in.nextDouble();
        System.out.println("podaj drugą liczbe ");
        double liczba2=in.nextDouble();

        result=liczba1*liczba2;
        System.out.println("wynik to "+result);
    }
    public  void printinfo()
    {

        Scanner inp=new Scanner(System.in);
            System.out.println("czy chcesz zapisać dany wynik do pliku y/n ");
                    String wybor=inp.next();
                    switch (wybor)
                    {
                        case "y":
                            System.out.println("podaj ścieżke do pliku ");

                            String trace;
                            trace=inp.next();



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

                            break;
                        case "n":
                            System.out.println("nie zapisano");
                    }

    }






}
