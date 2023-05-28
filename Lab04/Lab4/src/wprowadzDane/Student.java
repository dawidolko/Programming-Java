package wprowadzDane;

public class Student {

    private String name;
    private String surname;
    private int indexNumber;
    private String degree;
    private int yearOfStudy;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
    }

    public Student(String name, String surname, int indexNumber, String degree, int yearOfStudy) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        this.degree = degree;
        this.yearOfStudy = yearOfStudy;
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Index number: " + indexNumber);
        System.out.println("Degree: " + degree);
        System.out.println("Year of study: " + yearOfStudy);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
}