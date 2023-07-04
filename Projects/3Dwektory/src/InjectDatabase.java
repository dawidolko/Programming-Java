import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class InjectDatabase {
    private String excelFilePath;

    public InjectDatabase(String excelFilePath) {
        this.excelFilePath = excelFilePath;
    }

    DataFormatter dataFormatter = new DataFormatter();
    public List<Vector3D> readVectorsFromDatabase() {
        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            List<Vector3D> vector3DS = new ArrayList<>();

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                int id = (int) row.getCell(0).getNumericCellValue();
                double x = Double.parseDouble(dataFormatter.formatCellValue(row.getCell(1)));
                double y = Double.parseDouble(dataFormatter.formatCellValue(row.getCell(2)));
                double z = Double.parseDouble(dataFormatter.formatCellValue(row.getCell(3)));

                Vector3D vector3D = new Vector3D(id, x, y, z);
                vector3DS.add(vector3D);
            }

            return vector3DS;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Vector3D getVector(){
        InputData idOfVector = new InputData();
        int i = idOfVector.getInt();
        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            //List<Vector> vectors = new ArrayList<>();
            int lastRow = sheet.getLastRowNum();

            while (i<0 || i > lastRow){
                System.out.println("Wektor o podanym ID nie istnieje. Prosze podac poprawne ID.");
                i=idOfVector.getInt();
            }

            Row row = sheet.getRow(i);

            int id = (int) row.getCell(0).getNumericCellValue();
            double x = Double.parseDouble(dataFormatter.formatCellValue(row.getCell(1)));
            double y = Double.parseDouble(dataFormatter.formatCellValue(row.getCell(2)));
            double z = Double.parseDouble(dataFormatter.formatCellValue(row.getCell(3)));

            Vector3D vector3D = new Vector3D(id, x, y, z);
            //vectors.add(vector);

            return vector3D;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}