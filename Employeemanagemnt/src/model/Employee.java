package model;

public abstract class Employee {

    private int ID;
    private String Name;
    private String Address;
    private int Age;

    public Employee(int ID, String Name, String Address, int Age) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Age = Age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Age=" + Age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    ;
}