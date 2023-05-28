package Task2;

public class Main {
    public static void main(String[] args) {
        TupleTwo<String, Integer> tupleTwo = new TupleTwo<>("abc", 123);
        System.out.println("TupleTwo: " + tupleTwo.getPierwszy() + ", " + tupleTwo.getDrugi());

        TupleThree<String, Integer, Double> tupleThree = new TupleThree<>("abc", 123, 1.23);
        System.out.println("TupleThree: " + tupleThree.getPierwszy() + ", " + tupleThree.getDrugi() + ", " + tupleThree.getTrzeci());

        TupleFour<String, Integer, Double, Boolean> tupleFour = new TupleFour<>("abc", 123, 1.23, true);
        System.out.println("TupleFour: " + tupleFour.getPierwszy() + ", " + tupleFour.getDrugi() + ", " + tupleFour.getTrzeci() + ", " + tupleFour.getCzwarty());
    }
}