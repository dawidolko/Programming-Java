import java.io.File;
public class ShowAvailableDatabases {
    public void showDatabases(){
        System.out.println("_____________________________________________________________" +
                "\n--- Dostepne bazy danych:");
        File folder = new File("database/");
        File[] listOfFiles = folder.listFiles();
        int i=1;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("--- "+i+". "+file.getName());
            }
            i++;
        }
    }
    

}
