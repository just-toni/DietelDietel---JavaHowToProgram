package chapterSeven;

public class ExerciseSevenPointNine {

    public static void main(String[] args) {
        int [][] t = new int[2][3];
//        System.out.println(t.length);
//        System.out.println();
//        System.out.println(t[1].length);
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t.length; j++) {
//            }
//            sum+= t[i].length;
//            System.out.println(sum);
//        }
//        System.out.println();
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(t[1][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(t[i][1] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(t[0][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < t.length; i++) {
//            System.out.print(t[i][2] + " ");
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println(t[0][0] = 0);
//        System.out.println(t[0][1] = 0);
//        System.out.println(t[0][2] = 0);
//        System.out.println(t[1][0] = 0);
//        System.out.println(t[1][1] = 0);
//        System.out.println(t[1][2] = 0);
//        System.out.println();
//i
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // j
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = j + 1;
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();



        int [][] array = {{1,2,3,4,7,1,3},{5,6,7,5,11,8},{9,10,11,12},{0,2,5,3},{1,2,3,4,5,6,7,8,9,10,12,14},{2,5,1}};
        int sum = 0;
        int average = 0;
        int min = 0;
        int max = 0;
        int innerArraySum = 0;
        int innerArrayAverage = 0;
        int row = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            innerArraySum = 0;
            for (int j = 0; j < array[i].length; j++) {
                innerArraySum += array[i][j];
                sum += array[i][j];
            }
            System.out.println("sum of row " + row + " is " + innerArraySum);
            row++;
        }
        System.out.println("sum of all elements in array is " + sum);
        System.out.println();

        row = 1;
        for (int i = 0; i < array.length; i++) {
            innerArraySum = 0;
            for (int j = 0; j < array[i].length; j++) {
                innerArraySum += array[i][j];
                innerArrayAverage = innerArraySum / array[i].length;
                sum += array[i][j];
                average = sum / array.length;
            }
            System.out.println("average of row " + row + " is " + innerArrayAverage);
            row++;
        }
        System.out.println("average of all elements in array is " + average);
    }

}
