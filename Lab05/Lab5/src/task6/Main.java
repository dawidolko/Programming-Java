package task6;

public class Main {
    public static void main(String[] args) {
        Liczba liczba = new Liczba("12345");
        liczba.wypisz();
        liczba.mnozenie(2);
        liczba.wypisz();
        int dlugoscSilni = liczba.silnia(5);
        System.out.println("Długość silni: " + dlugoscSilni);
    }
}
