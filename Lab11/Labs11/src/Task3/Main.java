package Task3;

public class Main {
    public static void main(String[] args) {
        double x = 2.0 / 0.0;
        System.out.println("Wynik wyrażenia double x=2.0/0.0: " + x);

        float y = 2.0f / 0f;
        System.out.println("Wynik wyrażenia float y=2.0f/0f: " + y);

        try {
            int z = 2 / 0;
            System.out.println("Wynik wyrażenia int z=2/0: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek typu ArithmeticException.");
        }
    }
}

//        a) double x=2.0/0.0;
//        Wynik: Infinity
//
//        b) float y=2.0f/0f;
//        Wynik: Infinity
//
//        c) int z=2/0;
//        Wynik: Wyjątek typu ArithmeticException.

