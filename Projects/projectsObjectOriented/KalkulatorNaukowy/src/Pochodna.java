
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Function;

public class Pochodna extends Podstawy {

    public Pochodna(double x, double y) {
        super(x, y);
    }
    public double x;
    public double h;
    public double pochodna;

    public void operation() {

    }

    public void result() {

        Scanner scan=new Scanner(System.in);
        System.out.println("podaj punkt w, którym chcesz wyznaczyć pochodną");
         double x = scan.nextDouble(); // Punkt, w którym wyznaczamy pochodną
        double h = scan.nextDouble(); // Przyrost
         double pochodna = obliczPochodna(x, h);

        System.out.println("Pochodna w punkcie x = " + x + ": " + pochodna);
    }

    public static double obliczPochodna(double x, double h) {
        // Przybliżenie pochodnej funkcji w punkcie x
        double pochodna = (funkcja(x + h) - funkcja(x)) / h;

        return pochodna;
    }

    public static double funkcja(double x) {
        // Definicja funkcji f(x) = x^2

        return x ;
    }


    public void printinfo() {


        {

        System.out.println("podaj ścieżke do pliku ");
        Scanner inp=new Scanner(System.in);
       String  trace=inp.nextLine();



        try {


            String path = trace;
            FileWriter filewriter = new FileWriter(path,true);
            BufferedWriter bufferwriter= new BufferedWriter(filewriter);
            System.out.println();
            String resultendstring=String.valueOf(pochodna);
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

