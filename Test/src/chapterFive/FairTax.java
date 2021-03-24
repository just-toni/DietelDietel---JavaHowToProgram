package chapterFive;

public class FairTax {
    private double totalExpenses;

    public void setExpenses(double expenses) {
        if(expenses > 0)
            totalExpenses += expenses;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public double calculateTax() {
        double rate = (30 / (100 * 1.0)) * totalExpenses;
        return rate;
    }
}
