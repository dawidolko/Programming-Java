import java.util.Scanner;

//Zadanie 7. Napisz program umożliwiający wprowadzanie n liczb oraz sortujący te liczby metodą
//        bąbelkową lub wstawiania. Wyniki wyświetlaj na konsoli.

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Podaj " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.println("Liczba "+ (i+1) +": ");
            arr[i] = input.nextInt();
        }

        // Sortowanie przez wstawianie
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Posortowane liczby:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}