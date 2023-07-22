package Points;

public class Main
{
    public static void main(String[] args)
    {
        Point punkt1 = new Point(5, 10);
        Point punkt2 = new Point(3, 5);
        Point punkt3 = new Point(1, 1);
        Point punkt4 = new Point();

        punkt1.opis();
        punkt1.przesun(3.5, 5.5);
        punkt1.opis();
        System.out.println();

        punkt2.opis();
        punkt2.setY(7);
        punkt2.opis();
        System.out.println();

        punkt3.opis();
        System.out.println();

        punkt4.opis();
        punkt4.setX(13);
        punkt4.opis();
    }
}
