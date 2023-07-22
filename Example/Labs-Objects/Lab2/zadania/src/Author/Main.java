package Author;

public class Main
{
    public static void main(String[] args)
    {
        Ksiazka k1 = new Ksiazka(new Osoba("Henryk","Sienkiewicz"),"Potop",320,50);
        System.out.println("Imię autora: " + k1.getAutor().getImie());
        System.out.println("Nazwisko autora: " + k1.getAutor().getNazwisko());
        System.out.println("Tytuł książki: " + k1.getTytul());
        System.out.println("Liczba stron książki: " + k1.getStrony());
        System.out.println("Cena książki: " + k1.getCena());
    }
}
