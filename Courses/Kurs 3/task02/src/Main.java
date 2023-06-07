/*Kurs Java od podstaw #2 - Zmienne, operatory, komentarze https://www.youtube.com/watch?v=TFxNcoOGcXE&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=4*/
public class Main {
    byte b = 127; // -128 do 127 1 bajt
    short s = 32767; // -32768 do 32767 2 bajty
    int i = 2147483647; // -2147483648 do 2147483647 4 bajty
    long l = 9223372036854775807l; //-9223372036854775808 do 9223372036854775807 TYP LONG MUSI KONCZYC SIE NA LITERKE l // 8 bajtów
    float f = 3.444444f; // -3.4*10^38 do 3.4*10^38 konczy sie literka f // 4 bajty
    double d = 3.777654545767456745; // -1.8*10^108 do 1.8*10^108 tu już nie musi sie konczyć literką d. <-- 8 bajtów
    char c = 'a'; // 1 bajt typ arytmetyczny(często tak nazywany bo zawiera wiekszość liter na świecie)
    String str = "jakis tekst"; // <-- String to jakiś dowolny ciąg znaków

    public static void main(String[] args) {
        int wynik, wynik1, wynik2, wynik3, wynik4;
        wynik = 5;
        System.out.println("Wynik = " + wynik);// <- wypisze wartość z zmienej "wynik"
        System.out.printf("Wynik = %d\r\n", wynik); // <- to jest to samo co wyżej tylko w inny sposób (tak jak w języku C)

        System.out.println("Wynik = " + wynik + wynik); // tu wynik bedzie 55, ponieważ do 5 dopisujemy 5
        System.out.println("Wynik = " + (wynik + wynik)); // tu wynik bedzie 5+5=10, ponieważ jest w nawiasach

        int l1 = 56;
        int l2 = 16;
        wynik = l1 + l2;
        System.out.println("Wynik = " + wynik); // przypisanie do l1 i l2 wartości integer, a następnie do wyniku dodanie tych wartości. <- wynik został wypisany.

        wynik1 = l1 - l2;
        wynik2 = l1 * l2;
        wynik3 = l1 / l2;

        System.out.println("Wynik = " + wynik1); // odejmowanie
        System.out.println("Wynik = " + wynik2); // mnożenie
        System.out.println("Wynik = " + wynik3); // dzielenie jest wartość jest podana w integer wiec to co po przecinku jest ucinane, ponieważ jest inny typ.

        wynik4 = l1 % l2;
        System.out.println("Wynik = " + wynik4); // moduloo czyli reszta z dzielenia l1 i l2

        wynik4++; //inkrementacja
        wynik4++;
        wynik4++;
        System.out.println("Wynik = " + wynik4); // wynik po zastosowaniu jej x3 razy (inkrementacji)

        wynik4--; //dekrementacja
        wynik4--;
        wynik4--;
        System.out.println("Wynik = " + wynik4); // wynik po zastosowaniu jej x3 razy (dekrementacji)

        byte b1 = 127;
        b1++;
        b1++;
        b1++;
        System.out.println("B1 = " + b1); // jak widzimy przekroczyła wartość zmienej (127) i zaczeła się wypisywać od nowa czyli -128, -127, -126 ...


    }
}