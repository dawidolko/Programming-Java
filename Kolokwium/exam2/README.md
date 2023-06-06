# **KOLOKWIUM 2 GR. A**

## **Zadanie 1.** `(2 pkt).`

Utwórz klasę NegativeValueException, która będzie wyrzucać wyjątki w przypadku gdy ustawiona lub wprowadzona liczba jest mniejsza od zera (a powinna być większa od zera). Przetestuj działanie klasy.

## **Zadanie 2.** `(26 pkt)` 

Utwórz klasę abstrakcyjną `Zwierze`. 
- Klasa posiada odpowiednie pola: nazwa: `String`,  gatunek: `String`, waga: `float`.
- Dokonaj hermetyzacji pól pamiętając, że waga nie może być ujemna. W razie wprowadzenia wartości ujemnej ma być wyrzucony wyjątek `NegativeValueException`.
- Klasa posiada odpowiednie konstruktory (przynajmniej dwa).
- Klasa ma dwie metody: abstrakcją WydajGlos() i zwykłą (konkretną) `PokazInformacje()`.
 Metoda `PokazInformacje()` powinna wyświetlać w konsoli tekst „Dane zwierzęcia:”, a następnie jego nazwa, gatunek, wagę oraz wywoływać metodę WydajGlos(). `(6 pkt)`

B) Utwórz interfejsy z metodami abstrakcyjnymi `(2 pkt)`: 
•	`IPlywanie` z metodą: `Plywaj(int predkoscPlywania, int glebokosc);`
•	`IBieganie` z metodą: `Biegnij(int predkoscBiegania);`
•	`ILatanie` z metodą: `Lataj(int predkoscLatania, int wysokosc);`
•	`IDrapieznictwo` z metodą: `Atakuj();`

C) Utwórz klasy:
- `Kaczka`, `Orzel`, `Lew`, `Rekin` dziedziczące po klasie `Zwierze` i implementujące odpowiednie interfejsy (interfejsy należy dopasować do każdego zwierzęcia).
- Dla każdego zwierzęcia dodaj odpowiednie pola przechowujące odpowiednie dane odnośnie prędkości biegania, latania, pływania, głębokości i wysokości, w zależności od tego jakie interfejsy implementuje klasa.
- Utwórz odpowiednie konstruktory na bazie konstruktora klasy bazowej z uwzględnieniem dodanych pól.
- Przesłoń metodę `WydajGlos()` oraz zaimplementuj metody z przypisanych klasie interfejsów.
- Przesłoń metodę `PokazInformacje()` dodając w niej wyświetlanie pól dodanych w klasach `Kaczka`, `Orzel`, `Lew`, `Rekin`.
Zaimplementuj metody abstrakcyjne oddziedziczone po interfejsach tak aby wartości w nich ustawiane (odpowiednio dodane pola klasy) mogły przyjmować tylko wartości dodatnie (chodzi o atrybuty: prędkość pływania i biegania, wysokość i głębokość)
`(10 pkt)`

D)  (Uwaga zadanie wymagane – bez niego kolokwium będzie niezaliczone)
Utwórz klasę Main posiadającą metodę main jako punkt startowy programu. Utwórz w metodzie main obiekty zwierząt  `Kaczka`, `Orzel`, `Lew`, `Rekin`. Dla wszystkich obiektów wywołaj metodę `PokazInformacje()`. `(2 pkt)`

E) W klasie Main utwórz metody statyczne umożliwiające wprowadzanie danych zwierząt. Wychwyć wyjątki typu NegativeValueException i obsłuż je w taki sposób, że jeżeli użytkownik poda negatywną wartość wyświetla mu się informacja o błędnie podanej wartości i rekurencyjnie wywołuje się ta metoda wprowadzająca dane, aż do skutku (aż użytkownik poda właściwą wartość, większą od zera). (4pkt.)

F) W metodzie main utwórz dodatkowo 10-elementową tablicę przechowującą różne zwierzęta. Przejdź tablicę przy użyciu pętli i wywołaj dla każdego elementu tablicy metodę  `PokazInformacje()`.  `(2 pkt)`

## **Zadanie 3.** `(2 pkt)`

Utwórz klasę generyczną o nazwie `Tuple2`, implementującą krotkę dwuwartościową. Utwórz odpowiedni konstruktor ustawiający pola krotki oraz metody pobierające i ustawiające te pola. 
