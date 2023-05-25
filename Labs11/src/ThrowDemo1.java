class ThrowsDemo1 {
    static void metoda() throws IllegalAccessException {
        System.out.println("Wewnatrz metody");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) throws IllegalAccessException {
        metoda();
    }
}