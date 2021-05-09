package chapterEight;

public class Date {
    private int yearDay;
    private String stringMonth;
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) throws DateException{
        validateMonth(month);
        this.month = month;
        validateDay(day);
        this.day = day;
        validateYear(year);
        this.year = year;
    }

    public Date(String month, int day, int year) {
        validateMonthInCaps(month);
        validateDay(day);
        validateYear(year);
        this.day = day;
        this.year = year;
        this.stringMonth = month;
    }

    public Date(int day, int year) {
        validateYear(year);
        this.year = year;
        validateDayOfTheYear(day);
        this.yearDay = day;
    }

    private void validateMonthInCaps(String month) {
        month = month.toUpperCase();
        boolean validMonth = month.equals("JANUARY") || month.equals("FEBRUARY") || month.equals("MARCH") || month.equals("APRIL")
                || month.equals("MAY") || month.equals("JUNE") || month.equals("JULY") || month.equals("AUGUST") ||
                month.equals("SEPTEMBER") || month.equals("OCTOBER") || month.equals("NOVEMBER") || month.equals("DECEMBER");
        if(!validMonth) throw new MonthException("Month entered is invalid or not in capital letters");
    }

    private void validateDayOfTheYear(int day) {
        if(day <= 0 || day >= 367) throw new DayException("Invalid day entered, range of values is between 1 and 366");
    }

    private void validateYear(int year) {
        if(year < 1990) throw new YearException("Invalid year entered, range of values begins from 1990");
    }

    private void validateDay(int day) {
        if(day <= 0 || day > 31) throw new DayException("Invalid day entered, must be between 1 and 31");
    }

    private void validateMonth(int month) {
        if (month <= 0 || month >= 13) throw new MonthException("Invalid month entered, must be between 1 and 12");
    }

    @Override
    public String toString() {
        return String.format("%02d%s%02d%s%04d", month, "/", day, "/", year);
    }

    public String getDate(){
        return stringMonth + " " + day + ", " + year;
    }

    public String getYearDate(){
        return String.format("%03d%s%4d", yearDay, " ", year);
    }
}
