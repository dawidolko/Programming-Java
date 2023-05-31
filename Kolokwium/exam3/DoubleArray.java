public class DoubleArray {
    private double[] array;

    public DoubleArray(int size) {
        this.array = new double[size];
    }

    public void setArray(int index, double value) {
        array[index] = value;
    }

    public void displayArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public double sumArray() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}