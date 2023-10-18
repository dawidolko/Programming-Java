// Zad. 2 Proszę zaimplementować aplikację obrazującą Zwierzęta i ich podstawowe czynności (płynie, wynurza się,
//      zanurza, wydala, leci, ląduje). Wskazówka: Należy utworzyć dwa interfejsy: Pływanie z metodami plyn(), wynurz(),
//      zanurz() oraz interfejs Latanie z metodami lec(), wyladuj(). Klasę Zwierze należy zmodyfikować tak aby była
//      klasą abstrakcyjną. Klasę Ryba również by była abstrakcyjna. W klasie Ryba powinny się znaleźć metody jedz()
//      i wydalaj().Gotowe rozwiązanie powinno zostać przetestowane poprzez utworzenie nowego Zwierzaka gatunku
//      Wieloryb i sprawdzenie jego działania.

package Zwierzeta;

public class Main
{
    public static void main(String[] args)
    {
        Run run = new Run();
        run.Runs();
    }
}
