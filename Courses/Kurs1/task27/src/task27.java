/*#27. Kurs Java dla początkujących - Interfejsy https://www.youtube.com/watch?v=7g4FIK5GG4Q&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=28*/
public class task27 {
    public static void main(String[] args)
    {
        System.out.println(Poruszanie.nazwaInterfejsu);
        Samochod car = new Samochod("BMW", 4);
        car.jedzDoPrzodu();
        car.skrecaj();
    }
}
