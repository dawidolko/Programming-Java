public class Rekin extends Zwierze implements Iplywanie, Ipolowanie {
    public Rekin(String nazwa, double waga, int wiek) {
        super(nazwa, waga, wiek);
        }
    @Override
    public void je() {
        System.out.println("Rekin je ryby i ludzi");
    }

    @Override
    public void oddycha() {
        System.out.println("rekin oddycha w wodzie");
    }

    @Override
    public void poluj() {
        System.out.println("Rekin poluje pyskiem");
    }

    @Override
    public void plywaj() {
        System.out.println("Rekin pływa");
    }
}