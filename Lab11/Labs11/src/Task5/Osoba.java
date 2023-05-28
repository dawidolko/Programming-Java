package Task5;

public class Osoba {
    //B)
    private String imie;
    private String nazwisko;
    private int wiek;
    private float wzrost;
    private float waga;

    public Osoba(String imie, String nazwisko, int wiek, float wzrost, float waga) throws NegativeNumberExcepion {
        if (imie == null || nazwisko == null)
            throw new NullPointerException();
        if (wiek < 0 || wzrost < 0 || waga < 0)
            throw new NegativeNumberExcepion("Osoba");
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null)
            throw new NullPointerException();
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null)
            throw new NullPointerException();
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) throws NegativeNumberExcepion {
        if (wiek < 0)
            throw new NegativeNumberExcepion("setWiek");
        this.wiek = wiek;
    }

    public float getWzrost() {
        return wzrost;
    }

    public void setWzrost(float wzrost) throws NegativeNumberExcepion {
        if (wzrost < 0)
            throw new NegativeNumberExcepion("setWzrost");
        this.wzrost = wzrost;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) throws NegativeNumberExcepion {
        if (waga < 0)
            throw new NegativeNumberExcepion("setWaga");
        this.waga = waga;
    }
}
