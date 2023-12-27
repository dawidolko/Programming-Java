abstract class Potrawa {
    protected String nazwa;
    protected int temperaturaMin;
    protected int temperaturaMax;
    protected int czasMin;
    protected int czasMax;

    public Potrawa(String nazwa, int temperaturaMin, int temperaturaMax, int czasMin, int czasMax) {
        this.nazwa = nazwa;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
        this.czasMin = czasMin;
        this.czasMax = czasMax;
    }

    public abstract void gotuj();

    public String getNazwa() {
        return nazwa;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public int getCzasMin() {
        return czasMin;
    }

    public int getCzasMax() {
        return czasMax;
    }
}
