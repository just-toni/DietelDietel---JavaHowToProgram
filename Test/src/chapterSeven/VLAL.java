package chapterSeven;

public class VLAL {
    public double product(int... array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }
}
