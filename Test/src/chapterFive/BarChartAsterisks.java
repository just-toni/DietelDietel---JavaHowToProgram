package chapterFive;

public class BarChartAsterisks {
    private int input;
    private String asterisks;

    public void collectInput(int input) {
        if(input >= 1 && input <= 30)
            this.input = input;
    }

    public int getInput() {
        return input;
    }

    public String printAsterisks(int input) {
        if (input >= 1 && input <= 30){
            asterisks = "*";
        }
        for(int i = 1; i <= (input - 1); i++) {
            if (input <= 30)
                asterisks += "*";
        }
        return asterisks;
    }
}
