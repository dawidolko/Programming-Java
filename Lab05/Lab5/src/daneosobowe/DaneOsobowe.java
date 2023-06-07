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
        // 1 zadanie
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 15);
        osoba1.PokazDane();

        System.out.println("-------------------------------------");
        Osoba osoba2 = new Osoba("Adam", "Nowak");
        osoba2.PokazDane();

        System.out.println("-------------------------------------");
        osoba2.setImie("Stefan");
        osoba2.setWiek(20);
        osoba2.PokazDane();

        System.out.println("-------------------------------------");
        Osoba osoba3 = new Osoba();
        osoba3.setImie("Anna");
        osoba3.setNazwisko("Wiśniewska");
        osoba3.setWiek(45);
        osoba3.PokazDane();

        // 2 zadanie
        System.out.println("-------------------------------------");
        Student student1 = new Student("Dawid", "Olko");
        student1.setNr_indeksu(122222);
        student1.setRok(2022);
        student1.setNazwa("Matematyka");
        student1.pokazdane();

        System.out.println("-------------------------------------");
        Student student2 = new Student(125148, "Informatyka");
        student2.setImie("Dorota");
        student2.setNazwisko("Pawlak");
        student2.setRok(2022);
        student2.pokazdane();

        System.out.println("-------------------------------------");
        Student student3 = new Student(2022);
        student3.setImie("Damian");
        student3.setNazwisko("Rojek");
        student3.setNr_indeksu(125111);
        student3.setNazwa("Elekromobilność");
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