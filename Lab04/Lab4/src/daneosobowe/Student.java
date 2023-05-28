package daneosobowe;

import java.util.Scanner;

public class Student {
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa;
    public int rok;

    public Student(String imie,String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    public Student(int nr_indeksu,String nazwa)
    {
        this.nr_indeksu=nr_indeksu;
        this.nazwa=nazwa;
    }
    public Student(int rok)
    {
        this.rok=rok;
    }
    public Student(String imie,String nazwisko,int nr_indeksu,String nazwa,int rok)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr_indeksu;
        this.nazwa=nazwa;
        this.rok=rok;

    }
    public void pokazdane() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("nr_indeksu: " + this.nr_indeksu);
        System.out.println("nazwa: " + this.nazwa);
        System.out.println("rok: " + this.rok);
    }
    public void wprowadzDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        this.imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        this.nazwisko = scanner.nextLine();
        System.out.println("Podaj nazwę specjalności: ");
        this.nazwa = scanner.nextLine();
        System.out.println("Podaj numer indeksu: ");
        this.nr_indeksu = scanner.nextInt();
        System.out.println("Podaj rok studiów: ");
        this.rok = scanner.nextInt();
    }
}