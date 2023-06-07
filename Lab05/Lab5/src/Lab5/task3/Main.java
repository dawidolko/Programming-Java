package Lab5.task3;

public class Main {
    public static void main(String[] args) {
        // tworzymy nowy stos o rozmiarze 10
        Stack stack = new Stack(10);

        // wkładamy kilka wartości
        stack.push(5);
        stack.push(7);
        stack.push(9);

        // ściągamy wartości ze stosu
        int value1 = stack.pop();
        int value2 = stack.pop();
        int value3 = stack.pop();

        // wypisujemy wartości
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}