/*#2. Kurs Java dla początkujących - Typy danych, zmienne i stałe https://www.youtube.com/watch?v=sp10JnpVwlc&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=3
 */
public class task2 { //java to jezyk silnotypowany.
    public static void main(String[] args)
    {
        // komentarz
        /*znak
        * 1
        * 2
        * 3*/
        char zmChar;
        zmChar = 'a';
        System.out.println(zmChar);
        // String
        String stringChar; // tu tworzymy klase, ponieważ tego wymaga jezyk.
        stringChar = "abcdefg";
        System.out.println(stringChar);
        // Boolean
        boolean zmBool = true;
        System.out.println(zmBool);

        // byte
        byte zmByte = Byte.MIN_VALUE; // struktury to np. byte.min_value, a zmienne to byte zmByte
        byte zmByte2 = Byte.MAX_VALUE; // min_value and max to stałe...
        byte zmByte3 = 1;
        System.out.println("Byte: " + zmByte + " - " + zmByte2);

        // short

        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short: " + zmShort + " - " + zmShort2);

        // int

        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Integer: " + zmInt + " - " + zmInt2);

        // Long

        long zmLong = Long.MIN_VALUE;
        long zmLong1 = Long.MAX_VALUE;
        System.out.println("Long: " + zmLong + " - " + zmLong1);

        // float

        float zmFloat = 26.92313F; //float musi miec na koncu f inaczej jest warning.
        float zmFloat1 = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("Float: " + zmFloat1 + " - " + zmFloat2);

        // double

        double zmDouble = 26.92313;
        double zmDouble1 = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("Double: " + zmDouble1 + " - " + zmDouble2);

        final int liczba = 256; // STALA!

    }
}
