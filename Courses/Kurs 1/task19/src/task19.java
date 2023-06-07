import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

/*#19. Kurs Java dla początkujących - Kolekcje: Lista https://www.youtube.com/watch?v=042NlOSldnk&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=20*/
public class task19 {
    public static void main(String[] args)
    {
        Animal kot1 = new Animal("Rudy");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Bialy");

        ArrayList lista = new ArrayList();// alt + enter
        ArrayList<Animal> listaG = new ArrayList<Animal>(); // chroni przed bledami w dodawaniu obiektow.
        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);
        listaG.add(kot1);
        listaG.add(kot2);
        listaG.add(kot3);
        // listaG.add(3); <-- nie pozwoli i wyswietli bad 14 linika
        System.out.println("----------------");// sout to skrót tworzący calosc. <-- WAZNE! ! !
        for(Object k : listaG) //Object, nie objects bo to klasa specialna! ! !
        {
            System.out.println(((Animal)k).imie); //musze dac rzutowanie bo Object nie wylapuje niczego z poza tego. // przez 14 linike rzutowanie nie jest potrzebne.
        }
        System.out.println("----------------");

        System.out.println(listaG.get(0)); // Identyfikator <-- klasy i obiektu kota1
        System.out.println(((Animal)listaG.get(0)).imie); // Rzutowanie

        System.out.println(listaG.size()); // dlugosc listy

        System.out.println(listaG.contains(kot1)); // sprawdza czy istnieje jakis obiekt. mozna po przez nazwe oraz licznik np. 0, 1, 2 itp.

        listaG.remove(kot2); // usuwa 2 obiekt

        System.out.println("----------------"); // SPRAWDZAM CZY USUWA.
        for(Object k : listaG)
        {
            System.out.println(((Animal)k).imie);
        }
        System.out.println("----------------");

        System.out.println(listaG.size()); // 2
        listaG.clear(); //czyszczenie obiektow.
        System.out.println(listaG.size()); //0
    }
}
