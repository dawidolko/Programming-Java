package sklep;



public class Zamowienie {
    private static int nextId = 1;
    private int id;
    private Produkt produkt;
    private Klient klient;

    public Zamowienie(Produkt produkt, Klient klient) {
        this.id = nextId++;
        this.produkt = produkt;
        this.klient = klient;
    }

    public int getId() {
        return id;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}
