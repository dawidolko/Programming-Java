import java.util.Random; // klasa random
import java.util.Scanner; // klasa scanner

/*#8. Kurs Java dla początkujących - Piszemy prostą grę https://www.youtube.com/watch?v=UGCuVGcCaoY&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=9*/
public class task8 {
    public static void main(String[] args)
    {
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbe od 1 do 10!");

        do
        {
            i++;
            System.out.println("Podaj liczbe: ");
            odp = scanner.nextInt();
            if(odp > los)
            {
                System.out.println("niestety nie zgadles! Moja liczba jest mniejsza.");
            }
            else if(odp < los)
            {
                System.out.println("niestety nie zgadles! Moja liczba jest wieksza.");
            }
        }while(odp != los);
        System.out.println("Brawo odgadles za " + i + "razem!");
    }
}
