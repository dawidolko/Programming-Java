public class zadanie7 {
    public static void main(String[] args) {
        DoubleArray doubleArray = new DoubleArray(5);
        doubleArray.setArray(0, 1.5);
        doubleArray.setArray(1, 2.5);
        doubleArray.setArray(2, 3.5);
        doubleArray.setArray(3, 4.5);
        doubleArray.setArray(4, 5.5);

        System.out.print("Array: ");
        doubleArray.displayArray();

        System.out.println("Sum: " + doubleArray.sumArray());
    }
}
