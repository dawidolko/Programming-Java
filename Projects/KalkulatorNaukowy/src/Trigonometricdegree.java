import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trigonometricdegree extends Trigonometric{

        public double variable;
        public double wynik;
    public Trigonometricdegree(double alfa,double variable) {

        super(alfa);
        this.variable=variable;

    }



    public void menu()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Wybrana opcja pozwala wyznaczyć wartości kątów dla wartości funkcji trygonometrycznych ");




    }


    public void wybor()
    {
        System.out.println("Wybierz, która wartość chcesz obliczyc " +
                "1-sin()   2-cos() 3-tan()");


        Scanner in=new Scanner(System.in);
        int var =in.nextInt();
        System.out.println("podaj wartość");
        alfa=in.nextDouble();
        double mathtodegree=Math.toRadians(alfa);
        switch (var)
        {
            case 1:
            {
                wynik=mathtodegree;
                System.out.println(Math.sin(wynik));
            }
            break;
            case 2:
            {
                wynik=mathtodegree;
                System.out.println(Math.cos(wynik));
            }
            break;
            case 3:
            {
                wynik=mathtodegree;
                System.out.println(Math.tan(wynik));
            }
            break;

        }




    }
    public void  result()
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
                String resultendstring=String.valueOf(wynik);
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
