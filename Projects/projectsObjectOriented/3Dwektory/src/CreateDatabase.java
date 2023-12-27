import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class CreateDatabase {
    private String excelFilePath;

    public CreateDatabase(String excelFilePath){
        this.excelFilePath=excelFilePath;
    }
    public void writeVectorsToExcel() {
        int override = isDatabaseExists();
        if(override==1) return;
        InputData data = new InputData();

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("UserDatabase");
        int rowNum = 0, next = 1, i = 0;
        while (next != 2) {
            Row row = sheet.createRow(rowNum++);
            System.out.println("Tworzysz wektor nr. " + i);
            row.createCell(0).setCellValue(i);
            System.out.println("Podaj wspolrzedna X: ");
            row.createCell(1).setCellValue(data.getDouble());
            System.out.println("Podaj wspolrzedna Y: ");
            row.createCell(2).setCellValue(data.getDouble());
            System.out.println("Podaj wspolrzedna Z: ");
            row.createCell(3).setCellValue(data.getDouble());
            i++;

            System.out.println("\n-- Czy chcesz dodac kolejny wektor? \n-- 1. Tak. \n-- 2. Nie. \n-- Wybor: ");
            next = data.getInt();
            if (next != 1 && next != 2)
                System.out.println("-- Podana opcja nie jest dostepna. Praca programu trwa dalej.");

        }
        try {
            FileOutputStream fos = new FileOutputStream("database/UserDatabase.xlsx");
            workbook.write(fos);
            fos.close();
            System.out.println("Plik Excel został utworzony i zapisany pomyślnie.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wystąpił błąd podczas zapisywania pliku Excel.");
        }
    }
        public int isDatabaseExists(){
            InputData data = new InputData();
            File file = new File("database/UserDatabase.xlsx");
            if (file.exists()) {
                System.out.println("Plik o nazwie " + "UserDatabase" + " juz istnieje.");
                System.out.println("Czy chcesz nadpisac istniejący plik? \n--- 1. Tak. \n--- 2. Nie.");
                int choice;
                while(true){
                    choice=data.getInt();
                    if (choice==2) {
                        System.out.println("Operacja nadpisania pliku zostala anulowana.");
                        return 1;
                    } else if (choice==1) break;
                    else System.out.println("Podana opcja nie istnieje. Prosze wybrac poprawna opcje.");

                }
            }
            return 0;
        }



}
