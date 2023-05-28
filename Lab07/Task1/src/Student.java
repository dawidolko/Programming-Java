import java.util.Date;

public class Student extends Osoba {

    private int nrIndeksu;
    private String typStudiow;
    private String kierunek;
    private int rokStudiow;

    public Student(String imie, String nazwisko, Date dataUrodzenia, String plec,
                   int nrIndeksu, String typStudiow, String kierunek, int rokStudiow) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nrIndeksu = nrIndeksu;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
        this.rokStudiow = rokStudiow;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Numer indeksu: " + this.nrIndeksu + "\n" +
                "Typ studiów: " + this.typStudiow + "\n" +
                "Kierunek: " + this.kierunek + "\n" +
                "Rok studiów: " + this.rokStudiow;
    }
}
