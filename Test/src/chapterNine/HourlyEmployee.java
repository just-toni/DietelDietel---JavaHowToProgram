package chapterNine;

public class HourlyEmployee extends Employee {
    private double wages;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wages) {
        super(firstName, lastName, socialSecurityNumber);
        if(hours < 0 && hours > 168)
            throw new IllegalArgumentException("Hour range is from zero to 168");
        this.hours = hours;
        if(wages < 0.0)
            throw new IllegalArgumentException("Wages range begins from zero");
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if(wages < 0.0)
            throw new IllegalArgumentException("Wages range begins from zero");
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0 && hours > 168)
            throw new IllegalArgumentException("Hour range is from zero to 168");
        this.hours = hours;
    }

}
