package ChapterThree;

public class ExerciseThreePointOneFive {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ExerciseThreePointOneFive(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    private String name;
    private double balance;

    public static void displaydupaccount (ExerciseThreePointOneFive account){
        System.out.println("%s balance: $ %2f%n", account.getName(), account.getBalance());
    }
}
