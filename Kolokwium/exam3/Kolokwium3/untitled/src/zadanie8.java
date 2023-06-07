import java.util.ArrayList;

public class zadanie8 {
    public static void main(String[] args) {
        ArrayList<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Tygrys("Tygrys syberyjski", 300, 10));
        zwierzeta.add(new Orzeł("Orzeł przedni", 4, 5));
        zwierzeta.add(new Kaczka("Kaczka krzyżówka", 2, 3));
        zwierzeta.add(new Rekin("Rekin biały", 500, 20));

        for (Zwierze zwierze : zwierzeta) {
            zwierze.pokazDane();
            zwierze.je();
            zwierze.oddycha();
            if (zwierze instanceof Ibieganie) {
                ((Ibieganie) zwierze).biegnij();
            }
            if (zwierze instanceof Ilatanie) {
                ((Ilatanie) zwierze).lataj();
            }
            if (zwierze instanceof Iplywanie) {
                ((Iplywanie) zwierze).plywaj();
            }
            if (zwierze instanceof Ipolowanie) {
                ((Ipolowanie) zwierze).poluj();
            }
            System.out.println();
        }
    }
}