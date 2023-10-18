import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        /* Pętla while oraz do while */
        int itemCounter = 0;
        while (itemCounter < 5)
        {
            System.out.print(itemCounter + " ");
            itemCounter++;
        }
        System.out.println();

        itemCounter = 0;
        do
        {
            System.out.print(itemCounter + " ");
            itemCounter++;
        }
        while (itemCounter < 5);
        System.out.println();



        /* Pętla for */
        System.out.print("\nInkrementacja: ");
        for (int itemNumber = 0; itemNumber < 5; itemNumber++)
        {
            System.out.print(itemNumber + " ");
        }

        System.out.print("\nDekrementacja: ");
        for (int itemNumberMax = 8; itemNumberMax > 0; itemNumberMax--)
        {
            System.out.print(itemNumberMax + " ");
        }
        System.out.println();



        /* Losowanie liczb */
        // Losowanie liczby z biblioteki Random
        // Stworzenie obiektu klasy Random, który posłuży do losowania liczb
        Random rand = new Random();
        // Losowanie liczb odbywa się po wywołaniu którejś z metod obiektu rand (klasy Random).
        // W zależności od typu liczby, którą należy wylosować, trzeba wybrać odpowiednią metodę np.:
        //      rand.nextInt() - wylosuje liczbę całkowitą z zakresu int,
        //      rand.nextFloat() - wylosuje liczbę rzeczywistą z zakresu float, itd.,
        // lista dostępnych metod klasy Random wyświetli się po wpisaniu nazwy obiektu
        // i kropki w tym przypadku: rand.
        // W przypadku zapisu rand.nextInt(n); wylosowana zostanie liczba
        // z zakresu od 0 do n-1, czyli chcąc wylosować liczbę z zakresu
        // od 1 do 10 (domkniętego) należy zapisać: rand.nextInt(10) + 1;

        // Losowanie liczby z zakresu [0,10] do zmiennej a.
        int a = rand.nextInt(11); // Deklaracja i definicja zmiennej
        System.out.println("\nWylosowana liczba z zakresu [1,10]: " + a);

        // Losowanie liczby z zakresu [-5,15] do zmiennej a.
        a = rand.nextInt(21)-5;
        System.out.println("Wylosowana liczba z zakresu [-5,-15]: " + a);
        // 21, bo w przedziale [-5,15] jest 21 liczb
        // -5, ponieważ jest to najmniejsza liczba w zakresie.

        // Losowanie liczby z zakresu [-20,-10] i wyświetleniu jej na konsoli.
        System.out.print("Wylosowana liczba z zakresu [-20,-10]: ");
        System.out.println(rand.nextInt(11)-20);
        // 11, bo w przedziale [-20,-10] jest 11 liczb
        // -20, ponieważ jest to najmniejsza liczba w zakresie.

        // Losowanie liczb z zakresu [x,y], gdzie x i y, to zmienne całkowitoliczbowe o dowolnej wartości.
        int x = 7; // To wartość przykładowa
        int y = 15; // To wartość przykładowa
        a = rand.nextInt(y-x+1)+x;
        System.out.println("Wylosowana liczba z zakresu ["+x+","+y+"]: " + a);
        // Od większej (y) odejmujemy mniejszą (x) i dodajemy 1 - to daje liczność zbioru (w losowaniu),
        // a następnie dodajemy mniejszą (x), bo to najmniejsza liczba w zakresie.

        // Sprawdzenie powyższego przykładu dla liczb ujemnych:
        x = -27; // To wartość przykładowa
        y = -15; // To wartość przykładowa
        a = rand.nextInt(y-x+1)+x;
        System.out.println("Wylosowana liczba z zakresu ["+x+","+y+"]: " + a);

        // Sprawdzenie powyższego przykładu w sytuacji, kiedy jedna liczba
        // jest ujemna, a druga dodatnia
        x = -7; // To wartość przykładowa
        y = 15; // To wartość przykładowa
        a = rand.nextInt(y-x+1)+x;
        System.out.println("Wylosowana liczba z zakresu ["+x+","+y+"]: " + a);
    }
}
