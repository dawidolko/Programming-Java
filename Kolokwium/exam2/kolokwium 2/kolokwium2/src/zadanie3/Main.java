package zadanie3;
// POLECENIE:

//Utwórz klasę generyczną o nazwie Tuple2, implementującą krotkę dwuwartościową. Utwórz odpowiedni konstruktor ustawiający
//        pola krotki oraz metody pobierające i ustawiające te pola.

public class Main {
    public static void main(String[] args) {
        Tuple2<String, Integer> tuple = new Tuple2<>("Hello", 123);
        System.out.println("Pierwszy: " + tuple.getFirst()); // Output: Pierwszy: Hello
        System.out.println("Drugi: " + tuple.getSecond()); // Output: Drugi: 123

        tuple.setFirst("World");
        tuple.setSecond(456);
        System.out.println("Pierwszy: " + tuple.getFirst()); // Output: Pierwszy: World
        System.out.println("Drugi: " + tuple.getSecond()); // Output: Drugi: 456

        Tuple2<Double, Boolean> anotherTuple = new Tuple2<>(3.14, true);
        System.out.println("Pierwszy: " + anotherTuple.getFirst()); // Output: Pierwszy: 3.14
        System.out.println("Drugi: " + anotherTuple.getSecond()); // Output: Drugi: true
    }
}

//wyniki; (tu znajdują się wyniki 3 typów z losowymi nazwami i cyframi)

//        Pierwszy: Hello
//        Drugi: 123
//        Pierwszy: World
//        Drugi: 456
//        Pierwszy: 3.14
//        Drugi: true
//
//        Process finished with exit code 0




