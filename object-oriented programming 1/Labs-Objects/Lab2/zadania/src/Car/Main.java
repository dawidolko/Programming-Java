// Zad. 2 Napisz program, w którym będą dwie klasy: Samochod i SamochodOsobowy.
//      W klasach tych powinny znajdować się następujące pola:
//      • Samochod: Marka, Model, Nadwozie, Kolor, Rok produkcji, Przebieg (nie może być ujemny);
//      • SamochodOsobowy: Waga (powinna być z przedziału 2 t – 4,5 t), Pojemność silnika
//        (powinna być z przedziału 0,8-3,0), Ilość osób;
//      Klasa SamochodOsobowy dziedziczy po klasie Samochod. W obydwu klasach utwórz konstruktor, który pobierze dane
//      od użytkownika. Dodatkowo w klasie Samochod przeciąż konstruktor w taki sposób, by wartości pól były
//      parametrami metody. W klasie Samochod utwórz także metodę, która wyświetli informacje o samochodzie.
//      Przesłoń ją w klasie SamochodOsobowy. W metodzie Main() utwórz obiekt klasy SamochodOsobowy oraz
//      dwa obiekty klasy Samochod (wykorzystując różne konstruktory). Wyświetl informacje o samochodach.

package Car;

public class Main
{
    public static void main(String[] args)
    {
        Run run = new Run();
        run.Runs();
    }
}
