package Library;

public class Klient
{
    private String imie, nazwisko, pesel;

    public Klient()
    {
        this.imie = "N/A";
        this.nazwisko = "N/A";
        this.pesel = "N/A";
    }
    public Klient(String imie, String nazwisko, String pesel)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void opis()
    {
        System.out.printf("Informacje o kliencie:\t\tImię: %s;\t\tNazwisko: %s;\t\tPesel: %s;\t\t\n", imie, nazwisko, pesel);
    }
    public void opisZakup()
    {
        System.out.printf("Klient %s %s o numerze pesel %s zakupił następującą pozycję:\n", imie, nazwisko, pesel);
    }
}
