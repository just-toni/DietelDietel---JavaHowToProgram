package com.Exercises.chapterThree.HealthRecordClass;

import java.time.Year;

public class HealthRecords {

    String firstName;
    String lastName;
    String gender;
    String dateOfBirth;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    int heightInInches;
    int weightInPounds;

    public HealthRecords(String firstName, String lastName, String gender, String dateOfBirth, int dayOfBirth, int monthOfBirth, int yearOfBirth, int heightInInches, int weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public int calculateAge(){
        int calculateAge = Year.now().getValue() - getYearOfBirth();
        return calculateAge;
    }

    public int calculateMHR(){
        int calculateMHR = 220 - calculateAge();
        return calculateMHR;
    }

    public String calculateTHRR(){
        String calculateTHRR = ((0.5 * calculateMHR() + "-" + (0.85 * calculateMHR())));
        return calculateTHRR;
    }

    public int calculateBMI(){
        int BMI = ((weightInPounds * 703) / (heightInInches * heightInInches));
        return BMI;
    }

}
