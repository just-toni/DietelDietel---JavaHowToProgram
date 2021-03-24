package com.Exercises.chapterThree.EmployeeClass;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("", "", 0);
        employee.setFirstName("Billy");
        employee.setLastName("Audu");
        employee.setMonthlySalary(90);

        System.out.println("First name is: " + employee.getFirstName() +
                "\nLast name is: " + employee.getLastName() +
                "\nMonthly salary is: " + employee.getMonthlySalary() +
                "\nYearly salary is: " + employee.yearlySalary());
        System.out.println("The new yearly salary is: " + employee.yearlySalaryIncrease());

        System.out.println();
        System.out.println();
        System.out.println();

        Employee employee1 = new Employee("", "", 0);
        employee1.setFirstName("Amaka");
        employee1.setLastName("Anusionwu");
        employee1.setMonthlySalary(1000);

        System.out.println("First name is: " + employee1.getFirstName() +
                "\nLast name is: " + employee1.getLastName() +
                "\nMonthly salary is: " + employee1.getMonthlySalary() +
                "\nYearly salary is: " + employee1.yearlySalary());
        System.out.println("The new yearly salary is: " + employee1.yearlySalaryIncrease());
    }
}
