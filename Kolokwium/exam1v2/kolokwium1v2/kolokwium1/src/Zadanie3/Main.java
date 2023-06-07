package Zadanie3;

//POLECENIE:

//A) Utwórz klasę Osoba zawierającą następujące pola:
//
//        imie: String;
//        nazwisko: float;
//        wiek: int;
//        kraj_pochodzenia:String
//
//        Uwaga: Wiek powinien być wartością z przedziału od 0 do 120.
//
//        Klasa powinna posiadać trzy przeciążenia konstruktora, tj.
//        1.	konstruktor bezparametrowy,
//        2.	konstruktor ustawiający imie, nazwisko,
//        3.	konstruktor ustawiający imie, nazwisko, wiek, kraj_pochodzenia.
//
//        Utwórz metodę o nazwie WyswietlDaneOsoby(), która wyświetli informacje o osobie.
//
//        B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu liczbowego powinny zawsze być dodatnie.
//
//        C) Przetestuj klasę, tworząc przynajmniej trzy jej obiekty. Należy utworzyć obiekty przy użyciu wszystkich trzech przeciążeń konstruktora i uzupełnić
//        je danymi. Jeśli konstruktor nie ustawia jakiegoś pola klasy ustaw te dane odpowiednią metodą „set”. Wyświetl dane wszystkich utworzonych obiektów.
//        Wyniki wypisz w komentarzu pod kodem.
//

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba();
        osoba1.setImie("Jan");
        osoba1.setNazwisko("Kowalski");
        osoba1.setWiek(35);
        osoba1.setKrajPochodzenia("Polska");
        osoba1.WyswietlDaneOsoby();

        Osoba osoba2 = new Osoba("Anna", "Nowak");
        osoba2.setWiek(28);
        osoba2.setKrajPochodzenia("Niemcy");
        osoba2.WyswietlDaneOsoby();

        Osoba osoba3 = new Osoba("Marcin", "Zalewski", 42, "Francja");
        osoba3.WyswietlDaneOsoby();
    }
}

//    Dane osoby:
//        Imię: Jan
//        Nazwisko: Kowalski
//        Wiek: 35
//        Kraj pochodzenia: Polska
//
//        Dane osoby:
//        Imię: Anna
//        Nazwisko: Nowak
//        Wiek: 28
//        Kraj pochodzenia: Niemcy
//
//        Dane osoby:
//        Imię: Marcin
//        Nazwisko: Zalewski
//        Wiek: 42
//        Kraj pochodzenia: Francja
