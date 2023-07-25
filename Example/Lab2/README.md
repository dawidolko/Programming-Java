# PROGRAMOWANIE OBIEKTOWE JAVA – LABORATORIUM

## Instrukcje iteracyjne 

• Pętla while: 
```
while (warunek) {
 // Wykonywany blok kodu 
}
```
• Pętla do … while: 
```
do {
 // Blok kodu do wykonania 
}
while (warunek);
```
Przykład: 
```
package com.company;
public class Main {
 public static void main(String[] args) {
   // write your code here 
   System.out.println("Hello Java");
 
   int itemCounter = 0;
   while (itemCounter < 5) {
   System.out.println(itemCounter);
   itemCounter++;
   }
   itemCounter = 0;
   do {
     System.out.println(itemCounter);
     itemCounter++;
   }
   while (itemCounter < 5);
     }
  }
```
• Pętla for: 
```
for (<określenie zmiennej>; <warunek wykonalności>; <modyfikacja zmiennej 
liczącej>) {
 // Blok kodu do wykonania 
 }
```
Przykład: 
```
package com.company; 
public class Main { 
 public static void main(String[] args) { 
   System.out.println("Inkrementacja:"); 
  2 
   for (int itemNumber = 0; itemNumber < 5; itemNumber++) { 
     System.out.println(itemNumber); 
   } 
   System.out.println("Dekrementacja:"); 
   for (int itemNumberMax = 8; itemNumberMax > 0; itemNumberMax--) { 
     System.out.println(itemNumberMax); 
   } 
 } 
}
```
## Losowanie liczb 
```
package com.company; 
// importowanie biblioteki niezbednej do losowania liczb 
import java.util.Random; 

public class Main { 
 public static void main(String[] args) { 
   //Losowanie liczb biblioteka Random 
   // Stworzenie obiektu klasy Random, który posłuży do loswania liczb 
   Random rand = new Random(); 
   /* 
   * Losowanie liczb odbywa się po wywołaniu którejś z metod obiektu 
    rand
    * (klasy Random).
    * W zależności od typu liczby, którą należy wylosować, trzeba 
    wybrać
    * odpowiednią metodę np. 
    * `rand.nextInt()` - wylosuje liczbę całkowitą z zakresu int, 
    * `rand.nextFloat()` - wylosuje liczbę rzeczywistą z zakresu 
    float, 
    * itd. lista dostępnych metod klasy Random wyświetli się po 
    * wpisaniu nazwy obiektu i kropki w tym przypadku: rand. 
     * 
    * W przypadku zapisu `rand.nextInt(n);` wylosowana zostanie liczba z 
     * zakresu od 0 do n-1, czyli chcąc wylosować liczbę z zakresu 
     * od 1 do 10 (domkniętego) należy zapisać: 
     * `rand.nextInt(10)+1;` 
     */ 
     // Losowanie liczby z zakresu [0,10] do zmiennej a. 
    `int a = rand.nextInt(11);` // deklaracja i definicja zmiennej 
    System.out.println("Wylosowana liczba z zakresu [1,10]: " +a); 
    // Losowanie liczby z zakresu [-5,15] i wyświetlenie jej na 
    konsolę. 
     System.out.print("Wlosowana liczba z zakresu [-5,-15]: "); 
     System.out.println( rand.nextInt(21)-5 ); 
     // 21, bo w przedziale [-5,15] jest 21 liczb i -5, 
     // ponieważ jest to najmniejsza liczba w zakresie. 
     // Losowanie liczby z zakresu [-20,-10] do zmiennej a. 
     a = rand.nextInt(11)-20; 
     System.out.println("Wylosowana liczba z zakresu [-20,-10]: "+a); 
     // 11, bo w przedziale [-20,10] jest 11 liczb i -20, 
     // bo to najmniejsza liczba w zakresie. 
     // Losowanie liczb z zakresu [x,y], gdzie x i y, to zmienne 
     // całkowitoliczbowe o dowolnej wartości. 
     int x = 7; // To wartość przykładowa 
     int y = 15; // To wartość przykładowa 
     a = rand.nextInt(y-x+1)+x; // Od większej (y) odejmujemy mniejszą
    (x) i 
    // dodajemy 1 - to daje liczność zbioru (w losowaniu), a następnie 
    dodajemy mniejszą (x), 
     // bo to najmniejsza liczba w zakresie. 
    System.out.println("Wylosowana liczba z zakresu ["+x+","+y+"]: " 
    +a); 
     // Sprawdzenie powyższego przykładu dla liczb ujemnych: 
    x = -27; // To wartość przykładowa 
     y = -15; // To wartość przykładowa 
     a = rand.nextInt(y-x+1)+x; 
     System.out.println("Wylosowana liczba z zakresu ["+x+","+y+"]: " 
    +a); 
    // Sprawdzenie powyższego przykładu w sytuacji, kiedy jedna liczba 
    // jest ujemna, a druga dodatnia 
     x = -7; // To wartość przykładowa 
    y = 15; // To wartość przykładowa 
    a = rand.nextInt(y-x+1)+x; 
     System.out.println("Wylosowana liczba z zakresu ["+x+","+y+"]: " 
    +a); 
    } 
}
```
## Zadania:
1. Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik). Wprowadzamy 
liczbę punktów dla każdego studenta. Napisz program, który obliczy średnią liczbę punktów w 
grupie z wykorzystaniem pętli while. 

2. Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości oraz sumy liczb 
ujemnych i dodatnich podanych przez użytkownika. 

3. Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy wszystkich liczb 
parzystych w danym ciągu. 

4. Wykorzystując algorytm z zadania 5, napisz program który pozwoli użytkownikowi na 
wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym 
ciągu. 

5. Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest 
palindromem. Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. 
kajak.
