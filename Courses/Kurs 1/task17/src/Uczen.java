public class Uczen {
    private String nazwisko; // private dostep jest tylko w tej klasie.
    String getNazwisko()
    {
        return "Nazwisko: " + this.nazwisko;
    }
    void setNazwisko(String nazwisko)
    {
        if(nazwisko.length() >= 2)
        {
            this.nazwisko = nazwisko;
        }
    }
    private int ocena;
    int getOcena()
    {
        return  this.ocena;
    }
    void setOcena(int ocena)
    {
        if(ocena >= 1 && ocena <=6)
        {
            this.ocena = ocena;
        }
    }
}
