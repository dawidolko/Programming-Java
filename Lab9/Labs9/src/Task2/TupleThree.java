package Task2;

public class TupleThree<T1, T2, T3> extends TupleTwo<T1, T2> {
    private T3 trzeci;

    public TupleThree(T1 pierwszy, T2 drugi, T3 trzeci) {
        super(pierwszy, drugi);
        this.trzeci = trzeci;
    }

    public T3 getTrzeci()
    {
        return trzeci;
    }

    public void setTrzeci(T3 trzeci)
    {
        this.trzeci = trzeci;
    }
}