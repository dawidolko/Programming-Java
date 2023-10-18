package AbstractClass;

// Klasa abstrakcyjna jest klasą, z której nie można utworzyć instancji obiektu. Posiada ona następujące własności:
//  • Oznaczamy ją modyfikatorem abstract.
//  • Klasa może (ale nie musi) zawierać zarówno regularne metody Java jak i takie oznaczone modyfikatorem abstract.
//  • Klasa abstrakcyjna może być rozszerzana przez inne klasy Java - zarówno zwykłe jak i abstrakcyjne.
// W Javie możemy rozszerzać tylko jedną klasę na raz i tak samo jest w przypadku klas abstrakcyjnych.
// Klasa abstrakcyjna może zawierać deklaracje metod abstrakcyjnych, zwykłe metody, stałe i składowe finalne.

// Aby lepiej zdefiniować sens abstrakcji w programowaniu posłużmy się przykładem z życia. Klasą abstrakcyjną może
// być figura geometryczna. Nie wiemy jak wygląda “figura”, dla nas to ogólne pojęcie, abstrakcyjny byt, którego
// nie potrafimy sobie wyobrazić. Możemy natomiast zdefiniować właściwości owej figury, np.: pole powierzchni, obwód,
// które mogą być dziedziczone przez konkretne klasy potomne (i które możemy sobie wyobrazić np.: Kwadrat, Prostokat,
// Trójkąt, Koło itd.). Klasa abstrakcyjna jest pewnego rodzaju wzorcem dla klas potomnych.

public class Main
{
    public static void main(String[] args)
    {
        // Użycie klasy abstrakcyjnej i klas dziedziczących jej składowe.
        Kwadrat kw1 = new Kwadrat();
        Kwadrat kw2 = new Kwadrat();
        Kwadrat kw3 = new Kwadrat(5);
        kw1.a = 3;
        kw2.setA(4);
        System.out.println("Pole kwadratu kw1 o boku " + kw1.a + " wynosi " + kw1.Pole());
        System.out.println("Obwód kwadratu kw1 o boku " + kw1.a + " wynosi " + kw1.Obwod());
        System.out.println("Pole kwadratu kw2 o boku " + kw2.a + " wynosi " + kw2.Pole());
        System.out.println("Obwód kwadratu kw2 o boku " + kw2.a + " wynosi " + kw2.Obwod());
        System.out.println("Pole kwadratu kw3 o boku " + kw3.a + " wynosi " + kw3.Pole());
        System.out.println("Obwód kwadratu kw3 o boku " + kw3.a + " wynosi " + kw3.Obwod());

        Prostokat pr1 = new Prostokat();
        Prostokat pr2 = new Prostokat();
        Prostokat pr3 = new Prostokat(5,7);
        pr1.a = 5;
        pr1.b = 2;
        pr2.setA(3);
        pr2.setB(5);
        System.out.println("Pole prostokąta pr1 o bokach " + pr1.a + " i " + pr1.b + " wynosi " + pr1.Pole());
        System.out.println("Obwód prostokąta pr1 o bokach " + pr1.a + " i " + pr1.b + " wynosi " + pr1.Obwod());
        System.out.println("Pole prostokąta pr2 o bokach " + pr2.a + " i " + pr2.b + " wynosi " + pr2.Pole());
        System.out.println("Obwód prostokąta pr2 o bokach " + pr2.a + " i " + pr2.b + " wynosi " + pr2.Obwod());
        System.out.println("Pole prostokąta pr3 o bokach " + pr3.a + " i " + pr3.b + " wynosi " + pr3.Pole());
        System.out.println("Obwód prostokąta pr3 o bokach " + pr3.a + " i " + pr3.b + " wynosi " + pr3.Obwod());
    }
}
