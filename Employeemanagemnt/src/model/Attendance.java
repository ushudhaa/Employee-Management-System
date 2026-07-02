package model;

public class Attendance {

    private int employeeId;
    private AttendanceStatus status;

    public Attendance(int employeeId, AttendanceStatus status) {
        this.employeeId = employeeId;
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                ", Status: " + status;
    }
}