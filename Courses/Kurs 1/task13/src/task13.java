/*#13. Kurs Java dla początkujących - Rzutowanie i konwersja typów danych https://www.youtube.com/watch?v=pOPfj9tg274&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=14 */
public class task13 {
    public static void main(String[] args)
    {
        int a = Integer.MAX_VALUE;
        short b = (short) a; //rzutowanie jawne

        float c = 5.8f;
        int d = (int)c;

        String liczba = Integer.toString(d); // + "abc"

        int e = Integer.parseInt(liczba);

        try
        {
            e = Integer.parseInt(liczba);
            System.out.println(c + 2);
        }
        catch (Exception ex)
        {
            System.out.println("blad");
        }


        System.out.println(b);
        System.out.println(d);
        System.out.println(liczba);
        System.out.println(e + 2);
    }
}
