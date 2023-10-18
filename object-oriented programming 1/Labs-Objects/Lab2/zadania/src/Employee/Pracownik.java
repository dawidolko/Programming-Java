package Employee;

public class Pracownik
{
    private String imie, nazwisko;
    private int wyplata;

    public Pracownik()
    {
        imie = " ";
        nazwisko = " ";
        wyplata = 0;
    }
    public Pracownik(String imie, String nazwisko, int wyplata)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWyplata() {
        return wyplata;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    public void Wypisz()
    {
        System.out.print("\nJestem pracownikiem, moje dane: \t\t\tImie: " + imie + "\t\tNazwisko: " + nazwisko + " \t\tWyplata: " + wyplata);
    }
}
