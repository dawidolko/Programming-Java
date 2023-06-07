/*#34. Kurs Java dla początkujących - Rekurencja https://www.youtube.com/watch?v=0ntw-KXxVZw&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=35*/
public class task34 {
    public static void main(String[] args)
    {
        final int LICZBA = 3;
        long start = System.nanoTime();
        System.out.println(silnia(LICZBA));
        long end = System.nanoTime();
        System.out.println("Czas: " + (end - start));

        System.out.println();

        start = System.nanoTime();
        System.out.println(silniaRek(LICZBA));
        end = System.nanoTime();
        System.out.println("Czas: " + (end - start));
    }

    private static long silniaRek(int x) {
        if(x <= 1)
        {
            return 1;
        }else
        {
            return x * silniaRek(x - 1);
        }
    }

    private static long silnia(int x) {
        long wynik = 1;
        while(x > 1){
            wynik *= x;
            x--;
        }
        return wynik;
    }
}
