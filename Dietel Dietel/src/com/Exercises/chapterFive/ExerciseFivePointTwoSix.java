package com.Exercises.chapterFive;

public class ExerciseFivePointTwoSix {
    public static void main(String[] args) {

        int i;

        for(i = 1; i < 5; i++){
            if(!(i > 4)){
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
        System.out.println("Broke out of loop at: " + i);
    }
}
