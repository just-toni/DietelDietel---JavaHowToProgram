package chapterSix;

public class Kata {

    public int calculateSum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public int calculateAverage(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

    public int calculateMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(array[i], min);
        }
        return min;
    }

    public int calculateMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
        }
        return max;
    }


    public int calculateMaxSum(int[] array) {
        return calculateSum(array) - calculateMinimum(array);
    }

    public int calculateMinSum(int[] array) {
        return calculateSum(array) - calculateMaximum(array);
    }
}