/*#11. Kurs Java dla początkujących - Funkcje / Metody https://www.youtube.com/watch?v=1R3zkiuxw9g&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=12*/
public class task11 {
    public static void main(String[] args)
    {
        wyswietl();
        String h = wyswietl1();
        System.out.println(h);
        System.out.println(dodaj(5));
        System.out.println(dodaj(5,6)); // jakbym tu dał obok siebie bylo by 12 po wykonało by sie 6+6
        System.out.println(dodaj());
    }
    public static void wyswietl()
    {
        System.out.println("Hello world!");
    }

    static String wyswietl1()
    {
        return "Hello world1!";
    }
    static int dodaj() // Przeciążenie, to robienie funkcji takich samych ale przyjmujących rozne argumenty.
    {
        return 0;
    }
    static int dodaj(int x) // tu argument x
    {
        return ++x;
    }
    static int dodaj(int x, int y) // tu x i y
    {
        return x+y;
    }
}
