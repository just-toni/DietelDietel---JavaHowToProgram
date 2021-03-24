package chapterFive;

public class Factorials {
    private int input;
    private long factorial = 0;

    public void collectInput(int input) {
        if(input >= 1 && input <= 20)
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public void calculateFactorial(int input) {
        if(input >= 1 && input <= 20) {
            int counter = 1;
            factorial = 1;
            while (counter <= input) {
                factorial *= counter;
                counter++;
            }
        }
    }

    public long getFactorial() {
        return factorial;
    }
}
