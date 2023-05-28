package daneosobowe;

import daneosobowe.Osoba;
import daneosobowe.Student;

import java.util.Scanner;


public class DaneOsobowe {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        // 1 zadanie
//        Osoba osoba1 = new Osoba("Jan", "Kowalski", 15);
//        osoba1.PokazDane();
//
//        System.out.println("-------------------------------------");
//        Osoba osoba2 = new Osoba("Adam", "Nowak");
//        osoba2.PokazDane();
//
//        System.out.println("-------------------------------------");
//        osoba2.imie="Stefan";
//        osoba2.wiek=70;
//        osoba2.PokazDane();
//
//        System.out.println("-------------------------------------");
//        Osoba osoba3 = new Osoba();
//        osoba3.imie="Anna";
//        osoba3.nazwisko="Wiśniewska";
//        osoba3.wiek=45;
//        osoba3.PokazDane();

        // 2 zadanie
        System.out.println("-------------------------------------");
        Student student1 = new Student("Dawid", "Olko");
        student1.nr_indeksu=122222;
        student1.rok=2022;
        student1.nazwa="Matematyka";
        student1.pokazdane();

        System.out.println("-------------------------------------");
        Student student2 = new Student(125148, "Informatyka");
        student2.imie="Dorota";
        student2.nazwisko="Pawlak";
        student2.rok=2020;
        student2.pokazdane();

        System.out.println("-------------------------------------");
        Student student3 = new Student(2022);
        student3.imie="Damian";
        student3.nazwisko="Rojek";
        student3.nr_indeksu=125111;
        student3.nazwa="Elekromobilność";
        student3.pokazdane();

        System.out.println("-------------------------------------");
        Student student4 = new Student("Dawid", "Olko", 125148, "Informatyka", 2023);
        student4.pokazdane();

        // 3 zadanie
        System.out.println("-------------------------------------");
        Student student5 = new Student(125148, "Informatyka"); // Losowo wygrałem konstruktor poniewaz nie bylo pustego.
        student5.wprowadzDane();
        student5.pokazdane();
    }
}