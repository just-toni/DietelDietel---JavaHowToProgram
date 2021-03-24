package com.Exercises.chapterThree.EmployeeClass;

public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0){
            System.out.println("Invalid input");
        }
        else
            this.monthlySalary = monthlySalary;
    }

    public double yearlySalary(){
        double yearlySalary = 12 * monthlySalary;
        return yearlySalary;
    }

    public double yearlySalaryIncrease(){
        double yearlyPercentIncrease = ((10 * 1.0)/100);
        double increase = yearlyPercentIncrease * yearlySalary();
        double newYearlySalary = increase + yearlySalary();
        return newYearlySalary;
    }
}
