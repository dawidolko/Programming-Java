import java.util.Scanner;

// Zadanie 1.
// Napisz program obliczający wyróżnik delta i pierwiastki trójmianu kwadratowego.

public class Zadanie1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc A: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj wartosc B: ");
        double b = scanner.nextDouble();
        System.out.println("Podaj wartosc C: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        System.out.println("Delta wynosi: " + delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Pierwiastki trójmianu kwadratowego wynoszą: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Pierwiastek trójmianu kwadratowego wynosi: x = " + x);
        }
        else {
            System.out.println("Brak pierwiastków trójmianu kwadratowego.");
        }
    }
}
