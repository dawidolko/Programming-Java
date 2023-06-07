package Zadanie4;

//POLECENIE:

//      A) Utwórz klasę Pracownik, dziedziczącą po klasie Osoba. Klasa zawiera dodatkowo dwa pola:
//
//        zawod: String;
//        staz_pracy:int;
//
//        - Utwórz przynajmniej dwa przeciążenia konstruktora.
//
//        B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu liczbowego powinny zawsze być dodatnie.
//
//        C) Przesłoń metodę WyswietlDaneOsoby(), tak aby wyświetlała wszystkie dane osoby.
//
//        D) Przetestuj działanie programu, podobnie jak w zadaniu 3,  wyniki wypisz w komentarzu pod kodem.



public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        pracownik1.setImie("Jan");
        pracownik1.setNazwisko("Kowalski");
        pracownik1.setWiek(35);
        pracownik1.setKrajPochodzenia("Polska");
        pracownik1.setZawod("Informatyk");
        pracownik1.setStazPracy(7);
        pracownik1.WyswietlDaneOsoby();

        Pracownik pracownik2 = new Pracownik("Anna", "Nowak", "Nauczyciel");
        pracownik2.setWiek(28);
        pracownik2.setKrajPochodzenia("Niemcy");
        pracownik2.setStazPracy(3);
        pracownik2.WyswietlDaneOsoby();
    }
}

//    Dane osoby:
//        Imię: Jan
//        Nazwisko: Kowalski
//        Wiek: 35
//        Kraj pochodzenia: Polska
//        Zawód: Informatyk
//        Staż pracy: 7 lat
//
//        Dane osoby:
//        Imię: Anna
//        Nazwisko: Nowak
//        Wiek: 28
//        Kraj pochodzenia: Niemcy
//        Zawód: Nauczyciel
//        Staż pracy: 3 lat

