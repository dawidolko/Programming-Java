public class zadanie4 {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Dawid", "Olko", 21, 171, 68);
        osoba.wyswietlDane();

        Osoba osoba1 = new Osoba("Michał", "Pilecki");
        osoba1.setWaga(110);
        osoba1.wyswietlDane();

        osoba.wprowadzDane();
        osoba.wyswietlDane();

        Osoba osoba2 = new Osoba("Jan", "Kowalski", 30, 1.80, 80);
        osoba.wyswietlDane();
    }
    //W tej implementacji, pola imie, nazwisko, wiek, wzrost i waga klasy Osoba są hermetyzowane, a metody get i set są wykorzystywane do dostępu do tych pól. Konstruktor Osoba umożliwia tworzenie obiektów klasy z pełnymi lub minimalnymi informacjami o osobie. Metoda wyswietlDane wyświetla informacje o osobie na ekranie.
    //
    //W metodzie main tworzymy obiekt klasy Osoba z pełnymi informacjami i wywołujemy na nim metodę wyswietlDane, aby wyświetlić informacje o osobie na ekranie.
}
