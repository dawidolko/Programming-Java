import java.util.Scanner;

public class ArcDegree extends Arc{

    public ArcDegree(double beta)
    {
        super(beta);
    }
    public void menu()

    {
        System.out.println("Wybierz opcje 1-asin() 2-acos() 3-atan ");

    }
    public void wybor(double beta)
    {
        System.out.println("Wybierz opcje 1-asin() 2-acos() 3-atan ");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();


        switch(choice)
        {
            case 1:
                double degrees=Math.toDegrees(Math.asin(beta));
                System.out.println("wartosc kąta w stopniach wynosi "+degrees);
                break;
            case 2:
                double degrees2=Math.toDegrees(Math.acos(beta));
                System.out.println("wartosc kąta w stopniach wynosi "+degrees2);
                break;
            case 3:
                double degrees3=Math.toDegrees(Math.atan(beta));
                System.out.println("wartosc kąta w stopniach wynosi "+degrees3);
                break;


        }

    }

}
