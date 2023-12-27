import java.util.ArrayList;
import java.util.List;

public class LengthOfVector {
    private InputData varInt;

    public LengthOfVector(){
        varInt = new InputData();
    }
    private double lgthOfVectorsFromDatabase(){

        double[][] result = new double[1][3];
        Vector3D vector;
        SelectDatabase selectDatabase = new SelectDatabase();
        String database1Path = selectDatabase.select();

        InjectDatabase database1 = new InjectDatabase(database1Path);
        List<Vector3D> selectedVectors = new ArrayList<>();

        ReadVectors readVectors = new ReadVectors();
        readVectors.read(database1Path);

        SaveLogs saveLogs = new SaveLogs();

        System.out.println("--- Podaj id wektora, ktorego chcesz obliczyc dlugosc: ");
        vector=database1.getVector();
        result[0][0]=vector.getX();
        result[0][1]=vector.getY();
        result[0][2]=vector.getZ();
        selectedVectors.add(vector);

        double finalLenght = Math.sqrt(Math.pow(result[0][0],2)+Math.pow(result[0][1],2)+Math.pow(result[0][2],2));
        RoundedResult result1 = new RoundedResult();

        saveLogs.saveHistory();
        System.out.println("Dlugosc wektora: "+selectedVectors +" wynosi: ");
        System.out.println("Wynik : "+result1.returnRoundedOneNumber(finalLenght));
        saveLogs.stopRedirectingConsoleOutput();
        return 0;
    }
    private double lgthOfGivenVectors(){
        InputData cords = new InputData();
        int i=0;
        int next=1;
        double x,y,z;
        Vector3D vector;
        List<Vector3D> givenVectors = new ArrayList<>();

        SaveLogs saveLogs = new SaveLogs();

        System.out.print("Podaj współrzędną X: ");
        x=cords.getDouble();
        System.out.print("Podaj współrzędną Y: ");
        y=cords.getDouble();
        System.out.print("Podaj współrzędną Z: ");
        z=cords.getDouble();

        vector = new Vector3D(i, x, y, z);
        givenVectors.add(vector);

        double finalLenght = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        RoundedResult result1 = new RoundedResult();

        saveLogs.saveHistory();
        System.out.println("Dlugosc wektora: "+ givenVectors +" wynosi: ");
        System.out.println("Wynik : "+result1.returnRoundedOneNumber(finalLenght));
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
                lgthOfVectorsFromDatabase();
                break;
            case 2:
                lgthOfGivenVectors();
                break;
            default:
                System.out.println("Podana opcja nie jest dostepna.");
                break;
        }
    }
}
