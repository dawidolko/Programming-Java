/*#12. Kurs Java dla początkujących - Wysyłanie argumentów do funkcji https://www.youtube.com/watch?v=gqXlGOLE8EE&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=13*/
public class task12 {
    public static void main(String[] args)
    {
        int[] y = {5}; // w c to byl wskaznik a tu jest referencja
        zmien(y); //5 // y = zmien(y); <-- 20
        System.out.println(y[0]);
    }
    public  static int[] zmien(int[] x) // void zamienic na int
    {
        x = new int[1];
        x[0] += 20;
        System.out.println("Metoda: " + x[0]);
        return x;
    }
}
