public class Zadanie2_3 {
    public static void main(String[] args) {

        int x = 0b1010;
        int y;

        // Operator <<
        y = x << 2;
        System.out.println("x << 2 = " + y + " ( 1010 << 2 = 0010 0000 )");

        // Operator >>
        y = x >> 2;
        System.out.println("x >> 2 = " + y + " ( 1010 >> 2 = 0010 )");

        // Operator >>>
        y = x >>> 2;
        System.out.println("x >>> 2 = " + y + " ( 1010 >>> 2 = 0010 )");

//        int x = 10;     // 1010 w zapisie binarnym
//        int y = x << 2; // Przesunięcie o 2 bity w lewo: 101000 = 40 w zapisie dziesiętnym
//        System.out.println("x << 2 = " + y);
//
//        // Operator w prawo ze znakiem >>
//        int a = -10;    // 11111111111111111111111111110110 w zapisie binarnym (liczba ujemna)
//        int b = a >> 2; // Przesunięcie o 2 bity w prawo ze znakiem: 11111111111111111111111111111101 = -3 w zapisie dziesiętnym
//        System.out.println("a >> 2 = " + b);
//
//        // Operator w prawo bez znaku >>>
//        int c = -10;    // 11111111111111111111111111110110 w zapisie binarnym (liczba ujemna)
//        int d = c >>> 2; // Przesunięcie o 2 bity w prawo bez znaku: 00111111111111111111111111111101 = 1073741821 w zapisie dziesiętnym
//        System.out.println("c >>> 2 = " + d);
    }
}