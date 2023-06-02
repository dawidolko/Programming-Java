package Task1;

public class RandomNumberSort {

    public static void main(String[] args) {
        int arr[] = new int[100];

        // Tworzenie tablicy z liczbami losowymi
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 100);

        // Sortowanie tablicy
        sort(arr);

        // Wyświetlanie wyników
        System.out.println("Posortowane liczby: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Metoda sortująca
    public static void sort(int arr[])
    {
        int n = arr.length;

        // Przechodzenie przez wszystkie elementy
        for (int i = 0; i < n-1; i++)
        {
            // Znajdowanie najmniejszego elementu w nieposortowanej części tablicy
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j; //

            // Zamiana miejscami najmniejszego elementu z pierwszym elementem
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
