public abstract class AbstractClass {
    protected int someField;

    public AbstractClass(int someField) {
        this.someField = someField;
    }

    public int getSomeField() {
        return someField;
    }

    public abstract void someAbstractMethod();
}