
public class RóżnicaDat {
    private Data pierwszaData;
    private Data drugaData;

    public RóżnicaDat(Data pierwszaData, Data drugaData) {
        this.pierwszaData = pierwszaData;
        this.drugaData = drugaData;
    }

    public void obliczRóżnicęWDniach() {
        long roznicaWDniach = pierwszaData.roznicaWDniach(drugaData);
        System.out.println("Różnica między datami: " + roznicaWDniach + " dni");
    }
}
