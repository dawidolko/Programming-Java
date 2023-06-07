/*#25. Kurs Java dla początkujących - Dziedziczenie cz. 3 (Metody, abstract) https://www.youtube.com/watch?v=0rq1FUGMpmU&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=26*/
public class task25 {
    public static void main(String[] args)
    {
        Kot kot = new Kot(); // to wyswietla wszystkie funkcje bo jest zapisana jako klasa
        kot.dajGlos();
        //System.out.println(kot.toString());
        Animal pies = new Dog(); // rodzic przechowuje klase dziecka. DZIEDZICZENIE. // to nie wyswietla bo jest zapisane jako dziecko a wywołuje rodzic
        pies.dajGlos();
        ((Dog)pies).idz(); //rzutowanie cast to rzutowanie po ang.

        // Animal chomik = new Animal(); //blad bo klasa animal jest abstrakcyjna
    }
}
