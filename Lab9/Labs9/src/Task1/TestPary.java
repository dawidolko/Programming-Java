package Task1;

public class TestPary {
    public static void main(String[] args) {
        // Przykładowe zastosowanie klasy Para
        Para<String, Integer> para1 = new Para<>("John", 25);
        System.out.println("Imię: " + para1.getPierwszy());
        System.out.println("Wiek: " + para1.getDrugi());

        Para<Integer, Double> para2 = new Para<>(1, 2.5);
        System.out.println("Liczba całkowita: " + para2.getPierwszy());
        System.out.println("Liczba zmiennoprzecinkowa: " + para2.getDrugi());
    }
}
