import java.util.ArrayList;
import java.util.List;

public class SubtractionOfVectors {
    private InputData varInt;

    public SubtractionOfVectors(){
        varInt = new InputData();
    }
    private double subtractionOfVectorsFromDatabase(){
        int i=0;
        int next=1;
        double[][] result = new double[1][3];
        Vector3D vector;
        SelectDatabase selectDatabase = new SelectDatabase();
        String database1Path = selectDatabase.select();

        InjectDatabase database1 = new InjectDatabase(database1Path);
        List<Vector3D> selectedVectors = new ArrayList<>();

        ReadVectors readVectors = new ReadVectors();
        readVectors.read(database1Path);

        SaveLogs saveLogs = new SaveLogs();

        while(next!=2){
            System.out.println("--- Podaj id wektora, ktorego chcesz odjac: ");
            vector=database1.getVector();
            if(i==0){
                result[0][0]=vector.getX();
                result[0][1]=vector.getY();
                result[0][2]=vector.getZ();
            }
            else{
                result[0][0]-=vector.getX();
                result[0][1]-=vector.getY();
                result[0][2]-=vector.getZ();
            }

            i++;
            System.out.println("\n-- Czy chcesz odjac kolejny wektor? \n1. Tak. \n2. Nie. \n-- Wybor: ");
            next = varInt.getInt();
            if(next!=1 && next !=2) System.out.println("Podana opcja nie jest dostepna. Praca programu trwa dalej.");
            selectedVectors.add(vector);
        }


        saveLogs.saveHistory();
        System.out.println("Roznica wektorów: "+selectedVectors +" jest równa: ");
        RoundedResult result1 = new RoundedResult();
        System.out.println("Wektor : "+result1.returnRoundedResult(result));
        saveLogs.stopRedirectingConsoleOutput();
        return 0;
    }
    private double subtractionOfGivenVectors(){
        InputData cords = new InputData();
        int i=0;
        int next=1;
        double x,y,z;
        double[][] result = new double[1][3];
        Vector3D vector;
        List<Vector3D> givenVectors = new ArrayList<>();

        SaveLogs saveLogs = new SaveLogs();


        while(next!=2){
            System.out.print("Podaj współrzędną X: ");
            x=cords.getDouble();
            System.out.print("Podaj współrzędną Y: ");
            y=cords.getDouble();
            System.out.print("Podaj współrzędną Z: ");
            z=cords.getDouble();
            if (i == 0) {
                result[0][0]=x;
                result[0][1]=y;
                result[0][2]=z;
            }
            else{
                result[0][0]-=x;
                result[0][1]-=y;
                result[0][2]-=z;
            }

            vector = new Vector3D(i, x, y, z);
            givenVectors.add(vector);

            System.out.println("\n-- Czy chcesz odjac kolejny wektor? \n1. Tak. \n2. Nie. \n-- Wybor: ");
            next = varInt.getInt();

            if(next!=1 && next !=2) System.out.println("Podana opcja nie jest dostepna. Praca programu trwa dalej.");
            i++;
        }

        saveLogs.saveHistory();
        System.out.println("Roznica wektorów: "+givenVectors +" jest równa: ");
        RoundedResult result1 = new RoundedResult();
        System.out.println("Wektor : "+result1.returnRoundedResult(result));
        saveLogs.stopRedirectingConsoleOutput();
        return 0;

    }
    public void menu(){
        InputData data = new InputData();
        System.out.println("_____________________________________________________________");
        System.out.println("--- W jakis sposob chcesz przeprowadzic operacje na wektorach? : " +
                "\n1. Wybrac konkretne wektory z bazy danych." +
                "\n2. Utworzyc wlasne.");
        System.out.println("--- Wybor: ");

        int choice = data.getInt();
        switch (choice){
            case 1:
                subtractionOfVectorsFromDatabase();
                break;
            case 2:
                subtractionOfGivenVectors();
                break;
            default:
                System.out.println("Podana opcja nie jest dostepna.");
                break;
        }
    }
}
