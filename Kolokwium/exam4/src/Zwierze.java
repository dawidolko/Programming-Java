public abstract class Zwierze {
    private String nazwa;
    private double waga;
    private int wiek;

    public Zwierze(String nazwa, double waga, int wiek) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.wiek = wiek;
    }

    public abstract void je();

    public abstract void oddycha();

    public void pokazDane() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Waga: " + waga + " kg");
        System.out.println("Wiek: " + wiek + " lat");
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public int getWiek() {
        return wiek;
    }
}