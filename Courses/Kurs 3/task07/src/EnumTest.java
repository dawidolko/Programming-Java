public enum EnumTest {
    SMALL(false), MEDIUM(true), LARGE(true), XXL(false);
    private int a;
    private String name;

    boolean isBig;
    EnumTest(boolean isBig)
    {
        this.isBig = isBig;
    }

    String getSize(EnumTest et)
    {
        String big = (et.isBig) ? "big" : "small";
        return "Size :" + et.toString() + " its " + big;
    }
}
