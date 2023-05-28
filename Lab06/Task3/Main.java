package Task3;

import static Task3.Complex.*;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        System.out.println("c1 = " + toAlgebraicString(c1));
        System.out.println("c2 = " + toAlgebraicString(c2));
        System.out.println("Modulus of c1 = " + getModulus(c1));
        System.out.println("Conjugate of c1 = " + toAlgebraicString(getConjugate(c1)));
        System.out.println("c1 to exponential form = " + toExponentialString(c1));
        System.out.println("c1 to trigonometric form = " + toTrigonometricString(c1));
        System.out.println("c1 + c2 = " + toAlgebraicString(addAlgebraic(c1, c2)));
        System.out.println("c1 + c2 = " + toExponentialString(addExponential(c1, c2)));
        System.out.println("c1 - c2 = " + toAlgebraicString(subtractAlgebraic(c1, c2)));
        System.out.println("c1 * c2 = " + toAlgebraicString(multiplyAlgebraic(c1, c2)));
        System.out.println("c1 / c2 = " + toAlgebraicString(divideAlgebraic(c1, c2)));
        System.out.println("c1 / c2 = " + toExponentialString(divideExponential(c1, c2)));
    }
}
