package task5;

public class Pracownik {

    //pola klasy
    private String firstName;
    private String secondName;
    private int age;
    private String position;

    //Konstruktor
    public Pracownik(String firstName, String secondName, int age, String position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.position = position;
    }

    //metoda wyświetlająca dane
    public void show() {
        System.out.println(" Imię: " + firstName + " Nazwisko: " + secondName + " Wiek: " + age + " Stanowisko: " + position);
    }
}