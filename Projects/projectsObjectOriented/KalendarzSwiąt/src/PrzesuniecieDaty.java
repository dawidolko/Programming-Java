
public class PrzesuniecieDaty {
    private Data pierwszaData;

    public PrzesuniecieDaty(Data pierwszaData) {
        this.pierwszaData = pierwszaData;
    }

    public void przesunDate(int liczbaDni, int liczbaMiesiecy) {
        pierwszaData.przesunDate(liczbaDni, liczbaMiesiecy);
        System.out.println("Data po przesunięciu: " + pierwszaData.sformatujDate("dd-MM-yyyy"));
    }
}
