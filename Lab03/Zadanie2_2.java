public class Zadanie2_2 {
    public static void main(String[] args) {

        // przykład dla operatorów &&
        int a = 5;
        int b = 10;

        int e = 011;
        int f = 1;

        if (a > 0 && b > 0) { // operatory logiczne to && i ||
            System.out.println("Obie wartości są większe od zera.");
        }
        if (a > 0 & b > 0) { // operatory bitowe to & i |
            System.out.println("ILOCZYN BITOWY: "+(e & f)); // iloczyn bitowy
            System.out.println("Obie wartości są większe od zera.");
        }

        // przykład dla operatorów ||
        int c = 5;
        int d = -10;
        if (c > 0 || d > 0) {
            System.out.println("Jedna z wartości jest większa od zera.");
        }
        if (c > 0 | d > 0) {
            System.out.println("SUMA BITOWA: "+ (c | d)); // suma bitowa
            System.out.println("Jedna z wartości jest większa od zera.");
        }
    }
}
