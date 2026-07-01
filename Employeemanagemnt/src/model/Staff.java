package model;

public class Staff extends Employee {

    private String Shift;
    private String department;
    private int workingHours;
    private double salary;

    public Staff(int ID, String Name, String Address, int Age,
                 String Shift, String department,
                 int workingHours, double salary) {

        super(ID, Name, Address, Age);

        this.Shift = Shift;
        this.department = department;
        this.workingHours = workingHours;
        this.salary = salary;


    }


    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "Shift='" + Shift + '\'' +
                ", department='" + department + '\'' +
                ", workingHours=" + workingHours +
                ", salary=" + salary +
                '}';
    }

}