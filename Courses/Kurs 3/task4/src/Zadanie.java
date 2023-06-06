import java.util.Scanner;

public class Zadanie {
    // Uzytkownik podaje 3 wartosci liczbowe typu int. Sprawdz czy te podane cyfrny mogą byc ramionami trojkąta.

    public static void main(String[] args)
    {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        System.out.println("Podane wartości to: " + " a = " + a + " , b = " + b + " , c = " + c);

        System.out.println();
        System.out.println("Czy moze istniec trojkat z prostymi o takich dlugosciach?");
//        if(a<b+c) // to jest to samo co wyzej tylko bez operatorow logicznych
//        {
//            if(b<a+c)
//            {
//                if(c<a+b)
//                {
//                    System.out.println("Tak");
//                }else
//                {
//                    System.out.println("Nie");
//                }
//            }
//        }
        if(a + b > c && a + c > b && b + c > a)
        {
            System.out.println("Tak");
        }else
        {
            System.out.println("Nie");
        }
    }
}
