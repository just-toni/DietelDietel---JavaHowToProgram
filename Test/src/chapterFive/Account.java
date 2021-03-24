package chapterFive;

public class Account {
    private double balance;
    private String pin;
    private String accountNumber;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 10)
            this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPin(String pin) {
        if (pin.length() == 4)
            this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void deposit(double amount) {
        if(amount > 0)
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount, String pin) {
        if((pin.equals(this.pin)) && amount > 0 && amount < getBalance())
            balance -= amount;
    }

    public double checkBalance() {
        return getBalance();
    }

    public void transfer(double amount, String pin) {
        if((pin.equals(this.pin)) && amount <= getBalance())
            balance -= amount;
    }

    public void recharge(double amount, String pin) {
        if((pin.equals(this.pin)) && amount <= getBalance())
            balance -= amount;
    }

    public void makePayment(int amount, String pin) {
        withdraw(amount, pin);
    }
}
