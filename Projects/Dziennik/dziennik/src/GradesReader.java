import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GradesReader {
    private List<Grades> gradesList;
    private LoginSystem loginSystem;

    public GradesReader(LoginSystem loginSystem) {
        gradesList = new ArrayList<>();
        this.loginSystem = loginSystem;
    }

    public void loadGradesFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 2) {
                    int userId = Integer.parseInt(data[0]);
                    List<Integer> grades = parseGrades(data[1]);
                    Grades gradesObj = new Grades(userId, grades);
                    gradesList.add(gradesObj);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku.");
            e.printStackTrace();
        }
    }

    public void saveGradesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("grades.txt"))) {
            for (Grades grades : gradesList) {
                int userId = grades.getUserId();
                List<Integer> gradesData = grades.getGrades();

                StringBuilder sb = new StringBuilder();
                sb.append(userId).append(";");
                for (int i = 0; i < gradesData.size(); i++) {
                    sb.append(gradesData.get(i));
                    if (i < gradesData.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append(System.lineSeparator());

                writer.write(sb.toString());
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku.");
        }
    }

    private List<Integer> parseGrades(String gradesString) {
        String[] gradesArray = gradesString.split(",");
        List<Integer> grades = new ArrayList<>();
        for (String grade : gradesArray) {
            grades.add(Integer.parseInt(grade));
        }
        return grades;
    }

    public void displayGradesForUser(int userId) {
        for (Grades grades : gradesList) {
            if (grades.getUserId() == userId) {
                for (Integer grade : grades.getGrades()) {
                    System.out.print(grade + ", ");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Nie znaleziono ocen dla użytkownika.");
    }

    public void displayGradesForUserWithIndex(int userId) {
        for (Grades grades : gradesList) {
            if (grades.getUserId() == userId) {
                int i = 0;
                for (Integer grade : grades.getGrades()) {
                    System.out.print("[" + i + "] " + grade + "\n");
                    i++;
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Nie znaleziono ocen dla użytkownika");
    }

    public void displayAllGrades() {
        System.out.println("-----------------------------");
        for (Grades grades : gradesList) {
            int userId = grades.getUserId();
            User user = loginSystem.getUserById(userId);
            System.out.print("[" + userId + "] [" + user.getFirstName() + " " + user.getLastName() + "] ");
            for (Integer grade : grades.getGrades()) {
                System.out.print(grade + ", ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    public void addGrade(int id, int grade) {
        for (Grades grades : gradesList) {
            if (grades.getUserId() == id) {
                grades.addGrade(grade);
                return;
            }
        }
    }

    public void removeGrade(int userId, int gradeIndex) {
        for (Grades grades : gradesList) {
            if (grades.getUserId() == userId) {
                List<Integer> gradesData = grades.getGrades();
                if (gradeIndex >= 0 && gradeIndex < gradesData.size()) {
                    gradesData.remove(gradeIndex);
                    return;
                }
            }
        }
    }

    public double calculateAverageGrade(int userId) {
        for (Grades grades : gradesList) {
            if (grades.getUserId() == userId) {
                List<Integer> gradesData = grades.getGrades();
                if (gradesData.isEmpty()) {
                    return 0.0;
                } else {
                    int sum = 0;
                    for (int grade : gradesData) {
                        sum += grade;
                    }
                    return Math.round((double) sum / gradesData.size() * 100.0) / 100.0;
                }
            }
        }
        return 0.0;
    }

    public void addGradeToFile(int id) {
        Grades newGrade = new Grades(id);

        try (FileWriter writer = new FileWriter("grades.txt", true)) {

            writer.write(newGrade.getUserId() + ";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
