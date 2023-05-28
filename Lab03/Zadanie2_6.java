public class Zadanie2_6 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("NOT " + a + " = " + !a);
        System.out.println("NOT " + b + " = " + !b); //Operacja NOT to operacja unarnego negacji, która zmienia wartość logiczną na przeciwną. Oto przykładowy program demonstrujący działanie operacji NOT w Javie:

        boolean c = true;
        boolean d = false;

        System.out.println(c + " XOR " + c + " = " + (c ^ c));
        System.out.println(c + " XOR " + d + " = " + (c ^ d));
        System.out.println(d + " XOR " + c + " = " + (d ^ c));
        System.out.println(d + " XOR " + d + " = " + (d ^ d)); //Jak widać, operacja XOR zwraca true tylko w przypadku, gdy jeden z argumentów jest true, a drugi false.
    }
}