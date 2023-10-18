package Library;

public class Ksiazka
{
    private Ksiegarnia adres = new Ksiegarnia();
    private String tytul, autor;
    private int rokWydania, liczbaStron;
    private Klient klient = new Klient();

    public Ksiazka()
    {
        this.tytul = "N/A";
        this.autor = "N/A";
        this.rokWydania = 0;
        this.liczbaStron = 0;
    }
    public Ksiazka(String tytul, String autor, int rokWydania, int liczbaStron)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
    }
    public Ksiazka(String tytul, String autor, int rokWydania, int liczbaStron, Ksiegarnia adres)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
        this.adres = adres;
    }
    public Ksiazka(String tytul, String autor, int rokWydania, int liczbaStron, Ksiegarnia adres, Klient klient)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
        this.adres = adres;
        this.klient = klient;
    }

    public Ksiegarnia getAdres() {
        return adres;
    }
    public void setAdres(Ksiegarnia adres) {
        this.adres = adres;
    }
    public String getTytul() {
        return tytul;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getRokWydania() {
        return rokWydania;
    }
    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
    public int getLiczbaStron() {
        return liczbaStron;
    }
    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
    public Klient getKlient() {
        return klient;
    }
    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public void opis()
    {
        System.out.printf("Informacje o książce:\t\tTytuł: %s;\t\tAutor: %s;\t\tRok wydania: %d;\t\tLiczba stron: %d;\t\t\n",
                tytul, autor, rokWydania, liczbaStron);
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
