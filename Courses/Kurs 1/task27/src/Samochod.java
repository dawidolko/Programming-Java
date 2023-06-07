public class Samochod extends Pojazd implements Poruszanie, Comparable<String>{ // dziedziczyć klase mozna tylko jedną a interfejsow ile sie chce dodaje sie za pomocą implrements.

    Samochod(String nazwa, int iloscKol) {
        super(nazwa);
        this.iloscKol = iloscKol;
    }
    int iloscKol;

    @Override
    public void jedzDoPrzodu() {
        System.out.println("ja jade mordoo");

    }

    @Override
    public void skrecaj() {
        System.out.println("ups skreciłem");

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
