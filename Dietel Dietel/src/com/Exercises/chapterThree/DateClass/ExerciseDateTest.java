package com.Exercises.chapterThree.DateClass;

public class ExerciseDateTest {
    public static void main(String[] args) {
        ExerciseDate date = new ExerciseDate(1, 1, 1999);
        date.setMonth(2);
        date.setDay(30);
        date.setYear(2019);
        System.out.println(date.displayDate());
    }
}