package daneosobowe;

import java.util.Scanner;

public class Student {
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    private String nazwa;
    private int rok;

    public Student(String imie,String nazwisko)
    {
        this.setImie(imie);
        this.setNazwisko(nazwisko);
    }
    public Student(int nr_indeksu,String nazwa)
    {
        this.setNr_indeksu(nr_indeksu);
        this.setNazwa(nazwa);
    }
    public Student(int rok)
    {
        this.setRok(rok);
    }
    public Student(String imie,String nazwisko,int nr_indeksu,String nazwa,int rok)
    {
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNr_indeksu(nr_indeksu);
        this.setNazwa(nazwa);
        this.setRok(rok);

    }
    public void pokazdane() {
        System.out.println("Imie: " + this.getImie());
        System.out.println("Nazwisko: " + this.getNazwisko());
        System.out.println("nr_indeksu: " + this.getNr_indeksu());
        System.out.println("nazwa: " + this.getNazwa());
        System.out.println("rok: " + this.getRok());
    }
    public void wprowadzDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        this.setImie(scanner.nextLine());
        System.out.println("Podaj nazwisko: ");
        this.setNazwisko(scanner.nextLine());
        System.out.println("Podaj nazwę specjalności: ");
        this.setNazwa(scanner.nextLine());
        System.out.println("Podaj numer indeksu: ");
        this.setNr_indeksu(scanner.nextInt());
        System.out.println("Podaj rok studiów: ");
        this.setRok(scanner.nextInt());
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

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}