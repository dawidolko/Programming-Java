//  Tablice to ciągi obiektów tego samego typu. Tablice mają określony podczas ich tworzenia rozmiar,
//  który nie może ulec zmianie. Tablice to pierwszy rodzaj kolekcji. Kolekcje to zbiór powiązanych
//  ze sobą elementów. Kolekcje są bardzo często wykorzystywane w programowaniu, ponieważ często mamy potrzebę
//  przechowywać w programach tablice (bądź listy, zbiory itp.) wielu elementów, a nie pojedyncze wartości.
//  Wybrane metody używane w tablicach:
//      # length – rozmiar tablicy,
//      # charAt – pobranie znaku w tablicy,

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        /* TABLICE JEDNOWYMIAROWE */
        // Deklaracja tablicy: dataType[] arrayName;
        // dataType - int, char, double, byte, etc. or Java objects,
        // arrayName - nazwa tablicy,

        // I sposób
        double[] data;
        data = new double[10];

        // II sposób
        double[] data1 = new double[10];

        // III sposób
        String[] slowa;
        slowa = new String[] {"Ala","ma","kota"};

        // Inicjalizacja tablicy
        int[] LiczbyCalkowite = {12,4,45,32,24};
        int[] Liczby = new int[5];
        Liczby[0]=12;
        Liczby[1]=21;
        Liczby[2]=5;
        Liczby[3]=6;
        Liczby[4]=46;



        /* DOSTĘP DO ELEMENTÓW TABLICY */
        System.out.println("Dostęp do elementów:");
        System.out.println("Pierwszy element: " + Liczby[0]);
        System.out.println("Drugi element: " + Liczby[1]);
        System.out.println("Trzeci element: " + Liczby[2]);
        System.out.println("Czwarty element: " + Liczby[3]);
        System.out.println("Piąty element: " + Liczby[4]);
        System.out.println(slowa[0] + " " + slowa[1] + " " + slowa[2] + "\n");



        /* METODA LENGTH() */
        int[] calkowite = new int[5];
        double[] rzeczywiste = {3.14,5,-20.5};
        System.out.println("Liczba elementów w tablicy 'calkowite': " + calkowite.length);
        System.out.println("Liczba elementów w tablicy 'rzeczywiste': " + rzeczywiste.length);
        String tekst = "Witajcie!";
        slowa = new String[] {"Ania","ma","kota"};
        System.out.println("Liczba slow w zmiennej 'tekst': " + tekst.length());
        System.out.println("Liczba elementów w tablicy 'slowa': " + slowa.length);
        System.out.println("Liczba znaków w pierwszym słowie z tablicy 'slowa': " + slowa[0].length() + "\n");



        /* PORÓWNYWANIE TABLIC */
        int[] arrayInt1 = {1,2,3};
        int[] arrayInt2 = {1,3,3};
        int[] arrayInt3 = {1,2,3,2,3,4,5};
        int[] arrayInt4 = {1,2,3};
        System.out.println("Int1: " + Arrays.toString(arrayInt1) + ", Int2: " + Arrays.toString(arrayInt2) + ", Int3: "
                + Arrays.toString(arrayInt3) + ", Int4: " + Arrays.toString(arrayInt4));
        System.out.println("equals (arrayInt1,arrayInt2): " + Arrays.equals(arrayInt1,arrayInt2));
        System.out.println("equals (arrayInt1,arrayInt4): " + Arrays.equals(arrayInt1,arrayInt4));
        System.out.println("compare (arrayInt1,arrayInt4): " + Arrays.compare(arrayInt1,arrayInt4));
        System.out.println("compare (arrayInt3,arrayInt4): " + Arrays.compare(arrayInt3,arrayInt4));
        System.out.println("compare (arrayInt1,arrayInt2): " + Arrays.compare(arrayInt1,arrayInt2));
        System.out.println();



        /* UŻYCIE PĘTLI FOR */
        Liczby = new int[] {12, 4, 5};
        System.out.println("Użycie pętli for:");
        System.out.print("Wypisywanie elementów tablicy od pierwszego indeksu: ");
        for(int i = 0; i < Liczby.length; i++)
        {
            System.out.print(Liczby[i] + " ");
        }
        System.out.print("\nWypisywanie elementów tablicy od ostatniego indeksu: ");
        for (int i = Liczby.length - 1; i >= 0 ; i--)
        {
            System.out.print(Liczby[i] + " ");
        }
        System.out.println();



        /* UŻYCIE PĘTLI FOR-EACH */
        System.out.println("Użycie pętli for-each:");
        System.out.print("Wypisywanie elementów tablicy od pierwszego indeksu: ");
        for(int i:Liczby)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");



        /* TABLICE WIELOWYMIAROWE */
        // Deklaracja
        int[][] matrixA = new int[3][4];
        String[][][] dataA = new String[3][4][2];

        // Inicjalizacja tablicy wielowymiarowej
        int[][] a = {   {1, 2, 3},
                        {4, 5, 6, 9},
                        {7}             };

        double[][] matrix = {   {1.2, 4.3, 4.0},
                                {4.1, -1.1}         };

        // Wyświetlenie elementów tablicy
        System.out.println("Elementy tablicy:");
        for (int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Jak widać, każdy element tablicy wielowymiarowej sam w sobie jest tablicą.
        // Ponadto, każdy wiersz tablicy wielowymiarowej w Javie może mieć różną długość.

        // Tworzenie 2D Tablicy
        int[][] b = {   {1, -2, 3},
                        {-4, -5, 6, 9},
                        {7}             };
        System.out.println("\nElementy tablicy:");
        for (int[] wiersz: b)
        {
            for (int komorka : wiersz)
            {
                System.out.print(komorka + "\t");
            }
            System.out.println();
        }



        /* TABLICE TRZYWYMIAROWE */
        System.out.println("\nElementy tablicy:");
        int[][][] test = {  {   {1, -2, 3},
                                {2, 3, 4}       },
                            {   {-4, -5, 6, 9},
                                {1},
                                {2, 3}          }   };
        for (int[][] array2D: test)
        {
            for (int[] array1D: array2D)
            {
                for(int item: array1D)
                {
                    System.out.print(item +"\t");
                }
                System.out.println();
            }
        }
        System.out.println();



        /* KOPIOWANIE TABLICY */
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] positiveNumbers = numbers; // Skopiowano tablice
        System.out.print("Tablica: ");
        for (int number: numbers)
        {
            System.out.print(number + ", ");
        }
        System.out.print("\nKopia tablicy: ");
        for (int number: positiveNumbers)
        {
            System.out.print(number + ", ");
        }
        System.out.println();



        /* UŻYCIE PĘTLI PRZY KOPIOWANIU TABLICY */
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];
        // Iteracyjne kopiowanie elementów
        for (int i = 0; i < source.length; ++i)
        {
            destination[i] = source[i];
        }
        // Konwersja Tablicy na Napis tylko do wyświetlenia
        System.out.println("Kopia tablicy: " + Arrays.toString(destination) + "\n");



        /* KOPIOWANIE TABLICY Z WYKORZYSTANIEM METODY ARRAYCOPY() */
        // arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // src – tablica źródłowa, którą chcemy skopiować,
        // scrPoc – pozycja początkowa (indeks) w tablicy źródłowej,
        // dest – tablica docelowa, do której elementy zostaną skopiowane ze źródła,
        // destPOs – pozycja początkowa (indeks) w tablicy docelowej,
        // length – liczba elementów do skopiowania,

        int[] tab1 = {2, 3, 12, 4, 12, -2};
        int[] tab3 = new int[5];
        // Tworzenie tablicy tab2 o długości tab1
        int[] tab2 = new int[tab1.length];

        // Kopiowanie tab1 do tab2
        System.arraycopy(tab1, 0, tab2, 0, tab1.length);
        System.out.println("tab2 = " + Arrays.toString(tab2));

        // Kopiowanie 2 elementów od indeksu 2 z tab1 do indeksu 1 w tab3
        System.arraycopy(tab1, 2, tab3, 1, 2);
        System.out.println("tab3 = " + Arrays.toString(tab3) + "\n");



        /* KOPIOWANIE TABLICY Z WYKORZYSTANIEM METODY COPYOFRANGE() */
        int[] wartosci1 = {2, 3, 12, 4, 12, -2};
        // Kopiowanie całej tablicy
        int[] kopia1 = Arrays.copyOfRange(wartosci1, 0, wartosci1.length);
        System.out.println("kopia1 = " + Arrays.toString(kopia1));
        // Kopiowanie od indeksu 2 do 5 (5 się już nie zalicza)
        int[] kopia2 = Arrays.copyOfRange(wartosci1, 2, 5);
        System.out.println("kopia2 = " + Arrays.toString(kopia2) + "\n");



        /* ZMIANA ROZMIARU TABLICY */
        int[] tabela = {10, 100, -5};
        System.out.print("Elementy tablicy 'tabela': ");
        for (int x : tabela)
        {
            System.out.print(x + ", ");
        }
        System.out.println();
        // Tworzymy druga tablice o większym rozmiarze
        int[] tymczasowaTabela = new int[5];
        // Przepisujemy elementy z pierwszej tablicy
        for (int i = 0; i < tabela.length; i++)
        {
            tymczasowaTabela[i] = tabela[i];
        }
        // Ustawiamy dodatkowe elementy
        tymczasowaTabela[3] = 20;
        tymczasowaTabela[4] = 1;
        // Przypisujemy druga tablice do pierwszej
        tabela = tymczasowaTabela;
        System.out.print("Elementy tablicy 'tabela': ");
        for (int x : tabela)
        {
            System.out.print(x + ", ");
        }



        /* ROZDZIELANIE TEKSTU NA TABLICE */
        String text = "To jest tekst";
        String[] textArr = text.split(" ");
        System.out.println("\n\n" + text + "\n" + Arrays.toString(textArr));
    }
}
