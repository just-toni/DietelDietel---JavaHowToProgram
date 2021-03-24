package chapterSix;

public class ExerciseSixPointTwoEight {
    public static int qualityPoints(int grade) {
        int average = grade / 10;
        if(grade >= 0 && grade <= 100) {
            return switch (average) {
                case 9, 10 -> 4;
                case 8 -> 3;
                case 7 -> 2;
                case 6, 5, 4, 3, 2, 1 -> 1;
                default -> 0;
            };
        }
        return average;
    }
}
