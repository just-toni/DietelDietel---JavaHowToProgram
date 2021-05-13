package chapterNine;

public class BaseCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be greater than zero");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be greater than zero");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return "BaseCommission Employee\n" + super.toString() + "\n" + "Base salary: " + getBaseSalary();
    }

    @Override
    public double calculateEarnings(){
        return super.calculateEarnings() + getBaseSalary();
    }

}
