public class NonStaticClass {
    private int value;

    public NonStaticClass(int value) {
        this.value = value;
    }

    public void nonStaticMethod() {
        System.out.println("Jest to metoda niestatyczna o wartości: " + this.value);
    }
}