import java.io.File;

public class SelectDatabase {
    public String select(){
        InputData var = new InputData();
        ShowAvailableDatabases databases = new ShowAvailableDatabases();
        String database1Path;
        File file = new File("database/UserDatabase.xlsx");
        while (true){
            System.out.println("_____________________________________________________________");
            System.out.println("--- Dostepne bazy danych: ");
            databases.showDatabases();
            System.out.println("--- Wybor: ");
            int i=var.getInt();

            if(i == 1) {
                database1Path = "database/3dVecCordINTNUM.xlsx";
                return database1Path;
            }
            else if(i == 2) {
                database1Path = "database/3dVecCordREALNUM.xlsx";
                return database1Path;
            }
            else if (file.exists()) {
                if (i == 4) {
                    database1Path = "database/UserDatabase.xlsx";
                    return database1Path;
                }
            }
            else System.out.println("--- Podana opcja nie jest dostepna. Prosze wybrac poprawna opcje.");
        }
    }

}
