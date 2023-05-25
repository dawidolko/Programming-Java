package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] imiona = {"Anna", "Bartek", "Cezary", "Daria", "Ewa", "Filip", "Gosia", "Hubert", "Iza", "Jan"};
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (true) {
            try {
                System.out.print("Podaj nr indeksu (lub -1 aby zakończyć): ");
                String input = scanner.nextLine();
                index = Integer.parseInt(input);
                if (index == -1) {
                    break;
                }
                System.out.println("Imię: " + imiona[index]);
            } catch (NumberFormatException e) {
                System.out.println("Błędny format wprowadzonych danych!");
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Błędny indeks tablicy!");
            }
        }
        System.out.println("Koniec programu.");
    }
}
