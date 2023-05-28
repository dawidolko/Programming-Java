package obliczanieFigur;

import java.util.Scanner;

public class ObliczanieFigur {

    public static void main(String[] args) {
        // zadanie 4
        int wyborFigury;
        System.out.println("Wybierz figurę geometryczną:");
        System.out.println("1. Koło");
        System.out.println("2. Kwadrat");
        System.out.println("3. Prostokąt");
        System.out.println("4. Sześcian");
        System.out.println("5. Prostopadłościan");
        System.out.println("6. Kula");
        System.out.println("7. Stożek");
        Scanner sc = new Scanner(System.in);
        wyborFigury = sc.nextInt();

        switch (wyborFigury) {
            case 1:
                System.out.println("Podaj promień koła:");
                double promien = sc.nextDouble();
                Kolo kolo = new Kolo(promien);
                kolo.wyswietlDane();
                break;
            case 2:
                System.out.println("Podaj długość boku kwadratu:");
                double bok = sc.nextDouble();
                Kwadrat kwadrat = new Kwadrat(bok);
                kwadrat.wyswietlDane();
                break;
            case 3:
                System.out.println("Podaj długości boków prostokąta:");
                double bok1 = sc.nextDouble();
                double bok2 = sc.nextDouble();
                Prostokat prostokat = new Prostokat(bok1, bok2);
                prostokat.wyswietlDane();
                break;
            case 4:
                System.out.println("Podaj długość boku sześcianu:");
                double bok3 = sc.nextDouble();
                Szesciian szesciian = new Szesciian(bok3);
                szesciian.wyswietlDane();
                break;
            case 5:
                System.out.println("Podaj długości boków prostopadłościanu:");
                double bok4 = sc.nextDouble();
                double bok5 = sc.nextDouble();
                double bok6 = sc.nextDouble();
                Prostopadloscian prostopadloscian = new Prostopadloscian(bok4, bok5, bok6);
                prostopadloscian.wyswietlDane();
                break;
            case 6:
                System.out.println("Podaj promień kuli:");
                double promien1 = sc.nextDouble();
                Kula kula = new Kula(promien1);
                kula.wyswietlDane();
                break;
            case 7:
                System.out.println("Podaj dane stożka:");
                double promien2 = sc.nextDouble();
                double wysokosc = sc.nextDouble();
                Stozek stozek = new Stozek(promien2, wysokosc);
                stozek.wyswietlDane();
                break;
        }
    }
}
