# **Kolokwium I Gr. B**

## **Zadanie 1.**  `(5 pkt.)`

Napisz program w języku Java, który deklaruje tablicę 20-elementową liczb typu float i losuje do niej liczby z przedziału 1-100. Następnie wprowadź z konsoli liczbę n typu double. Następnie z wylosowanej tablicy oblicz sumę liczb o indeksach nieparzystych i większych od liczby n. Wyświetl sumę w konsoli. Przetestuj program trzy razy go wywołując, wyniki opisz w komentarzu pod kodem.

## **Zadanie 2.** `(5 pkt.)`

Napisz program, który deklaruje tablicę 10-elementową typu dobule, do której następnie użytkownik wprowadza dane. Napisz funkcję, która wylicza wartość sumy liczb podzielnych przez 5 i dodatkowo większych od średniej wartości liczb wprowadzonych przez użytkownika. 
Przetestuj program dwa razy go wywołując, wyniki opisz w komentarzu pod kodem.

## **Zadanie 3.**  `(6pkt)`

A) Utwórz klasę Osoba zawierającą następujące pola:

imie: `String;`
nazwisko: `float;`
wiek: `int;`
kraj_pochodzenia: `String`

Uwaga: Wiek powinien być wartością z przedziału od 0 do 120.

Klasa powinna posiadać trzy przeciążenia konstruktora, tj.
1.	konstruktor bezparametrowy,
2.	konstruktor ustawiający imie, nazwisko,
3.	konstruktor ustawiający imie, nazwisko, wiek, kraj_pochodzenia.

Utwórz metodę o nazwie `WyswietlDaneOsoby()`, która wyświetli informacje o osobie.

B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu liczbowego powinny zawsze być dodatnie. 

C) Przetestuj klasę, tworząc przynajmniej trzy jej obiekty. Należy utworzyć obiekty przy użyciu wszystkich trzech przeciążeń konstruktora i uzupełnić je danymi. Jeśli konstruktor nie ustawia jakiegoś pola klasy ustaw te dane odpowiednią metodą „set”. Wyświetl dane wszystkich utworzonych obiektów.  Wyniki wypisz w komentarzu pod kodem.

## **Zadanie 4.** `(4 pkt.)`

A) Utwórz klasę Pracownik, dziedziczącą po klasie Osoba. Klasa zawiera dodatkowo dwa pola: 

zawod: `String;`
staz_pracy: `int;`

- Utwórz przynajmniej dwa przeciążenia konstruktora.

B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu liczbowego powinny zawsze być dodatnie. 

C) Przesłoń metodę `WyswietlDaneOsoby()`, tak aby wyświetlała wszystkie dane osoby.

D) Przetestuj działanie programu, podobnie jak w zadaniu 3,  wyniki wypisz w komentarzu pod kodem. 

