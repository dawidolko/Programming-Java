package AbstractClass;

// Klasa Figura zawiera dwie metody abstrakcyjne, które zwracają wartości zmiennoprzecinkowe – double. W odróżnieniu
// od interfejsów metody abstrakcyjne muszą określać typ zwracanych wartości. Klasy potomne, dziedziczące klasę
// abstrakcyjną muszą zaimplementować wszystkie jej metody abstrakcyjne. Ponadto klasa abstrakcyjna może posiadać
// również zwykłe metody, które nie muszą być implementowane w klasach potomnych. Z powyższego przykładu wiemy już,
// że klasy potomne będą obliczać pole powierzchni i obwód danej figury. Klasa abstrakcyjna nie podaje konkretów dla
// metod obliczeniowych, bo każda figura ma przecież inny wzór matematyczny na przeliczanie tych niewiadomych.
// Jak widać, jest to elastyczne podejście dające nam dużo swobody w projektowaniu.

public abstract class Figura
{
    public abstract double Pole();
    public abstract double Obwod();
}
