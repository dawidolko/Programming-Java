
public class SprawdzenieCzySwieto {
    private Data pierwszaData;
    private Data drugaData;

    public SprawdzenieCzySwieto(Data pierwszaData, Data drugaData) {
        this.pierwszaData = pierwszaData;
        this.drugaData = drugaData;
    }

    public void sprawdzCzySwieto() {
        if (pierwszaData != null) {
            System.out.println("Czy pierwsza data jest świętem? " + pierwszaData.czySwieto());
        }

        if (drugaData != null) {
            System.out.println("Czy druga data jest świętem? " + drugaData.czySwieto());
        }
    }
}
