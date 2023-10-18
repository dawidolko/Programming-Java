package Person;

public class Osoba
{
    // Definicja pól
    String imie;
    String nazwisko;
    int wiek;

    // Konstruktor
    public Osoba()
    {
        // Ciało
    }

    // Konstruktor tworzący obiekt
    public Osoba(String imie, String nazwisko, int wiek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void info()
    {
        System.out.println(imie + " " + nazwisko + ", ma " + wiek + " lat");
    }

    public int getWiek()
    {
        return wiek;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setWiek(int wiek)
    {
        this.wiek = wiek;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
