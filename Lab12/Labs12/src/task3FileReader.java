import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3FileReader{

    //Metoda main()
    public static void main(String[] args) {

        //Tworzymy obiekt typu Scanner
        Scanner scan = new Scanner(System.in);

        //Zmienna przechowująca nazwę pliku
        String fileName;

        //Zmienna przechowująca decyzję o wczytaniu kolejnego pliku
        String answer="";

        //Pętla wykonująca się do czasu, aż użytkownik nie wpisze słowa "koniec"
        while(!answer.equals("N")){
            //Komunikat pytający o nazwę pliku
            System.out.println("Podaj nazwę pliku do wczytania: ");
            //Wczytywanie nazwy pliku
            fileName = scan.nextLine();
            //Wywołanie metody wczytującej plik i wyświetlającej jego zawartość
            readFile(fileName);
            //Komunikat pytający o chęć wczytania kolejnego pliku
            System.out.println("Wczytać kolejny plik? (T/N)");
            //Wczytywanie decyzji
            answer = scan.nextLine();
        }
        //Komunikat kończący program
        System.out.println("Koniec programu.");
    }

    //Metoda wczytująca i wyświetlająca zawartość pliku
    public static void readFile(String fileName){

        //Tworzymy obiekt typu File
        File file = new File(fileName);
        //Tworzymy obiekt typu Scanner
        Scanner scan = null;

        try{
            //Przypisujemy do obiektu Scanner plik
            scan = new Scanner(file);
            //Pętla wczytująca kolejne linie pliku
            while(scan.hasNextLine()){
                //Wyświetlenie linii pliku
                System.out.println(scan.nextLine());
            }
        }
        //Obsługa wyjątku w przypadku braku pliku
        catch(FileNotFoundException e){
            System.out.println("Brak pliku o podanej nazwie");
        }
        //Zamykanie obiektu Scanner
        finally{
            scan.close();
        }
    }
}