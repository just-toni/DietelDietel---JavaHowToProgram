package chapterEight;

public enum TrafficLight {

    RED("90 SECONDS"),
    YELLOW("10 SECONDS"),
    GREEN("45 SECONDS");
    private final String duration;


    TrafficLight(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }
}
