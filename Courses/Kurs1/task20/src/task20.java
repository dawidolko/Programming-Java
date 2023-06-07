import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*#20. Kurs Java dla początkujących - Kolekcje: Map, Set https://www.youtube.com/watch?v=Qae77e0_6tQ&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=21*/
public class task20 {
    public static void main(String[] args)
    {
        LinkedList<String> lista = new LinkedList<>(); // Tworzenie Linkedlist
        lista.add("Poznan");
        lista.add("Poznan");
        lista.add("Poznan");
        lista.add("Warszawa");
        lista.add("Warszawa");
        lista.remove(0);
        for(String e : lista)
        {
            System.out.println(e);
        }
        System.out.println(lista.size());
        lista.clear();

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Poniedzialek");
        mapa.put(5, "Piatek");
        mapa.put(7, "Niedziela");

        System.out.println(mapa.get(5));

        System.out.println(); // wypisuje wszystkie od najmniejszego do najwiekszego.
        for(String e : mapa.values())
        {
            System.out.println(e);
        }

        // nie musze uzywac warunku
        //if(zbior.contrains("Poznan") == false)
        //{
        //    zbior.contrains.add("Poznan");
        //}
        LinkedHashSet<String> zbior = new LinkedHashSet<>(); // alt + enter <-- TO ZAWIERA TEN WARUNEK.
        zbior.add("Warszawa");
        zbior.add("Poznan");
        zbior.add("Szczecin");
        zbior.add("Szczecin");
        System.out.println();
        for(String e : zbior)
        {
            System.out.println(e);
        }

        System.out.println(zbior.size()); // 3 a nie 4 dlatego ze takie jest zastosowanie HashSet
    }
}
