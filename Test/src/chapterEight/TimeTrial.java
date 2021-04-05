package chapterEight;

public class TimeTrial {
    private int hour;
    private int minute;

    public void setHour(int hour) {
        if(hour > 0 && hour <= 24){
            this.hour = hour;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute > 0 && minute <= 60){
            this.minute = minute;
        }
    }

    public int getMinute() {
        return minute;
    }
}
