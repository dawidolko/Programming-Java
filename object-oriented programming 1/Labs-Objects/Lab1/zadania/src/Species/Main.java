// Zad. 3 Stwórz program, w którym będzie utworzonych kilka obiektów typu Gatunek.
//      Klasa Gatunek powinna zawierać następujące pola: nazwę rodzaju, nazwę gatunkową,
//      liczbę chromosomów 2n, podstawową liczbę chromosomów x, opis oraz metody:
//      podającą pełną nazwę (Rodzaj + gatunek), podającą haploidalną liczbę chromosomów n,
//      wypisującą wszystkie dane, klonującą obiekt – metoda powinna zwracać odnośnik
//      do nowego obiektu typu Gatunek o wartościach pól takich samych jak w obiekcie,
//      w którym została wywołana. W programie powinny być użyte wszystkie metody.

package Species;

public class Main
{
    public static void main(String[] args)
    {
        Run run = new Run();
        run.Runs();
    }
}
