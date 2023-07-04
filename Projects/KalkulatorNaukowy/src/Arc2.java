import java.util.Scanner;

public class Arc2 implements Start{
    public double alfa;
    public double wynik;
    public Arc2( double alfa)
    {
       this.alfa=alfa;
    }
    public void menu()
    {
        System.out.println("Ta opcja pozwala wyzanczyć warości kątów dla podanych wartości funkcji trygonmetrycznych ");

    }
    public void wybor()
    {
        System.out.println("podaj rodzaj funkcji dla jakiej wartośc chcesz wyznaczyć 1 -asin, 2 -acos, 3-atan");
        Scanner  in =new Scanner(System.in);
        double choice=in.nextDouble();

        if(choice==1) {


            System.out.println("podaj wartość ");
            double value;
             value = in.nextDouble();
             wynik=Math.asin(value);

            System.out.println("wartość wynosi " + wynik);
        }
        else if(choice ==2)
        {

            System.out.println("podaj wartość ");
            double value;
            value = in.nextDouble();
            wynik=Math.acos(value);
            System.out.println("wartość wynosi " + wynik);
        }else if(choice ==3)
        {

            System.out.println("podaj wartość ");
            double value;
             value = in.nextDouble();
             wynik=Math.atan(value);
            System.out.println("Wartość wynosi " +wynik);
        }


    }
    public void result()
    {

    }



}
