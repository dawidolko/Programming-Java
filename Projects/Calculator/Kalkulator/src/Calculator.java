import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kalkulator");
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Pierwiastek");
            System.out.println("6. Pochodna");
            System.out.println("7. Całka");
            System.out.println("8. Wyjście");

            System.out.print("Wybierz numer operacji: ");
            int choice = scanner.nextInt();

            if (choice == 8) {
                System.out.println("Koniec programu.");
                break;
            }

            try {
                switch (choice) {
                    case 1:
                        performAddition(scanner);
                        break;
                    case 2:
                        performSubtraction(scanner);
                        break;
                    case 3:
                        performMultiplication(scanner);
                        break;
                    case 4:
                        performDivision(scanner);
                        break;
                    case 5:
                        performSquareRoot(scanner);
                        break;
                    case 6:
                        performDerivative(scanner);
                        break;
                    case 7:
                        performIntegration(scanner);
                        break;
                    default:
                        System.out.println("Nieprawidłowy numer operacji.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Błąd arytmetyczny: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd argumentu: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Nieoczekiwany błąd: " + e.getMessage());
            }

            System.out.println();
        }
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Wynik dodawania: " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Wynik odejmowania: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Wynik mnożenia: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero.");
        }
        double result = num1 / num2;
        System.out.println("Wynik dzielenia: " + result);
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Podaj liczbę: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
        }
        double result = Math.sqrt(num);
        System.out.println("Wynik pierwiastkowania: " + result);
    }

    private static void performDerivative(Scanner scanner) {
        // Implementacja obliczania pochodnej
        // ...
    }

    private static void performIntegration(Scanner scanner) {
        // Implementacja obliczania całki
        // ...
    }
}
