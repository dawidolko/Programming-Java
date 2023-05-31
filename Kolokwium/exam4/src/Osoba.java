import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private double wzrost;
    private double waga;

    public Osoba(String imie, String nazwisko, int wiek, double wzrost, double waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 0;
        this.wzrost = 0;
        this.waga = 0;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void wprowadzDane() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        this.imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        this.nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        this.wiek = scanner.nextInt();
        System.out.println("Podaj wzrost: ");
        this.wzrost = scanner.nextInt();
        System.out.println("Podaj wage: ");
        this.waga = scanner.nextInt();
    }

    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Wzrost: " + wzrost);
        System.out.println("Waga: " + waga);
    }
}