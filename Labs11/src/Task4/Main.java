package Task4;


public class Main {

    //B)
    public static void DivisionD(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        double result = a / b;
        System.out.println(result);
    }

    public static void DivisionF(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        float result = a / b;
        System.out.println(result);
    }

    //C)
    public static void main(String[] args) {
        try {
            DivisionD(5, 0); //Wywołanie metody DivisionD
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage()); //Wywołanie przesłoniętej metody getMessage()
        }

        try {
            DivisionF(5, 0); //Wywołanie metody DivisionF
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage()); //Wywołanie przesłoniętej metody getMessage()
        }

    }
}