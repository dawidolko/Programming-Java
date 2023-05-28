import java.util.Scanner;

public class Zadanie4_3 {
        // wersja rekurencyjna
        public static int potega(int podstawa, int wykladnik) {
            if (wykladnik == 0) {
                return 1;
            } else {
                return podstawa * potega(podstawa, wykladnik - 1);
            }
        }

        // wersja iteracyjna
        public static int potegaIteracyjnie(int podstawa, int wykladnik) {
            int wynik = 1;
            for (int i = 1; i <= wykladnik; i++) {
                wynik *= podstawa;
            }
            return wynik;
        }

        public static void main(String[] args) {
            int podstawa = 0;
            int wykladnik = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("Podaj podstawe: ");
            podstawa = s.nextInt();
            System.out.println("Podaj wykladnik: ");
            wykladnik = s.nextInt();

            int wynik1 = potega(podstawa, wykladnik);
            int wynik2 = potegaIteracyjnie(podstawa, wykladnik);

            System.out.println(podstawa + " do potęgi " + wykladnik + " wynosi:");
            System.out.println("Wersja rekurencyjna: " + wynik1);
            System.out.println("Wersja iteracyjna: " + wynik2);
        }
}