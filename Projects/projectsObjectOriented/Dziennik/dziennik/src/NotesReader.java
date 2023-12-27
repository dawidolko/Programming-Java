import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class NotesReader {
    private Map<Integer, Notes> notesMap;
    private LoginSystem loginSystem;

    public NotesReader(LoginSystem loginSystem) {
        this.loginSystem = loginSystem;
    }

    public void readNotesFromFile(String filePath) {
        notesMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    int userId = Integer.parseInt(parts[0]);
                    String[] notesArray = parts[1].split(",");
                    List<String> notesList = new ArrayList<>();
                    for (String note : notesArray) {
                        notesList.add(note);
                    }
                    Notes notes = new Notes(userId);
                    notes.setNotes(notesList);
                    notesMap.put(userId, notes);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }
    }

    public void displayNotesForUser(int userId) {
        if (notesMap.containsKey(userId)) {
            Notes notes = notesMap.get(userId);
            List<String> notesList = notes.getNotes();
            if (notesList.isEmpty()) {
                System.out.println("Brak uwag.");
            } else {
                System.out.println("[" + userId + "] " + String.join(", ", notesList));
            }
        } else {
            System.out.println("Brak uwag.");
        }
    }

    public void displayAllNotes(LoginSystem loginSystem) {
        System.out.println("-----------------------------");
        for (Map.Entry<Integer, Notes> entry : notesMap.entrySet()) {
            int userId = entry.getKey();
            Notes notes = entry.getValue();

            User user = loginSystem.getUserById(userId);
            if (user != null) {
                String fullName = user.getFirstName() + " " + user.getLastName();
                List<String> noteList = notes.getNotes();
                String formattedNotes = String.join(", ", noteList);

                System.out.println("[" + userId + "] [" + fullName + "] " + formattedNotes);
            }
        }
        System.out.println("-----------------------------");
    }

    public void addNoteToList(int userId, String newNote) {
        if (notesMap.containsKey(userId)) {
            Notes notes = notesMap.get(userId);
            notes.addNoteToList(newNote);
        } else {
            System.out.println("Użytkownik o podanym ID nie istnieje.");
        }
    }

    public void saveNotesToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<Integer, Notes> entry : notesMap.entrySet()) {
                int userId = entry.getKey();
                Notes notes = entry.getValue();
                String notesLine = userId + ";" + notes.getNotesAsString();
                writer.write(notesLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }

    public void displayNotesForUserWithIndex(int userId) {
        if (notesMap.containsKey(userId)) {
            Notes notes = notesMap.get(userId);
            List<String> notesList = notes.getNotes();

            System.out.println("Uwagi dla użytkownika o id " + userId + ":");
            for (int i = 0; i < notesList.size(); i++) {
                System.out.println("[" + i + "] " + notesList.get(i));
            }
        } else {
            System.out.println("Brak uwag.");
        }
    }

    public void removeNote(int userId, int noteIndex) {
        if (notesMap.containsKey(userId)) {
            Notes notes = notesMap.get(userId);
            List<String> notesList = notes.getNotes();

            if (noteIndex >= 0 && noteIndex < notesList.size()) {
                notesList.remove(noteIndex);
            } else {
                System.out.println("Nieprawidłowy indeks uwagi.");
            }
        } else {
            System.out.println("Brak uwag.");
        }
    }
}
