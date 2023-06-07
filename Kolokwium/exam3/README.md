# Kolokwium 3

## **Zadanie 1.**
Napisz program wyświetlający liczby od 10-0, z wyłączeniem liczb {8,6,3,1}. Do realizacji zadania wyłączenia użyj instrukcji continue;

## **Zadanie 2.** 
Zaimplementuj algorytm obliczający wartość ciągu Fibonacciego (rekurencja)

## **Zadanie 3.** 
Utwórz klasę przechowującą tablicę 10-ciu liczb całkowitych (tablica to pole klasy), która jest zahermetyzowana.
a) Utwórz metodę pozwalającą na wprowadzenie liczb przez użytkownika. b) Utwórz metodę wyświetlającą zawartość tablicy na konsoli.
c) Utwórz metodę zwracającą wartość średnią elementów tablicy.
d) Utwórz obiekt zaprojektowanej klasy i przetestuj działania metod w metodzie main.

## **Zadanie 4.** 
Utwórz klasą Osoba zawierającą pola określające imię, nazwisko, wiek, wzrost i wagę. Zastosuj hermetyzację pól. Utwórz metody pobierające i ustawiające wartości pól. Utwórz przynajmniej dwa konstruktory klasy Osoba. Utwórz metodę wyświetlającą dane osoby. Utwórz obiekt klasy Osoba i wyświetl dane tej osoby.

## **Zadanie 5.** 
Utwórz klasę Pracownik dziedziczącą po klasie osoba. Dodaj do niej dwa pola: zawód i zarobki. Przesłoń metodę wyświetlającą dane pracownika, która została odziedziczona po klasie Osoba tak aby wyświetlała również zawód i zarobki. Utwórz obiekt klasy Pracownik i wyświetl dane tego pracownika.

## **Zadanie 6.** 
Napisz program wyświetlający liczby z zakresu 200-0 z wyłączeniem liczb nieparzystych.

## **Zadanie 7.** 
Utwórz klasę przechowującą tablicę liczb rzeczywistych. Tablica ma rozmiar ustawiany konstruktorem. Utwórz metody pozwalające na: - uzupełnianie komórek tablicy,
- wyświetlanie zawartości tablicy,
- zwrócenie sumy tablicy.
Utwórz obiekt tej klasy i przetestuj jego działanie.

## **Zadanie 8.** 
Utwórz klasę abstrakcyjną `Zwierze` posiadającą pola: `nazwa`, `waga`, `wiek` oraz metody `Je`, `Oddycha`, `PokazDane`. Utwórz konstruktor klasy i jego przeciążenie. Po klasie `Zwierze` dziedziczą klasy konkretne `Tygrys`, `Orzeł`, `Kaczka`, `Rekin`. Klasy dziedziczą również po interfejsach. Do dyspozycji są następujące interfejsy: `IBieganie`, `ILatanie`, `IPlywanie`, `IPolowanie`. Dobierz odpowiednio interfejsy do klas opisujących zwierzęta i dodaj do interfejsów odpowiednie metody.
Utwórz kilka obiektów zwierząt i umieść je w tablicy ArrayList. Iterując po kolekcji wyświetl dane opisujące wszystkie zwierzęta.

## **Zadanie 9.** 
Utwórz klasę rzucającą wyjątek przy próbie wykonania dzielenia przez 0. Klasa ma dziedziczyć po `java.lang.Exception`. Następnie utwórz klasę, która testuje czy wyjątki dzielenia przez zero są rzucane przy pomocy utworzonej wcześniejszej klasy i wyłapywane.
