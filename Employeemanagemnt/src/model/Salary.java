package model;

public class Salary {

    private int employeeId;
    private double basicSalary;

    public Salary(int employeeId, double basicSalary) {
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeId=" + employeeId +
                ", basicSalary=" + basicSalary +
                '}';
    }
}