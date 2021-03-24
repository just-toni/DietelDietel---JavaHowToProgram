package chapterSix;

import java.util.Scanner;

public class ExerciseSixPointTwoEightMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        for(int grade = 0; grade <= 100; grade++) {
            System.out.println("Enter grade or -1 to quit");
            grade = reader.nextInt();
            System.out.println(ExerciseSixPointTwoEight.qualityPoints(grade));
            if(grade == -1)
                break;
        }
    }
}
