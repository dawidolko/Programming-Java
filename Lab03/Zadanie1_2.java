public class Zadanie1_2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Demonstracja operatora koniunkcji &&
        if (x < 10 && y > 5) {
            System.out.println("x jest mniejsze niż 10 i y jest większe niż 5");
        }

        // Demonstracja operatora alternatywy ||
        if (x < 10 || y < 5) {
            System.out.println("x jest mniejsze niż 10 lub y jest mniejsze niż 5");
        } else {
            System.out.println("x jest większe lub równe 10 i y jest większe lub równe 5");
        }
    }
}

