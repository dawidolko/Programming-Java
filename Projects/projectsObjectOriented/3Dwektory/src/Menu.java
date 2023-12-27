import org.apache.commons.math3.stat.descriptive.summary.Sum;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.zip.DataFormatException;

public class Menu{

    private void printLogo(){
        try{
            File logoTXT = new File("logo.txt");
            Scanner scanLogo = new Scanner(logoTXT);
            while (scanLogo.hasNextLine()){
                String var = scanLogo.nextLine();
                System.out.println(var);
            }
            scanLogo.close();
        }
        catch (FileNotFoundException e){
            System.out.println("BŁĄD: Nie można wczytać logo!");
            e.printStackTrace();
        }
    }
    public void menu() {
        String choice;
        while (true) {
            printLogo();
            System.out.println(
                    "_____________________________________________________________" +
                            "\n--- Opcje:" +
                            "\n1. Uruchom kalkulator." +
                            "\n2. Przegladaj dostepne bazy danych wektorow." +
                            "\n3. Zamknij program." +
                            "\n_____________________________________________________________" +
                            "\n--- Wybor:");
            choice=inputStr();
            switch (choice){
                case "1":
                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();

                    modes();
                    break;
                case "2":
                    searchDatabases();
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("Trwa zamykanie programu.");
                    try {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    System.exit(0);
                    break;

                default:
                    System.out.println("--- Podana opcja nie jest dostępna.");
                    break;
            }
        }
    }
    private void modes(){
        while (true){
            System.out.println("_____________________________________________________________");
            System.out.println("--- Dostepne opcje: \n" +
                    "1. Suma wektorow." +
                    "\n2. Roznica wektorow." +
                    "\n3. Iloczyn skalarny wektorow." +
                    "\n4. Dlugosc wektora." +
                    "\n5. Mnozenie wektora przez skalar" +
                    "\n6. Wroc.");
            System.out.println("--- Wybor: ");
            String choice = inputStr();
            switch (choice){
                case "1":
                    SumOfVectors sum = new SumOfVectors();
                    sum.menu();
                    break;
                case "2":
                    SubtractionOfVectors subtraction = new SubtractionOfVectors();
                    subtraction.menu();
                    break;
                case "3":
                    ScalarProductOfVectors scalarProductOfVectors = new ScalarProductOfVectors();
                    scalarProductOfVectors.menu();
                    break;
                case "4":
                    LengthOfVector lengthOfVector = new LengthOfVector();
                    lengthOfVector.menu();
                    break;
                case "5":
                    MultiplyVectorByScalar multiplyVectorByScalar = new MultiplyVectorByScalar();
                    multiplyVectorByScalar.menu();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Podana opcja nie jest dostepna.");
                    break;
            }
        }

    }
    private void searchDatabases(){
        InputData data = new InputData();
        int choice;
        String exit;
        ShowAvailableDatabases databases = new ShowAvailableDatabases();
        databases.showDatabases();
        File file = new File("database/UserDatabase.xlsx");
        ReadVectors readVectors = new ReadVectors();

        System.out.println("_____________________________________________________________" +
                "\n--- Opcje:" +
                "\n1. Utworz swoja baze danych." +
                "\n2. Wyswietl zawartosc bazy danych nr 1." +
                "\n3. Wyswietl zawartosc bazy danych nr 2.");
        if (file.exists()){
            System.out.println("4. Wyswietl zawartosc bazy danych nr 3." +
                    "\n5. Modyfikuj wektory bazy danych uzytkownika (UserDatabase.xlsx).");
        }
        System.out.println("_____________________________________________________________" +
                "\n--- Wybor: ");

        choice = data.getInt();
        if(choice==1){
            CreateDatabase newDatabase = new CreateDatabase("database/");
            newDatabase.writeVectorsToExcel();
        } else if (choice==2) {
            String database1Path = "database/3dVecCordINTNUM.xlsx";
            readVectors.read(database1Path);
        } else if (choice==3) {
            String database1Path = "database/3dVecCordREALNUM.xlsx";
            readVectors.read(database1Path);
        } else if (file.exists()) {
            if(choice==4){
                String database1Path = "database/UserDatabase.xlsx";
                readVectors.read(database1Path);
            } else if (choice==5) {
                ModifyDatabase modifyDatabase = new ModifyDatabase("database/UserDatabase.xlsx");
                modifyDatabase.modifyVectorInDatabase();
            }
        }

        System.out.println("\nAby wrocic do menu wcisnij dowolny przycisk i nacisnij Enter.");
        exit=inputStr();
    }
    private String inputStr(){
        Scanner scanner = new Scanner(System.in);
        String var = scanner.nextLine();
        return var;
    }


}
