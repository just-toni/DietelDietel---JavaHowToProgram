package com.Exercises.chapterThree.DateClass;

public class ExerciseDate {

    int month;
    int day;
    int year;
    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

    public ExerciseDate (int month, int day, int year){
        boolean validMonthRange = month > 0 && month < 13;
        boolean validYearRange = year > 1899 && year <= 2100;
        boolean validMonthIs30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean validMonthNot30Days = month == 1 || month == 2 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12;
        boolean validDayRangeIsALeapYear = day > 0 && day <= 29;
        boolean validDayRangeIsNotALeapYear = day > 0 && day <= 28;
        boolean isMonthFebruary = month == 2;
        boolean validDayRangeFor30DayMonth = day > 0 && day <= 30;
        boolean validDayRangeForNot30DayMonth = day > 0 && day <= 31;
        boolean yearIsALeapYear = year % 4 == 0;

        if (validMonthRange) {
            this.month = month;
        }
        if (validYearRange) {
            this.year = year;
        }

        if (isMonthFebruary) {
            if (yearIsALeapYear){
                if (validDayRangeIsALeapYear)
                    this.day = day;
            }
            if (!yearIsALeapYear) {
                if (validDayRangeIsNotALeapYear) {
                    this.day = day;
                }
            }

        }

        if (validMonthIs30Days) {
            if (validDayRangeFor30DayMonth){
                this.day = day;
            }
        }
        if (validMonthNot30Days) {
            if (validDayRangeForNot30DayMonth){
                this.day = day;
            }
        }


    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        boolean validMonthRange = month > 0 && month < 13;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        boolean validMonthIs30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean validMonthNot30Days = month == 1 || month == 2 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12;
        boolean validDayRangeIsALeapYear = day > 0 && day <= 29;
        boolean validDayRangeIsNotALeapYear = day > 0 && day <= 28;
        boolean isMonthFebruary = month == 2;
        boolean validDayRangeFor30DayMonth = day > 0 && day <= 30;
        boolean validDayRangeForNot30DayMonth = day > 0 && day <= 31;
        boolean yearIsALeapYear = year % 4 == 0;

        if (isMonthFebruary) {
            if (yearIsALeapYear){
                if (validDayRangeIsNotALeapYear)
                    this.day = day;
            }
            if (!yearIsALeapYear) {
                if (validDayRangeIsALeapYear) {
                    this.day = day;
                }
            }

        }

        if (validMonthIs30Days) {
            if (validDayRangeFor30DayMonth){
                this.day = day;
            }
        }
        if (validMonthNot30Days) {
            if (validDayRangeForNot30DayMonth){
                this.day = day;
            }
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        boolean validYearRange = year > 1899 && year <= 2100;
        if (validYearRange) {
            this.year = year;
        }
    }
}

//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        if (month >0 && month <13)
//            this.month = month;
//        else
//            System.out.println("Incorrect input");
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        if (month == 2 && day > 28)
//            System.out.println("Month can not exceed 28 days");
//        else if ((month == 4 || month == 6 || month  == 9 || month  == 11)  && day > 30)
//            System.out.println("Month can not exceed 30 days");
//        else if (day < 1 && day > 31)
//            System.out.println("Incorrect input");
//        else
//            this.day = day;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//
//    public ExerciseDate(int month, int day, int year){
//        this.month = month;
//        this.day = day;
//        this.year = year;
//    }
//
//    public void leapYear(int day){
//        if ((month == 2 && day > 29) && (year %4 == 0))
//            System.out.println("Leap year can not exceed 29 days");
//    }
//}
