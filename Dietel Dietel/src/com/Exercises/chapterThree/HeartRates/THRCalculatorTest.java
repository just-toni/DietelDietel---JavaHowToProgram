package com.Exercises.chapterThree.HeartRates;

public class THRCalculatorTest {
    public static void main(String[] args) {
        THRCalculator patient1 = new THRCalculator("", "", 0,0,0);
        patient1.setFirstName("Michelle");
        patient1.setLastName("Chikezie");
        patient1.setDayOfBirth(23);
        patient1.setMonthOfBirth(2);
        patient1.setYearOfBirth(1998);
        patient1.getDayOfBirth();
        patient1.calculateAge();
        patient1.calculateMaxHeartRate();
        patient1.calculateTargetHeartRateRange();

        System.out.println("The first name is " + patient1.getFirstName());
        System.out.println("The last name is "+ patient1.getLastName());
        System.out.println("The date of birth is "+ patient1.getDateOfBirth());
        System.out.println("The age is "+ patient1.calculateAge());
        System.out.println("The maximium heart rate is " + patient1.calculateMaxHeartRate());
        System.out.println("The target heart rate range is between " + patient1.calculateTargetHeartRateRange());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        THRCalculator patient2 = new THRCalculator("", "", 0,0,0);
        patient2.setFirstName("Ian");
        patient2.setLastName("Thompson");
        patient2.setDayOfBirth(3);
        patient2.setMonthOfBirth(3);
        patient2.setYearOfBirth(2001);
        patient2.getDayOfBirth();
        patient2.calculateAge();
        patient2.calculateMaxHeartRate();
        patient2.calculateTargetHeartRateRange();

        System.out.println("The first name is " + patient2.getFirstName());
        System.out.println("The last name is "+ patient2.getLastName());
        System.out.println("The date of birth is "+ patient2.getDateOfBirth());
        System.out.println("The age is "+ patient2.calculateAge());
        System.out.println("The maximium heart rate is " + patient2.calculateMaxHeartRate());
        System.out.println("The target heart rate range is between " + patient2.calculateTargetHeartRateRange());
    }

}
