package com.kerroneopp2;

public class SalesRep extends StaffMember {
    private double allowance;

    public SalesRep(String title, String firstName, String lastName, String deptNumber, double hoursWorked, double allowance) {
        super(title, firstName, lastName, deptNumber, hoursWorked);
        this.allowance = allowance;
    }
    public double getAllowance() {
        return allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Allowance: " + this.allowance);
    }
    public void calculateSalary() {
        double salary = getHoursWorked() * 1500 + getAllowance();
        System.out.println("Salary of Sales Representative: " + getTitle() + " " + getFirstName() + " " + getLastName() + " is " + "$" + salary);
    }
}
