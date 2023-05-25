package Task3;


//        a) Wyrażenie a) zwróci wyjątek ArithmeticException, ponieważ dzielenie przez zero jest niezdefiniowane i prowadzi do błędu arytmetycznego.
//        b) Wyrażenie b) zwróci wartość Infinity, ponieważ typ float obsługuje nieskończoność w obliczeniach zmiennoprzecinkowych.
//        c) Wyrażenie c) zwróci wyjątek ArithmeticException, ponieważ dzielenie przez zero jest niezdefiniowane i prowadzi do błędu arytmetycznego.

public class WyjatkiDzieleniaPrzezZero {
    public static void main(String[] args) {
        try {
            double x = 2.0 / 0.0;
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek ArithmeticException: " + e.getMessage());
        }

        try {
            float y = 2.0f / 0f;
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek ArithmeticException: " + e.getMessage());
        }

        try {
            int z = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek ArithmeticException: " + e.getMessage());
        }
    }
}