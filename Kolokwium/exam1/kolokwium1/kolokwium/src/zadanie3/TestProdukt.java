package zadanie3;

//A) Utwórz klasę Produkt zawierającą następujące pola:
//
//        nazwa: String;
//
//        cena: float;
//
//        kod_kreskowy: int;
//
//        kraj_pochodzenia:String
//
//        Uwaga: Kod kreskowy powinien być wartością z przedziału od 10000000 do 99999999.
//
//        Klasa powinna posiadać trzy przeciążenia konstruktora, tj.
//
//        1. konstruktor bezparametrowy,
//
//        2. konstruktor ustawiający nazwę, cenę, kod kreskowy,
//
//        3. konstruktor ustawiający nazwę, cenę, kod kreskowy, kraj_pochodzenia.
//
//        Utwórz metodę o nazwie WyswietlDaneProduktu(), która wyświetli informacje o produkcie.
//
//        B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu
//        liczbowego powinny zawsze być dodatnie. (4pkt)
//
//        C) Przetestuj klasę, tworząc przynajmniej trzy jej obiekty. Należy utworzyć obiekty przy użyciu
//        wszystkich trzech przeciążeń konstruktora i uzupełnić je danymi. Jeśli konstruktor nie ustawia
//        jakiegoś pola klasy ustaw te dane odpowiednia metodą „set”. Wyświetl dane wszystkich utworzonych obiektów.
//        Wyniki wypisz w komentarzu pod kodem.

public class TestProdukt {
    public static void main(String[] args) { // losowo stworzyłem 3 obiekty np. chleb, mleko czy jajka.
        Produkt produkt1 = new Produkt();
        produkt1.setNazwa("Chleb");
        produkt1.setCena(3.5f);
        produkt1.setKodKreskowy(12345678); // tu użyłem pierwszego konstrutora (pustego)

        Produkt produkt2 = new Produkt("Mleko", 2.2f, 87654321); //(TU DRUGIEGO)

        Produkt produkt3 = new Produkt("Jajka", 5.0f, 23456789, "Polska"); //(tu trzeciego) ze wszystkimi polami

        produkt1.wyswietlDaneProduktu();
        System.out.println();

        produkt2.wyswietlDaneProduktu();
        System.out.println();

        produkt3.wyswietlDaneProduktu();
        System.out.println();
    }
}
//wynik 1;
//Nazwa: Chleb
//        Cena: 3.5
//        Kod kreskowy: 12345678
//        Kraj pochodzenia: null
//
//        Nazwa: Mleko
//        Cena: 2.2
//        Kod kreskowy: 87654321
//        Kraj pochodzenia: null
//
//        Nazwa: Jajka
//        Cena: 5.0
//        Kod kreskowy: 23456789
//        Kraj pochodzenia: Polska
//
//
//        Process finished with exit code 0

