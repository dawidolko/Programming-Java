package zadanie4;

public class Koszyk extends Produkt {
    private float pojemnosc;
    private String material;

    public Koszyk(String nazwa, float cena, int ilosc, float pojemnosc, String material) {
        super(nazwa, cena, ilosc);
        setPojemnosc(pojemnosc);
        this.material = material;
    }

    public Koszyk(String nazwa, float cena, float pojemnosc, String material) {
        this.getNazwa();
        setPojemnosc(pojemnosc);
        this.material = material;
    }

    public float getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(float pojemnosc) {
        if (pojemnosc > 0) {
            this.pojemnosc = pojemnosc;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if(material!=null)
        {
            this.material=material;
        }
        else
        {
            this.material=null;
        }
    }

    @Override
    public void wyswietlDaneProduktu() {
        super.wyswietlDaneProduktu();
        System.out.println("Pojemność: " + pojemnosc);
        System.out.println("Materiał: " + material);
    }
}
