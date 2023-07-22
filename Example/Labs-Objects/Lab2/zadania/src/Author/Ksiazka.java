package Author;

public class Ksiazka
{
    private Osoba autor;
    private String tytul;
    private double strony;
    private double cena;

    public Ksiazka(Osoba autor, String tytul, double strony, double cena)
    {
        this.autor = autor;
        this.tytul = tytul;
        this.strony = strony;
        this.cena = cena;
    }
    public Osoba getAutor() {
        return autor;
    }
    public String getTytul() {
        return tytul;
    }
    public double getStrony() {
        return strony;
    }
    public double getCena() {
        return cena;
    }
    public void setAutor(Osoba autor) {
        this.autor = autor;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public void setStrony(double strony) {
        this.strony = strony;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
}
