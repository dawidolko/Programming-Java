package Library;

public class Podrecznik extends Ksiazka
{
    private String szkola;
    private int klasa;

    public Podrecznik()
    {
        this.szkola = "N/A";
        this.klasa = 0;
    }
    public Podrecznik(String tytul, String autor, int rokWydania, int liczbaStron, String szkola, int klasa)
    {
        super(tytul, autor, rokWydania, liczbaStron);
        this.szkola = szkola;
        this.klasa = klasa;
    }
    public Podrecznik(String tytul, String autor, int rokWydania, int liczbaStron, String szkola, int klasa, Ksiegarnia adres)
    {
        super(tytul, autor, rokWydania, liczbaStron, adres);
        this.szkola = szkola;
        this.klasa = klasa;
    }
    public Podrecznik(String tytul, String autor, int rokWydania, int liczbaStron, String szkola, int klasa, Ksiegarnia adres, Klient klient)
    {
        super(tytul, autor, rokWydania, liczbaStron, adres, klient);
        this.szkola = szkola;
        this.klasa = klasa;
    }

    public String getSzkola() {
        return szkola;
    }
    public void setSzkola(String szkola) {
        this.szkola = szkola;
    }
    public int getKlasa() {
        return klasa;
    }
    public void setKlasa(int klasa) {
        this.klasa = klasa;
    }

    public void opis()
    {
        System.out.printf("Informacje o podręczniku:\t\tTytuł: %s;\t\tAutor: %s;\t\tRok wydania: %d;\t\tLiczba stron: %d;\t\t" +
                "Przeznaczenie: %s;\t\tKlasa: %d;\t\t\n", getTytul(), getAutor(), getRokWydania(), getLiczbaStron(), szkola, klasa);
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
