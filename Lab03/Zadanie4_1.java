import java.util.*;
public class Zadanie4_1 {
    // metoda silnia zwraca silnię z liczby przekazanej jako parametr
// obliczenie silni odbywa się za pomocą rekurencji
    public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
        if(wartosc == 0) return 1;
        else return wartosc * silnia(wartosc - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: " );
// pobieramy od użytkownika liczbę
        int liczba = sc.nextInt();
// wyświetlamy na ekranie obliczoną silnię
        System.out.println(liczba + "! = " + silnia(liczba));
    }
}