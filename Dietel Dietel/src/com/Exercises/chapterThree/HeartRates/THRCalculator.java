package com.Exercises.chapterThree.HeartRates;

import java.time.Year;

public class THRCalculator {
    private String firstName;
   private String lastName;
   private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String dateOfBirth;

    public THRCalculator(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDateOfBirth() {
        String dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
        return dateOfBirth;
    }

    public int calculateAge(){
        int age = Year.now().getValue() - getYearOfBirth();
        return age;
    }

    public int calculateMaxHeartRate(){
        int maxHeartRate = 220 - calculateAge();
        return maxHeartRate;
    }

    public String calculateTargetHeartRateRange(){
        String targetHeartRateRange = ((0.5 * calculateMaxHeartRate() + " - " + (0.85 * calculateMaxHeartRate())));
        return targetHeartRateRange;
    }
}

