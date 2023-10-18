package ZadaniaLekcyjne.zadanie3;

import java.util.InputMismatchException;
import java.util.Objects;

import static ZadaniaLekcyjne.zadanie3.zadanie3.inputString;
import static ZadaniaLekcyjne.zadanie3.zadanie3.inputInt;

public class Adres
{
    private String ulica; // Wartość nieprawidłowa to null
    private int numerDomu; // Wartość nieprawidłowa to liczba <= 0
    private String kodPocztowy; // Wartość nieprawidłowa to null
    private String miasto; // Wartość nieprawidłowa to null

    public Adres()
    {
        System.out.print("Podaj ulicę: ");
        String ulica;
        try
        {
            ulica = inputString();
            if (Objects.equals(ulica, ""))
            {
                throw new NieprawidlowyAdresException("Ulica nie może być nullem.\n");
            }
            this.ulica = ulica;
        }
        catch (NieprawidlowyAdresException e)
        {
            System.out.print(e.getMessage());
            this.ulica = "N/A";
        }

        System.out.print("Podaj numer domu: ");
        int numerDomu;
        try
        {
            numerDomu = inputInt();
            if (numerDomu <= 0)
            {
                throw new NieprawidlowyAdresException("Numer domu nie może być <= 0.\n");
            }
            this.numerDomu = numerDomu;
        }
        catch (NieprawidlowyAdresException e)
        {
            System.out.print(e.getMessage());
            this.numerDomu = 0;
        }
        catch (InputMismatchException e)
        {
            System.out.print("Numer domu nie może być <= 0.\n");
            this.numerDomu = 0;
        }

        System.out.print("Podaj kod pocztowy: ");
        String kodPocztowy;
        try
        {
            kodPocztowy = inputString();
            if (Objects.equals(kodPocztowy, ""))
            {
                throw new NieprawidlowyAdresException("Kod pocztowy nie może być nullem.\n");
            }
            this.kodPocztowy = kodPocztowy;
        }
        catch (NieprawidlowyAdresException e)
        {
            System.out.print(e.getMessage());
            this.kodPocztowy = "N/A";
        }

        System.out.print("Podaj miasto: ");
        String miasto;
        try
        {
            miasto = inputString();
            if (Objects.equals(miasto, ""))
            {
                throw new NieprawidlowyAdresException("Miasto nie może być nullem.\n");
            }
            this.miasto = miasto;
        }
        catch (NieprawidlowyAdresException e)
        {
            System.out.print(e.getMessage());
            this.miasto = "N/A";
        }
    }
    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public String getUlica() { return ulica; }
    public int getNumerDomu() { return numerDomu; }
    public String getKodPocztowy() { return kodPocztowy; }
    public String getMiasto() { return miasto; }
}
