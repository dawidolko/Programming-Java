import java.util.ArrayList;
import java.util.List;

public class Notes {
    private int userId;
    private List<String> notes;

    public Notes(int userId) {
        this.userId = userId;
        this.notes = new ArrayList<>();
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void addNoteToList(String newNote) {
        notes.add(newNote);
    }

    public String getNotesAsString() {
        return String.join(",", notes);
    }
}
