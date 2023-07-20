/*#15. Kurs Java dla początkujących - Konstruktory klas https://www.youtube.com/watch?v=6k8q6v57A6k&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=16*/
public class task15 {
    public static void main(String[] args)
    {
        Czlowiek Jan = new Czlowiek("Jan"); // nowy konstruktor
        // Jan.imie = "Jan";
        System.out.println(Jan.imie);
        System.out.println(Czlowiek.count);

        Czlowiek daniel = new Czlowiek();
        daniel.imie = "Daniel";
        System.out.println(daniel.imie);
        System.out.println(Czlowiek.count);
    }
}
