package zadanie3;

public class Produkt {
    private String nazwa;
    private float cena;
    private int kodKreskowy;
    private String krajPochodzenia;

    public Produkt() {}

    public Produkt(String nazwa, float cena, int kodKreskowy) {
        this.nazwa = nazwa;
        setCena(cena);
        setKodKreskowy(kodKreskowy);
    }

    public Produkt(String nazwa, float cena, int kodKreskowy, String krajPochodzenia) {
        this(nazwa, cena, kodKreskowy);
        this.krajPochodzenia = krajPochodzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa!=null)
        {
            this.nazwa = nazwa;
        }
        else
        {
            this.nazwa = null;
        }
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        if (cena > 0) {
            this.cena = cena;
        } else {
            System.out.println("Cena musi być większa od zera!");
        }
    }

    public int getKodKreskowy() {
        return kodKreskowy;
    }

    public void setKodKreskowy(int kodKreskowy) {
        if (kodKreskowy >= 10000000 && kodKreskowy <= 99999999) {
            this.kodKreskowy = kodKreskowy;
        } else {
            System.out.println("Kod kreskowy musi być wartością z przedziału od 10000000 do 99999999!");
        }
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        if(krajPochodzenia!=null)
        {
            this.krajPochodzenia = krajPochodzenia;
        }
        else
        {
            this.krajPochodzenia = null;
        }
    }

    public void wyswietlDaneProduktu() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Kod kreskowy: " + kodKreskowy);
        System.out.println("Kraj pochodzenia: " + krajPochodzenia);
    }
}
