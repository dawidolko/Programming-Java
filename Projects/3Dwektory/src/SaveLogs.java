import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.output.TeeOutputStream;

public class SaveLogs {
    private String saveName;
    private PrintStream originalOut;

    public SaveLogs() {
        this.saveName = saveName;
    }

    public void saveHistory() {
        String fileName = generateFileName();
        saveName = fileName;
        try {
            originalOut = System.out;
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            TeeOutputStream teeOutputStream = new TeeOutputStream(originalOut, fileOutputStream);
            PrintStream out = new PrintStream(teeOutputStream);

            System.setOut(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String generateFileName() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Log'HHmmddMMyyyy");
        return "Logs/" + now.format(formatter) + ".txt";
    }

    public void stopRedirectingConsoleOutput() {
        System.setOut(originalOut);
        System.out.println("Historia operacji została zapisana do pliku o nazwie: " + saveName);
    }
}