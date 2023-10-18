package Interface;

// Przykład interfejsu

public interface FiguraGeometryczna
{
    // Zwróć uwagę, że interfejs FiguraGeometryczna mówi klasie “co ma zrobić”, ale nie mówi w jaki sposób ma to zrobić.
    // Mamy tylko deklaracje nazw metod: Pole() i Obwod(). Wszystkie stałe i metody interfejsu są domyślnie publiczne
    // i abstrakcyjne dlatego nie jest wymagane pisanie przed nimi słów kluczowych np.: public, abstract.
    // Analizując ten prosty interfejs możemy z łatwością domyślić się, że będzie on kazał klasie obliczyć pole i obwód
    // danej figury geometrycznej.

    double Pole();
    double Obwod();



    /* Metody domyślne w interfejsach */
    // W Javie jest możliwość dodawania do intefejsów metod zawierających ciało. Metody te używają słowa kluczowego
    // 'default' i są nazywane metodami domyślnymi. Jako, że są one od razu zaimplementowane (nie są abstrakcyjne),
    // nie jest wymagane dostarczanie ich implementacji w klasach dziedziczących. W razie potrzeby mogą być one
    // nadpisywane w tych klasach.

    default String getFullName()
    {
        return "Interfejs Figura geometryczna";
    }



    /* Stałe wartości w interfejsach */
    // W Javie oprócz zmiennych możemy wprowadzić do kodu także wartości stałe. Będziemy jeszcze o tym mówić
    // w przyszłości, ale na ta chwilę istotne jest aby wiedzieć, że stałą definiujemy za pomocą połączenia dwóch słów
    // kluczowych 'static final'. Dodatkowo nazwa stałej powinna być pisana dużymi literami (w razie nazwy złożonej
    // z kilku członów - rozdzielamy je znakiem podkreślenia _).

    public static final String LABEL = "Moje figury geometryczne";

    // Stałą wartość możemy zainicjować wartością tylko w trakcie tworzenia. Możemy to zrobić albo od razu w polu, albo
    // w konstruktorze. Nie możemy później zmienić takiej wartości. Przypisanie nowej wartości zakończy się błędem kompilacji.

    // Co to wszystko ma wspólnego z interfejsami? Okazuje się, że w interfejsach również możemy tworzyć stałe, ale
    // z tą różnicą, że są one deklarowane automatycznie i niejawnie. Tak więc nie wpisujemy w kodzie słów 'static final'.

    public String LABEL2 = "Moje figury geometryczne";
}
