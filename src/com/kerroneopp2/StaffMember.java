package com.kerroneopp2;

public class StaffMember {
    private String firstName;
    private String lastName;
    private String deptNumber;
    private double hoursWorked;
    private String title;

    StaffMember() {
        //setTitle("Null");
        setFirstName("Null");
        setLastName("Null");
        setDeptNumber("Null");
        setHoursWorked(0.00);
    }

    public StaffMember(String title, String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }
    public String getTitle() {
        return title;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDeptNumber() {
        return deptNumber;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void display() {
        System.out.println("\nStaff Information: ");
        System.out.println("Name in Full: " + this.title + " " + this.firstName + " " + this.lastName);
        System.out.println("Department No.: " + this.deptNumber);
        System.out.println("Hours Worked: " + this.hoursWorked);
    }

    /* public abstract void calculateSalary() {
        double salary = getHoursWorked() * 1200;
        System.out.println("Salary: " + salary);
    }*/
}
