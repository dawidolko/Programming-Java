import java.util.List;

public class Grades {
    private int userId;
    private List<Integer> grades;

    public Grades(int userId, List<Integer> grades) {
        this.userId = userId;
        this.grades = grades;
    }

    public Grades(int userId){
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
}
