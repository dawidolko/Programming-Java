package CwiczeniaLekcyjne;

public class ExceptionExample2
{
    public static void main(String[] args)
    {
        try
        {
            // Kod generujący wyjątek
            int divideByZero = 5 / 0;
            System.out.println("Reszta kodu w bloku try");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Wyjątek ArithmeticException: " + e.getMessage());
        }
        finally
        {
            System.out.println("To jest ostatni blok finally");
        }
    }
}
