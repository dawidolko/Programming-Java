package Library;

public class Powiesc extends Ksiazka
{
    private String gatunek;

    public Powiesc()
    {
        this.gatunek = "N/A";
    }
    public Powiesc(String tytul, String autor, int rokWydania, int liczbaStron, String gatunek)
    {
        super(tytul, autor, rokWydania, liczbaStron);
        this.gatunek = gatunek;
    }
    public Powiesc(String tytul, String autor, int rokWydania, int liczbaStron, String gatunek, Ksiegarnia adres)
    {
        super(tytul, autor, rokWydania, liczbaStron, adres);
        this.gatunek = gatunek;
    }
    public Powiesc(String tytul, String autor, int rokWydania, int liczbaStron, String gatunek, Ksiegarnia adres, Klient klient)
    {
        super(tytul, autor, rokWydania, liczbaStron, adres, klient);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void opis()
    {
        System.out.printf("Informacje o powieści:\t\tTytuł: %s;\t\tAutor: %s;\t\tRok wydania: %d;\t\tLiczba stron: %d;\t\t" +
                "Gatunek: %s;\t\t\n", getTytul(), getAutor(), getRokWydania(), getLiczbaStron(), gatunek);
    }
    public void opisKg()
    {
        opis();
        System.out.print("\t\t");
        getAdres().opis();
        System.out.print("\n");
    }
    public void zakup()
    {
        getKlient().opisZakup();
        System.out.print("\t\t");
        opis();
        System.out.print("\t\t");
        getAdres().opis();
        System.out.print("\n");
    }
}
