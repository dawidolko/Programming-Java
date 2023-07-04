import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PresentReader {
    private Map<Integer, Present> presentMap;
    private LoginSystem loginSystem;

    public PresentReader(LoginSystem loginSystem) {
        presentMap = new HashMap<>();
        this.loginSystem = loginSystem;
    }

    public void readPresentsFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    int userId = Integer.parseInt(parts[0]);
                    int attendance = Integer.parseInt(parts[1]);
                    int absence = Integer.parseInt(parts[2]);
                    Present present = new Present(userId, attendance, absence);
                    presentMap.put(userId, present);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }
    }

    public void displayPresentInfo(int userId) {
        if (presentMap.containsKey(userId)) {
            Present present = presentMap.get(userId);
            int attendance = present.getAttendance();
            int absence = present.getAbsence();
            int total = attendance + absence;
            double attendancePercentage = (double) attendance / total * 100;

            System.out.println("Obecności: " + attendance);
            System.out.println("Nieobecności: " + absence);
            System.out.printf("Procent obecności: %.2f%%\n", attendancePercentage);
        } else {
            System.out.println("Brak danych obecności dla użytkownika o id " + userId);
        }
    }

    public void displayAllPresents() {
        List<User> userList = loginSystem.getUsers();
        System.out.println("-----------------------------");
        for (User user : userList) {
            int userId = user.getId();
            String userName = user.getFirstName() + " " + user.getLastName();

            if (presentMap.containsKey(userId)) {
                Present present = presentMap.get(userId);
                int attendance = present.getAttendance();
                int absence = present.getAbsence();
                int total = attendance + absence;
                double attendancePercentage = (double) attendance / total * 100;

                System.out.printf("[%d] [%s] %.2f%%\n", userId, userName, attendancePercentage);
            } else {
            }
        }
        System.out.println("-----------------------------");
    }

    public void addAttendance(int userId) {
        if (presentMap.containsKey(userId)) {
            Present present = presentMap.get(userId);
            int attendance = present.getAttendance();
            attendance++;
            present.setAttendance(attendance);
        } else {
            System.out.println("Brak danych obecności dla użytkownika o id " + userId);
        }
    }

    public void addAbsence(int userId) {
        if (presentMap.containsKey(userId)) {
            Present present = presentMap.get(userId);
            int absence = present.getAbsence();
            absence++;
            present.setAbsence(absence);
        } else {
            System.out.println("Brak danych obecności dla użytkownika o id " + userId);
        }
    }

    public void savePresentsToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<Integer, Present> entry : presentMap.entrySet()) {
                int userId = entry.getKey();
                Present present = entry.getValue();
                int attendance = present.getAttendance();
                int absence = present.getAbsence();
                String line = userId + ";" + attendance + ";" + absence;
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }
    public void addPresentToFile(int userId) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("present.txt", true))) {
            String line = userId + ";0;0";
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }


}
