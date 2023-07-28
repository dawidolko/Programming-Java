public class Obliczenia {

    public double dodawanie(double a, double b){
        return a+b;
    }
    public double odejmowanie(double a, double b){
        return a-b;
    }
    public double mnozenie(double a, double b){
        return a*b;
    }
    public double dzielenie(double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
