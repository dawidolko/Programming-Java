import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*#21. Kurs Java dla początkujących - Kolekcje: operacje, sortowanie https://www.youtube.com/watch?v=E4z0TtaEiGs&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=22
 */
public class task21 {
    public static void main(String[] args)
    {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Poznan");
        lista.add("Warszawa");
        lista.add("Gdansk");
        lista.add("Szczecin");

        System.out.println();
        for(String e : lista)
        {
            System.out.println(e);
        }

        // SORTOWANIE ALFABETYNIE
        Collections.sort(lista); // <--
        System.out.println();
        for(String e : lista)
        {
            System.out.println(e);
        }

        System.out.println();
        System.out.println(Collections.min(lista)); // pierwsza posegregowana wartosc

        System.out.println();
        System.out.println(Collections.max(lista)); // ostatnia posegregowana wartosc

        Collections.reverse(lista); // odwrotnosc alfabetyczna
        System.out.println();
        for(String e : lista)
        {
            System.out.println(e);
        }

        Collections.shuffle(lista); // przetasuj losowo
        System.out.println();
        for(String e : lista)
        {
            System.out.println(e);
        }
        ArrayList<Animal> koty = new ArrayList<Animal>();
        Animal kot1 = new Animal("Czarny");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Biały");
        Animal kot4 = new Animal("Rudy");
        Animal kot5 = new Animal("Rudy");
        kot5.wiek = 10;

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);
        koty.add(kot5);
        System.out.println();
        for(Animal kot : koty)
        {
            System.out.println(kot.name + " " + kot.wiek + " lat.");
        }

        Collections.sort(koty); // implemantacja compareable <-- //sortuje alfabetycznie
        System.out.println();
        for(Animal kot : koty)
        {
            System.out.println(kot.name + " " + kot.wiek + " lat.");
        }

    }
}
