package chapterSeven;

public class ToniArray {

    private int arrayLength;
    private int[] toni;
    private int element;

    public void setArrayLength(int arrayLength) {
        if(arrayLength > 0) {
            this.arrayLength = arrayLength;
            toni = new int[arrayLength];
        }
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayElements(int[] toni) {
        int even = 2;
        for (int i = 0; i < toni.length; i++) {
            toni[i] = even;
            even+=2;
        }
        this.toni = toni;
    }

    public int[] getArrayElements() {
        return toni;
    }

    public void setIndex(int index) {
        int[] arrayElements = getArrayElements();
        element = arrayElements[index];
        }

    public int getElement() {
        return element;
    }
}

