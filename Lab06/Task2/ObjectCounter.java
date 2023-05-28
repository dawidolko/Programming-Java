package Task2;

import java.util.Random;

public class ObjectCounter {
    public static void main(String[] args) {
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for(int i = 0; i < 10; i++)
        {
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000),r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();

        System.out.println("---------------------------------------------");
        System.out.println(Punkt.last_point.toString());

        System.out.println("---------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}
