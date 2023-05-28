import java.util.Date;

public class Osoba {

    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, Date dataUrodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
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

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Imię: " + this.imie + "\n" +
                "Nazwisko: " + this.nazwisko + "\n" +
                "Data urodzenia: " + this.dataUrodzenia + "\n" +
                "Płeć: " + this.plec;
    }
}
