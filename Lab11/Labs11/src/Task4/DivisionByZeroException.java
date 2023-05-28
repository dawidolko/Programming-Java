package Task4;

public class DivisionByZeroException extends ArithmeticException {

    //A)
    public DivisionByZeroException() {
        super("Wystąpił wyjątek dzielenia przez zero");
    }

    @Override
    public String getMessage() {
        StackTraceElement[] elements = this.getStackTrace();
        return "Wywołanie metody " + elements[0].toString() + " spowodowało wyrzucnie wyjątku dzielenia przez zero";
    }
}