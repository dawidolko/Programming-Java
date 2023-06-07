package task5;

public class Main {
    //przykład zastosowania
    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Jan", "Kowalski", 25, "Programista");
        Pracownik p2 = new Pracownik("Piotr", "Nowak", 30, "Tester");

        Firma firma = new Firma();
        firma.addPracownik(p1);
        firma.addPracownik(p2);

        System.out.println("Lista pracowników: ");
        firma.showPracownicy();
    }
}
