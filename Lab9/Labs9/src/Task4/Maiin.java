package Task4;

import java.util.ArrayList;
import java.util.List;

public class Maiin {
    public static void main(String[] args) {
        //Tworzymy listę obiektów klasy Jabłko
        List<Jablko> jablka = new ArrayList<>();
        jablka.add(new Jablko());
        jablka.add(new Papierowka());
        jablka.add(new Reneta());

        //Możemy przypisać listę jabłek do listy owoców
        List<? extends Owoc> owoce = jablka;
        //Nie możemy dodać do niej obiektów
        //owoce.add(new Jablko());

        //Możemy pobrać obiekt Owoc, ale nie wiadomo jaki dokładnie obiekt się tam znajduje
        Owoc f = owoce.get(0);

        //Tworzymy listę obiektów klasy Owoc
        List<Owoc> owoce2 = new ArrayList<>();
        owoce2.add(new Owoc());
        owoce2.add(new Jablko());
        owoce2.add(new Papierowka());
        owoce2.add(new Reneta());
        owoce2.add(new Truskawka());
        owoce2.add(new Banan());

        //Możemy przypisać listę owoców do listy jabłek
        List<? super Jablko> jablka2 = owoce2;
        //Możemy dodać obiekty klasy Jabłko i jej podklasy
        jablka2.add(new Jablko());
        jablka2.add(new Papierowka());
        //Nie możemy dodać obiektu klasy Owoc ani innej nadklasy
        //jablka2.add(new Owoc());

        //Możemy pobrać tylko obiekt klasy Object z listy jabłek
        Object o = jablka2.get(0);

    }


}
