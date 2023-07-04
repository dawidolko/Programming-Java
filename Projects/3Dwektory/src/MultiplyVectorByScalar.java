import java.util.ArrayList;
import java.util.List;

public class MultiplyVectorByScalar {
    private InputData var;

    public MultiplyVectorByScalar() {
        var = new InputData();
    }

    private double multiplyVectorsFromDatabase() {

        double[][] result = new double[1][3];
        Vector3D vector;
        SelectDatabase selectDatabase = new SelectDatabase();
        String database1Path = selectDatabase.select();

        InjectDatabase database1 = new InjectDatabase(database1Path);
        List<Vector3D> selectedVectors = new ArrayList<>();

        ReadVectors readVectors = new ReadVectors();
        readVectors.read(database1Path);

        SaveLogs saveLogs = new SaveLogs();

        System.out.println("--- Podaj id wektora, ktorego chcesz pomnozyc: ");
        vector = database1.getVector();
        result[0][0] = vector.getX();
        result[0][1] = vector.getY();
        result[0][2] = vector.getZ();
        selectedVectors.add(vector);

        System.out.println("--- Podaj liczbe przez ktora ma zostac pomnozony wektor: ");
        double scalar = var.getDouble();

        result[0][0] *=scalar;
        result[0][1] *=scalar;
        result[0][2] *=scalar;


        RoundedResult result1 = new RoundedResult();
        saveLogs.saveHistory();
        System.out.println("Wektor: " + selectedVectors + " pomnozony przez: " + scalar + " jest rowny: ");
        System.out.println("Wynik : " + result1.returnRoundedResult(result));
        saveLogs.stopRedirectingConsoleOutput();
        return 0;
    }

    private double multiplyGivenVectors() {
        InputData cords = new InputData();
        int i = 0;
        double[][] result = new double[1][3];        Vector3D vector;
        List<Vector3D> givenVectors = new ArrayList<>();

        SaveLogs saveLogs = new SaveLogs();

        System.out.print("Podaj współrzędną X: ");
        result[0][0] = cords.getDouble();
        System.out.print("Podaj współrzędną Y: ");
        result[0][1] = cords.getDouble();
        System.out.print("Podaj współrzędną Z: ");
        result[0][2] = cords.getDouble();

        vector = new Vector3D(i, result[0][0], result[0][1], result[0][2]);
        givenVectors.add(vector);
        System.out.println("--- Podaj liczbe przez ktora ma zostac pomnozony wektor: ");
        double scalar = var.getDouble();

        result[0][0] *=scalar;
        result[0][1] *=scalar;
        result[0][2] *=scalar;

        saveLogs.saveHistory();
        RoundedResult result1 = new RoundedResult();
        System.out.println("Wektor: " + givenVectors + " pomnozony przez: " + scalar + " jest rowny: ");
        System.out.println("Wynik : " + result1.returnRoundedResult(result));
        saveLogs.stopRedirectingConsoleOutput();
        return 0;

    }

    public void menu() {
        InputData data = new InputData();
        System.out.println("_____________________________________________________________");
        System.out.println("--- W jakis sposob chcesz przeprowadzic operacje na wektorach? : " +
                "\n1. Wybrac konkretne wektory z bazy danych." +
                "\n2. Utworzyc wlasne.");
        System.out.println("--- Wybor: ");

        int choice = data.getInt();
        switch (choice) {
            case 1:
                multiplyVectorsFromDatabase();
                break;
            case 2:
                multiplyGivenVectors();
                break;
            default:
                System.out.println("Podana opcja nie jest dostepna.");
                break;
        }
    }
}
