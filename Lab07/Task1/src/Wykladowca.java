import java.util.Date;

public class Wykladowca extends Osoba {

    private String przedmiot;
    private double stawkaGodzinowa;

    public Wykladowca(String imie, String nazwisko, Date dataUrodzenia, String plec,
                      String przedmiot, double stawkaGodzinowa) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.przedmiot = przedmiot;
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public double getStawkaGodzinowa() {
        return stawkaGodzinowa;
    }

    public void setStawkaGodzinowa(double stawkaGodzinowa) {
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Przedmiot: " + this.przedmiot + "\n" +
                "Stawka godzinowa: " + this.stawkaGodzinowa;
    }
}
