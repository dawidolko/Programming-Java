/*#4. Kurs Java dla początkujących - Operatory porównania i logiczne https://www.youtube.com/watch?v=CqDaLUsykf0&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=5*/
public class task4 {
    public static void main(String[] args)
    {
        // OPERATORY PORÓWNANIA
        int a = 5, b = 6;
        boolean logiczna = a == b; //porownanie <--
        boolean logiczna1 = a != b; //różne <--
        boolean logiczna2 = a > b; //a wieksze <--
        boolean logiczna3 = a < b; //a mniejsze <--
        boolean logiczna4 = a <= b; //a mniejsze bądź równe <--
        System.out.println(logiczna);
        System.out.println(logiczna1);
        System.out.println(logiczna2);
        System.out.println(logiczna3);
        System.out.println(logiczna4);
        // OPERATORY LOGICZNE
        boolean logiczna5 = 5 >= 5 && 6 > 1; // prawda i prawda wiec prawda bo jest && wiec AND.
        System.out.println(logiczna5);
        boolean logiczna6= 5 >= 10 || 6 > 7; // FALSZ lub FALSZ wiec FALSZ bo jest || wiec OR. ( TO JEST TAKIE JAK NA LOGICE )
        System.out.println(logiczna6);

        // && AND ma pierszeństwo bo to jest tak jakby mnożenie a || to lub wiec to jest dodawanie.

        System.out.println(!logiczna6); // ! to jest negacja czyli zaprzeczenie.
    }
}
