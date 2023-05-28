package Task2;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Tworzymy obiekt Random
        Random rand = new Random();

        //Tworzymy obiekt TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        //Losujemy 100 liczb całkowitych i dodajemy je do TreeSet
        for (int i = 0; i < 100; i++) {
            treeSet.add(rand.nextInt(100));
        }

        //Tworzymy obiekt iterator
        var iterator = treeSet.iterator();

        //Wyświetlamy wylosowane liczby
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}