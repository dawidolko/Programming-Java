/*#16. Kurs Java dla początkujących - Klasy i obiekty, kopiowanie https://www.youtube.com/watch?v=t-OIW2qbrt4&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=17*/
public class task16 {
    public static void main(String[] args)
    {
        int liczba = 50;
        //int liczba2 = 111;
        System.out.println("liczba przed: " + liczba);
        zmien(liczba);
        System.out.println("liczba po: " + liczba);
        Liczba gliczba = new Liczba();
        gliczba.liczba = 50;
        //gliczba2.liczba = gliczba;
        //gliczba2.liczba = 111;
        System.out.println("Obiekt liczba przed: " + gliczba.liczba);
        zmien(gliczba); // -1 jakbym dał gliczba.liczba bylo by 50.
        System.out.println("Obiekt liczba pp: " + gliczba.liczba);
    }
    public static void zmien(int liczba) // na bazie integer
    {
        liczba = -1;
        //System.out.println("liczba przed1: " + liczba);
    }
    public static  void zmien(Liczba gliczba) // na bazie klasy Liczba
    {
        //int temp = gliczba.liczba; //<-- 50
        gliczba.liczba = -1; // <-- -1
    }
}
