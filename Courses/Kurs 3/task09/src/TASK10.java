
import java.util.InputMismatchException;
import java.util.Scanner;

public class TASK10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cyfre: ");
        try{
            int n = scanner.nextInt();
        }catch (InputMismatchException e)
        {
            System.err.println("Nie wpordzadziles cyfry"); // err wyswietla error w konsoli na redowo.
            System.out.println(e);
        }
        division(5);
        createTable();
    }
    public static double division(int a)
    {
        Scanner scanner = new Scanner(System.in);
        try{
            return a / scanner.nextInt();
        }catch (ArithmeticException e)
        {
            return 0;
        }catch (InputMismatchException e)
        {
            return 123456789;
        }catch (Exception e)
        {
            return 0;
        }finally {
            System.out.println("finally"); // <-- wykona wszystko i dopiero zwroci finally
        }
    }

    public static void createTable()
    {
        int tab[] = new int[10];
        try
        {
            tab[10] = 8;
        }catch (Exception e)
        {
            System.err.println(e);
        }
    }
}
