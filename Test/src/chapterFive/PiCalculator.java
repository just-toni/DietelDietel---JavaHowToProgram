package chapterFive;

public class PiCalculator {
    private int input;
    private double piValue = 0;


    public void collectInput(int input) {
        if (input >= 1 && input <= 200_000) {
            this.input = input;
        }
    }


    public int getInput() {
        return input;
    }

    public void setPiValue(int input) {
        if (input >= 1 && input <= 200_000) {
            int denominator = 1;
            for(int i = 1; i <= input; i++){
                if(i % 2 == 1){
                    piValue += 4.0/denominator;
                }
                else
                    piValue -= 4.0/ denominator;
                denominator+=2;
            }
        }
        }

    public double getPiValue() {
        return piValue;
    }
}
