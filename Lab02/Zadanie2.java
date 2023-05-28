import java.util.Scanner;

//Zadanie 2.
//        Napisz kalkulator obliczający: sumę, różnicę, iloczyn, iloraz, potęgę, pierwiastek, oraz wartości
//        funkcji trygonometrycznych dla zadanego kąta. Użyj biblioteki Math np. Math. Sin(2.5). Proszę
//        pamiętać, że wartości kąta podawane do funkcji mierzone są miarą łukową. Wyniki działania
//        algorytmów wyświetlaj na konsoli. Do obsługi menu proszę użyć konstrukcji switch-case oraz pętli
//        while.

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnożenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Potęga");
            System.out.println("6 - Pierwiastek");
            System.out.println("7 - Sinus");
            System.out.println("8 - Cosinus");
            System.out.println("9 - Tangens");
            System.out.println("0 - Wyjście");

            System.out.print("Wybrałeś: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Podaj pierwszą liczbę:");
                    double a = scanner.nextDouble();
                    System.out.println("Podaj drugą liczbę:");
                    double b = scanner.nextDouble();
                    double sum = a + b;
                    System.out.println("Suma wynosi: " + sum);
                    break;
                case 2:
                    System.out.println("Podaj pierwszą liczbę:");
                    a = scanner.nextDouble();
                    System.out.println("Podaj drugą liczbę:");
                    b = scanner.nextDouble();
                    double diff = a - b;
                    System.out.println("Różnica wynosi: " + diff);
                    break;
                case 3:
                    System.out.println("Podaj pierwszą liczbę:");
                    a = scanner.nextDouble();
                    System.out.println("Podaj drugą liczbę:");
                    b = scanner.nextDouble();
                    double prod = a * b;
                    System.out.println("Iloczyn wynosi: " + prod);
                    break;
                case 4:
                    System.out.println("Podaj pierwszą liczbę:");
                    a = scanner.nextDouble();
                    System.out.println("Podaj drugą liczbę:");
                    b = scanner.nextDouble();
                    double quotient = a / b;
                    System.out.println("Iloraz wynosi: " + quotient);
                    break;
                case 5:
                    System.out.println("Podaj podstawę:");
                    a = scanner.nextDouble();
                    System.out.println("Podaj wykładnik:");
                    b = scanner.nextDouble();
                    double pow = Math.pow(a, b);
                    System.out.println("Wynik wynosi: " + pow);
                    break;
                case 6:
                    System.out.println("Podaj liczbę:");
                    a = scanner.nextDouble();
                    double sqrt = Math.sqrt(a);
                    System.out.println("Pierwiastek wynosi: " + sqrt);
                    break;
                case 7:
                    System.out.println("Podaj kąt w radianach:");
                    double angle = scanner.nextDouble();
                    double sin = Math.sin(angle);
                    System.out.println("Sinus wynosi: " + sin);
                    break;
                case 8:
                    System.out.println("Podaj kąt w radianach:");
                    angle = scanner.nextDouble();
                    double cos = Math.cos(angle);
                    System.out.println("Cosinus wynosi: " + cos);
                    break;
                case 9:
                    System.out.println("Podaj kąt w radianach:");
                    angle = scanner.nextDouble();
                    double tan = Math.tan(angle);
                    System.out.println("Tangens wynosi: " + tan);
                    break;
                case 0:
                    System.out.println("Zakończyłeś program!");
                    exit = true;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja!");
                    break;
            }
        }
    }
}