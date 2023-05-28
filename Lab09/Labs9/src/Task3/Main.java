package Task3;

public class Main {
    public static void main(String[] args) {

        System.out.println("FUNKCJA POSTACI GENERYCZNEJ, DOWOLNE TYPY");

        DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        dynamicArray.add("Przykład1");
        dynamicArray.add("Przykład2");
        dynamicArray.print();
        System.out.println("Rozmiar tablicy: " + dynamicArray.size());
        System.out.println("Czy znaleziono element: " + dynamicArray.find("Przykład1"));

        System.out.println("FUNKCJA BEZ POSTACI GENERYCZNEJ, TYLKO TYPU INT");

        DynamicArrayInt dynamicArrayInt = new DynamicArrayInt(2);
        dynamicArrayInt.add(5);
        dynamicArrayInt.add(2);
        dynamicArrayInt.print();
        System.out.println("Rozmiar tablicy: " + dynamicArrayInt.size());
        System.out.println("Czy znaleziono element: " + dynamicArrayInt.find(5));
    }
}
