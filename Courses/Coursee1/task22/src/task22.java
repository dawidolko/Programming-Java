import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*#22. Kurs Java dla początkujących - Kolekcje: Kolejka, Stos https://www.youtube.com/watch?v=Md7NCIMzPyI&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=23*/
public class task22 {
    public static void main(String[] args)
    {
        // Kolejka bierze pierwsze elementy.
        Queue<String> kolejka = new ArrayDeque<>(); // Queue to po ang. kolejka.

        kolejka.add("Pierwszy");
        kolejka.add("Drugi");
        kolejka.add("Trzeci");

        System.out.println(kolejka.size());
        System.out.println(kolejka.remove()); //usuwanie z kolejki 1
        System.out.println(kolejka.size());
        System.out.println(kolejka.poll()); // zwolni element 1(drugi bo 1 juz usunelo)
        System.out.println(kolejka.size());
        System.out.println(kolejka.remove()); // usunie ostatni bo juz 2 usunela
        System.out.println(kolejka.poll()); // pool jak kolejka jest pusta zwraca null a remove Warning wiec pool jest lepsze to tego.
        System.out.println(kolejka.size());

        // stak bierze ostatnie elementy
        Stack<String> stos = new Stack<>();
        stos.push("pierwszy");
        stos.push("drugi");
        stos.push("trzeci");
        System.out.println(stos.size()); // rozmiar
        System.out.println(stos.peek()); //podglada ostatni element, ale go nie usuwa
        System.out.println(stos.pop()); // ostatni jeden jest zdjęty (usuniety)
        stos.push("Ostatni");
        System.out.println(stos.pop());
    }
}
