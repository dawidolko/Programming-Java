/*#14. Kurs Java dla początkujących - Wstęp do klas i obiektów https://www.youtube.com/watch?v=y0EvXmqnkM8&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=15*/
public class task14 { //public powoduje to że poziom dostępu jest dostępny w calym naszym folderze.
    public static void main(String[] args)
    {
        System.out.println(Zwierze.count); // 0 bo jeszcze nie dodalem obiektow.
        Zwierze kot = new Zwierze();
        kot.glos = "Meeeow";
        kot.imie = "bajka";
        // System.out.println(kot.imie);
        kot.przedstawSie();
        kot.dajGlos(3);
        System.out.println(kot.count); //zawsze bedzie jeden chyba ze w liczniku dodam static i zmienie w funkcji main Nazwe klasy

        Zwierze pies = new Zwierze();
        pies.glos = "Hooow";
        pies.imie = "Gustaw";
        pies.przedstawSie();
        pies.dajGlos(2);

        System.out.println(Zwierze.count); // tu jest 2 bo jest jako 2 obiekt.
        System.out.println(pies.count);
    }
}