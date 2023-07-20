# **KOLOKWIUM I gr. A**

## **[Zadanie 1.](https://github.com/dawidolko/Programming-Java/blob/master/Kolokwium/exam1/kolokwium1/kolokwium/src/zadanie1/Main.java)**  `(5 pkt.)`

Napisz program w języku Java, który deklaruje tablicę 20-elementową liczb typu float i losuje do niej liczby z przedziału 1-100. Następnie wprowadź z konsoli liczbę n typu double. Następnie z wylosowanej tablicy oblicz sumę liczb nieparzystych i większych od liczby n. Wyświetl sumę w konsoli. Przetestuj program trzy razy go wywołując, wyniki opisz w komentarzu pod kodem.

## **[Zadanie 2.](https://github.com/dawidolko/Programming-Java/blob/master/Kolokwium/exam1/kolokwium1/kolokwium/src/zadanie2/Main.java)** `(5 pkt.)`

Napisz program, który deklaruje tablicę 10-elementową typu dobule, do której następnie użytkownik wprowadza dane. Napisz funkcję, która wylicza wartość sumy liczb podzielnych przez 3 i dodatkowo większych od średniej wartości liczb wprowadzonych przez użytkownika. 
Przetestuj program dwa razy go wywołując, wyniki opisz w komentarzu pod kodem.

## **[Zadanie 3.](https://github.com/dawidolko/Programming-Java/tree/master/Kolokwium/exam1/kolokwium1/kolokwium/src/zadanie3)**  `(6pkt)`
A) Utwórz klasę Produkt zawierającą następujące pola:

```
nazwa: String;
cena: float;
kod_kreskowy: int;
kraj_pochodzenia:String
```

Uwaga: Kod kreskowy powinien być wartością z przedziału od 10000000 do 99999999. 

Klasa powinna posiadać trzy przeciążenia konstruktora, tj.
1.	konstruktor bezparametrowy,
2.	konstruktor ustawiający nazwę, cenę, kod kreskowy,
3.	konstruktor ustawiający nazwę, cenę, kod kreskowy, kraj_pochodzenia.

Utwórz metodę o nazwie WyswietlDaneProduktu(), która wyświetli informacje o produkcie.

B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu liczbowego powinny zawsze być dodatnie. (4pkt)

C) Przetestuj klasę, tworząc przynajmniej trzy jej obiekty. Należy utworzyć obiekty przy użyciu wszystkich trzech przeciążeń konstruktora i uzupełnić je danymi. Jeśli konstruktor nie ustawia jakiegoś pola klasy ustaw te dane odpowiednia metodą „set”. Wyświetl dane wszystkich utworzonych obiektów.  Wyniki wypisz w komentarzu pod kodem.

## **[Zadanie 4.](https://github.com/dawidolko/Programming-Java/tree/master/Kolokwium/exam1/kolokwium1/kolokwium/src/zadanie4)** `(4 pkt.)`
A) Utwórz klasę Koszyk, dziedziczącą po klasie produkt. Klasa zawiera dodatkowo dwa pola: 

```
pojemnosc: float;
material:String;  // opisuje z czego wykonano koszyk.
```

- Utwórz przynajmniej dwa przeciążenia konstruktora.

B) Dokonaj hermetyzacji pól klasy, tworząc metody udostępniające pola, zwróć uwagę, że niektóre pola typu liczbowego powinny zawsze być dodatnie. 

C) Przesłoń metodę WyswietlDaneProduktu(), tak aby wyświetlała wszystkie dane produktu.

D) Przetestuj działanie programu, podobnie jak w zadaniu 3,  wyniki wypisz w komentarzu pod kodem. 




