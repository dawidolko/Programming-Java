package dodatekZadanie2;

abstract class Zwierze {
    private String nazwa;
    private String gatunek;
    private float waga;

    public Zwierze(String nazwa, String gatunek, float waga) throws NegativeValueException {
        if (waga < 0) {
            throw new NegativeValueException("Waga zwierzęcia nie może być ujemna.");
        }
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.waga = waga;
    }

    public abstract void WydajGlos();

    public void PokazInformacje() {
        System.out.println("Dane zwierzęcia:");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Waga: " + waga + " kg");
        WydajGlos();
    }
}
