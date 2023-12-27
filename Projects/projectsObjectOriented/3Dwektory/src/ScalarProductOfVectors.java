import java.util.ArrayList;
import java.util.List;

public class ScalarProductOfVectors {
    private InputData varInt;

    public ScalarProductOfVectors(){
        varInt = new InputData();
    }
    private double scPrdOfVectorsFromDatabase(){
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
            System.out.println("--- Podaj id wektora, ktorego chcesz pomnozyc: ");
            vector=database1.getVector();
            if(i==0){
                result[0][0]=vector.getX();
                result[0][1]=vector.getY();
                result[0][2]=vector.getZ();
            }
            else{
                result[0][0]*=vector.getX();
                result[0][1]*=vector.getY();
                result[0][2]*=vector.getZ();
            }

            //selectedVectors.addAll(database1.getVector());
            i++;
            System.out.println("\n-- Czy chcesz pomnozyc kolejny wektor? \n1. Tak. \n2. Nie. \n-- Wybor: ");
            next = varInt.getInt();
            if(next!=1 && next !=2) System.out.println("Podana opcja nie jest dostepna. Praca programu trwa dalej.");
            selectedVectors.add(vector);
        }

        //System.out.println(selectedVectors);
        //System.out.println("X: "+result[0][0]+"Y: "+result[0][1]+"Z: "+result[0][2]);
        double finalResult = result[0][0]+result[0][1]+result[0][2];

        saveLogs.saveHistory();
        RoundedResult result1 = new RoundedResult();
        System.out.println("Iloczyn sklarany wektorow: "+selectedVectors +" jest rowny: "+result1.returnRoundedOneNumber(result[0][0])+" + "
                +result1.returnRoundedOneNumber(result[0][1])+" + "+result1.returnRoundedOneNumber(result[0][2]));
        System.out.println("Wynik : "+result1.returnRoundedOneNumber(finalResult));
        saveLogs.stopRedirectingConsoleOutput();
        return 0;
    }
    private double scPrdOfGivenVectors(){
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
                result[0][0]*=x;
                result[0][1]*=y;
                result[0][2]*=z;
            }

            vector = new Vector3D(i, x, y, z);
            givenVectors.add(vector);

            System.out.println("\n-- Czy chcesz pomnozyc kolejny wektor? \n1. Tak. \n2. Nie. \n-- Wybor: ");
            next = varInt.getInt();

            if(next!=1 && next !=2) System.out.println("Podana opcja nie jest dostepna. Praca programu trwa dalej.");
            i++;
        }

        double finalResult = result[0][0]+result[0][1]+result[0][2];

        saveLogs.saveHistory();
        System.out.println("Iloczyn sklarany wektorow: "+givenVectors +" jest rowny: "+result[0][0]+" + "+result[0][1]+" + "+result[0][2]);
        RoundedResult result1 = new RoundedResult();
        System.out.println("Wynik : "+result1.returnRoundedOneNumber(finalResult));
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
                scPrdOfVectorsFromDatabase();
                break;
            case 2:
                scPrdOfGivenVectors();
                break;
            default:
                System.out.println("Podana opcja nie jest dostepna.");
                break;
        }
    }
}
