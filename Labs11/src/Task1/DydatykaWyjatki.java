package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DydatykaWyjatki {
    public static void main(String[] args) {
        try{
            Scanner input_value = new Scanner(System.in);
            System.out.print("Wprowadź liczbę całkowitą: ");
            int value_1 = input_value.nextInt();

            int[] array = new int[value_1];
            for(int i = 0; i<=array.length;i++)
            {
                array[i] = i;
            }
        }
        catch (InputMismatchException ex1)
        {
            System.out.println("Wprowadzona wartość nie jest liczbą Całkowitą!");
        }catch (ArrayIndexOutOfBoundsException ex2)
        {
            System.out.println("Wykorzystano poza zakres tablicy!");
        }
    }
}
