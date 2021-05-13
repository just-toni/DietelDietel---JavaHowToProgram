package chapterNine;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales can't be less than zero");
        if(commissionRate < 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("Commission rate is between zero and one only!");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales can't be less than zero");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("Commission rate is between zero and one only!");
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Gross sales: " + getGrossSales() + "\n" + "Commission rates: " + getCommissionRate();
    }

    public double calculateEarnings() {
        return getGrossSales() * getCommissionRate();
    }
}
