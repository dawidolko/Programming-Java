package zadanie1;

class MyClass {
    private int liczba;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) throws NegativeValueException {
        if (liczba < 0) {
            throw new NegativeValueException("Liczba nie może być mniejsza od zera.");
        }
        this.liczba = liczba;
    }
}
