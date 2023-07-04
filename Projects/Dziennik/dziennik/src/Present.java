public class Present {
    private int userId;
    private int attendance;
    private int absence;

    public Present(int userId, int attendance, int absence) {
        this.userId = userId;
        this.attendance = attendance;
        this.absence = absence;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }
}
