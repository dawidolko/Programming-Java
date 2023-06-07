import java.math.BigInteger;
import java.util.Random;

/*Kurs Java od podstaw #8 - Przegląd klas zaimplementowanych w Javie https://www.youtube.com/watch?v=-Q4c-g-V0mA&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=8 */
public class Main {
    public static void main(String[] args) {
        Main  main = new Main();
        main.addingString(); //metoda ktora pozwala na dodawanie znow do Stringu
        main.showString(); //metoda ktora pozwala na pokazanie Stringu
        main.showMath();
        main.random();
    }

    public void addingString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "a";
        long startTime = System.currentTimeMillis(); // jest to czas w milisekundach od stycznia 1970 roku
        for(int i = 0; i<1000000; i++)
        {
            //str = str + "a"; // <-- wbudowana klasa pozwala zamiane na: stringBuilder.append("a")
            stringBuilder.append("a");
        }
        str = stringBuilder.toString();
        long endTime = System.currentTimeMillis(); //<-- czas po
        long result = endTime - startTime; // czas po jakim sie zrobila petla.
        System.out.println(str);
        System.out.println(result);
    }

    public void showString()
    {
        String str = "temporary text";
        System.out.println(str);
        str = str.charAt(0) +""; // wypisywanie stringa
        System.out.println(str);
        str = str.concat("abc"); // laczenie stringow <-
        System.out.println(str);
        str = str.substring(1,3); //wycina Zaznaczony fragment stringa
        System.out.println(str);
        str = str.toUpperCase(); // zamienia na duze litery
        System.out.println(str);
        str = str.toLowerCase(); //zamiana na male litery
        System.out.println(str);

        char[] chars = str.toCharArray();
        System.out.println(chars.length); // zapisanie stringa do tablicy ! ! ! wazne
    }

    public void showMath()
    {
        int a = -90;
        a = Math.abs(a); // wartosc bezwzgledna.
        System.out.println(a);
        double b = 90;
        double c = Math.pow(b, 2); // musi byc typu double
        System.out.println(c); //potegowanie

        BigInteger bigInteger = new BigInteger("31222222321321331232"); //specialna klasa o mega duzych wartosciach
        System.out.println(bigInteger.pow(3)); // to potegi ktrorej chcemy
        System.out.println(bigInteger.add(bigInteger)); // dodawanie
    }

    public void random()
    {
        Random rand = new Random(); // klasa robiaca randomowe liczby
        int a = rand.nextInt();
        System.out.println(a);
        int b = rand.nextInt(100)+1; // losowanie cyfr od 0 do 100 bo jest + 1
        System.out.println(b);
    }
}