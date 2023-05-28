package Task1;

public class Para <T1, T2>{
    private T1 pierwszy;
    private T2 drugi;

    public Para(T1 pierwszy, T2 drugi)
    {
        this.pierwszy=pierwszy;
        this.drugi=drugi;
    }

    public T1 getPierwszy()
    {
        return pierwszy;
    }

    public T2 getDrugi()
    {
        return drugi;
    }

    public void setPierwszy(T1 pierwszy)
    {
        this.pierwszy=pierwszy;
    }

    public void setDrugi(T2 Drugi)
    {
        this.drugi=drugi;
    }
}
