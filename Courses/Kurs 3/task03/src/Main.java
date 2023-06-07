import javafx.scene.control.Tab;

/*Kurs Java od podstaw #3 - Tablice jedno i wielowymiarowe, pętle https://www.youtube.com/watch?v=jeuEP_vTVWc&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=3*/
public class Main {
    public static void main(String[] args)
    {
        int tab[] = new int[5]; // tablica o wartościach 0, 1, 2, 3, 4
        //int[] tab = new int[5]; // <- to jest to samo to wyżej.

        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        for(int i = 0; i < tab.length; i++) // pętla "for" wypisująca wszystkie elementy tablicy.
        {
            System.out.println(tab[i]);
        }

        for (int i : tab) // pętla foreach <- specialna pętla pod wypisywanie tablic i działanie na nich.
        {
            System.out.println(i);
        }

        int i = 0;
        while(i < tab.length) // pętla while.
        {
            System.out.println(tab[i]);
            i++;
        }

        i = 0;
        do // pętla do while (różnica miedzy nią a while jest taka, że ona nawet gdy jest zły warunek wykona się min. raz)
        {
            System.out.println(tab[i]);
            i++;
        }while(i < tab.length);
        {
            System.out.println("koniec");
        }


        int table[][] ={{1, 2, 3}, {4, 5, 6, 7}};

        for (int j = 0; j < table.length; j++)
        {
            for(int k = 0; k < table[j].length; k++) // pętla złożona <- WAŻNE INACZEJ NIŻ W C
            {
                System.out.println("Tablica dwuwymiarowa: " + table[j][k]);
            }
        }

        for (int a = 5; a > 0; a--)
        {
            for (int b = 0; b < 5; b++)
            {
                System.out.println("Zmienna a = " + a + " , zmienna b = " + b);
            }
        }
    }
}