import java.util.Scanner;

public class Arc extends Trigonometric {

    public double alfa;
    public double value;
    public double radious,radious2,radious3;
    public double beta;
    public Arc(double alfa)
    {
        super(alfa);

    }

    public void wybor()
    {
        System.out.println("Wybierz opcje 1-asin() 2-acos() 3-atan ");

    }
    public void menu()
    {

        double alfa;
        double value;
        double radious,radious2,radious3;
        double beta;
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        System.out.println("podaj wartośc dla, której kąt chcesz wyznaczyc ");
       value=scan.nextDouble();

        radious=Math.asin(value);
        radious2=Math.acos(value);
        radious3=Math.atan(value);
        switch(choice)
        {
            case 1:

                System.out.println("wartość kąta w radianach dla wartości tego sinusa wynosi : "+radious);
                break;
            case 2:

                System.out.println("wartość kąta w radianach dla wartości tego cosinusa wynosi : "+radious2);
                break;
            case 3:

                System.out.println("wartość kąta w radianach dla wartości tego tangensa wynosi : "+radious3);
                break;



        }


    }

}
