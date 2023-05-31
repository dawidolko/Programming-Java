public class zadanie2 {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
//  tej implementacji, funkcja fibonacci wykorzystuje rekurencję do obliczenia wartości ciągu Fibonacciego dla danej liczby n.
//  Jeśli n jest mniejsze lub równe 1, zwracamy wartość n. W przeciwnym razie, wywołujemy funkcję fibonacci dla n-1 i n-2, a
//  następnie dodajemy ich wyniki i zwracamy jako wynik obecnej funkcji.
//
//W funkcji main tworzymy pętlę, która iteruje przez pierwszych n liczb ciągu Fibonacciego i wyświetla ich wartości na
// ekranie przy użyciu instrukcji System.out.print.
