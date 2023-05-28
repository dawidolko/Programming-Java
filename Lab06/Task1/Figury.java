package Task1;

public class Figury {
    // Inicjalizator statyczny
    static
    {
        System.out.println("Biblioteka obliczająca wielkości figur geometrycznych!!!");
    }

    //Metoda statyczna obliczająca pole koła
    public static double PoleKola(double r)
    {
        return Math.PI*Math.pow(r,2);
    }

    // Metoda statyczna obliczająca obdów koła
    public static double ObwodKola(double r)
    {
        return 2*Math.PI*r;
    }

    // Metoda statyczna obliczająca pole kwadratu
    public static double PoleKwadratu(double a)
    {
        return Math.pow(a,2);
    }

    // Metoda statyczna obliczająca obwód kwadratu
    public static double ObwodKwadratu(double a)
    {
        return 4*a;
    }

    // Metoda statyczna obliczająca pole prostokąta
    public static double PoleProstokata(double a, double b)
    {
        return a*b;
    }

    // Metoda statyczna obliczająca obwód prostokąta
    public static double ObwodProstokata(double a, double b)
    {
        return 2*(a+b);
    }

    // Metoda statyczna obliczająca pole stożka
    public static double PoleStozka(double r, double l)
    {
        return Math.PI*r*(r+l);
    }

    // Metoda statyczna obliczająca obwód stożka
    public static double ObwodStozka(double r, double l)
    {
        return Math.PI*r*(2+l);
    }

    // Metoda statyczna obliczająca pole walca
    public static double PoleWalca(double r, double h)
    {
        return 2*Math.PI*r*(r+h);
    }

    // Metoda statyczna obliczająca obwód walca
    public static double ObwodWalca(double r, double h)
    {
        return 2*Math.PI*r*h;
    }
}