// Zad. 1 Proszę zaimplementować aplikację modelu istniejących środków transportu używanych do przemieszczania się
//      zarówno na lądzie, wodzie jak i w powietrzu. Wskazówka: Należy utworzyć interfejs Jedzie, Plywa oraz Lata
//      (metody odpowiednio jedz(), plyn() i lec()). Powinno się również zdefiniować klasy implementujące każdy
//      z interfejsów (np. Samochód, Statek, Samolot) jak również klasę tworzącą przykładowe obiekty wraz
//      z wywołaniem zaimplementowanych metod.

package Transport;

public class Main
{
    public static void main(String[] args)
    {
        Run run = new Run();
        run.Runs();
    }
}
