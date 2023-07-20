/*#30. Kurs Java dla początkujących - Wielowątkowość - Thread https://www.youtube.com/watch?v=RpDIMnB9yFg&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=31*/
public class task30 {
    public static void main(String[] args)
    {
        //Obliczenia ob1 = new Obliczenia();
        //Obliczenia ob2 = new Obliczenia(); //<-- tu moglismy <---

        Thread ob1 = new Thread(new Obliczenia());
        Thread ob2 = new Thread(new Obliczenia()); // po przez to tracimy interfejs poniewaz nie mozemy otworzyc metod zawardej w dziedziczonej klasie.

        ob1.start(); // ob1.run(); <-- jeden watek | ob1.start(); wielowatkowosc
        ob2.start();
    }
}
