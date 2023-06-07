package zadanie4;
//
//       A) Utwórz klasę Koszyk, dziedziczącą po klasie produkt. Klasa zawiera dodatkowo dwa pola:
//
//        pojemnosc: float;
//
//        material:String; // opisuje z czego wykonano koszyk.
//
//        - Utwórz przynajmniej dwa przeciążenia konstruktora.
//
//        B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że
//        niektóre pola typu liczbowego powinny zawsze być dodatnie.
//
//        C) Przesłoń metodę WyswietlDaneProduktu(), tak aby wyświetlała wszystkie dane produktu.
//
//        D) Przetestuj działanie programu, podobnie jak w zadaniu 3, wyniki wypisz w komentarzu pod kodem.

public class Test {
    public static void main(String[] args) { // stworzylem 3 obiekty np. laptop, koszyk wilinowy czy sklepowy
        Produkt produkt = new Produkt("Laptop", 4000.0f, 22222222); // 1 produkt
        produkt.setKrajPochodzenia("Chiny");
        produkt.wyswietlDaneProduktu();

        System.out.println("------------------");

        Koszyk koszyk1 = new Koszyk("Koszyk wiklinowy", 20.0f, 3, 2.5f, "Wiklina"); // 2 produkt
        koszyk1.wyswietlDaneProduktu();

        Koszyk koszyk2 = new Koszyk("koszyk sklepowy", 500.0f, 100, 300.0f, "stal nierdzewna"); // 3 produkt
        koszyk2.setKrajPochodzenia("Polska");
        koszyk2.wyswietlDaneProduktu();
    }
}

//wynik 1;

//Nazwa: Laptop
//        Cena: 4000.0
//        Kod kreskowy: 22222222
//        Kraj pochodzenia: Chiny
//        ------------------
//        Kod kreskowy musi być wartością z przedziału od 10000000 do 99999999!
//        Nazwa: Koszyk wiklinowy
//        Cena: 20.0
//        Kod kreskowy: 0
//        Kraj pochodzenia: null
//        Pojemność: 2.5
//        Materiał: Wiklina
//        Kod kreskowy musi być wartością z przedziału od 10000000 do 99999999!
//        Nazwa: koszyk sklepowy
//        Cena: 500.0
//        Kod kreskowy: 0
//        Kraj pochodzenia: Polska
//        Pojemność: 300.0
//        Materiał: stal nierdzewna


