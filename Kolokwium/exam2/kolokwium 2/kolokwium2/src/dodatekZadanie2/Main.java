package dodatekZadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kaczka kaczka = utworzKaczke();
        Orzel orzel = utworzOrla();
        Lew lew = utworzLwa();
        Rekin rekin = utworzRekina();

        kaczka.PokazInformacje();
        System.out.println();
        orzel.PokazInformacje();
        System.out.println();
        lew.PokazInformacje();
        System.out.println();
        rekin.PokazInformacje();
    }

    public static Kaczka utworzKaczke() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę kaczki:");
            String nazwa = scanner.nextLine();
            System.out.println("Podaj gatunek kaczki:");
            String gatunek = scanner.nextLine();
            System.out.println("Podaj wagę kaczki (kg):");
            float waga = Float.parseFloat(scanner.nextLine());
            if (waga < 0) {
                throw new NegativeValueException("Waga zwierzęcia nie może być ujemna.");
            }
            System.out.println("Podaj predkosc plywania kaczki (km/h):");
            int predkoscPlywania = Integer.parseInt(scanner.nextLine());
            if (predkoscPlywania < 0) {
                throw new NegativeValueException("Predkosc plywania nie moze byc ujemna.");
            }
            System.out.println("Podaj glebokosc plywania kaczki (m):");
            int glebokosc = Integer.parseInt(scanner.nextLine());
            if (glebokosc < 0) {
                throw new NegativeValueException("Glebokosc nie moze byc ujemna.");
            }
            System.out.println("Podaj predkosc latania kaczki (km/h):");
            int predkoscLatania = Integer.parseInt(scanner.nextLine());
            if (predkoscLatania < 0) {
                throw new NegativeValueException("Predkosc latania nie moze byc ujemna.");
            }
            System.out.println("Podaj wysokosc latania kaczki (m):");
            int wysokosc = Integer.parseInt(scanner.nextLine());
            if (wysokosc < 0) {
                throw new NegativeValueException("Wysokosc nie moze byc ujemna.");
            }
            return new Kaczka(nazwa, gatunek, waga, predkoscPlywania, glebokosc, predkoscLatania, wysokosc);
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
            System.out.println("Spróbuj ponownie:");
            return utworzKaczke();
        } catch (NumberFormatException e) {
            System.out.println("Błędny format danych. Spróbuj ponownie:");
            return utworzKaczke();
        }
    }

    public static Orzel utworzOrla() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę orła:");
            String nazwa = scanner.nextLine();
            System.out.println("Podaj gatunek orła:");
            String gatunek = scanner.nextLine();
            System.out.println("Podaj wagę orła (kg):");
            float waga = Float.parseFloat(scanner.nextLine());
            if (waga < 0) {
                throw new NegativeValueException("Waga zwierzęcia nie może być ujemna.");
            }
            System.out.println("Podaj predkosc latania orła (km/h):");
            int predkoscLatania = Integer.parseInt(scanner.nextLine());
            if (predkoscLatania < 0) {
                throw new NegativeValueException("Predkosc latania nie moze byc ujemna.");
            }
            System.out.println("Podaj wysokosc latania orła (m):");
            int wysokosc = Integer.parseInt(scanner.nextLine());
            if (wysokosc < 0) {
                throw new NegativeValueException("Wysokosc nie moze byc ujemna.");
            }
            return new Orzel(nazwa, gatunek, waga, predkoscLatania, wysokosc);
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
            System.out.println("Spróbuj ponownie:");
            return utworzOrla();
        } catch (NumberFormatException e) {
            System.out.println("Błędny format danych. Spróbuj ponownie:");
            return utworzOrla();
        }
    }

    public static Lew utworzLwa() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę lwa:");
            String nazwa = scanner.nextLine();
            System.out.println("Podaj gatunek lwa:");
            String gatunek = scanner.nextLine();
            System.out.println("Podaj wagę lwa (kg):");
            float waga = Float.parseFloat(scanner.nextLine());
            if (waga < 0) {
                throw new NegativeValueException("Waga zwierzęcia nie może być ujemna.");
            }
            System.out.println("Podaj predkosc biegania lwa (km/h):");
            int predkoscBiegania = Integer.parseInt(scanner.nextLine());
            if (predkoscBiegania < 0) {
                throw new NegativeValueException("Predkosc biegania nie moze byc ujemna.");
            }
            return new Lew(nazwa, gatunek, waga, predkoscBiegania);
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
            System.out.println("Spróbuj ponownie:");
            return utworzLwa();
        } catch (NumberFormatException e) {
            System.out.println("Błędny format danych. Spróbuj ponownie:");
            return utworzLwa();
        }
    }
    public static Rekin utworzRekina() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę rekina:");
            String nazwa = scanner.nextLine();
            System.out.println("Podaj gatunek rekina:");
            String gatunek = scanner.nextLine();
            System.out.println("Podaj wagę rekina (kg):");
            float waga = Float.parseFloat(scanner.nextLine());
            if (waga < 0) {
                throw new NegativeValueException("Waga zwierzęcia nie może być ujemna.");
            }
            System.out.println("Podaj predkosc plywania rekina (km/h):");
            int predkoscPlywania = Integer.parseInt(scanner.nextLine());
            if (predkoscPlywania < 0) {
                throw new NegativeValueException("Predkosc plywania nie moze byc ujemna.");
            }
            System.out.println("Podaj glebokosc plywania rekina (m):");
            int glebokosc = Integer.parseInt(scanner.nextLine());
            if (glebokosc < 0) {
                throw new NegativeValueException("Glebokosc nie moze byc ujemna.");
            }
            return new Rekin(nazwa, gatunek, waga, predkoscPlywania, glebokosc);
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
            System.out.println("Spróbuj ponownie:");
            return utworzRekina();
        } catch (NumberFormatException e) {
            System.out.println("Błędny format danych. Spróbuj ponownie:");
            return utworzRekina();
        }
    }
}

//wyniki: (jesli podamy ujemna wartosc bedzie petla ktora pozwoli przejsc dalej tylko gdy podamy wartosc dodatnią)

//    Podaj nazwę kaczki:
//        Daria
//        Podaj gatunek kaczki:
//        Domowa
//        Podaj wagę kaczki (kg):
//        1
//        Podaj predkosc plywania kaczki (km/h):
//        1
//        Podaj glebokosc plywania kaczki (m):
//        1
//        Podaj predkosc latania kaczki (km/h):
//        1
//        Podaj wysokosc latania kaczki (m):
//        1
//        Podaj nazwę orła:
//        Orzel
//        Podaj gatunek orła:
//        Gatunek
//        Podaj wagę orła (kg):
//        1
//        Podaj predkosc latania orła (km/h):
//        1
//        Podaj wysokosc latania orła (m):
//        1
//        Podaj nazwę lwa:
//        1
//        Podaj gatunek lwa:
//        1
//        Podaj wagę lwa (kg):
//        1
//        Podaj predkosc biegania lwa (km/h):
//        1
//        Podaj nazwę rekina:
//        Rekin
//        Podaj gatunek rekina:
//        Gatunek
//        Podaj wagę rekina (kg):
//        1
//        Podaj predkosc plywania rekina (km/h):
//        1
//        Podaj glebokosc plywania rekina (m):
//        1
//        Dane zwierzęcia:
//        Nazwa: Daria
//        Gatunek: Domowa
//        Waga: 1.0 kg
//        Kwa kwa!
//
//        Dane zwierzęcia:
//        Nazwa: Orzel
//        Gatunek: Gatunek
//        Waga: 1.0 kg
//        Skrr!
//
//        Dane zwierzęcia:
//        Nazwa: 1
//        Gatunek: 1
//        Waga: 1.0 kg
//        Ryczenie lwa!
//
//        Dane zwierzęcia:
//        Nazwa: Rekin
//        Gatunek: Gatunek
//        Waga: 1.0 kg
//        Jaws music...

