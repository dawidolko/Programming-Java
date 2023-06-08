# Lab10 - Kolekcje w języku Java

## **[1.] Tablice**

Deklaracja i inicjalizacja zmiennej tablicowej
```
typ_danych [] nazwa_tablicy ;
typ_danych nazwa_tablicy [] ;
```
Przykład:
```
int [] a; String
[] słowa;
public class Punkt
  { private double
  X; private double
  Y;
  public punkt(int x, int y)
    { X = x;
    Y = y;
}
```

`Punkt [] x;` - powoduje utworzenie referencji do tablicy obiektów określonego rodzaju w przypadku punkt.
Aby jednak użyć tablicy, należy utworzyć (instancję) nowy obiekt tablicowy za pomocą operatora new, czyli
zainicjalizować tablicę. Określa się wtedy rozmiar tablicy:
```
słowa = new String [4] ;
x = new int [n + 20] ; // rozmiar określony przy pomocy wyrażenia
```

W przypadku tablicy obiektów typu podstawowego nastąpi zainicjalizowanie elementów domyślnymi wartościami (0
dla typów liczbowych i `char` oraz `false` dla `boolean`). Jeżeli elementy są obiektami to tablica będzie zawierać referencje
(do null) a nie konkretne obiekty.
Deklarację oraz utworzenie instancji można złączyć w jedną instrukcję:
```
typ [] nazwaTablicy = new typ [rozmiar];
```
Dozwolone jest także jednoczesne zadeklarowanie, utworzenie tablicy oraz inicjalizacja jej elementów:
```
int [] pierwsze = {1, 2, 3, 4 + 1, 7, 11};
String [] muszkieterzy = {"Atos", "Portos", "Aramis"};
punkt [] trojkat = puntk { new punkt(0,0), new punkt(3,0), new punkt(3,4), };
```
- ostatni przecinek jest opcjonalny
- dlatego został wcześniej pominięty

Jak widać nie ma konieczności używania operatora new!
Rozmiar tablicy przechowywany jest w polu length: `nazwaTablicy.length`
Elementy tablicy są numerowane od zera. Można więc odwoływać się do elementów z zakresu **[0,length-1]**.
```
for(int i = 0; i < a.length; i++)
a[i] = i;
```
W przeciwieństwie do tablic z C++ w języku Java, sprawdza czy odwołania do składowych tablicy są poprawne. Jeżeli
nastąpi próba odwołania się do elementu z poza dozwolonego zakresu zostanie zgłoszony wyjątek
`ArrayIndexOutOfBoundException`.

Dostęp do składowych tablicy uzyskujemy za pomocą operatora indeksującego [ ].
`nazwaTablicy[indeks_ekenetu];`
Kopiowanie fragmentów lub całych tablic można wykonać przy użyciem pętli:
```
int [] liczby3 = new int[13];
for(int i = 0; i < 8; i++)
liczby3[i] = i * 3;
int [] tab = {24, 27, 30, 33, 36}; // tworzymy drugą tablicę
for(int k=0; k < 5; k++ ) // kopiujemy liczby 24, 27, 30, 33, 36
liczby3[8 + k] = tab[k];
```
Można również wykorzystać funkcję `arraycopy()` z klasy System:
```
void System.arraycopy(src, srcPos, dest, destPos, n)
```
gdzie:
`src` - nazwa tablicy z której kopiujemy elementy

`srcPos` - początkowy indeks od którego będą odczytywane elementy

`dest` - tablica do której będą kopiowane argumenty

`destPos` - początkowy indeks od którego zostaną zapisywane elementy

`n` - ilość elementów do skopiowania

Zatem następuje przekopiowanie skopiowanie n elementów od `src[srcPos]` do `src[srcPos + n - 1]` i zostaną one
skopiowane na miejsce elementów od `des[destPos]` do `des[desPos + n - 1]`. Dla powyższego przykładu:
```
System.arraycopy( tab, 0, liczby3, 8, 5 );
```
Wywołanie funkcji arraycopy dla tablicy zawierającej obiekty, kopiowane są referencje do tych nie obiektów, nie zaś
same obiekty. Taka operacja zwana jest kopiowaniem płytkim.
Java oferuje również inne ciekawe funkcje do obsługi tablic. Zawarte są w klasie `java.util.Arrays`:
`void sort(tab)` - sortuje tablicę stosując algorytm QuickSort,
`void sort(tab, pocz, przedOst)` - sortuje fragment tablicy od elementu **[pocz, przedOst]** od
elementu o indeksie pocz włącznie do elementu przedOst bez niego.
`nt binarSearch(tab, elem)`- zwraca indeks elementu elem w tablicy tab. Tablica musi być posortowana w
przeciwnym razie wynik jest niezdefiniowany. W przypadku gdy element nie zostanie odnaleziony w tablicy zwracana
jest wartość – `tab.length + 1)`
```
import java.util.Arrays;
import java.util.Random;

class LosowanieSortowanie {
  public static void main(String[] args) {
    Random losujLiczby = new Random();
    int [] kilkaNaturalnych ;
    tablicaNaturalnych = new int [10];
    tablicaNaturalnych[0] = 55;
    for(int i = 1; i < tablicaNaturalnych.length; i++ )
      tablicaNaturalnych[i] = losujLiczby.nextInt(101);
      Arrays.sort(tablicaNaturalnych);
      System.out.println(Arrays.binarySearch(tablicaNaturalnych, 55));
      System.out.println(Arrays.binarySearch(tablicaNaturalnych, 101));
    }
}
```
`boolean equals(tab1, tab2)` - porównuje dwie tablice (ilość elementów i wartośći)
`String toString(tab)` - wyświetla tablicę
```
System.out.print("Tablica liczb NATURALNYCH: ");
System.out.println(Arrays.toString(kilkaNaturalnych));
```
`void fill(tab, wart)` - przypisuje wszystkim elementom tablicy tab wartość wart
`void fill(tab, pocz, przedOst, wart)` - przypisuje elementom tablicy tab wartość wart w przedziale
**[pocz, przedOst]**

### Tablice wielowymiarowe

Tablicami wielowymiarowymi są tablice których elementami są tablice.
```
int [][] macierz = { {1, 2, 3},{4, 5 ,6}}
boolean [][] szachownica;
szachownica = new boolean [8][8];
szachownica[0][0] = true;
szachownica[1][0] = false;
//...
class Kolor { private
  String kolor;
  public Kolor(String k) {
  kolor = k;
  }
  //...
}
Kolor [][][] rgb = new Kolor [256][256][256];
rgb[0][0][0] = new Kolor("black"); rgb[255]
[255][0] = new Kolor("yellow");
```

## **[2.] Kontenery**

Gdy zachodzi konieczność przechowywanie nieustalonej liczby obiektów lub zapewnienia określonej struktury
elementów używa się klasy kontenerowych. Dzielą się one na dwie kategorie: kolekcje (ang. collection) oraz
odwzorowania (tablice asocjacyjne, ang. map).
`Collection` - to kontenery, których elementy podlegają określonym regułom: np. elementy listy `list` są
przechowywane w określonej kolejności, natomiast elementy zbioru `set` nie mogą się powtarzać.

`Odwzorowania` - są obiektami przechowującymi pary typu klucz – wartość. Można je traktować jak tablice, których
elementami są zmienne wartość zaś indeksy to zmienne reprezentowane przez klucze.

W celu wygodnego operowania na kontenerach tj. dodawania, usuwania, odczytywania elementów (poza odpowiednimi
dla danego kontenera metodami) odpowiednim obiektem zwanym iteratorem. Jego działanie można przyrównać do
wskaźnika. Iterartor "wie" jak przechodzić po elementach danego kontenera. Stąd napisany w ten sposób kod jest
bardziej uniwersalny - można zmienić deklaracją typu kontenera bez zmiany funkcji na nim operujących. Oprócz
uniwersalnej klasy `Iterator` dla kontenerów `ArrayList` i `LinkedList` dostępny jest `ListIterator`.

### Hierarchia klas kontenerowych

<br>![cmd_gcc](images/picture1.png)

Przykład aplikacji wykorzystującej kolekcję ArrayList. Typy danych w przechowywanych w kolekcji nie
są sparametryzowane.

### Typy generyczne - parametryzowane, szablonowe

W wersji 1.5 języka Java wprowadzono sparametryzowane typy kontenerowe – tzw. typy generyczne. Do tej
pory, aby stworzyć jakąś kolekcję obiektów należało zaimplementować kolekcję pozwalającą na przechowywania
obiektów typu Object. Konsekwencją tego podejścia była konieczność rzutowania danego elementu danej kolekcji na
rozpatrywany typ pomimo tego, iż programista chciał przechowywać tylko i wyłącznie obiekty tego typu. W przypadku
pomyłki błąd zgłaszany był podczas wykonania programu a nie w czasie kompilacji. Typy generyczne pozwalają
sparametryzować dany typ klasy kontenerowej za pomocą odpowiedniego obiektu, dzięki czemu jest on określony i
rzutowanie nie jest potrzebne. Podobnym rozwiązaniem są szablony w C++.

### Interfejs Collection

`boolean add(Object)` - dodaje element Object do kolekcji sprawdzając czy należy on do tej kolekcji, jeśli nie
zwraca false,

`boolean addAll(Collection)` - dodaje wszystkie elementy kolekcji będącej argumentem do tej na rzecz której
jest wywoływana metoda, zwraca true jeżeli dodano przynajmniej jeden elemen,

`void clear()` - usuwa wszystkie elementy kolekcji,

`boolean contains(Object)` - sprawdza czy dany element jest elementem kolekcji,

`boolean containsAll(Collection)` - sprawdza czy wszystkie elementy kolekcji będącej parametrem są
również elementami kolekcji na rzecz której wywołujemy funkcję,

`boolean equals(Object)` - sprawdza czy dana kolekcja jest taka sama jak

`argument, boolean isEmpty()` - zwraca true jeżeli kontener nie zawiera elementów,

`boolean remove(Object)` - sprawdza czy dany element jest w kontenerze, jeśli tak to go usuwa lub jeden z nich
jeśli jest ich więcej, zwraca true jeżeli udało się usunąć,

`boolean removeAll(Collection)` - usuwa wszystkie elementy kontenera, które są jednocześni wskazane
poprzez argument (różnica), jeżeli usunięto przynajmniej jedną wartość to zwraca true,

`boolean retainAll(Collection)` – usuwa wszystkie elementy kontenera na rzecz którego jest wywoływana
metoda, które nie znajdują się w kolekcji wskazywanej przez argument (część wspólna), jeżeli usunięto przynajmniej
jedną wartość to zwraca true,

`int size()` - zwraca liczbę elementów w kontenerze,

`Object[] toArray()` - zwraca tablicę utworzoną z wszystkich elementów danej kolekcji.

### Interfejs List

Interfejs `List` poza metodami z interfejsu `Collection` definiuje dodatkowe metody:

`void add(int indeks, Object)` - dodaje do listy obiekt na pozycji indeks,

`Object get(int indeks)` - zwraca element znajdujący się na miejscu o indeksie indeks,

`int indexOf(Object)` - zwraca indeks na którym po raz pierwszy pojawia się dany obiekt, zwraca -1 jeśli nie
występuje na liście,

`int lastIndexOf(Object)` - zwraca indeks na którym po raz ostatni pojawia się dany obiekt albo -1,

`Object remove(int indeks)` - zwraca element znajdujący się na pozycji indeks a następnie go usuwa,

`Objest set(int indeks, Object)` - zastępuje element występujący na podanej pozycji argumentem,

`List subList(int pocz, int przedOst)` - zwraca listę utworzoną z elementów bieżącej listy o indeksach
z przedziału **[pocz, przedOst]**.

Wyróżnia się dwie klasy list: `ArrayList` i `LinkedList`. Każda jest zaimplementowana w celu
zoptymalizowania określonych operacji.

### ArrayList

`ArrayList` pozwala na szybkie przeglądanie elementów listy kosztem wolnego wstawiania lub usuwania elementów
wewnątrz listy. Jest to spowodowane implementacją przy użyci tablic. Poza konstruktorem bezparametrowym
dostarcza typów konstruktora:

`ArrayList(Collection c)` - pozwala utworzyć ArrayList z dowolnej kolekcji,

`ArrayList(int poj)` - rezerwuje określoną liczbę elementów, jakie będzie można umieść bez przydziału
pamięci na dodatkowe elementy.

Poza tym metodami interfejsów Collection i List można wywołać dodatkowe metody:

`void ensuerCapacity(int)` - ustawia minimalną liczbę danych jakie mogą być przechowywane bez
realokacji pamięci,

`void trimToSize()` - zmniejsza długość ArrayList do bieżącej ilości elementów.

Przykład aplikacji ze sparametryzowaną kolekcją ArrayList:
```
import java.util.ArrayList;
  public class ArrayListExample {
    public static void main(String[] args) {
      ArrayList<String> arlist=new ArrayList<String>();
      //<E> it is return type of ArrayList
      arlist.add("First Element"); // adding element in ArrayList
      arlist.add("Second Element");
      arlist.add("Third Element");
      arlist.add("forth Element");
      arlist.add("fifth Element");
      // add element with index for fix order
      arlist.add(2, "Fixed Order of Element");
      // arlist.size() inform number of elements in ArrayList
      System.out.println("ArrayList Size :"+arlist.size());
      // get elements of ArrayList
      for(int i=0;i<arlist.size();i++)
        {
        System.out.println("ArrayList Element "+i+" :"+arlist.get(i));
      }
  }
}
```

### LinkedList

`LinkedList` pozwala szybko wstawiać i usuwać elementy z dowolnego miejsca, w zamian za to przeglądanie elementu
o danym indeksie jest operacją stosunkowo powolną w porównaniu do ArrayList. Posiada ona dodatkowe metody:

`void addFirst(Object)` - wstawia argument na początku

`listy void addLast(Object)` - wstawia argument na końcu

`listy Object getFirst()` - zwraca pierwszy element listy

`Object getLast()` - zwraca ostatni element listy

`Object removeFirst()` - zwraca pierwszy element i go usuwa z listy

`Object removeLast()` - zwraca ostatni element i go usuwa z listy

Jeżeli rozważamy wybór między tablicą (array), `LinkedList` lub `ArrayList` to:

1) jeżeli nie ma konieczności zmieniania rozmiaru (np. wiemy że nie będzie to więcej niż jakaś liczba) to należy wybrać
tablicę

2) jeżeli nie planujemy często dokonywać usuwaia lub wstawiania elementu w środku – `ArrayList`

3) w przeciwnym wypadku stosujemy `LinkedList`

### Kontenery Set - wybrane aspekty

Kontenery typu `Set` czyli zbiory służą do przechowywania nie powtarzających się elementów. Interfejs `Set` nie definiuje
nowych metod w stosunku do interfejsu `Collection`, jednak zbiory zachowują się zupełnie inaczej niż inne kolekcje. Jak
już wspomniano nie pozwala na wprowadzanie powtarzających się obiektów dodatkowo przechowywane typy muszą
implementować funkcję `equals`.

Występują dwie implementacje:

`HashSet` pozwalający na szybkie zlokalizowanie elementu ale wymajający implementacji funkcji `hashCode()`.

`TreeSet`, zapewniający uporządkowanie elementów dzięki implementacji na bazie drzewa.
`TreeSet` udostępnia następujące funkcje - jest implementacją klasy SortedSet:

`Object firs()` - zwraca najmniejszy element,

`Objest last()` - zwraca największy element,

`TreeSet subset(int pocz, int przedOst)` - zwraca fragment zbioru którego elemnty są większe lub
równe od pocz i mniejsze od przedOst,

`TreeSet headSet(Object elem)` - zwraca zbiór o elementach mniejszych równych elem,

`TreeSet tailSet(Object elem)` - zwraca zbiór o elementach większych od elem.
```
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
  public static void main(String[] args) {
    HashSet<String> hs=new HashSet<String>();
    // duplicate element is not permitted
    hs.add("b");
    hs.add("a");
    hs.add("c");
    hs.add("d");
    hs.add("d");
    Iterator it=hs.iterator();
    while(it.hasNext())
    {
      String value =(String)it.next();
      System.out.println("Value :"+value);
    }
    //find size of hashSet
    System.out.println("Size :"+hs.size());
    // Remove element from hashSet : hs.remove("d");
    // To remove all object from hashSet hs.clear();
  }
}
```

### Kontenery Map – wybrane aspekty

Odwzorowania (mapy, słowniki, tablice asocjacyjne) są podobne do tablic czy też `ArrayList`, przy czym
przechowują elementy będąca parami typu: wartość – klucz. Rolę indeksu tablic czy też pozycji w `ArrayList` spełnia
klucz.

Wyróżniamy dwie różne implementacje `Map`:

`HashMap` - oparta na tablicach haszujących zapewnia stały czas wykonania operacji wstawiania i zlokalizowania
obiektu. Konstruktor pozwala ustawić pojemność oraz współczynnik wypełnienia tego kontenera.

`TreeMap` - oparta na drzewach czerwono-czarnych, jej elementy są automatycznie sortowane, ponadto ten typ
kontenera pozwala na wyodrębnienie podkontenera za pomocą metody `subMap()`.

### Iteratory

`Iteratory` są podobne do wskaźników pokazujących na określony element w danym kontenerze. Pozwalają na
dokonanie tylko kilku czynności, ale za to można ich dokonać na każdym kontenerze:

`iterator iterator()` - zwraca iterator

`E next()` - zwraca element znajdujący się za bieżącym

`boolean hasNext()` - sprawdzamy czy jest jakiś więcej obiektów w danym kontenerze za
`bieżącym void remove()` - usuwa ostatni zwrócony przez iterator element

Powyższy zestaw czynności, jakich możemy dokonać wystarcza do sprawnego przeszukiwania i ewentualnego
usuwania elementów. Należy pamiętać, że funkcja iterator() jest funkcją składową poszczególnych kontenerów czyli
wywołujemy je na rzecz obiektów kontenerowych pozostałe zaś to składowe klasy Iterator zatem wywołujemy je na rzecz iteratorów.
```
Iterator iter = c.iterator();
while(iter.hasNext())
  {
    Object o = iter.next();
   ...
   wykonanie operacji na obiekcie o
   ...
  if ( warunek_usuniecia(o) ) iter.remove();
}
```

## **Zadania:**

### **Zadanie 1.**

Utwórz tablicę losującą 100 liczb. Utwórz metody sortującą tą tablicę i wyświetlającą wynik.

### **Zadanie 2.** 

Utwórz aplikację losującą 100 liczb całkowitych. Wylosowane dane pamiętaj w strukturze `TreeSet`.
Następnie wyświetl dane używając iteratora. Co otrzymałeś?

### **Zadanie 3.**

Utwórz klasę zawierającą opis parametrów samochodów różnych marek, tj. `marka`, `nazwa samochodu`,
`max. prędkość`, `cena` itp. Uwzględnij mechanizm hermetyzacji. Zaimplementuj listę generyczną
przechowującą te wszystkie samochody. Utwórz odpowiednie metody dostępu do danych.

### **Zadanie 4.**

Napisz aplikację realizującą słownik umożliwiający przetłumaczenie dwudziestu podstawowych słów
zapisanych w języku polskim na język angielski. Po wpisaniu słowa w języku polskim w konsoli powinien
się pojawić ekwiwalent słowa w języku angielskim. Aplikacja powinna działać do chwili wpisania łańcucha
`koniec!`. Do reprezentacji danych użyj typu generycznego HashMap.
