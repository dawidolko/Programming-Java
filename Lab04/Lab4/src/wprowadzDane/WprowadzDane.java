package wprowadzDane;

public class WprowadzDane {

    public static void main(String[] args) {
        Student[] students = new Student[100];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("", "", 0, "", 0);
        }
        addStudent(students, 0, "John", "Smith", 12345, "Computer Science", 3);
        addStudent(students, 1, "Amy", "Green", 12346, "Mathematics", 2);
        addStudent(students, 2, "Mary", "Jones", 12347, "Physics", 1);
        editStudent(students, 0, "John", "Doe", 12345, "Computer Science", 3);
        deleteStudent(students, 1);
        displayStudent(students, 0);
        displayAllStudents(students);
        displayStudentsRange(students, 0, 2);
    }

    public static void addStudent(Student[] students, int index, String name, String surname, int indexNumber, String degree, int yearOfStudy) {
        students[index] = new Student(name, surname, indexNumber, degree, yearOfStudy);
    }

    public static void editStudent(Student[] students, int index, String name, String surname, int indexNumber, String degree, int yearOfStudy) {
        students[index].setName(name);
        students[index].setSurname(surname);
        students[index].setIndexNumber(indexNumber);
        students[index].setDegree(degree);
        students[index].setYearOfStudy(yearOfStudy);
    }

    public static void deleteStudent(Student[] students, int index) {
        students[index] = new Student("", "", 0, "", 0);
    }

    public static void displayStudent(Student[] students, int index) {
        students[index].displayData();
    }

    public static void displayAllStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].displayData();
        }
    }

    public static void displayStudentsRange(Student[] students, int start, int end) {
        for (int i = start; i <= end; i++) {
            students[i].displayData();
        }
    }
}