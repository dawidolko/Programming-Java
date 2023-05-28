class ThrowsDemo2 {
    static void metoda()
            throws IllegalAccessException {
        System.out.println("Wewnatrz metody");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            metoda();
        } catch (IllegalAccessException e) {
            System.out.println("Zlapany " + e);
        }
    }
}