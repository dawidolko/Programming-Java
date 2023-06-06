import java.util.*;

/*https://www.youtube.com/watch?v=qlnhhDfc-Qg - kolekcje list, set(tree), map(Linked)*/
public class Main {
    public static void main(String[] args) {

        //List

        ArrayList<String> lista = new ArrayList<>();
        System.out.println(lista.size()); // rozmiar listy

        lista.add("Kasia"); // dodawanie obiektow do listy
        lista.add("Tomek");
        lista.add("Dariusz");

        System.out.println(lista.isEmpty()); // Sprawdzanie czy lista jest pusta
        System.out.println(lista); // sprawdzanie jej zawartosci
        System.out.println(lista.size()); // rozmiar listy

        System.out.println(lista.get(1));// wybrany 1 element listy czyli 'Tomek'
        System.out.println(lista.contains("Tomek"));//sprawdzenie czy istnieje podany String o tej nazwie

        lista.clear(); // czyszczenie listys
        System.out.println(lista); //pusta jak widac

        //Set | Tree

        Set<Integer> set = new HashSet<>();

        set.add(5); // dodawanie
        set.add(3);
        set.add(4);
        set.add(4);

        for(Integer obiekt : set)
        {
            System.out.println(obiekt+""); // tu nie da sie wypisac jak w liscie za pomoca sout(lista)! ! ! trzeba petla
            // wypisanie dodanych wartosci seta ( NIE WYPISUJE SIE DODANA TA SAMA WARTOSC ) ! ! !
        }

        Set<Integer> set2 = new TreeSet<>(); // TO TO SAMO TYLKO MOZNA WYPISAC ZA POMOCA SOUT(SET)

        set2.add(5);
        set2.add(3);
        set2.add(4);
        set2.add(4);

        System.out.println(set2); // tu sie da wypisac za pomoca sout(set2)

        //LinkedMap | Map
        Map<String, Integer> oceny = new HashMap<>(); // lista z kluczami i wartosciami
        Map<String, Integer> oceny1 = new LinkedHashMap<>(); // posegregowana lista  z kluczami i wartosciami. (W kolejnosci w jakiej wpisalismy)

        oceny.put("Matematyka", 5); // dopisywanie czegos do mapy
        oceny.put("Angielski", 4);
        oceny.put("Polski", 3);
        System.out.println(oceny); // wypisane calosci

        oceny1.put("Matematyka", 5); // dopisywanie czegos do LinkedMapy
        oceny1.put("Angielski", 4);
        oceny1.put("Polski", 3);
        System.out.println(oceny1); // wypisane calosci

        System.out.println(oceny.get("Matematyka")); // wypisane wartosci po kluczu

        for (String klucz : oceny.keySet())  // wypisane Kluczy za pomoga petli forEach
        {
            System.out.println(klucz);
        }

        for(Integer klucz1 : oceny.values()){
            System.out.println(klucz1); // wypisanie wartosci za pomoca petli forEach
        }
    }
}