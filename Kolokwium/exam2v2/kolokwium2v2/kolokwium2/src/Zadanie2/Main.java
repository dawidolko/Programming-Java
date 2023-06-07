package Zadanie2;

//POLECENIE:

//Utwórz klasę abstrakcyjną Zwierze.
//        - Klasa posiada odpowiednie pola: nazwa: String,  gatunek:String, wiek: int.
//        - Dokonaj hermetyzacji pól pamiętając, że wiek nie może być ujemny. W razie wprowadzenia wartości ujemnej ma
//        być wyrzucony wyjątek ValueNegativeException.
//        - Klasa posiada odpowiednie konstruktory (przynajmniej dwa).
//        - Klasa ma dwie metody: abstrakcją WydajGlos() i zwykłą (konkretną) PokazInformacje().
//        Metoda PokazInformacje() powinna wyświetlać w konsoli tekst „Dane zwierzęcia:”, a następnie jego nazwa, gatunek,
//        wiek oraz wywoływać metodę WydajGlos(). (6 pkt)
//
//        B) Utwórz interfejsy z metodami abstrakcyjnymi (2 pkt):
//        •	IPlywanie z metodą: Plywaj(int predkoscPlywania, int glebokosc);
//        •	IBieganie z metodą: Biegnij(int predkoscBiegania);
//        •	ILatanie z metodą: Lataj(int predkoscLatania, int wysokosc);
//        •	IDrapieznictwo z metodą: Atakuj();
//
//        C) Utwórz klasy:
//        - Jelen, Sokol, Tygrys, Pirania dziedziczące po klasie Zwierze i implementujące odpowiednie interfejsy (interfejsy
//        należy dopasować do każdego zwierzęcia).
//        - Dla każdego zwierzęcia dodaj odpowiednie pola przechowujące odpowiednie dane odnośnie prędkości biegania, latania,
//        pływania, głębokości i wysokości, w zależności od tego jakie interfejsy implementuje klasa.
//        - Utwórz odpowiednie konstruktory na bazie konstruktora klasy bazowej z uwzględnieniem dodanych pól.
//        - Przesłoń metodę WydajGlos() oraz zaimplementuj metody z przypisanych klasie interfejsów.
//        - Przesłoń metodę PokazInformacje() dodając w niej wyświetlanie pól dodanych w klasach Jelen, Sokol, Tygrys, Pirania.
//        Zaimplementuj metody abstrakcyjne oddziedziczone po interfejsach tak aby wartości w nich ustawiane (odpowiednio dodane
//        pola klasy) mogły przyjmować tylko wartości dodatnie (chodzi o atrybuty: prędkość pływania i biegania, wysokość i głębokość)
//        (10 pkt)
//
//        D)  (Uwaga zadanie wymagane – bez niego kolokwium będzie niezaliczone)
//        Utwórz klasę Main posiadającą metodę main jako punkt startowy programu. Utwórz w metodzie main obiekty zwierząt  Jelen,
//        Sokol, Tygrys, Pirania. Dla wszystkich obiektów wywołaj metodę PokazInformacje(). (2 pkt)
//
//        E) W klasie Main utwórz metody statyczne umożliwiające wprowadzanie danych zwierząt. Wychwyć wyjątki typu ValueNegativeException
//        i obsłuż je w taki sposób, że jeżeli użytkownik poda negatywną wartość wyświetla mu się informacja o błędnie podanej wartości i rekurencyjnie wywołuje się ta metoda wprowadzająca dane, aż do skutku (aż użytkownik poda właściwą wartość, większą od zera). (4pkt.)
//
//        F) W metodzie main utwórz dodatkowo 10-elementową tablicę przechowującą różne zwierzęta. Przejdź tablicę przy użyciu pętli i
//        wywołaj dla każdego elementu tablicy metodę  PokazInformacje().


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jelen jelen = null;
        try {
            jelen = new Jelen("Jeleń", "Sarenka", -5, 40);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            jelen = wczytajJelena();
        }
        jelen.PokazInformacje();

        Sokol sokol = null;
        try {
            sokol = new Sokol("Sokół", "Sokolnik", 8, 100, 500);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            sokol = wczytajSokola();
        }
        sokol.PokazInformacje();

        Tygrys tygrys = null;
        try {
            tygrys = new Tygrys("Tygrys", "Bengalski", 10, 60);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            tygrys = wczytajTygrysa();
        }
        tygrys.PokazInformacje();

        Pirania pirania = null;
        try {
            pirania = new Pirania("Pirania", "Czerwona", 2, 30, 10);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            pirania = wczytajPiranie();
        }
        pirania.PokazInformacje();

        Zwierze[] zwierzeta = new Zwierze[10];
        zwierzeta[0] = jelen;
        zwierzeta[1] = sokol;
        zwierzeta[2] = tygrys;
        zwierzeta[3] = pirania;
        for (Zwierze zwierze : zwierzeta) {
            if (zwierze != null) {
                zwierze.PokazInformacje();
            }
        }
    }

    public static Jelen wczytajJelena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane dla jelenia:");
        System.out.print("Nazwa: ");
        String nazwa = scanner.nextLine();
        System.out.print("Gatunek: ");
        String gatunek = scanner.nextLine();
        System.out.print("Wiek: ");
        int wiek = scanner.nextInt();
        System.out.print("Prędkość biegania: ");
        int predkoscBiegania = scanner.nextInt();
        try {
            return new Jelen(nazwa, gatunek, wiek, predkoscBiegania);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            return wczytajJelena();
        }
    }

    public static Sokol wczytajSokola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane dla sokoła:");
        System.out.print("Nazwa: ");
        String nazwa = scanner.nextLine();
        System.out.print("Gatunek: ");
        String gatunek = scanner.nextLine();
        System.out.print("Wiek: ");
        int wiek = scanner.nextInt();
        System.out.print("Prędkość latania: ");
        int predkoscLatania = scanner.nextInt();
        System.out.print("Wysokość: ");
        int wysokosc = scanner.nextInt();
        try {
            return new Sokol(nazwa, gatunek, wiek, predkoscLatania, wysokosc);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            return wczytajSokola();
        }
    }

    public static Tygrys wczytajTygrysa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane dla tygrysa:");
        System.out.print("Nazwa: ");
        String nazwa = scanner.nextLine();
        System.out.print("Gatunek: ");
        String gatunek = scanner.nextLine();
        System.out.print("Wiek: ");
        int wiek = scanner.nextInt();
        System.out.print("Prędkość biegania: ");
        int predkoscBiegania = scanner.nextInt();
        try {
            return new Tygrys(nazwa, gatunek, wiek, predkoscBiegania);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            return wczytajTygrysa();
        }
    }

    public static Pirania wczytajPiranie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane dla piranii:");
        System.out.print("Nazwa: ");
        String nazwa = scanner.nextLine();
        System.out.print("Gatunek: ");
        String gatunek = scanner.nextLine();
        System.out.print("Wiek: ");
        int wiek = scanner.nextInt();
        System.out.print("Prędkość pływania: ");
        int predkoscPlywania = scanner.nextInt();
        System.out.print("Głębokość: ");
        int glebokosc = scanner.nextInt();
        try {
            return new Pirania(nazwa, gatunek, wiek, predkoscPlywania, glebokosc);
        } catch (ValueNegativeException e) {
            System.out.println("Błąd: " + e.getMessage());
            return wczytajPiranie();
        }
    }
}

//Wynik:

//        Błąd: Wiek nie może być ujemny.
//        Wprowadź dane dla jelenia:
//        Nazwa: -5
//        Gatunek: dska
//        Wiek: 10
//        Prędkość biegania: 20
//        Dane zwierzęcia:
//        Nazwa: -5
//        Gatunek: dska
//        Wiek: 10
//        Jelen wydaje dźwięk: Beee!
//        Dane zwierzęcia:
//        Nazwa: Sokół
//        Gatunek: Sokolnik
//        Wiek: 8
//        Sokół wydaje dźwięk: Ki-ki-ki!
//        Dane zwierzęcia:
//        Nazwa: Tygrys
//        Gatunek: Bengalski
//        Wiek: 10
//        Tygrys wydaje dźwięk: Roooar!
//        Dane zwierzęcia:
//        Nazwa: Pirania
//        Gatunek: Czerwona
//        Wiek: 2
//        Pirania wydaje dźwięk: Chomp chomp!
//        Dane zwierzęcia:
//        Nazwa: -5
//        Gatunek: dska
//        Wiek: 10
//        Jelen wydaje dźwięk: Beee!
//        Dane zwierzęcia:
//        Nazwa: Sokół
//        Gatunek: Sokolnik
//        Wiek: 8
//        Sokół wydaje dźwięk: Ki-ki-ki!
//        Dane zwierzęcia:
//        Nazwa: Tygrys
//        Gatunek: Bengalski
//        Wiek: 10
//        Tygrys wydaje dźwięk: Roooar!
//        Dane zwierzęcia:
//        Nazwa: Pirania
//        Gatunek: Czerwona
//        Wiek: 2
//        Pirania wydaje dźwięk: Chomp chomp!
//
//        Process finished with exit code 0
