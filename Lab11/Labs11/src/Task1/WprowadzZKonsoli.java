package Task1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;


public class WprowadzZKonsoli {

    public static int wprowadzInt() throws InputMismatchException {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą: ");
        int value_1 = input_value.nextInt();
        return value_1;
    }

    public static byte wprowadzByte() throws InputMismatchException {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą typu byte: ");
        byte value_1 = input_value.nextByte();
        return value_1;
    }

    public static double wprowadzDouble() throws InputMismatchException {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Wprowadź liczbę zmiennoprzecinkową: ");
        double value_1 = input_value.nextDouble();
        return value_1;
    }

    public static BigDecimal wprowadzBigDecimal() throws InputMismatchException {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Wprowadź liczbę BigDecimal: ");
        BigDecimal value_1 = input_value.nextBigDecimal();
        return value_1;
    }

    public static BigInteger wprowadzBigInteger() throws InputMismatchException {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Wprowadź liczbę BigInteger: ");
        BigInteger value_1 = input_value.nextBigInteger();
        return value_1;
    }

    public static boolean wprowadzBoolean() throws InputMismatchException {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Wprowadź wartość logiczną (true lub false): ");
        boolean value_1 = input_value.nextBoolean();
        return value_1;
    }
}