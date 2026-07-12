package model;

public class Manager extends Employee {

    private String department;
    private int teamSize;

    public Manager(int ID, String Name, String Address, int Age,
                   Double salary, String department, int teamSize) {

        super(ID, Name, Address, Age, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Department='" + department + '\'' +
                ", Team Size=" + teamSize;
    }
}