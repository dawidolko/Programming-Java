package task4;

public class Date {
    private int day;
    private int month;
    private int year;

    //konstruktor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //gettery i settery
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //metody
    public void forwardWeek(){
        day += 7;
        if(day > 30){
            day -= 30;
            month++;
            if(month > 12){
                month -= 12;
                year++;
            }
        }
    }

    public void backwardWeek(){
        day -= 7;
        if(day < 1){
            day += 30;
            month--;
            if(month < 1){
                month += 12;
                year--;
            }
        }
    }

    public void printDate(){
        System.out.println(day + "." + month + "." + year);
    }
}