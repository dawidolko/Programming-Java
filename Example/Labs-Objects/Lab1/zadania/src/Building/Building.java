package Building;

import java.time.LocalDate;

public class Building
{
    private String name; // Nazwa
    private int yearBuild; // Rok budowy
    private int numberOfFloors; // Liczba pięter

    public Building() { }
    public Building(String name, int yearBuild, int numberOfFloors)
    {
        this.name = name;
        this.yearBuild = yearBuild;
        this.numberOfFloors = numberOfFloors;
    }

    public String getName() {
        return name;
    }
    public int getYearBuild() {
        return yearBuild;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void Print()
    {
        System.out.format("\n\tNazwa budynku: %s;\n\tRok budowy: %d;\n\tLiczba pięter: %d;\n", name, yearBuild, numberOfFloors);
    }

    public void HowOld()
    {
        LocalDate howDate = LocalDate.now();
        int howYears = howDate.minusYears(yearBuild).getYear();
        System.out.format("\n\tBudynek %s ma %d lat;\n", name, howYears);
    }
}
