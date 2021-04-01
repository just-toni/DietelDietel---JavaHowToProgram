package chapterSeven;

public class ArraysPractice {
    private int[] hype;
    private int lengthOfArray;

    public void setLengthOfArray(int lengthOfArray) {
        if(lengthOfArray > 0) {
            this.lengthOfArray = lengthOfArray;
            hype = new int[lengthOfArray];
        }
    }

    public int getLengthOfArray() {
        return lengthOfArray;
    }


}
