import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", "Kowalski", new Date(), "mężczyzna");
        System.out.println(osoba);
        System.out.println();

        Student student = new Student("Anna", "Nowak", new Date(), "kobieta",
                12345, "stacjonarne", "informatyka", 2);
        System.out.println(student);
        System.out.println();

        Wykladowca wykladawca = new Wykladowca("Adam", "Mickiewicz", new Date(), "mężczyzna",
                "język polski", 60.0);
        System.out.println(wykladawca);
    }
}