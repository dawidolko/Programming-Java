package Task5;

public class Main {
    //C)
    public static void main(String[] args) {
        try {
            Osoba osoba = new Osoba("Jan", "Kowalski", 12, 180, 80);
            System.out.println("Imię: " + osoba.getImie() + "\nNazwisko: " + osoba.getNazwisko() +
                    "\nWiek: " + osoba.getWiek() + "\nWzrost: " + osoba.getWzrost() + "\nWaga: " + osoba.getWaga());
        } catch (NegativeNumberExcepion e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Name cannot be null!");
        }
    }
}

//Klasa NegativeNumberExcepion rozszerza klasę Exception i jest używana do wyrzucania wyjątków, gdy
// wartość zmiennej jest ujemna, podczas gdy oczekuje się, że jej wartość będzie zawsze dodatnia.
// Klasa Osoba zawiera pola imie, nazwisko, wiek, wzrost i waga, które są zhermetyzowane. Konstruktor
// klasy i metody get i set używają wyjątków, jeśli wartości są ustawione na null lub wartości ujemne.
// W funkcji main tworzymy obiekt klasy Osoba i wypisujemy wszystkie pola. Jeśli są one ustawione na null
// lub ujemne, wyrzucony zostanie odpowiedni wyjątek, który zostanie przechwycony i obsłużony.