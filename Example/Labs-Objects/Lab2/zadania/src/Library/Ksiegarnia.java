package Library;

public class Ksiegarnia
{
    private String ulica, nrBudynku, kodPocztowy, miejscowosc;

    public Ksiegarnia()
    {
        this.ulica = "N/A";
        this.nrBudynku = "N/A";
        this.kodPocztowy = "N/A";
        this.miejscowosc = "N/A";
    }
    public Ksiegarnia(String ulica, String nrBudynku, String kodPocztowy, String miejscowosc)
    {
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
        this.kodPocztowy = kodPocztowy;
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public String getNrBudynku() {
        return nrBudynku;
    }
    public void setNrBudynku(String nrBudynku) {
        this.nrBudynku = nrBudynku;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
    public String getMiejscowosc() {
        return miejscowosc;
    }
    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public void opis()
    {
        System.out.printf("Adres księgarni: Ulica %s %s, %s %s;\n", ulica, nrBudynku, kodPocztowy, miejscowosc);
    }
}
