package chapterEight;

public class TimeTrial {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        boolean isValidHour = hour > 0 && hour < 24;
        if(isValidHour){
            this.hour = hour;
        }
        else
            throw new IllegalArgumentException("Invalid hour value");
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        boolean isValidMinute = minute > 0 && minute < 60;
        if(isValidMinute){
            this.minute = minute;
        }
        else
            throw new IllegalArgumentException("Invalid minute value");
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds(int second) {
        boolean isSecondValid = second > 0 && second < 60;
        if(isSecondValid){
            this.second = second;
        }
        else
            throw new IllegalArgumentException("Invalid second value");
    }

    public int getSeconds() {
        return second;
    }

    public String toUniversalTimeFormat() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardTimeFormat() {
        return String.format("%02d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12) ? "AM" : "PM");
    }
}
