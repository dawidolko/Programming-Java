import java.util.Scanner;

//Zadanie 6.
//        Napisz program, który w nieskończoność pyta użytkownika o liczby całkowite. Pętla nieskończona
//        powinna się zakończyć gdy użytkownik wprowadzi liczbę mniejszą od zera. Do opuszczenia pętli
//        nieskończonej użyj instrukcji „break”. Pętle nieskończoną realizuje się następującymi
//        konstrukcjami:
//        while(true)
//        { ciało pętli }
//        lub
//        for(;;)
//        { ciało pętli }

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbe calkowita: ");
            int liczba = input.nextInt();

            if (liczba < 0) {
                break;
            }

            // tutaj umieszczone zostanie dowolne cialo petli
            System.out.println("Podana liczba to: " + liczba);
        }

        System.out.println("Koniec programu.");
    }
}