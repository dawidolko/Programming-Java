import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ModifyDatabase {
    private String excelFilePath;

    public ModifyDatabase(String excelFilePath) {
        this.excelFilePath = excelFilePath;
    }

    DataFormatter dataFormatter = new DataFormatter();

    public void modifyVectorInDatabase() {
        InputData var = new InputData();
        int vectorId;
        InjectDatabase userDatabase = new InjectDatabase("database/UserDatabase.xlsx");
        System.out.println("Zapisane wektory: ");
        readVectors(excelFilePath);

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            System.out.println("--- Podaj id wiektora ktory chcesz zmodyfikowac: ");
            vectorId=var.getInt();
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(vectorId);

            if (row != null) {
                Cell cellX = row.getCell(1);
                Cell cellY = row.getCell(2);
                Cell cellZ = row.getCell(3);

                System.out.println("Podaj wspolrzedna X: ");
                cellX.setCellValue(var.getDouble());
                System.out.println("Podaj wspolrzedna Y: ");
                cellY.setCellValue(var.getDouble());
                System.out.println("Podaj wspolrzedna Z: ");
                cellZ.setCellValue(var.getDouble());

                FileOutputStream fos = new FileOutputStream(excelFilePath);
                workbook.write(fos);
                fos.close();

                System.out.println("Wektor zostal pomyslnie zmodyfikowany.");
            } else {
                System.out.println("Wiersz o podanym indeksie nie istnieje.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readVectors(String path){
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