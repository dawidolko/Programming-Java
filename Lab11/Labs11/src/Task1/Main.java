package Task1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;

import static Task1.WprowadzZKonsoli.*;

public class Main {
    public static void main(String[] args) {
        try {
            int wprowadzonaLiczbaCalkowita = wprowadzInt();
            byte wprowadzonaLiczbaCalkowitaTypuByte = wprowadzByte();
            double wprowadzonaLiczbaZmiennoprzecinkowa = wprowadzDouble();
            BigDecimal wprowadzonaLiczbaBigDecimal = wprowadzBigDecimal();
            BigInteger wprowadzonaLiczbaBigInteger = wprowadzBigInteger();
            boolean wprowadzonaWartoscLogiczna = wprowadzBoolean();

            System.out.println("Wprowadzona liczba calkowita: " + wprowadzonaLiczbaCalkowita);
            System.out.println("Wprowadzona liczba calkowita typu byte: " + wprowadzonaLiczbaCalkowitaTypuByte);
            System.out.println("Wprowadzona liczba zmiennoprzecinkowa: " + wprowadzonaLiczbaZmiennoprzecinkowa);
            System.out.println("Wprowadzona liczba BigDecimal: " + wprowadzonaLiczbaBigDecimal);
            System.out.println("Wprowadzona liczba BigInteger: " + wprowadzonaLiczbaBigInteger);
            System.out.println("Wprowadzona wartość logiczna: " + wprowadzonaWartoscLogiczna);

        } catch (InputMismatchException ex1) {
            System.out.println("Wprowadzona wartość jest błędna!");
        }
    }
}
