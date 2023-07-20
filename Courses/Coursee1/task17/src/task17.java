/*#17. Kurs Java dla początkujących - Gettery i Settery hermetyzacja danych https://www.youtube.com/watch?v=Xxy5oz3EdmA&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=18*/
public class task17 {
    public static void main(String[] args)
    {
        Uczen u1 = new Uczen();
        u1.setNazwisko("Galka");
        System.out.println(u1.getNazwisko());
        u1.setNazwisko("K"); // nie wypisuje nic bo nazwisko ma jeden znak a jest zrobiony warunek ze musi miec conajmniej 2.
        System.out.println(u1.getNazwisko());

        System.out.println(u1.getOcena());
        u1.setOcena(4);
        System.out.println(u1.getOcena());
        u1.setOcena(9);
        System.out.println(u1.getOcena());

    }
}
