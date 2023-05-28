import java.util.Scanner;

public class Zadanie4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = input.nextInt();

        int silnia = 1;
        for (int i = 2; i <= n; i++) {
            silnia *= i;
        }

        System.out.println("Silnia z " + n + " wynosi " + silnia);
    }
}
