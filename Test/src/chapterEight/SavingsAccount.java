package chapterEight;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingBalance;

    public static void modifyAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingBalance(double savingBalance) {
        if(savingBalance >= 0) this.savingBalance = savingBalance;
    }

    public double getSavingsBalance() {
        return savingBalance;
    }

    public double calculateMonthlyInterestRate(double savingsBalance, double annualInterestRate) {
        return (savingsBalance * (annualInterestRate / 100)) / 12;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
