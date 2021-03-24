package chapterFive;

public class SmallestValue {
    private int input;

    public void collectInput(int input) {
        if(input > 0)
            this.input = input;
    }

    public int getInput() {
        return input;
    }
}
