import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello Java");



        /* Typy proste */
        char itemFirstCharacter = 'i';
        System.out.println(itemFirstCharacter);

        boolean enabled = true;
        System.out.println(enabled);

        byte itemsNumberByte = 7;
        System.out.println(itemsNumberByte);

        short itemsNumberShort = 400;
        System.out.println(itemsNumberShort);

        int itemsNumberInt = 53000;
        System.out.println(itemsNumberInt);

        long itemsNumberLong = 547758071;
        System.out.println(itemsNumberLong);

        float itemsNumberFloat = 4.33f;
        System.out.println(itemsNumberFloat);

        double itemsNumberDouble = 4.99;
        System.out.println(itemsNumberDouble);



        /* Deklaracja zmiennych */
        String imie;
        int wiek;
        String miasto;



        /* Inicjalizacja zmiennych */
        imie = "Jurek";
        wiek = 23;
        miasto = "Rzeszow";

        System.out.println();
        System.out.println("Imie: " + imie);
        System.out.println("Wiek: " + wiek);
        System.out.println("Miasto: " + miasto);



        /* Instrukcje wczytywania danych z klawiatury */
        // Stworzenie obiektu klasy Scanner z parametrem System.in
        // Ten obiekt posłuży do wczytywania liczb (danych)
        Scanner in = new Scanner(System.in);

        // Przed wczytywaniem danych należy poinformować użytkownika, co konkretnie ma wykonać
        System.out.print("\nPodaj liczbe calkowita: ");
        int a = in.nextInt();
        // W tym przypadku metoda obiektu in (klasy Scanner) nextInt() powoduje wczytanie liczby całkowitej z klawiatury

        // Wyświetlanie tekstu oraz wartości wczytanej liczby:
        System.out.print("Wczytana liczba to: " + a);

        // Dane można też wczytać do wcześniej zadeklarowanych zmiennych
        System.out.print("\nPodaj nowa liczbe calkowita: ");
        a = in.nextInt();
        System.out.println("Wczytana liczba to: " + a);

        // Oczywiście istnieje możliwość wczytania liczby rzeczywistej
        System.out.print("\nPodaj liczbe rzeczywista: ");
        float f = in.nextFloat();
        System.out.println("Wczytana liczba to: " + f);
        System.out.println();

        // Metoda println powoduje wyświetlenie komunikatu i przejście do nowej linii natomiast metoda print tylko wyświetla komunikat
        System.out.print("Komunikat 1a");
        System.out.print("Komunikat 2a");
        System.out.println(); // Nowa linia
        System.out.println("Komunikat 1b");
        System.out.println("Komunikat 2b");
        // Przejście do nowej linii można również wymusić wstawiając znak '\n'
        System.out.print("Komunikat 1c\nKomunikat 2c\n");
        // W podobny sposób można wstawić znak tabulacji
        System.out.println("Komunikat 1d\tKomunikat 2d");

        // Dodatkowo można zastosować wyświetlanie danych podobne do znanego printf
        // %f oznacza, że w to miejsce zostanie wstawiona liczba rzeczywista
        // %d oznacza, że w to miejsce zostanie wstawiona liczba całkowita
        System.out.format("\nPodana liczba calkowita wynosi %d, natomiast " + "podana liczba rzeczywista wynosi %f. Wynik dzielenia: %f\n", a, f, a / f);
        // Liczby z dokładnością do danego miejsca po przecinku
        System.out.format("PI: %.4f; %.3f; %.2f; %.1f; %.0f\n", Math.PI, Math.PI, Math.PI, Math.PI, Math.PI);
        System.out.println();



        /* Instrukcje - Określają konkretne działania w programie, takie jak na przykład deklarowanie i przypisywanie wartości lub sterowanie zachowaniem kodu */
        // Deklaracyjne - umożliwiają zadeklarowanie zmiennej
        int itemValue;
        int itemMaxValue = 10;
        String textElement;

        // Wyrażeniowe - elementy kodu zakończone średnikiem
        // Wyrażenie przypisanie wartości
        int itemNumber = 100;
        itemNumber *= 10;
        // Wyrażenie zwiększenia (inkrementacja) lub zmniejszenia (dekrementacja) wartości o jeden
        itemNumber++;
        ++itemNumber;
        itemNumber--;
        --itemNumber;
        // Wyrażenie wywołujące metodę
        System.out.println("Fragment tekstu");
        itemValue = 100 + 50;
        System.out.println(itemValue);
        int itemCurrentValue = itemValue + 250;
        System.out.println(itemCurrentValue);
        int itemNextValue = itemCurrentValue + itemValue;
        System.out.println(itemNextValue);
        // Przypisanie nowej wartości do zmiennej
        itemValue = 10;
        System.out.println(itemValue);
        // Dodanie nowej wartości do zmiennej i przypisanie wyniku do tej samej zmiennej
        itemValue += 5;
        System.out.println(itemValue);
        // Pomnożenie wartości zmiennej i przypisanie wyniku do tej samej zmiennej
        itemValue *= 3;
        System.out.println(itemValue + "\n");

        // Instrukcje warunkowe
        int numberOfItems = 220;
        if (numberOfItems < 100)
        {
            System.out.println("Liczba itemów mniejsza niż 100.");
        }
        else if (numberOfItems < 200)
        {
            System.out.println("Liczba itemów mniejsza niż 200.");
        }
        else
        {
            System.out.println("Liczba itemów nie jest mniejsza od 100 ani od 200. Jest większa bądź równa 200.");
        }

        // Instrukcja wyboru Switch
        numberOfItems = 50;
        switch (numberOfItems)
        {
            case 0:
                System.out.println("Liczba itemów równa jest 0.");
                break;
            case 10:
                System.out.println("Liczba itemów równa jest 10.");
                break;
            case 50:
                System.out.println("Liczba itemów równa jest 50.");
                break;
            case 103:
                System.out.println("Liczba itemów równa jest 103.");
                break;
            default:
                System.out.println("Liczba itemów jest inna niż przewidywana.");
        }
    }
}
