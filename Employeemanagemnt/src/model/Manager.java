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
}