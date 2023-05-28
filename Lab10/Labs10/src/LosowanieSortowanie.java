import java.util.Arrays;
import java.util.Random;

class LosowanieSortowanie {
    public static void main(String[] args) {
        Random losujLiczby = new Random();
        int[] kilkaNaturalnych = new int[10];
        int[] tablicaNaturalnych = new int[10];
        tablicaNaturalnych[0] = 55;
        for(int i = 1; i < tablicaNaturalnych.length; i++ )
            tablicaNaturalnych[i] = losujLiczby.nextInt(101);
        Arrays.sort(tablicaNaturalnych);
        System.out.println(Arrays.binarySearch(tablicaNaturalnych, 55));
        System.out.println(Arrays.binarySearch(tablicaNaturalnych, 101));
//        boolean equals(kilkaNaturalnych, tablicaNaturalnych);
        System.out.print("Tablica liczb NATURALNYCH: ");
        System.out.println(Arrays.toString(kilkaNaturalnych));

        int [][] macierz = { {1, 2, 3},{4, 5 ,6}};
        boolean [][] szachownica;
        szachownica = new boolean [8][8];
        szachownica[0][0] = true;
        szachownica[1][0] = false;
//...
        class Kolor { private
        String kolor;
            public Kolor(String k) {
                kolor = k;
            }
//...
        }
        Kolor [][][] rgb = new Kolor [256][256][256];
        rgb[0][0][0] = new Kolor("black"); rgb[255]
                [255][0] = new Kolor("yellow");
    }
}