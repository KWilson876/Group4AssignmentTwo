package com.kerroneopp2;

public class Manager extends StaffMember {
    private double bonus;

    public Manager(String title, String firstName, String lastName, String deptNumber, double hoursWorked, double bonus) {
        super(title, firstName, lastName, deptNumber, hoursWorked);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
    public void calculateSalary() {
        double salary = getHoursWorked() * 2500 + bonus;
        System.out.println("Salary of Manager: " + getTitle() + " " + getFirstName() + " " + getLastName() + " is " + "$"+ salary);
    }
}
