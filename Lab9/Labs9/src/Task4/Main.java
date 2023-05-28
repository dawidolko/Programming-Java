//package Task4;
//
//import java.util.ArrayList;
//import java.util.List;
//
////public class Owoc {}
////class Jablko extends Owoc{}
////class Papierowka extends Jablko{}
////class Renta extends Jablko{}
//
//public class Main {
//    public static void main(String[] args) {
//        List<? extends Owoc> oList = new ArrayList<Jablko>();
//        //Błąd kompilacji - nie można dodawać obiektów żadnego typu
////        oList.add(new Jablko());
////        oList.add(new Owoc());
////        oList.add(new Object());
////        oList.add(new Papierowka());
//
//        oList.add(null);
//
//        //Wiadomo, że otrzymamy obiekt Owoc albo pochodny
//        Owoc f = oList.get(0);
//    }
//
//    static void writeToList(List<? super Jablko> lista)
//    {
//
//        lista.add(new Jablko());
////        lista.add(new Owoc());
////        lista.add(new Object());
////        lista.add(new Papierowka());
//    }
//}