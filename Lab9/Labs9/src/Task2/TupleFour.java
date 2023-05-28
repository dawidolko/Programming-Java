package Task2;

public class TupleFour<T1, T2, T3, T4> extends TupleThree<T1, T2, T3> {
    private T4 czwarty;

    public TupleFour(T1 pierwszy, T2 drugi, T3 trzeci, T4 czwarty) {
        super(pierwszy, drugi, trzeci);
        this.czwarty = czwarty;
    }

    public T4 getCzwarty()
    {
        return czwarty;
    }

    public void setCzwarty(T4 czwarty)
    {
        this.czwarty = czwarty;
    }
}