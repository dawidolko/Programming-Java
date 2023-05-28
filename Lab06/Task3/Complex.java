package Task3;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //obliczanie modułu liczby zespolonej
    public static double getModulus(Complex c) {
        return Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);
    }

    //obliczenie wartości liczby sprzężonej do liczby zespolonej
    public static Complex getConjugate(Complex c) {
        return new Complex(c.real, -c.imaginary);
    }

    //zamiana postaci algebraicznej liczby zespolonej na wykładniczą
    public static Complex algebraicToExponential(Complex c) {
        double modulus = getModulus(c);
        double argument = Math.atan2(c.imaginary, c.real);
        return new Complex(modulus * Math.cos(argument), modulus * Math.sin(argument));
    }

    //zamiana postaci wykładniczej liczby zespolonej na algebraiczną
    public static Complex exponentialToAlgebraic(Complex c) {
        double modulus = getModulus(c);
        double argument = Math.atan2(c.imaginary, c.real);
        return new Complex(modulus * Math.cos(argument), modulus * Math.sin(argument));
    }

    //dodawanie (z argumentami w postaci algebraicznej)
    public static Complex addAlgebraic(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    //dodawanie (z argumentami w postaci wykładnicze)
    public static Complex addExponential(Complex c1, Complex c2) {
        Complex c1Algebraic = exponentialToAlgebraic(c1);
        Complex c2Algebraic = exponentialToAlgebraic(c2);
        Complex result = addAlgebraic(c1Algebraic, c2Algebraic);
        return algebraicToExponential(result);
    }

    //odejmowanie (z argumentami w postaci algebraicznej)
    public static Complex subtractAlgebraic(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    //mnożenie (z argumentami w postaci algebraicznej)
    public static Complex multiplyAlgebraic(Complex c1, Complex c2) {
        return new Complex(c1.real * c2.real - c1.imaginary * c2.imaginary,
                c1.real * c2.imaginary + c1.imaginary * c2.real);
    }

    //dzielenie (z argumentami w postaci algebraicznej)
    public static Complex divideAlgebraic(Complex c1, Complex c2) {
        double divisor = Math.pow(c2.real, 2) + Math.pow(c2.imaginary, 2);
        return new Complex((c1.real * c2.real + c1.imaginary * c2.imaginary) / divisor,
                (c1.imaginary * c2.real - c1.real * c2.imaginary) / divisor);
    }

    //dzielenie (z argumentami w postaci wykładniczej)
    public static Complex divideExponential(Complex c1, Complex c2) {
        Complex c1Algebraic = exponentialToAlgebraic(c1);
        Complex c2Algebraic = exponentialToAlgebraic(c2);
        Complex result = divideAlgebraic(c1Algebraic, c2Algebraic);
        return algebraicToExponential(result);
    }

    //wartość liczby zespolonej w typie łańcuchowym (String) w postaci zapisu algebraicznego
    public static String toAlgebraicString(Complex c) {
        return c.real + " + " + c.imaginary + "i";
    }

    //wartość liczby zespolonej w typie łańcuchowym (String) w postaci zapisu wykładniczego
    public static String toExponentialString(Complex c) {
        double modulus = getModulus(c);
        double argument = Math.atan2(c.imaginary, c.real);
        return modulus + " * e^(" + argument + "i)";
    }

    //wartość liczby zespolonej w typie łańcuchowym (String) w postaci zapisu trygonometrycznego
    public static String toTrigonometricString(Complex c) {
        double modulus = getModulus(c);
        double argument = Math.atan2(c.imaginary, c.real);
        return modulus + " * (cos(" + argument + ") + i * sin(" + argument + "))";
    }
}