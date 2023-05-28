
//Zadanie 5.
//        Napisz program wyświetlający liczby od 20-0, z wyłączeniem liczb {2,6,9,15,19}. Do realizacji
//        zadania wyłączenia użyj instrukcji continue;

public class Zadanie5 {
    public static void main(String[] args) {
        for (int i = 20; i >= 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.println(i);
        }
    }
}