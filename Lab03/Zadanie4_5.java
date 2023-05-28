//Zagadnienie wież Hanoi to klasyczny problem z dziedziny matematyki i informatyki, polegający na przenoszeniu stosu krążków
// z jednej wieży na drugą, zgodnie z określonymi zasadami. Zadanie to jest często wykorzystywane jako przykład rekurencji.
public class Zadanie4_5 {
    public static void hanoi(int n, char zrodlo, char pomoc, char cel) {
        if (n == 1) {
            System.out.println("Przenieś krążek z " + zrodlo + " na " + cel);
        } else {
            hanoi(n-1, zrodlo, cel, pomoc);
            System.out.println("Przenieś krążek z " + zrodlo + " na " + cel);
            hanoi(n-1, pomoc, zrodlo, cel);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        hanoi(n, 'A', 'B', 'C');
    }
}