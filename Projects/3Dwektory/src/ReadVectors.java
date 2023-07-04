import java.util.List;

public class ReadVectors {

    public void read(String path){
        InjectDatabase database = new InjectDatabase(path);
        List<Vector3D> vectorsFromDatabase = database.readVectorsFromDatabase();
        if (vectorsFromDatabase != null) {
            System.out.println("Wektory z bazy danych 1:");
            for (Vector3D vector : vectorsFromDatabase) {
                System.out.println(vector);
            }
        }
    }
}
