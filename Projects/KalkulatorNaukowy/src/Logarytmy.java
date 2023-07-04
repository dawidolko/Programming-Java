
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Logarytmy extends Podstawy{



public String trace;
    public Logarytmy(double podstawa,double log)
    {
        super(podstawa,log);
    }

    public   void  operation()
    {

        System.out.println("Wybrałeś Logarytmy");


    }
    public  void result()
    {
       // String trace;
        Scanner scan=new Scanner(System.in);
        System.out.println("wybierz jaki rodzaj logarytmu chcesz liczyć 1-naturalny 2-dziesietny");
        int choice=scan.nextInt();

        System.out.println("podaj liczbę, której logarytm  chcesz obliczyć  ");

        double liczba=scan.nextDouble();
        switch(choice)
        {
            case 1:
                double wynik=Math.log(liczba);

                System.out.println("wynik to "+wynik);
                Scanner inp=new Scanner(System.in);


                System.out.println("podaj ścieżke do pliku ");

                trace = inp.nextLine();


                try {


                    String path = trace;
                    FileWriter filewriter = new FileWriter(path, true);
                    BufferedWriter bufferwriter = new BufferedWriter(filewriter);
                    System.out.println();
                    String resultendstring = String.valueOf(wynik);
                    bufferwriter.write(resultendstring);
                    bufferwriter.newLine();
                    bufferwriter.close();
                } catch (IOException e) {
                    System.out.println("bład");
                }
                break;
            case 2:
                double wynik10=Math.log10(liczba);

                System.out.println("wynik to "+wynik10);



                System.out.println("podaj ścieżke do pliku ");

                trace = scan.nextLine();


                try {


                    String path = trace;
                    FileWriter filewriter = new FileWriter(path, true);
                    BufferedWriter bufferwriter = new BufferedWriter(filewriter);
                    System.out.println();
                    String resultendstring = String.valueOf(wynik10);
                    bufferwriter.write(resultendstring);
                    bufferwriter.newLine();
                    bufferwriter.close();
                } catch (IOException e) {
                    System.out.println("bład");
                }
                break;
        }







    }
    public  void printinfo()
    {

    }
}
