public class Samochod {
    private int id;
    private String marka;
    private String model;
    private int rokProdukcji;
    private int pojemnoscSilnika;
    private int mocSilnika;
    private int cena;
    private String kolor;
    private String rodzajPaliwa;

    public Samochod(int id, String marka, String model, int rokProdukcji, int pojemnoscSilnika, int mocSilnika, int cena, String kolor, String rodzajPaliwa) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.mocSilnika = mocSilnika;
        this.cena = cena;
        this.kolor = kolor;
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }

    public int getCena() {
        return cena;
    }

    public String getKolor() {
        return kolor;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }
}
