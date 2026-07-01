package model;

import model.Employee;

public class  Developer extends Employee {
    private static Double Double;
    private static final Double Salary = Double ;
    private String programmingLanguage;
    private int experienceYears;
    private String projectName;
    private String level;

    public Developer(int ID, String Name, String Address, int Age, String programmingLanguage, int experienceYears, String projectName, String level) {
        super(ID, Name, Address, Age, Salary);
        this.programmingLanguage = programmingLanguage;
        this.experienceYears = experienceYears;
        this.projectName = projectName;
        this.level = level;

    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", experienceYears=" + experienceYears +
                ", projectName='" + projectName + '\'' +
                ", level='" + level + '\'' +
                '}';
    }


}
