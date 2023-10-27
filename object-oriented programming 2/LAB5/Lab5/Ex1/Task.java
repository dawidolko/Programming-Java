import java.time.LocalDate;
import java.util.Calendar;

public class Task {
    private String title, description;
    private Calendar expiration;
    private String priority; //isHigh?

    public Task(String title, Calendar expiration, String priority) {
        this.title = title;
        this.expiration = expiration;
        this.priority = priority;
    }

    public Task(String title, String description, Calendar expiration, String priority) {
        this.title = title;
        this.description = description;
        this.expiration = expiration;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getExpiration() {
        return expiration;
    }

    public String getPriority() {
        return priority;
    }
}
