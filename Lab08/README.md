# Lab08 - Klasy i metody abstrakcyjne oraz interfejsy w języku Java

## **Zadanie 0.** `Klasy abstrakcyjne`

Klasa w której zadeklarowano jakąkolwiek metodę abstrakcyjną jest klasą abstrakcyjną i
musi być opatrzona specyfikatorem `abstract`. Metoda abstrakcyjna nie ma implementacji (ciała) i
winna być zadeklarowana ze specyfikatorem `abstract`. Metody abstrakcyjne to takie, co do których
nie wiemy jeszcze jaka może być ich konkretna implementacja (lub nie chcemy tego przesądzać),
ale wiemy, że powinny wystąpić w zestawie metod każdej konkretnej klasy dziedziczącej klasę
abstrakcyjną. Konkretna implementacja (definicja w klasie kodu metody) może być bardzo różna, w
zależności od konkretnego rodzaju obiektów, które opisuje dana klasa.
Abstrakcyjność klasy oznacza, iż nie można tworzyć jej egzemplarzy (obiektów).

## **Zadanie 1.**

Zmodyfikuj klasę Produkt z poprzedniego laboratorium tak aby stała się klasą abstrakcyjną **zob.
kod poniżej.** Uzupełnij enkapsulację danych w klasie **i utwórz konstruktor**.
```
public class Product {
  private double price;
  private String name;
  private String describe;
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public abstract void Buy();
  public abstract void ShowInfo();
  }
```

Utwórz klasę pochodną, po klasie `Product`, która nie będzie już klasą abstrakcyjną **zob. kod poniżej**.
```
public class Tractor extends Product{
  public Tractor(String name, double price, String describe){
    super(name, price, describe);
  }
  public void Buy(){
    System.out.println(”I bought a black tractor, capaciticy 2400!”);
  }
  public void ShowInfo(){
    System.out.println(”Price:”+getPrice()+” name:”+getName()+
    ” describe:”+getDescribe());
  }
}
```
[LINK](http://edu.pjwstk.edu.pl/wyklady/poj/scb/Polimorf/Polimorf.html)

## **Zadanie 2.**

W oparciu o klasę `Product` zdefiniuj produkty tj.: `książka`, `dżem`, `polopiryna`, `długopis`, `czekolada`.
Czy produkty typu ubranie, lekarstwa, narzędzia powinny być opisane klasami abstrakcyjnymi czy
nieabstrakcyjnymi?

## **Zadanie 3.**

Utwórz kolekcję produktów w postaci tablicy 10-elementowej i dodaj do tej tablicy następujące
produkty: `książka`, `czekolada`, `książka`, `długopis`, `dżem`, `polopiryna`, `dżem`, `czekolada`, `długopis`,
`książka`, `traktor`. Następnie przejdź kolekcję przy użyciu pętli iteracyjnej i wywołaj dla każdego
elementu metody `Buy()` i `ShowInfo()`. Przeanalizuj wyświetlone wyniki i opisz.

## **Zadanie 4.**

Utwórz klasę abstrakcyjną `FiguraGeometryczna`, zawierającą metodę abstrakcyjną `obliczPole()`
(dla każdej figury geometrycznej można obliczyć pole). Utwórz dwie klasy pochodne -
dziedziczące po klasie - `FiguraGeometryczna`, które również są klasami abstrakcyjnymi:
`FiguraPlaska` oraz `FiguraPrzestrzenna`. Dla figury płaskiej dodaj metodę abstrakcyjną
`obliczObwod()`, oraz przesłoń metodę `toString()`, która zwróci informację: **„Obliczanie parametrów
figury płaskiej”**. Dla figury przestrzennej dodaj metodę abstrakcyjną `obliczObjetosc()` oraz przesłoń
metodę `toString()`, tak aby zwracała informację: **„Obliczanie parametrów figury przestrzennej”**.
Utwórz następujące klasy pochodne dziedziczące odpowiednio po klasach `FiguraPlaska` i
`FiguraPrzestrzenna`: `Kwadrat`, `Prostokat`, `Trojkat`, `Trapez`, `Rownoleglobok`, `Romb`, `Kolo`,
`Szescian`, `Prostopaloscian`, `Kula`, `Walec`, `Stozek`. Dla tych klas utwórz odpowiednie struktury
danych opisujące te figury (np. koło posiada parametr promienia **„r”**), oraz zastosuj hermetyzację
danych (parametry figur muszą być liczbami dodatnimi). Dla utworzonych klas zaimplementuj
metody abstrakcyjne dodając w ich ciałach odpowiednie funkcjonalności. Dla utworzonych klas
przesłoń również metodę `toString()`, tak aby zwracany łańcuch składał się z konkatenacji dwóch
łańcuchów: wartości zwróconej z metody `toString()` klasy pochodnej oraz informacji opisującej
parametry danej figury (również obliczone `pole`, `obwód` względnie objętość).

## **Zadanie 5.**

Utwórz 15-elementową tablicę przechowującą różne figury geometryczne. Przejdź tablicę przy
użyciu pętli `while` i wywołaj dla każdego elementu tablicy metodę toString(). Przeanalizuj
wyświetlone wyniki i opisz.
