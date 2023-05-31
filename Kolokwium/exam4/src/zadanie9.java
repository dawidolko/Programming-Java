public class zadanie9 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Wyjątek: " + e.getMessage());
        }
    }


    public static void divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Nie można dzielić przez 0.");
        } else {
            int result = a / b;
            System.out.println("Wynik dzielenia: " + result);
        }
    }
}