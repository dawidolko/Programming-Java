package zadanie1;
// POLECENIE:

//Utwórz klasę NegativeValueException, która będzie wyrzucać wyjątki w przypadku gdy ustawiona lub wprowadzona liczba jest
//        mniejsza od zera (a powinna być większa od zera). Przetestuj działanie klasy.


public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        try {
            obj.setLiczba(10);
            System.out.println("Wartość liczby: " + obj.getLiczba());

            obj.setLiczba(-5); // Próba ustawienia wartości mniejszej od zera
            System.out.println("Wartość liczby: " + obj.getLiczba()); // Nie zostanie wykonane
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        try {
            obj.setLiczba(100);
            System.out.println("Wartość liczby: " + obj.getLiczba());

            obj.setLiczba(-15); // Próba ustawienia wartości mniejszej od zera
            System.out.println("Wartość liczby: " + obj.getLiczba()); // Nie zostanie wykonane
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        try {
            obj.setLiczba(1000);
            System.out.println("Wartość liczby: " + obj.getLiczba());

            obj.setLiczba(-25); // Próba ustawienia wartości mniejszej od zera
            System.out.println("Wartość liczby: " + obj.getLiczba()); // Nie zostanie wykonane
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}

//wynik1: (tu przedstawione są 3 losowe wyniki podzielone przez losowe liczby ujemne)

//    Wartość liczby: 10
//        Błąd: Liczba nie może być mniejsza od zera.
//        Wartość liczby: 100
//        Błąd: Liczba nie może być mniejsza od zera.
//        Wartość liczby: 1000
//        Błąd: Liczba nie może być mniejsza od zera.
//
//        Process finished with exit code 0